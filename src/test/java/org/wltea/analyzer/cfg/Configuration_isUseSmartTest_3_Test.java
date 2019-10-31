package org.wltea.analyzer.cfg;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.cfg.Configuration;

public class Configuration_isUseSmartTest_3_Test {
  @Test
  public void isUseSmartTest() throws Exception {
    // Arrange
    Configuration configuration = Whitebox.newInstance(Configuration.class);

    // Act
    boolean actual = configuration.isUseSmart();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
