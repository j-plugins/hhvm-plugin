// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackAnonymousFunctionExpression extends HackExpression {

  @Nullable
  HackAsyncModifier getAsyncModifier();

  @Nullable
  HackCapabilityList getCapabilityList();

  @NotNull
  HackCompoundStatement getCompoundStatement();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @NotNull
  HackParameters getParameters();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @NotNull
  List<HackVariableExpression> getVariableExpressionList();

}
