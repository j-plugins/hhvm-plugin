package com.github.xepozz.hhvm.lang.psi

import com.github.xepozz.hhvm.lang.HackLanguage
import com.intellij.psi.tree.IElementType

class HackElementType(debugName: String) : IElementType("HackElementType($debugName)", HackLanguage.INSTANCE)
