package org.elasticsearch.index.analysis;

import org.elasticsearch.index.analysis.IkAnalyzerProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IkAnalyzerProvider_getTest_4_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    IkAnalyzerProvider ikAnalyzerProvider = Whitebox.newInstance(IkAnalyzerProvider.class);

    // Act
    IKAnalyzer actual = ikAnalyzerProvider.get();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
