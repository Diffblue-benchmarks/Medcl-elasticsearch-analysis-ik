package org.wltea.analyzer.help;

import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.PrefixPluginLogger;

public class PrefixPluginLogger_PrefixPluginLoggerTest_4_Test {
  @Test
  public void PrefixPluginLoggerTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaka";
    PrefixPluginLogger prefixPluginLogger = new PrefixPluginLogger(
        new PrefixPluginLogger(new PrefixPluginLogger(null, string, string1), string2, "aaaaa"), "aaaaa", string);

    // Act
    PrefixPluginLogger prefixPluginLogger1 = new PrefixPluginLogger(prefixPluginLogger, string1, string2);

    // Assert
    MessageFactory messageFactory = prefixPluginLogger1.getMessageFactory();
    String name = prefixPluginLogger1.getName();
    String toStringResult = prefixPluginLogger1.toString();
    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
    Assert.assertEquals("aaaka", prefixPluginLogger1.prefix());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", name);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory).toString());
    MessageFactory messageFactory1 = prefixPluginLogger.getMessageFactory();
    String name1 = prefixPluginLogger.getName();
    String toStringResult1 = prefixPluginLogger.toString();
    Assert.assertTrue(messageFactory1 instanceof ParameterizedMessageFactory);
    Assert.assertEquals("aaaaa", prefixPluginLogger.prefix());
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals("aaaaa", name1);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory1).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
