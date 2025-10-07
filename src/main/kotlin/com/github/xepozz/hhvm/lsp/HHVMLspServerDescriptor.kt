package com.github.xepozz.hhvm.lsp

import com.github.xepozz.hhvm.lang.HackFileType
import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessEvent
import com.intellij.execution.process.ProcessListener
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.guessProjectDir
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.TextRange
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.platform.lsp.api.LspCommunicationChannel
import com.intellij.platform.lsp.api.LspServerListener
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspCodeActionsSupport
import com.intellij.platform.lsp.api.customization.LspCommandsSupport
import com.intellij.platform.lsp.api.customization.LspCompletionSupport
import com.intellij.platform.lsp.api.customization.LspDiagnosticsSupport
import com.intellij.platform.lsp.api.customization.LspDocumentColorSupport
import com.intellij.platform.lsp.api.customization.LspDocumentLinkSupport
import com.intellij.platform.lsp.api.customization.LspFindReferencesSupport
import com.intellij.platform.lsp.api.customization.LspFormattingSupport
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import com.jetbrains.rd.util.printlnError
import org.eclipse.lsp4j.Diagnostic
import org.eclipse.lsp4j.InitializeResult
import java.nio.file.Path

class HHVMLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Hack Language") {
    override fun startServerProcess(): OSProcessHandler {
        val startServerProcess = super.startServerProcess()
        startServerProcess.addProcessListener(object : ProcessListener {
//            override fun processNotStarted() {
//                println("HHVM LS process not started")
//            }
//
//            override fun processWillTerminate(event: ProcessEvent, willBeDestroyed: Boolean) {
//                println("HHVM LS process will terminate: $willBeDestroyed")
//            }
//
            override fun onTextAvailable(event: ProcessEvent, outputType: Key<*>) {
                println("HHVM LS output: ${event.text}. outputType: $outputType")
            }

            override fun processTerminated(event: ProcessEvent) {
                println("HHVM LS process terminated: ${event.exitCode}")
            }

            override fun startNotified(event: ProcessEvent) {
                println("HHVM LS process started $event")
            }
        })
        return startServerProcess
    }

    override fun isSupportedFile(file: VirtualFile) =
        (file.fileType == HackFileType.INSTANCE)
//            .apply { println("HHVM LS support: $this") }

    override val lspServerListener: LspServerListener = object : LspServerListener {
        override fun serverInitialized(params: InitializeResult) {
            println("HHVM LS started! params: $params")
        }

        override fun serverStopped(shutdownNormally: Boolean) {
            printlnError("HHVM LS stopped! shutdownNormally: $shutdownNormally")
        }
    }

    override val lspSemanticTokensSupport = LspSemanticTokensSupport()
    override val lspDocumentLinkSupport = LspDocumentLinkSupport()
    override val lspDocumentColorSupport = LspDocumentColorSupport()
    override val lspCodeActionsSupport = LspCodeActionsSupport()
    override val lspCommandsSupport = LspCommandsSupport()
    override val lspDiagnosticsSupport = object : LspDiagnosticsSupport() {
        override fun createAnnotation(
            holder: AnnotationHolder,
            diagnostic: Diagnostic,
            textRange: TextRange,
            quickFixes: List<IntentionAction>
        ) {
            println("LSP diagnostic: $diagnostic")
            super.createAnnotation(holder, diagnostic, textRange, quickFixes)
        }

        override fun getTooltip(diagnostic: Diagnostic): String {
            return super.getTooltip(diagnostic).apply { println("LSP diagnostic: $diagnostic, tooltip: $this") }
        }

        override fun getHighlightSeverity(diagnostic: Diagnostic): HighlightSeverity? {
            return super.getHighlightSeverity(diagnostic)
                .apply { println("LSP diagnostic: $diagnostic, severity: $this") }
        }

        override fun getMessage(diagnostic: Diagnostic): String {
            return super.getMessage(diagnostic).apply { println("LSP diagnostic: $diagnostic, message: $this") }
        }

        override fun getSpecialHighlightType(diagnostic: Diagnostic): ProblemHighlightType? {
            return super.getSpecialHighlightType(diagnostic)
                .apply { println("LSP diagnostic: $diagnostic, special highlight: $this") }
        }
    }

    override val lspFindReferencesSupport = LspFindReferencesSupport()
    override val lspFormattingSupport = LspFormattingSupport()
    override val lspCompletionSupport = LspCompletionSupport()
    override val lspGoToTypeDefinitionSupport = true
    override val lspGoToDefinitionSupport = true
    override val lspHoverSupport = true
//    override val clientCapabilities = ClientCapabilities(
//        WorkspaceClientCapabilities(),
//        TextDocumentClientCapabilities().apply {
//            publishDiagnostics = PublishDiagnosticsCapabilities(true)
//        },
//        WindowClientCapabilities(),
//        null,
//    )

    override val lspCommunicationChannel = LspCommunicationChannel.StdIO

    //    *("compose exec hack hh_client lsp"
//    *("run -i hhvm/hhvm hh_client lsp"
    //    docker run hhvm/hhvm hh_client lsp
    override fun createCommandLine() = GeneralCommandLine(
        "docker",
        "run",
        "-i",
        "-v",
        "${project.guessProjectDir()?.path}/hh.conf:/etc/hh.conf",
        "-v",
        "${project.guessProjectDir()?.path}:${PathMapper.HOST_PATH}/",
        "-w",
        "${PathMapper.HOST_PATH}/",
        "hhvm/hhvm",
        "sh",
        "-c",
//        "hh_server -d .; hh_client lsp --from=idea --ignore-hh-version --verbose",
        "hh_server -d .; hh_client lsp --from=idea",
    )
//        .apply { environment["USER"] = "xepozz" }
//        .apply { println("HHVM LS command line: ${this.commandLineString}") }

    val pathMapper = project.service<PathMapper>()

    override fun findFileByUri(fileUri: String): VirtualFile? {
        val toHost = pathMapper.toLocal(fileUri).replace("file://", "")

        return VirtualFileManager.getInstance().refreshAndFindFileByNioPath(Path.of(toHost))
//            .apply { println("find local file by path: $fileUri -> $this ($toHost)") }
    }

    override fun findLocalFileByPath(path: String): VirtualFile? {
        val toLocal = pathMapper.toLocal(path).replace("file://", "")

        return VirtualFileManager.getInstance().refreshAndFindFileByNioPath(Path.of(toLocal))
//            .apply { println("find local file by path: $path -> $this ($toLocal)") }
    }

    override fun getFilePath(file: VirtualFile): String {
        return pathMapper.toLocal(file.path)
//            .apply { println("get file path: $file -> $this") }
    }

    override fun getFileUri(file: VirtualFile): String {
        return pathMapper.toHost(file.path)
//            .apply { println("get file uri: $file -> $this") }
    }
}