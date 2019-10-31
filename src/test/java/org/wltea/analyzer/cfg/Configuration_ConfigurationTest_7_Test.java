package org.wltea.analyzer.cfg;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;

public class Configuration_ConfigurationTest_7_Test {
  @Test
  public void ConfigurationTest() throws Exception {
    // Arrange
    Environment environment = (Environment) null;
    Settings settings = (Settings) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new Configuration(environment, settings);
    Assert.assertEquals(null, environment);
    Assert.assertEquals(null, settings);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
