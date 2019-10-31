package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CJKSegmenter;

public class CJKSegmenter_resetTest_1_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    CJKSegmenter cJKSegmenter = new CJKSegmenter();

    // Act
    cJKSegmenter.reset();

    // Assert
    Assert.assertNotNull(cJKSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
