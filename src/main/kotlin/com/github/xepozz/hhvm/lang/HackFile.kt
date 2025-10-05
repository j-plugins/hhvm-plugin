package com.github.xepozz.hhvm.lang

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class HackFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, HackLanguage.INSTANCE) {
    override fun getFileType() = HackFileType.INSTANCE
}