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

public class HackXhpExpressionImpl extends HackExpressionImpl implements HackXhpExpression {

  public HackXhpExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitXhpExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HackExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackExpression.class);
  }

  @Override
  @Nullable
  public HackXhpClose getXhpClose() {
    return findChildByClass(HackXhpClose.class);
  }

  @Override
  @Nullable
  public HackXhpOpen getXhpOpen() {
    return findChildByClass(HackXhpOpen.class);
  }

  @Override
  @Nullable
  public HackXhpOpenClose getXhpOpenClose() {
    return findChildByClass(HackXhpOpenClose.class);
  }

  @Override
  @NotNull
  public List<HackXhpString> getXhpStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackXhpString.class);
  }

}
