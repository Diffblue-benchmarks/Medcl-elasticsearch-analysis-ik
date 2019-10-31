package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CJKSegmenter;

public class CJKSegmenter_CJKSegmenterTest_2_Test {
  @Test
  public void CJKSegmenterTest() throws Exception {
    // Arrange and Act
    CJKSegmenter cJKSegmenter = new CJKSegmenter();

    // Assert
    Assert.assertNotNull(cJKSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
