package com.github.xepozz.hhvm.lang.psi.impl

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry

object HackPsiImplUtil {
    @JvmStatic
    fun getReferences(element: PsiElement): Array<PsiReference> =
        ReferenceProvidersRegistry.getReferencesFromProviders(element)
}