package com.github.xepozz.hhvm.lang.psi

import com.intellij.psi.tree.TokenSet

object HackTokenSets {
    val COMMENTS = TokenSet.create(HackTypes.COMMENT)
    val STRING_LITERALS = TokenSet.create(HackTypes.PATTERN)
    val WHITESPACES = TokenSet.WHITE_SPACE
}