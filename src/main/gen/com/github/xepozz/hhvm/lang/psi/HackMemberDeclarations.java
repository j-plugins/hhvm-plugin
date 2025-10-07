// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackMemberDeclarations extends PsiElement {

  @NotNull
  List<HackAbstractModifier> getAbstractModifierList();

  @NotNull
  List<HackContextConstDeclaration> getContextConstDeclarationList();

  @NotNull
  List<HackExpression> getExpressionList();

  @NotNull
  List<HackFinalModifier> getFinalModifierList();

  @NotNull
  List<HackFunctionTypeSpecifier> getFunctionTypeSpecifierList();

  @NotNull
  List<HackMethodDeclaration> getMethodDeclarationList();

  @NotNull
  List<HackPropertyDeclaration> getPropertyDeclarationList();

  @NotNull
  List<HackRequireExtendsClause> getRequireExtendsClauseList();

  @NotNull
  List<HackRequireImplementsClause> getRequireImplementsClauseList();

  @NotNull
  List<HackShapeTypeSpecifier> getShapeTypeSpecifierList();

  @NotNull
  List<HackStaticModifier> getStaticModifierList();

  @NotNull
  List<HackTraitUseClause> getTraitUseClauseList();

  @NotNull
  List<HackTupleTypeSpecifier> getTupleTypeSpecifierList();

  @NotNull
  List<HackTypeConstDeclaration> getTypeConstDeclarationList();

  @NotNull
  List<HackTypeConstant> getTypeConstantList();

  @NotNull
  List<HackTypeSpecifier> getTypeSpecifierList();

  @NotNull
  List<HackVisibilityModifier> getVisibilityModifierList();

}
