// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackRequireImplementsClause extends PsiElement {

  @NotNull
  List<HackFunctionTypeSpecifier> getFunctionTypeSpecifierList();

  @NotNull
  List<HackShapeTypeSpecifier> getShapeTypeSpecifierList();

  @NotNull
  List<HackTupleTypeSpecifier> getTupleTypeSpecifierList();

  @NotNull
  List<HackTypeConstant> getTypeConstantList();

  @NotNull
  List<HackTypeSpecifier> getTypeSpecifierList();

}
