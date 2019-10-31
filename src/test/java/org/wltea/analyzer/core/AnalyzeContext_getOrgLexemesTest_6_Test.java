package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class AnalyzeContext_getOrgLexemesTest_6_Test {
  @Test
  public void getOrgLexemesTest() throws Exception {
    // Arrange
    AnalyzeContext analyzeContext = new AnalyzeContext(null);

    // Act
    QuickSortSet actual = analyzeContext.getOrgLexemes();

    // Assert
    String toStringResult = actual.toString();
    boolean isEmptyResult = actual.isEmpty();
    QuickSortSet.Cell head = actual.getHead();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, actual.size());
    Assert.assertEquals(null, head);
    Assert.assertTrue(isEmptyResult);
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
    Assert.assertSame(actual, orgLexemes);
    Assert.assertEquals('\u0000', currentChar);
    Assert.assertEquals(0, cursor);
    Assert.assertEquals(4096, segmentBuff.length);
    Assert.assertEquals('\u0000', segmentBuff[0]);
    Assert.assertEquals('\u0000', segmentBuff[1]);
    Assert.assertEquals('\u0000', segmentBuff[2]);
    Assert.assertEquals('\u0000', segmentBuff[4093]);
    Assert.assertEquals('\u0000', segmentBuff[4094]);
    Assert.assertEquals('\u0000', segmentBuff[4095]);
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
