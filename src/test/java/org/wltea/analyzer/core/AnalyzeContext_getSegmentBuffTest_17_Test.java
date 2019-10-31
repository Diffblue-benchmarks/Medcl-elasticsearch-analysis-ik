package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class AnalyzeContext_getSegmentBuffTest_17_Test {
  @Test
  public void getSegmentBuffTest() throws Exception {
    // Arrange
    AnalyzeContext analyzeContext = new AnalyzeContext(null);

    // Act
    char[] actual = analyzeContext.getSegmentBuff();

    // Assert
    Assert.assertEquals(4096, actual.length);
    Assert.assertEquals('\u0000', actual[0]);
    Assert.assertEquals('\u0000', actual[1]);
    Assert.assertEquals('\u0000', actual[2]);
    Assert.assertEquals('\u0000', actual[3]);
    Assert.assertEquals('\u0000', actual[4]);
    Assert.assertEquals('\u0000', actual[5]);
    Assert.assertEquals('\u0000', actual[4090]);
    Assert.assertEquals('\u0000', actual[4091]);
    Assert.assertEquals('\u0000', actual[4092]);
    Assert.assertEquals('\u0000', actual[4093]);
    Assert.assertEquals('\u0000', actual[4094]);
    Assert.assertEquals('\u0000', actual[4095]);
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
    Assert.assertSame(actual, segmentBuff);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, orgLexemes.size());
    Assert.assertTrue(isEmptyResult);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
