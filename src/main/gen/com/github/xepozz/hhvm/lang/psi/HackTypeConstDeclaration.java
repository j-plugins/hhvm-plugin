// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTypeConstDeclaration extends PsiElement {

  @NotNull
  List<HackAbstractModifier> getAbstractModifierList();

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @NotNull
  List<HackFinalModifier> getFinalModifierList();

  @NotNull
  List<HackFunctionTypeSpecifier> getFunctionTypeSpecifierList();

  @NotNull
  List<HackShapeTypeSpecifier> getShapeTypeSpecifierList();

  @NotNull
  List<HackStaticModifier> getStaticModifierList();

  @NotNull
  List<HackTupleTypeSpecifier> getTupleTypeSpecifierList();

  @NotNull
  List<HackTypeConstant> getTypeConstantList();

  @Nullable
  HackTypeParameters getTypeParameters();

  @NotNull
  List<HackTypeSpecifier> getTypeSpecifierList();

  @NotNull
  List<HackVisibilityModifier> getVisibilityModifierList();

  @NotNull
  PsiElement getIdentifier();

}
