package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CN_QuantifierSegmenter;

public class CN_QuantifierSegmenter_resetTest_3_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    CN_QuantifierSegmenter cN_QuantifierSegmenter = new CN_QuantifierSegmenter();

    // Act
    cN_QuantifierSegmenter.reset();

    // Assert
    Assert.assertNotNull(cN_QuantifierSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
