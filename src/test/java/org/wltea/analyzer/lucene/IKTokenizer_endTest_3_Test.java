package org.wltea.analyzer.lucene;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.lucene.IKTokenizer;

public class IKTokenizer_endTest_3_Test {
  @Test
  public void endTest() throws Exception {
    // Arrange
    IKTokenizer iKTokenizer = new IKTokenizer(null);

    // Act
    iKTokenizer.end();

    // Assert
    String toStringResult = iKTokenizer.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(iKTokenizer.hasAttributes());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
