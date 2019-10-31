package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet;

public class LexemePath_removeTailTest_13_Test {
  @Test
  public void removeTailTest() throws Exception {
    // Arrange
    LexemePath lexemePath = new LexemePath();

    // Act
    Lexeme actual = lexemePath.removeTail();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = lexemePath.toString();
    int xWeight = lexemePath.getXWeight();
    int pWeight = lexemePath.getPWeight();
    int pathBegin = lexemePath.getPathBegin();
    boolean isEmptyResult = lexemePath.isEmpty();
    QuickSortSet.Cell head = lexemePath.getHead();
    int payloadLength = lexemePath.getPayloadLength();
    int pathEnd = lexemePath.getPathEnd();
    int sizeResult = lexemePath.size();
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n", toStringResult);
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
