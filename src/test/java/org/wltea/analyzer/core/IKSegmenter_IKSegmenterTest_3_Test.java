package org.wltea.analyzer.core;

import java.io.StringReader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;

public class IKSegmenter_IKSegmenterTest_3_Test {
  @Test
  public void IKSegmenterTest() throws Exception {
    // Arrange
    StringReader stringReader = new StringReader("aaaaa");
    Configuration configuration = (Configuration) null;

    // Act
    IKSegmenter iKSegmenter = new IKSegmenter(stringReader, configuration);

    // Assert
    Assert.assertNotNull(iKSegmenter.toString());
    boolean readyResult = stringReader.ready();
    Assert.assertTrue(readyResult);
    Assert.assertNotNull(stringReader.toString());
    Assert.assertEquals(null, configuration);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
