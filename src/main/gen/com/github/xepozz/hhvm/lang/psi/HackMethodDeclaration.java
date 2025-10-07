// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMethodDeclaration extends PsiElement {

  @NotNull
  List<HackAbstractModifier> getAbstractModifierList();

  @Nullable
  HackAsyncModifier getAsyncModifier();

  @NotNull
  List<HackAttributeModifier> getAttributeModifierList();

  @Nullable
  HackCapabilityList getCapabilityList();

  @Nullable
  HackCompoundStatement getCompoundStatement();

  @NotNull
  List<HackFinalModifier> getFinalModifierList();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @NotNull
  HackParameters getParameters();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @NotNull
  List<HackStaticModifier> getStaticModifierList();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeParameters getTypeParameters();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @NotNull
  List<HackVisibilityModifier> getVisibilityModifierList();

  @Nullable
  HackWhereClause getWhereClause();

  @NotNull
  PsiElement getIdentifier();

}
