// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackXhpExpression extends HackExpression {

  @NotNull
  List<HackExpression> getExpressionList();

  @Nullable
  HackXhpClose getXhpClose();

  @Nullable
  HackXhpOpen getXhpOpen();

  @Nullable
  HackXhpOpenClose getXhpOpenClose();

  @NotNull
  List<HackXhpString> getXhpStringList();

}
