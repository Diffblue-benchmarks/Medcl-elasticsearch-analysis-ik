package org.wltea.analyzer.cfg;

import org.elasticsearch.env.Environment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.cfg.Configuration;

public class Configuration_getEnvironmentTest_4_Test {
  @Test
  public void getEnvironmentTest() throws Exception {
    // Arrange
    Configuration configuration = Whitebox.newInstance(Configuration.class);

    // Act
    Environment actual = configuration.getEnvironment();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
