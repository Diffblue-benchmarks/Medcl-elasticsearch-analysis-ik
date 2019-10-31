package org.wltea.analyzer.help;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.message.FormattedMessage;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.PrefixPluginLogger;

public class PrefixPluginLogger_logMessageTest_1_Test {
  @Test
  public void logMessageTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "kaaaa";
    String string3 = "aaaaa";
    String string4 = "aaaaa";
    PrefixPluginLogger prefixPluginLogger = new PrefixPluginLogger(
        new PrefixPluginLogger(new PrefixPluginLogger(new PrefixPluginLogger(null, string, string1), string2, string3),
            string4, string),
        string1, string2);
    Level level = (Level) null;
    MarkerManager.Log4jMarker log4jMarker = new MarkerManager.Log4jMarker(string1);
    MarkerManager.Log4jMarker log4jMarker1 = new MarkerManager.Log4jMarker(string);
    log4jMarker.setParents(new Marker[]{null, log4jMarker1, null});
    MarkerManager.Log4jMarker log4jMarker2 = new MarkerManager.Log4jMarker(string4);
    log4jMarker.setParents(new Marker[]{log4jMarker2, log4jMarker1, log4jMarker2});
    FormattedMessage formattedMessage = new FormattedMessage(string3, "kaaaa");
    Throwable throwable = new Throwable();

    // Act and Assert
    thrown.expect(AssertionError.class);
    prefixPluginLogger.logMessage(string3, level, log4jMarker, formattedMessage, throwable);
    Assert.assertEquals(null, level);
    String name = log4jMarker.getName();
    String toStringResult = log4jMarker.toString();
    Marker[] parents = log4jMarker.getParents();
    Assert.assertEquals("aaaaa", name);
    Assert.assertTrue(log4jMarker.hasParents());
    Assert.assertEquals(3, parents.length);
    Marker marker = parents[1];
    Marker marker1 = parents[2];
    Assert.assertEquals("aaaaa[ aaaaa, aaaaa, aaaaa ]", toStringResult);
    Assert.assertSame(log4jMarker2, marker1);
    Assert.assertTrue(marker1 instanceof MarkerManager.Log4jMarker);
    Assert.assertSame(log4jMarker1, marker);
    Assert.assertTrue(marker instanceof MarkerManager.Log4jMarker);
    Assert.assertSame(log4jMarker2, marker1);
    Assert.assertSame(log4jMarker1, marker);
    Assert.assertSame(log4jMarker2, parents[0]);
    Throwable throwable1 = formattedMessage.getThrowable();
    String toStringResult1 = formattedMessage.toString();
    String formattedMessage1 = formattedMessage.getFormattedMessage();
    String format = formattedMessage.getFormat();
    Object[] parameters = formattedMessage.getParameters();
    Assert.assertEquals(null, throwable1);
    Assert.assertEquals(1, parameters.length);
    Object object = parameters[0];
    Assert.assertEquals("aaaaa", format);
    Assert.assertEquals("FormattedMessage[messagePattern=aaaaa, args=[kaaaa]]", toStringResult1);
    Assert.assertEquals("aaaaa", formattedMessage1);
    Assert.assertTrue(object instanceof String);
    Assert.assertEquals("kaaaa", object);
    String toStringResult2 = throwable.toString();
    Throwable[] suppressed = throwable.getSuppressed();
    String message = throwable.getMessage();
    Throwable cause = throwable.getCause();
    Assert.assertEquals("java.lang.Throwable", toStringResult2);
    Assert.assertEquals(null, throwable.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
    MessageFactory messageFactory = prefixPluginLogger.getMessageFactory();
    String name1 = prefixPluginLogger.getName();
    String toStringResult3 = prefixPluginLogger.toString();
    Assert.assertTrue(messageFactory instanceof ParameterizedMessageFactory);
    Assert.assertEquals("kaaaa", prefixPluginLogger.prefix());
    Assert.assertNotNull(toStringResult3);
    Assert.assertEquals("aaaaa", name1);
    Assert.assertNotNull(((ParameterizedMessageFactory) messageFactory).toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
