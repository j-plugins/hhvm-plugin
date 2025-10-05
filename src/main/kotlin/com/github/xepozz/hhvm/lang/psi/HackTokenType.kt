package com.github.xepozz.hhvm.lang.psi

import com.github.xepozz.hhvm.lang.HackLanguage
import com.intellij.psi.tree.IElementType

class HackTokenType(debugName: String) : IElementType(debugName, HackLanguage.INSTANCE) {
    override fun toString() = "HackTokenType." + super.toString()
}