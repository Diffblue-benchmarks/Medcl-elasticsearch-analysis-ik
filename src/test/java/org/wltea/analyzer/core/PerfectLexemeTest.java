package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;

import org.wltea.analyzer.core.Lexeme;

public class PerfectLexemeTest {

  // Test written by hand, adapted from the test-generator output with phase 1
  // options plus `--java-assume-inputs-interval [2:4]`
  @Test
  public void appendEndDifferentFromOtherBegin() {

    // Arrange
    final Lexeme lexeme = new Lexeme(4, 4, 2,  Lexeme.TYPE_UNKNOWN);
    final Lexeme l = new Lexeme(2, 2, 3, Lexeme.TYPE_UNKNOWN);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(l, Lexeme.TYPE_UNKNOWN));
  }

  // Test written by hand, adapted from the test-generator output with phase 1
  // options plus `--java-assume-inputs-interval [2:4]`
  @Test
  public void appendEndEqualsOtherBegin() {
    // Arrange
    final Lexeme lexeme = new Lexeme(2, 3, 3, Lexeme.TYPE_UNKNOWN);
    final Lexeme l = new Lexeme(4, 4, 3, Lexeme.TYPE_UNKNOWN);

    // Act and Assert result
    Assert.assertTrue(lexeme.append(l, Lexeme.TYPE_ENGLISH));

    // Assert side effects
    Assert.assertEquals(6, lexeme.getLength());
    Assert.assertEquals(Lexeme.TYPE_ENGLISH, lexeme.getLexemeType());
  }

  // Test written by hand, adapted from test generated Diffblue Cover
  @Test
  public void appendNull() {
    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, Lexeme.TYPE_UNKNOWN);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(null, Lexeme.TYPE_UNKNOWN));
  }
}
