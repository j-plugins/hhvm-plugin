package com.github.xepozz.hhvm.lsp

import com.github.xepozz.hhvm.HHVMIcons
import com.github.xepozz.hhvm.lang.HackFileType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.LspServerSupportProvider.LspServerStarter
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem

internal class HHVMLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerStarter) {
        if (file.fileType == HackFileType.INSTANCE) {
            serverStarter.ensureServerStarted(HHVMLspServerDescriptor(project))
        }
    }

    override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?) = LspServerWidgetItem(
        lspServer,
        currentFile,
        HHVMIcons.HHVM,
        null,
    )
}

