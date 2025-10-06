//package com.github.xepozz.hhvm.lang.psi.impl
//
//import com.github.xepozz.hhvm.lang.psi.HackFunctionDeclaration
//import com.intellij.extapi.psi.ASTWrapperPsiElement
//import com.intellij.icons.AllIcons
//import com.intellij.ide.projectView.PresentationData
//import com.intellij.lang.ASTNode
//
//abstract class HackFunctionBaseImpl : ASTWrapperPsiElement, HackFunctionDeclaration {
//    constructor(node: ASTNode) : super(node)
//
//    override fun getPresentation() = PresentationData(text, null, getIcon(0), null)
//
//    override fun getIcon(flags: Int) = AllIcons.Nodes.Function
//}