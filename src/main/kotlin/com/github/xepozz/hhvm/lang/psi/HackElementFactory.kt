package com.github.xepozz.hhvm.lang.psi

import com.github.xepozz.hhvm.lang.HackFile
import com.github.xepozz.hhvm.lang.HackFileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory

object HackElementFactory {
    fun createFile(project: Project, text: String): HackFile {
        val name = "dummy.hack"
        return PsiFileFactory.getInstance(project)
            .createFileFromText(name, HackFileType.INSTANCE, text) as HackFile
    }
}