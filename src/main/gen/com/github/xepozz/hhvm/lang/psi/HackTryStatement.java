// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTryStatement extends HackStatement {

  @NotNull
  List<HackCatchClause> getCatchClauseList();

  @NotNull
  HackCompoundStatement getCompoundStatement();

  @Nullable
  HackFinallyClause getFinallyClause();

}
