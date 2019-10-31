package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.LetterSegmenter;

public class LetterSegmenter_LetterSegmenterTest_3_Test {
  @Test
  public void LetterSegmenterTest() throws Exception {
    // Arrange and Act
    LetterSegmenter letterSegmenter = new LetterSegmenter();

    // Assert
    Assert.assertNotNull(letterSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
