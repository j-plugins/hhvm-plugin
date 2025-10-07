// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackEnumClassDeclaration extends PsiElement {

  @Nullable
  HackAttributeModifier getAttributeModifier();

  @Nullable
  HackExtendsClause getExtendsClause();

  @Nullable
  HackFunctionTypeSpecifier getFunctionTypeSpecifier();

  @Nullable
  HackShapeTypeSpecifier getShapeTypeSpecifier();

  @Nullable
  HackTupleTypeSpecifier getTupleTypeSpecifier();

  @Nullable
  HackTypeConstant getTypeConstant();

  @Nullable
  HackTypeSpecifier getTypeSpecifier();

  @NotNull
  List<HackTypedEnumerator> getTypedEnumeratorList();

  @NotNull
  PsiElement getIdentifier();

}
