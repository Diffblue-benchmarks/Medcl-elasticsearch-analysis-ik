package org.wltea.analyzer.lucene;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.lucene.IKTokenizer;

public class IKTokenizer_IKTokenizerTest_1_Test {
  @Test
  public void IKTokenizerTest() throws Exception {
    // Arrange
    Configuration configuration = (Configuration) null;

    // Act
    IKTokenizer iKTokenizer = new IKTokenizer(configuration);

    // Assert
    String toStringResult = iKTokenizer.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(iKTokenizer.hasAttributes());
    Assert.assertEquals(null, configuration);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
