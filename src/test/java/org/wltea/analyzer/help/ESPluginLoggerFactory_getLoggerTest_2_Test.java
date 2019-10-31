package org.wltea.analyzer.help;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.ESPluginLoggerFactory;
import org.wltea.analyzer.help.PrefixPluginLogger;

public class ESPluginLoggerFactory_getLoggerTest_2_Test {
  @Test
  public void getLoggerTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "kaaaa";
    String string3 = "aaaaa";
    PrefixPluginLogger prefixPluginLogger = new PrefixPluginLogger(
        new PrefixPluginLogger(new PrefixPluginLogger(new PrefixPluginLogger(null, string1, string2), string3, "aaaaa"),
            string, string1),
        string2, string3);

    // Act
    Logger actual = ESPluginLoggerFactory.getLogger(string, prefixPluginLogger);

    // Assert
    Assert.assertTrue(actual instanceof PrefixPluginLogger);
    MessageFactory messageFactory = actual.getMessageFactory();
    String name = actual.getName();
    String toStringResult = ((PrefixPluginLogger) actual).toString();
    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
    Assert.assertEquals("aaaaa", ((PrefixPluginLogger) actual).prefix());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("kaaaa", name);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory).toString());
    MessageFactory messageFactory1 = prefixPluginLogger.getMessageFactory();
    String name1 = prefixPluginLogger.getName();
    String toStringResult1 = prefixPluginLogger.toString();
    Assert.assertTrue(messageFactory1 instanceof ParameterizedMessageFactory);
    Assert.assertEquals("aaaaa", prefixPluginLogger.prefix());
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals("kaaaa", name1);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory1).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
