// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackFunctionDeclaration extends PsiElement {

  @Nullable
  HackAsyncModifier getAsyncModifier();

  @NotNull
  List<HackAttributeModifier> getAttributeModifierList();

  @Nullable
  HackCapabilityList getCapabilityList();

  @Nullable
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
  HackTypeParameters getTypeParameters();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @Nullable
  HackWhereClause getWhereClause();

  @NotNull
  PsiElement getIdentifier();

}
