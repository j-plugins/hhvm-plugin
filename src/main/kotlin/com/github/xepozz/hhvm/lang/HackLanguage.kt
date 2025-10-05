package com.github.xepozz.hhvm.lang

import com.intellij.lang.Language

class HackLanguage : Language("Hack") {
    companion object {
        @JvmStatic
        val INSTANCE = HackLanguage()
    }
}