package com.github.xepozz.hhvm.lsp

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.guessProjectDir
import org.jetbrains.annotations.NonNls

@Service(Service.Level.PROJECT)
class PathMapper(val project: Project) {
    companion object {
        const val HOST_PATH = "/tmp/hhvm-project"
    }

    fun toHost(path: String) = path.replace(getProjectPath(), HOST_PATH)
    fun toLocal(path: String) = path.replace(HOST_PATH, getProjectPath())

    private fun getProjectPath(): @NonNls String = project.guessProjectDir()?.path ?: ""
}
