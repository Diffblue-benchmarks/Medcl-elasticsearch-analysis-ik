package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;

public class Lexeme_LexemeTest_1_Test {
  @Test
  public void LexemeTest() throws Exception {
    // Arrange
    int offset = 1;
    int begin = 1;
    int length = 1;
    int lexemeType = 1;

    // Act
    Lexeme lexeme = new Lexeme(offset, begin, length, lexemeType);

    // Assert
    int offset1 = lexeme.getOffset();
    String toStringResult = lexeme.toString();
    int begin1 = lexeme.getBegin();
    int beginPosition = lexeme.getBeginPosition();
    int lexemeType1 = lexeme.getLexemeType();
    String lexemeTypeString = lexeme.getLexemeTypeString();
    int endPosition = lexeme.getEndPosition();
    int length1 = lexeme.getLength();
    Assert.assertEquals(1, offset1);
    Assert.assertEquals("", lexeme.getLexemeText());
    Assert.assertEquals(1, length1);
    Assert.assertEquals(3, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType1);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin1);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
