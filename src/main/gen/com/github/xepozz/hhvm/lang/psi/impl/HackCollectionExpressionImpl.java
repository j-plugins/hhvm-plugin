// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.xepozz.hhvm.lang.psi.HackTypes.*;
import com.github.xepozz.hhvm.lang.psi.*;

public class HackCollectionExpressionImpl extends HackExpressionImpl implements HackCollectionExpression {

  public HackCollectionExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitCollectionExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackElementInitializer> getElementInitializerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackElementInitializer.class);
  }

  @Override
  @NotNull
  public List<HackExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpression.class);
  }

  @Override
  @Nullable
  public HackTypeArguments getTypeArguments() {
    return findChildByClass(HackTypeArguments.class);
  }

}
