package org.wltea.analyzer.core;

import java.io.StringReader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;

public class IKSegmenter_resetTest_1_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    IKSegmenter iKSegmenter = new IKSegmenter(new StringReader("aaaaa"), null);
    StringReader stringReader = new StringReader("kaaaa");

    // Act
    iKSegmenter.reset(stringReader);

    // Assert
    boolean readyResult = stringReader.ready();
    Assert.assertTrue(readyResult);
    Assert.assertNotNull(stringReader.toString());
    Assert.assertNotNull(iKSegmenter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
