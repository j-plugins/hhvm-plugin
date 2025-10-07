// This is a generated file. Not intended for manual editing.
package com.github.xepozz.hhvm.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HackContextConstDeclaration extends PsiElement {

  @Nullable
  HackAbstractModifier getAbstractModifier();

  @NotNull
  List<HackCapabilityList> getCapabilityListList();

  @NotNull
  PsiElement getIdentifier();

}
