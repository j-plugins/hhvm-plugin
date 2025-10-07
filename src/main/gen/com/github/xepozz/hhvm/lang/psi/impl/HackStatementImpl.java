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

public class HackStatementImpl extends ASTWrapperPsiElement implements HackStatement {

  public HackStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HackVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HackVisitor) accept((HackVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HackAbstractEnumClassDeclaration getAbstractEnumClassDeclaration() {
    return findChildByClass(HackAbstractEnumClassDeclaration.class);
  }

  @Override
  @Nullable
  public HackAliasDeclaration getAliasDeclaration() {
    return findChildByClass(HackAliasDeclaration.class);
  }

  @Override
  @Nullable
  public HackClassDeclaration getClassDeclaration() {
    return findChildByClass(HackClassDeclaration.class);
  }

  @Override
  @Nullable
  public HackConstDeclaration getConstDeclaration() {
    return findChildByClass(HackConstDeclaration.class);
  }

  @Override
  @Nullable
  public HackEnumClassDeclaration getEnumClassDeclaration() {
    return findChildByClass(HackEnumClassDeclaration.class);
  }

  @Override
  @Nullable
  public HackEnumDeclaration getEnumDeclaration() {
    return findChildByClass(HackEnumDeclaration.class);
  }

  @Override
  @Nullable
  public HackFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(HackFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public HackInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(HackInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public HackModuleAttribute getModuleAttribute() {
    return findChildByClass(HackModuleAttribute.class);
  }

  @Override
  @Nullable
  public HackNamespaceDeclaration getNamespaceDeclaration() {
    return findChildByClass(HackNamespaceDeclaration.class);
  }

  @Override
  @Nullable
  public HackTraitDeclaration getTraitDeclaration() {
    return findChildByClass(HackTraitDeclaration.class);
  }

}
