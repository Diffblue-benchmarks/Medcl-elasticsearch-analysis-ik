package org.wltea.analyzer.help;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager.Log4jMarker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.help.PrefixPluginLogger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

@RunWith(PowerMockRunner.class)
public class PrefixPluginLoggerTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(PrefixPluginLogger.class)
  @Test
  public void staticInitOutputVoid0005a25b74e962bf51c()
      throws Exception, InvocationTargetException {

    // Arrange
    final WeakHashMap weakHashMap = PowerMockito.mock(WeakHashMap.class);
    PowerMockito.whenNew(WeakHashMap.class).withNoArguments().thenReturn(weakHashMap);

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.help.PrefixPluginLogger");
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void markersSizeOutputZero() throws Exception {

    // Act
    final int actual = PrefixPluginLogger.markersSize();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Marker.class)
  @Test
  public void prefixOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final PrefixPluginLogger prefixPluginLogger =
        (PrefixPluginLogger)Reflector.getInstance("org.wltea.analyzer.help.PrefixPluginLogger");
    final Marker marker = PowerMockito.mock(Marker.class);
    final Method getNameMethod = DTUMemberMatcher.method(Marker.class, "getName");
    PowerMockito.doReturn("foo").when(marker, getNameMethod).withNoArguments();
    Reflector.setField(prefixPluginLogger, "marker", marker);

    // Act
    final String actual = prefixPluginLogger.prefix();

    // Assert result
    Assert.assertEquals("foo", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNotNullOutputVoid0025ccb8ac4fd213a28() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = "?";
    final Log4jMarker log4jMarker = PowerMockito.mock(Log4jMarker.class);
    PowerMockito.whenNew(Log4jMarker.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(log4jMarker);

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNullOutputVoid0004d4e22b4f1142d69() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = null;
    final Log4jMarker log4jMarker = PowerMockito.mock(Log4jMarker.class);
    PowerMockito.whenNew(Log4jMarker.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(log4jMarker);

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNullOutputVoid000747f0abd153575f7() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = null;

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = "foo";
    final Log4jMarker log4jMarker = PowerMockito.mock(Log4jMarker.class);
    PowerMockito.whenNew(Log4jMarker.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(log4jMarker);

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNullOutputVoid4() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = null;

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNotNullNotNullNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = PowerMockito.mock(ExtendedLogger.class);
    final String name = "foo";
    final String prefix = "foo";

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNotNullOutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = "foo";

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PrefixPluginLogger.class, WeakHashMap.class})
  @Test
  public void constructorInputNullNullNullOutputVoid0014d4e22b4f1142d69() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(ExtendedLoggerWrapper.class));

    // Arrange
    final ExtendedLogger logger = null;
    final String name = null;
    final String prefix = null;
    final Log4jMarker log4jMarker = PowerMockito.mock(Log4jMarker.class);
    PowerMockito.whenNew(Log4jMarker.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(log4jMarker);

    // Act, creating object to test constructor
    final PrefixPluginLogger actual = new PrefixPluginLogger(logger, name, prefix);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ExtendedLoggerWrapper.class)
  @Test
  public void logMessageInputNullNullNullNullNullOutputVoid0009c032ca0959f090f() throws Exception {

    // Arrange
    final PrefixPluginLogger prefixPluginLogger = PowerMockito.mock(PrefixPluginLogger.class);
    PowerMockito.doCallRealMethod().when(prefixPluginLogger);
    prefixPluginLogger.logMessage(
        or(isA(String.class), isNull(String.class)), or(isA(Level.class), isNull(Level.class)),
        or(isA(Marker.class), isNull(Marker.class)), or(isA(Message.class), isNull(Message.class)),
        or(isA(Throwable.class), isNull(Throwable.class)));
    Reflector.setField(prefixPluginLogger, "marker", null);
    final String fqcn = null;
    final Level level = null;
    final Marker marker = null;
    final Message message = null;
    final Throwable t = null;

    // Act
    prefixPluginLogger.logMessage(fqcn, level, marker, message, t);

    // The method returns void, testing that no exception is thrown
  }
}
