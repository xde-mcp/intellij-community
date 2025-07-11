// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.psi.javadoc;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

/** Describes a markdown reference link */
public interface PsiMarkdownReferenceLink extends PsiElement {
  /**
   * @return The PsiElement that acts as a label.
   *         On short links, returns the same as {@link #getLinkElement()}.
   *         When there is a user-defined label, returns a {@link PsiMarkdownReferenceLabel}.
   */
  @Nullable PsiElement getLabel();

  /** @return The PsiElement that act as a reference. */
  @Nullable PsiElement getLinkElement();

  /** @return Whether the link is a short form reference link */
  boolean isShortLink();
}
