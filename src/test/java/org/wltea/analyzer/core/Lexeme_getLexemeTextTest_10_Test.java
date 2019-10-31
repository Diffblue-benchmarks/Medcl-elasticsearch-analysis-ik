package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;

public class Lexeme_getLexemeTextTest_10_Test {
  @Test
  public void getLexemeTextTest() throws Exception {
    // Arrange
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);

    // Act
    String actual = lexeme.getLexemeText();

    // Assert
    Assert.assertEquals("", actual);
    int offset = lexeme.getOffset();
    String toStringResult = lexeme.toString();
    int begin = lexeme.getBegin();
    int beginPosition = lexeme.getBeginPosition();
    int lexemeType = lexeme.getLexemeType();
    String lexemeTypeString = lexeme.getLexemeTypeString();
    int endPosition = lexeme.getEndPosition();
    int length = lexeme.getLength();
    Assert.assertEquals(1, offset);
    Assert.assertEquals("", lexeme.getLexemeText());
    Assert.assertEquals(1, length);
    Assert.assertEquals(3, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
