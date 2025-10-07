package com.github.xepozz.hhvm.lang

import com.github.xepozz.hhvm.lang.psi.HackTypes
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class HackAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element.elementType) {
            HackTypes.VARIABLE_EXPRESSION -> {
//                println("found variable $element")
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(element)
                    .textAttributes(DefaultLanguageHighlighterColors.GLOBAL_VARIABLE)
                    .create()
            }
        }
    }
}