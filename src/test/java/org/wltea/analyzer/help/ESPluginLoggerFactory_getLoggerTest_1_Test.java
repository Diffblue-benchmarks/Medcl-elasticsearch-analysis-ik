package org.wltea.analyzer.help;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.simple.SimpleLogger;
import org.apache.logging.log4j.spi.StandardLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

public class ESPluginLoggerFactory_getLoggerTest_1_Test {
//failed_compile   @Test
//  public void getLoggerTest() throws Exception {
//    // Arrange
//    String name = "aaaaa";
//
//    // Act
//    Logger actual = ESPluginLoggerFactory.getLogger(name);
//
//    // Assert
//    Assert.assertTrue(actual instanceof SimpleLogger);
//    MessageFactory messageFactory = actual.getMessageFactory();
//    boolean isTraceEnabledResult = actual.isTraceEnabled();
//    String name1 = actual.getName();
//    String toStringResult = ((SimpleLogger) actual).toString();
//    boolean isDebugEnabledResult = actual.isDebugEnabled();
//    boolean isErrorEnabledResult = actual.isErrorEnabled();
//    boolean isFatalEnabledResult = actual.isFatalEnabled();
//    boolean isWarnEnabledResult = actual.isWarnEnabled();
//    Level level = actual.getLevel();
//    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
//    Assert.assertFalse(actual.isInfoEnabled());
//    String toStringResult1 = ((ParameterizedMessageFactory) messageFactory).toString();
//    String toStringResult2 = level.toString();
//    Class<Level> declaringClass = level.getDeclaringClass();
//    Assert.assertFalse(isTraceEnabledResult);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(isWarnEnabledResult);
//    Assert.assertFalse(isDebugEnabledResult);
//    Assert.assertEquals("aaaaa", name1);
//    Assert.assertTrue(isFatalEnabledResult);
//    Assert.assertTrue(isErrorEnabledResult);
//    Assert.assertTrue(declaringClass instanceof Level);
//    Assert.assertEquals(StandardLevel.ERROR, level.getStandardLevel());
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals("ERROR", toStringResult2);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
