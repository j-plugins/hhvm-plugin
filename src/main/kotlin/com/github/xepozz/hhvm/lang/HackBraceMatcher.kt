package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.lang.psi.HackTypes
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class HackBraceMatcher : PairedBraceMatcher {
    private val bracePairs = arrayOf(
        BracePair(HackTypes.T_LPAREN, HackTypes.T_RPAREN, true),
        BracePair(HackTypes.T_LBRACE, HackTypes.T_RBRACE, true),
        BracePair(HackTypes.T_LBRACKET, HackTypes.T_RBRACKET, true),
    )

    override fun getPairs() = bracePairs

    override fun isPairedBracesAllowedBeforeType(
        p0: IElementType,
        p1: IElementType?
    ) = true

    override fun getCodeConstructStart(
        file: PsiFile,
        openingBraceOffset: Int
    ): Int = openingBraceOffset

}