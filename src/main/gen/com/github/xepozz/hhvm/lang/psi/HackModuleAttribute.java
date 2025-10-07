// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackModuleAttribute extends PsiElement {

  @NotNull
  List<HackArguments> getArgumentsList();

  @NotNull
  List<HackQualifiedIdentifierExpression> getQualifiedIdentifierExpressionList();

  @NotNull
  PsiElement getIdentifier();

}
