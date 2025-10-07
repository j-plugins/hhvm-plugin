// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackLambdaExpression extends HackExpression {

  @Nullable
  HackAsyncModifier getAsyncModifier();

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @Nullable
  HackCapabilityList getCapabilityList();

  @Nullable
  HackCompoundStatement getCompoundStatement();

  @NotNull
  List<HackExpression> getExpressionList();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @Nullable
  HackParameters getParameters();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

}
