package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet;

public class LexemePath_checkCrossTest_10_Test {
  @Test
  public void checkCrossTest() throws Exception {
    // Arrange
    LexemePath lexemePath = new LexemePath();
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);

    // Act
    boolean actual = lexemePath.checkCross(lexeme);

    // Assert
    Assert.assertFalse(actual);
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
    String toStringResult1 = lexemePath.toString();
    int xWeight = lexemePath.getXWeight();
    int pWeight = lexemePath.getPWeight();
    int pathBegin = lexemePath.getPathBegin();
    boolean isEmptyResult = lexemePath.isEmpty();
    QuickSortSet.Cell head = lexemePath.getHead();
    int payloadLength = lexemePath.getPayloadLength();
    int pathEnd = lexemePath.getPathEnd();
    int sizeResult = lexemePath.size();
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n", toStringResult1);
    Assert.assertEquals(0, lexemePath.getPathLength());
    Assert.assertEquals(0, sizeResult);
    Assert.assertEquals(-1, pathEnd);
    Assert.assertEquals(0, payloadLength);
    Assert.assertEquals(null, head);
    Assert.assertTrue(isEmptyResult);
    Assert.assertEquals(-1, pathBegin);
    Assert.assertEquals(0, pWeight);
    Assert.assertEquals(1, xWeight);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
