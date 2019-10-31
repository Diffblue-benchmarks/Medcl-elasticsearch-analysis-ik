package org.wltea.analyzer.help;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.StandardLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.ESPluginLoggerFactory;
import org.wltea.analyzer.help.PrefixPluginLogger;

public class ESPluginLoggerFactory_getLoggerTest_4_Test {
//failed_compile   @Test
//  public void getLoggerTest() throws Exception {
//    // Arrange
//    String prefix = "aaaaa";
//    String name = "aaaaa";
//
//    // Act
//    Logger actual = ESPluginLoggerFactory.getLogger(prefix, name);
//
//    // Assert
//    Assert.assertTrue(actual instanceof PrefixPluginLogger);
//    MessageFactory messageFactory = actual.getMessageFactory();
//    boolean isTraceEnabledResult = actual.isTraceEnabled();
//    String name1 = actual.getName();
//    String toStringResult = ((PrefixPluginLogger) actual).toString();
//    boolean isDebugEnabledResult = actual.isDebugEnabled();
//    boolean isErrorEnabledResult = actual.isErrorEnabled();
//    boolean isFatalEnabledResult = actual.isFatalEnabled();
//    String prefixResult = ((PrefixPluginLogger) actual).prefix();
//    boolean isWarnEnabledResult = actual.isWarnEnabled();
//    Level level = actual.getLevel();
//    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
//    Assert.assertFalse(actual.isInfoEnabled());
//    String toStringResult1 = ((ParameterizedMessageFactory) messageFactory).toString();
//    String toStringResult2 = level.toString();
//    Class<Level> declaringClass = level.getDeclaringClass();
//    Assert.assertFalse(isTraceEnabledResult);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("aaaaa", prefixResult);
//    Assert.assertFalse(isWarnEnabledResult);
//    Assert.assertFalse(isDebugEnabledResult);
//    Assert.assertEquals("aaaaa", name1);
//    Assert.assertTrue(isFatalEnabledResult);
//    Assert.assertTrue(isErrorEnabledResult);
//    Assert.assertEquals("ERROR", toStringResult2);
//    Assert.assertTrue(declaringClass instanceof Level);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(StandardLevel.ERROR, level.getStandardLevel());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
