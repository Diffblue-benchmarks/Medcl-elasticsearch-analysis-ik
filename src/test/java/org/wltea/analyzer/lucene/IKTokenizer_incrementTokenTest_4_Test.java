package org.wltea.analyzer.lucene;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.lucene.IKTokenizer;

public class IKTokenizer_incrementTokenTest_4_Test {
  @Test
  public void incrementTokenTest() throws Exception {
    // Arrange
    IKTokenizer iKTokenizer = new IKTokenizer(null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    iKTokenizer.incrementToken();
    String toStringResult = iKTokenizer.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(iKTokenizer.hasAttributes());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
