package org.wltea.analyzer.help;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager.Log4jMarker;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.help.ESPluginLoggerFactory;
import org.wltea.analyzer.help.PrefixPluginLogger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class ESPluginLoggerFactoryTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNullOutputNull0006f7aed8c315b30b2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String name = null;
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(name);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNotNullOutputNotNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String name = "?";
    final Logger logger = (Logger)Reflector.getInstance("org.apache.logging.log4j.Logger");
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(name);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNotNullOutputNotNull000eb116859df183b79()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String name = "foo";
    final Logger logger = (Logger)Reflector.getInstance("org.apache.logging.log4j.Logger");
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(name);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNotNullNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = "";
    final String name = "?";
    final Logger logger = (Logger)Reflector.getInstance("org.apache.logging.log4j.Logger");
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, name);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNullNullOutputNull000cb2d4f8ce0613419() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = null;
    final String name = null;
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, name);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNotNullNullOutputNull00164e06403ad7fae08() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = "";
    final String name = null;
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, name);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNotNullNotNullOutputNull001f330a343260a6b41()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = "";
    final Class clazz = (Class)Reflector.getInstance("java.lang.Class");
    Reflector.setField(clazz, "name", "?");
    Reflector.setField(clazz, "classValueMap", null);
    Reflector.setField(clazz, "enumConstantDirectory", null);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, clazz);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNullNotNullOutputNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = null;
    final Class clazz = (Class)Reflector.getInstance("java.lang.Class");
    Reflector.setField(clazz, "name", "foo");
    Reflector.setField(clazz, "classValueMap", null);
    Reflector.setField(clazz, "enumConstantDirectory", null);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, clazz);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void getLoggerInputNullNotNullOutputNull00012af4f19746f7a66()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final String prefix = null;
    final Class clazz = (Class)Reflector.getInstance("java.lang.Class");
    Reflector.setField(clazz, "name", "?");
    Reflector.setField(clazz, "classValueMap", null);
    Reflector.setField(clazz, "enumConstantDirectory", null);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, clazz);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
    /*
  @Test
  public void getLoggerInputNotNullNullOutputNull0024ccc5fe6e26722d1() {

    // Act and Assert result
    Assert.assertNull(ESPluginLoggerFactory.getLogger("", null));
  }
*/

  // Test written by Diffblue Cover.
  @PrepareForTest({ESPluginLoggerFactory.class, Logger.class})
  @Test
  public void getLoggerInputNotNullNotNullOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Arrange
    final String prefix = "foo";
    final ExtendedLogger logger = PowerMockito.mock(ExtendedLogger.class);
    final Method getNameMethod = DTUMemberMatcher.method(Logger.class, "getName");
    PowerMockito.doReturn("foo").when(logger, getNameMethod).withNoArguments();
    final PrefixPluginLogger prefixPluginLogger = PowerMockito.mock(PrefixPluginLogger.class);
    final Log4jMarker log4jMarker =
        (Log4jMarker)Reflector.getInstance("org.apache.logging.log4j.MarkerManager$Log4jMarker");
    Reflector.setField(prefixPluginLogger, "marker", log4jMarker);
    PowerMockito.whenNew(PrefixPluginLogger.class)
        .withParameterTypes(ExtendedLogger.class, String.class, String.class)
        .withArguments(or(isA(ExtendedLogger.class), isNull(ExtendedLogger.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(prefixPluginLogger);

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, logger);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ESPluginLoggerFactory.class, Logger.class})
  @Test
  public void getLoggerInputNotNullNotNullOutputNotNull5() throws Exception {

    // Arrange
    final String prefix = "?";
    final ExtendedLogger logger = PowerMockito.mock(ExtendedLogger.class);
    final Method getNameMethod = DTUMemberMatcher.method(Logger.class, "getName");
    PowerMockito.doReturn(null).when(logger, getNameMethod).withNoArguments();
    final PrefixPluginLogger prefixPluginLogger = PowerMockito.mock(PrefixPluginLogger.class);
    final Log4jMarker log4jMarker = PowerMockito.mock(Log4jMarker.class);
    Reflector.setField(prefixPluginLogger, "marker", log4jMarker);
    PowerMockito.whenNew(PrefixPluginLogger.class)
        .withParameterTypes(ExtendedLogger.class, String.class, String.class)
        .withArguments(or(isA(ExtendedLogger.class), isNull(ExtendedLogger.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(prefixPluginLogger);

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, logger);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ESPluginLoggerFactory.class, Logger.class})
  @Test
  public void getLoggerInputNotNullNotNullOutputNotNull001c62d67f2d78d60a8()
      throws Exception, InvocationTargetException {

    // Arrange
    final String prefix = "?";
    final ExtendedLogger logger = PowerMockito.mock(ExtendedLogger.class);
    final Method getNameMethod = DTUMemberMatcher.method(Logger.class, "getName");
    PowerMockito.doReturn("?").when(logger, getNameMethod).withNoArguments();
    final PrefixPluginLogger prefixPluginLogger = PowerMockito.mock(PrefixPluginLogger.class);
    final Log4jMarker log4jMarker =
        (Log4jMarker)Reflector.getInstance("org.apache.logging.log4j.MarkerManager$Log4jMarker");
    Reflector.setField(prefixPluginLogger, "marker", log4jMarker);
    PowerMockito.whenNew(PrefixPluginLogger.class)
        .withParameterTypes(ExtendedLogger.class, String.class, String.class)
        .withArguments(or(isA(ExtendedLogger.class), isNull(ExtendedLogger.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(prefixPluginLogger);

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, logger);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
    /*
  @Test
  public void getLoggerInputNullNullOutputNull00090f5de1e1b35a2d6() {

    // Act and Assert result
    Assert.assertNull(ESPluginLoggerFactory.getLogger(null, null));
  }
*/

  // Test written by Diffblue Cover.
  @PrepareForTest({ESPluginLoggerFactory.class, Logger.class})
  @Test
  public void getLoggerInputNotNullNotNullOutputNotNull3()
      throws Exception, InvocationTargetException {

    // Arrange
    final String prefix = "foo";
    final ExtendedLogger logger = PowerMockito.mock(ExtendedLogger.class);
    final Method getNameMethod = DTUMemberMatcher.method(Logger.class, "getName");
    PowerMockito.doReturn(null).when(logger, getNameMethod).withNoArguments();
    final PrefixPluginLogger prefixPluginLogger = PowerMockito.mock(PrefixPluginLogger.class);
    final Log4jMarker log4jMarker =
        (Log4jMarker)Reflector.getInstance("org.apache.logging.log4j.MarkerManager$Log4jMarker");
    Reflector.setField(prefixPluginLogger, "marker", log4jMarker);
    PowerMockito.whenNew(PrefixPluginLogger.class)
        .withParameterTypes(ExtendedLogger.class, String.class, String.class)
        .withArguments(or(isA(ExtendedLogger.class), isNull(ExtendedLogger.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(prefixPluginLogger);

    // Act
    final Logger actual = ESPluginLoggerFactory.getLogger(prefix, logger);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
    /*
  @Test
  public void getLoggerInputNotNullNullOutputNull3() {

    // Act and Assert result
    Assert.assertNull(ESPluginLoggerFactory.getLogger("", null));
  }
  */
}
