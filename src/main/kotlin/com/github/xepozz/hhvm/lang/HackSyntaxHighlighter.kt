package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.lang.parser.HackLexerAdapter
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class HackSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer() = HackLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType) = when (tokenType) {
        TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
        else -> EMPTY_KEYS
    }

    companion object {
        private val BAD_CHAR_KEYS = arrayOf(
            HighlighterColors.BAD_CHARACTER,
        )

        private val COMMENT_KEYS = arrayOf(
            DefaultLanguageHighlighterColors.DOC_COMMENT
        )
        private val OPERATION_KEYS = arrayOf(
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }
}