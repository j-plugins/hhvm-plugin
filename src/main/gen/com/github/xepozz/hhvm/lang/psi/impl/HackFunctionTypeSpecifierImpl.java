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

public class HackFunctionTypeSpecifierImpl extends ASTWrapperPsiElement implements HackFunctionTypeSpecifier {

  public HackFunctionTypeSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitFunctionTypeSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackCapabilityList getCapabilityList() {
    return findChildByClass(HackCapabilityList.class);
  }

  @Override
  @NotNull
  public List<HackFunctionTypeSpecifier> getFunctionTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackFunctionTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackInoutModifier> getInoutModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackInoutModifier.class);
  }

  @Override
  @NotNull
  public List<HackShapeTypeSpecifier> getShapeTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackShapeTypeSpecifier.class);
  }

  @Override
  @NotNull
  public List<HackTupleTypeSpecifier> getTupleTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackTupleTypeSpecifier.class);
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
  public List<HackVariadicModifier> getVariadicModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HackVariadicModifier.class);
  }

}
