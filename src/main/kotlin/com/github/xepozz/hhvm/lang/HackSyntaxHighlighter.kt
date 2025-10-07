package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.lang.parser.HackLexerAdapter
import com.github.xepozz.hhvm.lang.psi.HackTokenType
import com.github.xepozz.hhvm.lang.psi.HackTypes
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class HackSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer() = HackLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey> = arrayOf(
        when (tokenType) {
            HackTypes.VARIABLE_EXPRESSION,
            HackTypes.T_DOLLAR_DOLLAR,
            HackTypes.T_DOLLAR -> DefaultLanguageHighlighterColors.GLOBAL_VARIABLE
            HackTypes.INLINE_COMMENT -> DefaultLanguageHighlighterColors.LINE_COMMENT
            HackTypes.BLOCK_COMMENT -> DefaultLanguageHighlighterColors.BLOCK_COMMENT
            HackTypes.IDENTIFIER -> DefaultLanguageHighlighterColors.IDENTIFIER
            HackTypes.STRING -> DefaultLanguageHighlighterColors.STRING
            HackTypes.FLOAT,
            HackTypes.INTEGER -> DefaultLanguageHighlighterColors.NUMBER
            HackTypes.T_LBRACE, HackTypes.T_RBRACE -> DefaultLanguageHighlighterColors.BRACES
            HackTypes.T_LPAREN, HackTypes.T_RPAREN -> DefaultLanguageHighlighterColors.PARENTHESES
            HackTypes.T_COMMA -> DefaultLanguageHighlighterColors.COMMA
            HackTypes.T_ASYNC,
            HackTypes.T_AWAIT,
            HackTypes.T_NEW,
            HackTypes.T_NEWTYPE,
            HackTypes.T_CONTINUE,
            HackTypes.T_BREAK,
            HackTypes.T_DO,
            HackTypes.T_WHILE,
            HackTypes.T_FOR,
            HackTypes.T_FOREACH,
            HackTypes.T_CLONE,
            HackTypes.T_IF,
            HackTypes.T_ELSE,
            HackTypes.T_ELSEIF,
            HackTypes.T_SWITCH,
            HackTypes.T_CASE,
            HackTypes.T_DEFAULT,
            HackTypes.T_AS,
            HackTypes.T_REQUIRE,
            HackTypes.T_REQUIRE_ONCE,
            HackTypes.T_INCLUDE,
            HackTypes.T_INCLUDE_ONCE,
            HackTypes.T_RETURN,
            HackTypes.T_TRY,
            HackTypes.T_CATCH,
            HackTypes.T_FINALLY,
            HackTypes.T_THROW,
            HackTypes.T_YIELD,
            HackTypes.T_INSTEADOF,
            HackTypes.T_STATIC,
            HackTypes.T_ABSTRACT,
            HackTypes.T_FINAL,
            HackTypes.T_PRIVATE,
            HackTypes.T_PROTECTED,
            HackTypes.T_PUBLIC,

            HackTypes.T_FUNCTION -> DefaultLanguageHighlighterColors.KEYWORD

            TokenType.BAD_CHARACTER -> HighlighterColors.BAD_CHARACTER
            else -> null
        }
    )
        .filterNotNull()
        .toTypedArray()
}