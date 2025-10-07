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

public class HackXhpAttributeExpressionImpl extends HackExpressionImpl implements HackXhpAttributeExpression {

  public HackXhpAttributeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitXhpAttributeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackXhpCategoryIdentifier getXhpCategoryIdentifier() {
    return findChildByClass(HackXhpCategoryIdentifier.class);
  }

  @Override
  @Nullable
  public HackXhpClassIdentifier getXhpClassIdentifier() {
    return findChildByClass(HackXhpClassIdentifier.class);
  }

}
