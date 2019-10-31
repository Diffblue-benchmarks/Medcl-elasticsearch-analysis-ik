package org.wltea.analyzer.cfg;

import org.elasticsearch.common.settings.Settings;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.cfg.Configuration;

public class Configuration_getSettingsTest_5_Test {
  @Test
  public void getSettingsTest() throws Exception {
    // Arrange
    Configuration configuration = Whitebox.newInstance(Configuration.class);

    // Act
    Settings actual = configuration.getSettings();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
