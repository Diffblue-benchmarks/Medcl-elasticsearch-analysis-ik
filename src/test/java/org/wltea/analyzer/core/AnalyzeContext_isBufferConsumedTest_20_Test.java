package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class AnalyzeContext_isBufferConsumedTest_20_Test {
  @Test
  public void isBufferConsumedTest() throws Exception {
    // Arrange
    AnalyzeContext analyzeContext = new AnalyzeContext(null);

    // Act
    boolean actual = analyzeContext.isBufferConsumed();

    // Assert
    Assert.assertFalse(actual);
    Lexeme nextLexeme = analyzeContext.getNextLexeme();
    String toStringResult = analyzeContext.toString();
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
    String toStringResult1 = orgLexemes.toString();
    boolean isEmptyResult = orgLexemes.isEmpty();
    QuickSortSet.Cell head = orgLexemes.getHead();
    Assert.assertEquals('\u0000', currentChar);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, cursor);
    Assert.assertEquals(4096, segmentBuff.length);
    Assert.assertEquals('\u0000', segmentBuff[0]);
    Assert.assertEquals('\u0000', segmentBuff[1]);
    Assert.assertEquals('\u0000', segmentBuff[2]);
    Assert.assertEquals('\u0000', segmentBuff[4093]);
    Assert.assertEquals('\u0000', segmentBuff[4094]);
    Assert.assertEquals('\u0000', segmentBuff[4095]);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, orgLexemes.size());
    Assert.assertTrue(isEmptyResult);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
