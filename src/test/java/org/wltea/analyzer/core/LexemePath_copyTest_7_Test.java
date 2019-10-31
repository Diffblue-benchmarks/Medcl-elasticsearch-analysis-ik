package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet;

public class LexemePath_copyTest_7_Test {
  @Test
  public void copyTest() throws Exception {
    // Arrange
    LexemePath lexemePath = new LexemePath();

    // Act
    LexemePath actual = lexemePath.copy();

    // Assert
    String toStringResult = actual.toString();
    int xWeight = actual.getXWeight();
    int pWeight = actual.getPWeight();
    int pathBegin = actual.getPathBegin();
    boolean isEmptyResult = actual.isEmpty();
    QuickSortSet.Cell head = actual.getHead();
    int payloadLength = actual.getPayloadLength();
    int pathEnd = actual.getPathEnd();
    int sizeResult = actual.size();
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n", toStringResult);
    Assert.assertEquals(0, actual.getPathLength());
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
