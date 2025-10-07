// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackPropertyDeclaration extends PsiElement {

  @NotNull
  List<HackAbstractModifier> getAbstractModifierList();

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @NotNull
  List<HackFinalModifier> getFinalModifierList();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @NotNull
  List<HackPropertyDeclarator> getPropertyDeclaratorList();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @NotNull
  List<HackStaticModifier> getStaticModifierList();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @NotNull
  List<HackVisibilityModifier> getVisibilityModifierList();

}
