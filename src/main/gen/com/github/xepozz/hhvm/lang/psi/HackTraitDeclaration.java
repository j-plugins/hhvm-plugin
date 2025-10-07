// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackTraitDeclaration extends PsiElement {

  @Nullable
  HackAttributeModifier getAttributeModifier();

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
