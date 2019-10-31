package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet;

public class LexemePath_compareToTest_9_Test {
  @Test
  public void compareToTest() throws Exception {
    // Arrange
    LexemePath lexemePath = new LexemePath();
    LexemePath lexemePath1 = new LexemePath();

    // Act
    int actual = lexemePath.compareTo(lexemePath1);

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = lexemePath1.toString();
    int xWeight = lexemePath1.getXWeight();
    int pWeight = lexemePath1.getPWeight();
    int pathBegin = lexemePath1.getPathBegin();
    boolean isEmptyResult = lexemePath1.isEmpty();
    QuickSortSet.Cell head = lexemePath1.getHead();
    int payloadLength = lexemePath1.getPayloadLength();
    int pathEnd = lexemePath1.getPathEnd();
    int sizeResult = lexemePath1.size();
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n", toStringResult);
    Assert.assertEquals(0, lexemePath1.getPathLength());
    Assert.assertEquals(0, sizeResult);
    Assert.assertEquals(-1, pathEnd);
    Assert.assertEquals(0, payloadLength);
    Assert.assertEquals(null, head);
    Assert.assertTrue(isEmptyResult);
    Assert.assertEquals(-1, pathBegin);
    Assert.assertEquals(0, pWeight);
    Assert.assertEquals(1, xWeight);
    String toStringResult1 = lexemePath.toString();
    int xWeight1 = lexemePath.getXWeight();
    int pWeight1 = lexemePath.getPWeight();
    int pathBegin1 = lexemePath.getPathBegin();
    boolean isEmptyResult1 = lexemePath.isEmpty();
    QuickSortSet.Cell head1 = lexemePath.getHead();
    int payloadLength1 = lexemePath.getPayloadLength();
    int pathEnd1 = lexemePath.getPathEnd();
    int sizeResult1 = lexemePath.size();
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n", toStringResult1);
    Assert.assertEquals(0, lexemePath.getPathLength());
    Assert.assertEquals(0, sizeResult1);
    Assert.assertEquals(-1, pathEnd1);
    Assert.assertEquals(0, payloadLength1);
    Assert.assertEquals(null, head1);
    Assert.assertTrue(isEmptyResult1);
    Assert.assertEquals(-1, pathBegin1);
    Assert.assertEquals(0, pWeight1);
    Assert.assertEquals(1, xWeight1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
