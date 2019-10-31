package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet;

public class AnalyzeContext_addLexemePathTest_4_Test {
  @Test
  public void addLexemePathTest() throws Exception {
    // Arrange
    AnalyzeContext analyzeContext = new AnalyzeContext(null);
    LexemePath lexemePath = new LexemePath();

    // Act
    analyzeContext.addLexemePath(lexemePath);

    // Assert
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
    Lexeme nextLexeme = analyzeContext.getNextLexeme();
    String toStringResult1 = analyzeContext.toString();
    char[] segmentBuff = analyzeContext.getSegmentBuff();
    int cursor = analyzeContext.getCursor();
    char currentChar = analyzeContext.getCurrentChar();
    QuickSortSet orgLexemes = analyzeContext.getOrgLexemes();
    int currentCharType = analyzeContext.getCurrentCharType();
    int bufferOffset = analyzeContext.getBufferOffset();
    boolean isBufferLockedResult = analyzeContext.isBufferLocked();
    Assert.assertEquals(null, nextLexeme);
    Assert.assertFalse(analyzeContext.isBufferConsumed());
    Assert.assertFalse(isBufferLockedResult);
    Assert.assertEquals(0, bufferOffset);
    Assert.assertEquals(0, currentCharType);
    String toStringResult2 = orgLexemes.toString();
    boolean isEmptyResult1 = orgLexemes.isEmpty();
    QuickSortSet.Cell head1 = orgLexemes.getHead();
    Assert.assertEquals('\u0000', currentChar);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, cursor);
    Assert.assertEquals(4096, segmentBuff.length);
    Assert.assertEquals('\u0000', segmentBuff[0]);
    Assert.assertEquals('\u0000', segmentBuff[1]);
    Assert.assertEquals('\u0000', segmentBuff[2]);
    Assert.assertEquals('\u0000', segmentBuff[4093]);
    Assert.assertEquals('\u0000', segmentBuff[4094]);
    Assert.assertEquals('\u0000', segmentBuff[4095]);
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(0, orgLexemes.size());
    Assert.assertTrue(isEmptyResult1);
    Assert.assertEquals(null, head1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
