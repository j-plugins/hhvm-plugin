// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackInterfaceDeclaration extends PsiElement {

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @Nullable
  HackExtendsClause getExtendsClause();

  @NotNull
  HackMemberDeclarations getMemberDeclarations();

  @Nullable
  HackTypeParameters getTypeParameters();

  @Nullable
  HackWhereClause getWhereClause();

  @NotNull
  PsiElement getIdentifier();

}
