// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackSwitchStatement extends HackStatement {

  @NotNull
  HackParenthesizedExpression getParenthesizedExpression();

  @NotNull
  List<HackSwitchCase> getSwitchCaseList();

  @NotNull
  List<HackSwitchDefault> getSwitchDefaultList();

}
