package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;

public class Lexeme_appendTest_16_Test {
  @Test
  public void appendTest() throws Exception {
    // Arrange
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);
    Lexeme lexeme1 = new Lexeme(1, 1, 655361, 1);
    int lexemeType = 1;

    // Act
    boolean actual = lexeme.append(lexeme1, lexemeType);

    // Assert
    Assert.assertFalse(actual);
    int offset = lexeme1.getOffset();
    String toStringResult = lexeme1.toString();
    int begin = lexeme1.getBegin();
    int beginPosition = lexeme1.getBeginPosition();
    int lexemeType1 = lexeme1.getLexemeType();
    String lexemeTypeString = lexeme1.getLexemeTypeString();
    int endPosition = lexeme1.getEndPosition();
    int length = lexeme1.getLength();
    Assert.assertEquals(1, offset);
    Assert.assertEquals("", lexeme1.getLexemeText());
    Assert.assertEquals(655361, length);
    Assert.assertEquals(655363, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType1);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-655363 : null : \tENGLISH", toStringResult);
    int offset1 = lexeme.getOffset();
    String toStringResult1 = lexeme.toString();
    int begin1 = lexeme.getBegin();
    int beginPosition1 = lexeme.getBeginPosition();
    int lexemeType2 = lexeme.getLexemeType();
    String lexemeTypeString1 = lexeme.getLexemeTypeString();
    int endPosition1 = lexeme.getEndPosition();
    int length1 = lexeme.getLength();
    Assert.assertEquals(1, offset1);
    Assert.assertEquals("", lexeme.getLexemeText());
    Assert.assertEquals(1, length1);
    Assert.assertEquals(3, endPosition1);
    Assert.assertEquals("ENGLISH", lexemeTypeString1);
    Assert.assertEquals(1, lexemeType2);
    Assert.assertEquals(2, beginPosition1);
    Assert.assertEquals(1, begin1);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
