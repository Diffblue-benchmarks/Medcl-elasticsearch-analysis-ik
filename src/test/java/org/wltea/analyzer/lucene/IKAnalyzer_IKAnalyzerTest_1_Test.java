package org.wltea.analyzer.lucene;

import org.apache.lucene.util.Version;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IKAnalyzer_IKAnalyzerTest_1_Test {
  @Test
  public void IKAnalyzerTest() throws Exception {
    // Arrange
    Configuration configuration = (Configuration) null;

    // Act
    IKAnalyzer iKAnalyzer = new IKAnalyzer(configuration);

    // Assert
    String toStringResult = iKAnalyzer.toString();
    Version version = iKAnalyzer.getVersion();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("8.2.0", version.toString());
    Assert.assertEquals(8, version.major);
    Assert.assertEquals(2, version.minor);
    Assert.assertEquals(0, version.prerelease);
    Assert.assertEquals(0, version.bugfix);
    Assert.assertEquals(null, configuration);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
