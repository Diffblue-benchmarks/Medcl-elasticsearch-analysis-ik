package org.wltea.analyzer.cfg;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.cfg.Configuration;

public class Configuration_isEnableLowercaseTest_1_Test {
  @Test
  public void isEnableLowercaseTest() throws Exception {
    // Arrange
    Configuration configuration = Whitebox.newInstance(Configuration.class);

    // Act
    boolean actual = configuration.isEnableLowercase();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
