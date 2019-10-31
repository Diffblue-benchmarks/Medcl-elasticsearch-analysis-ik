package org.wltea.analyzer.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.util.Version;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IKAnalyzer_createComponentsTest_2_Test {
  @Test
  public void createComponentsTest() throws Exception {
    // Arrange
    IKAnalyzer iKAnalyzer = new IKAnalyzer();
    String fieldName = "aaaaa";

    // Act
    Analyzer.TokenStreamComponents actual = iKAnalyzer.createComponents(fieldName);

    // Assert
    TokenStream tokenStream = actual.getTokenStream();
    Assert.assertTrue(tokenStream instanceof org.wltea.analyzer.lucene.IKTokenizer);
    Assert.assertNotNull(actual.toString());
    String toStringResult = tokenStream.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(tokenStream.hasAttributes());
    String toStringResult1 = iKAnalyzer.toString();
    Version version = iKAnalyzer.getVersion();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals("8.2.0", version.toString());
    Assert.assertEquals(8, version.major);
    Assert.assertEquals(2, version.minor);
    Assert.assertEquals(0, version.prerelease);
    Assert.assertEquals(0, version.bugfix);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
