// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackClassDeclaration extends PsiElement {

  @NotNull
  List<HackAbstractModifier> getAbstractModifierList();

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @Nullable
  HackExtendsClause getExtendsClause();

  @NotNull
  List<HackFinalModifier> getFinalModifierList();

  @Nullable
  HackImplementsClause getImplementsClause();

  @NotNull
  HackMemberDeclarations getMemberDeclarations();

  @Nullable
  HackTypeParameters getTypeParameters();

  @Nullable
  HackWhereClause getWhereClause();

  @NotNull
  PsiElement getIdentifier();

}
