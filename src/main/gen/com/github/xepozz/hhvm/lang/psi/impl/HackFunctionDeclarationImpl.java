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

public class HackFunctionDeclarationImpl extends ASTWrapperPsiElement implements HackFunctionDeclaration {

  public HackFunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAsyncModifier getAsyncModifier() {
    return findChildByClass(HackAsyncModifier.class);
  }

  @Override
  @NotNull
  public List<HackAttributeModifier> getAttributeModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackAttributeModifier.class);
  }

  @Override
  @Nullable
  public HackCapabilityList getCapabilityList() {
    return findChildByClass(HackCapabilityList.class);
  }

  @Override
  @Nullable
  public HackCompoundStatement getCompoundStatement() {
    return findChildByClass(HackCompoundStatement.class);
  }

  @Override
  @Nullable
  public HackFunctionTypeSpecifier getFunctionTypeSpecifier() {
    return findChildByClass(HackFunctionTypeSpecifier.class);
  }

  @Override
  @NotNull
  public HackParameters getParameters() {
    return findNotNullChildByClass(HackParameters.class);
  }

  @Override
  @Nullable
  public HackShapeTypeSpecifier getShapeTypeSpecifier() {
    return findChildByClass(HackShapeTypeSpecifier.class);
  }

  @Override
  @Nullable
  public HackTupleTypeSpecifier getTupleTypeSpecifier() {
    return findChildByClass(HackTupleTypeSpecifier.class);
  }

  @Override
  @Nullable
  public HackTypeConstant getTypeConstant() {
    return findChildByClass(HackTypeConstant.class);
  }

  @Override
  @Nullable
  public HackTypeParameters getTypeParameters() {
    return findChildByClass(HackTypeParameters.class);
  }

  @Override
  @Nullable
  public HackTypeSpecifier getTypeSpecifier() {
    return findChildByClass(HackTypeSpecifier.class);
  }

  @Override
  @Nullable
  public HackWhereClause getWhereClause() {
    return findChildByClass(HackWhereClause.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
