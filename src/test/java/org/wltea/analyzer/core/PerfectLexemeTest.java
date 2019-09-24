package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;

import org.wltea.analyzer.core.Lexeme;

import java.lang.reflect.InvocationTargetException;

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

  // Test written by Diffblue Cover.
  @Test
  public void equalsDifferentOnOffset() {

    // Arrange
    final Lexeme lexeme = new Lexeme(1, 0, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsDifferentOnBegin() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 1_073_741_824, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsDifferentOnLength() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 134_217_728, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test adapted from the output of Diffblue Cover with phase 0 parameters
  // where we added `--java-assume-inputs-interval [2:4]`
  @Test
  public void equalsOutputTrue() {
    // Arrange
    final Lexeme lexeme = new Lexeme(3, 2, 3, Lexeme.TYPE_CNWORD);
    final Lexeme o = new Lexeme(3, 2, 3, Lexeme.TYPE_ARABIC);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test adapted from the output of Diffblue Cover with phase 0 parameters
  // where `--java-assume-input-non-null` was removed
  @Test
  public void equalsInputNull() throws InvocationTargetException {
    // Arrange
    final Lexeme lexeme = new Lexeme(2, 3, 4, Lexeme.TYPE_ENGLISH);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(null));
  }

  // Test written by hand
  @Test
  public void equalsReferenceEquals() throws InvocationTargetException {
    // Arrange
    final Lexeme lexeme = new Lexeme(2, 3, 4, Lexeme.TYPE_ENGLISH);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(lexeme));
  }

  // Test written by hand
  @Test
  public void equalsNonLexemeInstance() throws InvocationTargetException {
    // Arrange
    final Lexeme lexeme = new Lexeme(2, 3, 4, Lexeme.TYPE_ENGLISH);
    final Integer i = 234;

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(i));
  }
}
