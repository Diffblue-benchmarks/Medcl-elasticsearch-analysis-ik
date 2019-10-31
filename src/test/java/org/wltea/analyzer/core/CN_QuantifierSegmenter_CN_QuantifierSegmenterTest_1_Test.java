package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CN_QuantifierSegmenter;

public class CN_QuantifierSegmenter_CN_QuantifierSegmenterTest_1_Test {
  @Test
  public void CN_QuantifierSegmenterTest() throws Exception {
    // Arrange and Act
    CN_QuantifierSegmenter cN_QuantifierSegmenter = new CN_QuantifierSegmenter();

    // Assert
    Assert.assertNotNull(cN_QuantifierSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
