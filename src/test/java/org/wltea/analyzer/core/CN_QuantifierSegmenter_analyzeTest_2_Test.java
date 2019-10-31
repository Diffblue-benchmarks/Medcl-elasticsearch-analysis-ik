package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.CN_QuantifierSegmenter;
import org.wltea.analyzer.core.QuickSortSet;

public class CN_QuantifierSegmenter_analyzeTest_2_Test {
  @Test
  public void analyzeTest() throws Exception {
    // Arrange
    CN_QuantifierSegmenter cN_QuantifierSegmenter = new CN_QuantifierSegmenter();
    AnalyzeContext analyzeContext = new AnalyzeContext(null);

    // Act
    cN_QuantifierSegmenter.analyze(analyzeContext);

    // Assert
    String toStringResult = analyzeContext.toString();
    char[] segmentBuff = analyzeContext.getSegmentBuff();
    int cursor = analyzeContext.getCursor();
    char currentChar = analyzeContext.getCurrentChar();
    QuickSortSet orgLexemes = analyzeContext.getOrgLexemes();
    int currentCharType = analyzeContext.getCurrentCharType();
    int bufferOffset = analyzeContext.getBufferOffset();
    boolean isBufferLockedResult = analyzeContext.isBufferLocked();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(analyzeContext.isBufferConsumed());
    Assert.assertFalse(isBufferLockedResult);
    Assert.assertEquals(0, bufferOffset);
    Assert.assertEquals(0, currentCharType);
    String toStringResult1 = orgLexemes.toString();
    boolean isEmptyResult = orgLexemes.isEmpty();
    QuickSortSet.Cell head = orgLexemes.getHead();
    Assert.assertEquals('\u0000', currentChar);
    Assert.assertEquals(4096, segmentBuff.length);
    Assert.assertEquals('\u0000', segmentBuff[0]);
    Assert.assertEquals('\u0000', segmentBuff[1]);
    Assert.assertEquals('\u0000', segmentBuff[2]);
    Assert.assertEquals('\u0000', segmentBuff[4093]);
    Assert.assertEquals('\u0000', segmentBuff[4094]);
    Assert.assertEquals('\u0000', segmentBuff[4095]);
    Assert.assertEquals(0, cursor);
    Assert.assertTrue(isEmptyResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, head);
    Assert.assertEquals(0, orgLexemes.size());
    Assert.assertNotNull(cN_QuantifierSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
