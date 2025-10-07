package com.github.xepozz.hhvm.lang

import com.intellij.lang.Commenter
import org.jetbrains.annotations.Unmodifiable

class HackCommenter : Commenter {
    companion object {
        val LINE_COMMENTS = listOf(";", "//")
    }
    override fun getLineCommentPrefixes() = LINE_COMMENTS

    override fun getLineCommentPrefix(): String = "//"

    override fun getBlockCommentPrefix(): String = "/**"

    override fun getBlockCommentSuffix(): String = "*/"

    override fun getCommentedBlockCommentPrefix(): String = "/*"

    override fun getCommentedBlockCommentSuffix(): String = "*/"
}