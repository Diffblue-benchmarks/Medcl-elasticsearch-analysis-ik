package org.wltea.analyzer.help;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

public class ESPluginLoggerFactory_getLoggerTest_3_Test {
  @Test
  public void getLoggerTest() throws Exception {
    // Arrange
    String prefix = "aaaaa";
    Class<Object> resultClass = (Class<Object>) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ESPluginLoggerFactory.getLogger(prefix, resultClass);
    Assert.assertEquals(null, resultClass);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
