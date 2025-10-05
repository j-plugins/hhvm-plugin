package com.github.xepozz.hhvm.lang.parser

import com.intellij.lexer.FlexAdapter

class HackLexerAdapter : FlexAdapter(HackLexer(null))