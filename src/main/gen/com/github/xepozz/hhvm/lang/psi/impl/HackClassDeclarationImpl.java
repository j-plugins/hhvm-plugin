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

public class HackClassDeclarationImpl extends ASTWrapperPsiElement implements HackClassDeclaration {

  public HackClassDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitClassDeclaration(this);
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
  @Nullable
  public HackAttributeModifier getAttributeModifier() {
    return findChildByClass(HackAttributeModifier.class);
  }

  @Override
  @Nullable
  public HackExtendsClause getExtendsClause() {
    return findChildByClass(HackExtendsClause.class);
  }

  @Override
  @NotNull
  public List<HackFinalModifier> getFinalModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFinalModifier.class);
  }

  @Override
  @Nullable
  public HackImplementsClause getImplementsClause() {
    return findChildByClass(HackImplementsClause.class);
  }

  @Override
  @NotNull
  public HackMemberDeclarations getMemberDeclarations() {
    return findNotNullChildByClass(HackMemberDeclarations.class);
  }

  @Override
  @Nullable
  public HackTypeParameters getTypeParameters() {
    return findChildByClass(HackTypeParameters.class);
  }

  @Override
  @Nullable
  public HackWhereClause getWhereClause() {
    return findChildByClass(HackWhereClause.class);
  }

  @Override
  @Nullable
  public HackXhpIdentifierExpression getXhpIdentifierExpression() {
    return findChildByClass(HackXhpIdentifierExpression.class);
  }

  @Override
  @Nullable
  public HackXhpModifier getXhpModifier() {
    return findChildByClass(HackXhpModifier.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
