package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.HHVMIcons
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class HackFileType : LanguageFileType(HackLanguage.INSTANCE) {
    override fun getName() = "Hack File"

    override fun getDescription() = "Hack language file"

    override fun getDefaultExtension() = "hack"

    override fun getIcon() = HHVMIcons.HHVM

    companion object {
        val INSTANCE = HackFileType()
    }
}