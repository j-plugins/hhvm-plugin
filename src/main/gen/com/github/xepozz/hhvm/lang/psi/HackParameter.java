// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackParameter extends PsiElement {

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @NotNull
  List<HackExpression> getExpressionList();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @Nullable
  HackInoutModifier getInoutModifier();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @Nullable
  HackVariadicModifier getVariadicModifier();

  @Nullable
  HackVisibilityModifier getVisibilityModifier();

}
