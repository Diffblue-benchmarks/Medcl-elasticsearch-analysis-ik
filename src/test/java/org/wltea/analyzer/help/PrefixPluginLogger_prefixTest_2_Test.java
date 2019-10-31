package org.wltea.analyzer.help;

import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.PrefixPluginLogger;

public class PrefixPluginLogger_prefixTest_2_Test {
  @Test
  public void prefixTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "kaaaa";
    PrefixPluginLogger prefixPluginLogger = new PrefixPluginLogger(
        new PrefixPluginLogger(new PrefixPluginLogger(new PrefixPluginLogger(null, string, string1), string2, "aaaaa"),
            "aaaaa", string),
        string1, string2);

    // Act
    String actual = prefixPluginLogger.prefix();

    // Assert
    Assert.assertEquals("kaaaa", actual);
    MessageFactory messageFactory = prefixPluginLogger.getMessageFactory();
    String name = prefixPluginLogger.getName();
    String toStringResult = prefixPluginLogger.toString();
    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
    Assert.assertEquals("kaaaa", prefixPluginLogger.prefix());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", name);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
