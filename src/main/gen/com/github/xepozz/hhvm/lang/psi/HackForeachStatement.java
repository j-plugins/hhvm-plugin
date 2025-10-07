// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackForeachStatement extends HackStatement {

  @Nullable
  HackAwaitModifier getAwaitModifier();

  @NotNull
  List<HackExpression> getExpressionList();

  @NotNull
  HackStatement getStatement();

}
