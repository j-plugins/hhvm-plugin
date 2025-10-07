// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.xepozz.hhvm.lang.psi.HackTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.xepozz.hhvm.lang.psi.*;

public class HackMemberDeclarationsImpl extends ASTWrapperPsiElement implements HackMemberDeclarations {

  public HackMemberDeclarationsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitMemberDeclarations(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackAbstractModifier> getAbstractModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackAbstractModifier.class);
  }

  @Override
  @NotNull
  public List<HackContextConstDeclaration> getContextConstDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackContextConstDeclaration.class);
  }

  @Override
  @NotNull
  public List<HackExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpression.class);
  }

  @Override
  @NotNull
  public List<HackFinalModifier> getFinalModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFinalModifier.class);
  }

  @Override
  @NotNull
  public List<HackFunctionTypeSpecifier> getFunctionTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFunctionTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackMethodDeclaration> getMethodDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackMethodDeclaration.class);
  }

  @Override
  @NotNull
  public List<HackPropertyDeclaration> getPropertyDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackPropertyDeclaration.class);
  }

  @Override
  @NotNull
  public List<HackRequireExtendsClause> getRequireExtendsClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackRequireExtendsClause.class);
  }

  @Override
  @NotNull
  public List<HackRequireImplementsClause> getRequireImplementsClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackRequireImplementsClause.class);
  }

  @Override
  @NotNull
  public List<HackShapeTypeSpecifier> getShapeTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShapeTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackStaticModifier> getStaticModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackStaticModifier.class);
  }

  @Override
  @NotNull
  public List<HackTraitUseClause> getTraitUseClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTraitUseClause.class);
  }

  @Override
  @NotNull
  public List<HackTupleTypeSpecifier> getTupleTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTupleTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackTypeConstDeclaration> getTypeConstDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTypeConstDeclaration.class);
  }

  @Override
  @NotNull
  public List<HackTypeConstant> getTypeConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTypeConstant.class);
  }

  @Override
  @NotNull
  public List<HackTypeSpecifier> getTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackVisibilityModifier> getVisibilityModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVisibilityModifier.class);
  }

}
