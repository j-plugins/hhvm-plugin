package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.lang.parser.HackLexerAdapter
import com.github.xepozz.hhvm.lang.parser.HackParser
import com.github.xepozz.hhvm.lang.psi.HackTokenSets
import com.github.xepozz.hhvm.lang.psi.HackTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IFileElementType

class HackParserDefinition : ParserDefinition {
    override fun createLexer(project: Project) = HackLexerAdapter()

    override fun getCommentTokens() = HackTokenSets.COMMENTS

    override fun getWhitespaceTokens() = HackTokenSets.WHITESPACES

    override fun getStringLiteralElements() = HackTokenSets.STRING_LITERALS

    override fun createParser(project: Project?) = HackParser()

    override fun getFileNodeType() = FILE

    override fun createFile(viewProvider: FileViewProvider) = HackFile(viewProvider)

    override fun createElement(node: ASTNode): PsiElement = HackTypes.Factory.createElement(node)

    companion object {
        @JvmStatic
        val FILE = IFileElementType(HackLanguage.INSTANCE)
    }
}