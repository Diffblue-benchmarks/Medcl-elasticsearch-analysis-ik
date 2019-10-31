package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.LetterSegmenter;

public class LetterSegmenter_resetTest_2_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    LetterSegmenter letterSegmenter = new LetterSegmenter();

    // Act
    letterSegmenter.reset();

    // Assert
    Assert.assertNotNull(letterSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
