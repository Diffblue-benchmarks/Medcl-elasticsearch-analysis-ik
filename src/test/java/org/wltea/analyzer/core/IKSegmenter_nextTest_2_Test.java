package org.wltea.analyzer.core;

import java.io.StringReader;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

public class IKSegmenter_nextTest_2_Test {
  @Test
  public void nextTest() throws Exception {
    // Arrange
    IKSegmenter iKSegmenter = new IKSegmenter(new StringReader("aaaaa"), null);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    iKSegmenter.next();
    Assert.assertNotNull(iKSegmenter.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
