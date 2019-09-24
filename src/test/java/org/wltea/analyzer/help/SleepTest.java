package org.wltea.analyzer.help;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.help.Sleep.Type;
import org.wltea.analyzer.help.Sleep;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class SleepTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();
  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Sleep actual = new Sleep();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void staticInitOutputVoid00098dc34466e4d09c2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.help.Sleep");

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(Sleep.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LogManager.class)
  @Test
  public void staticInitOutputVoid0008e99819af3af2300()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.help.Sleep");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid3() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.help.Sleep$Type");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid0000179d01721e63278() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.help.Sleep$1");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    Sleep.Type.valueOf(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputMsecZeroOutputVoid000dbc39d2b9e51fe58() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.MSEC;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputMsecZeroOutputVoid001dbc39d2b9e51fe58() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.MSEC;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputHourZeroOutputVoid0024afc449c300cc824() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.HOUR;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputSecZeroOutputVoid000b37b939241fdbaa9() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.SEC;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputSecZeroOutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.SEC;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputMinZeroOutputVoid00271957ab83c29ad7c() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.MIN;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputMinZeroOutputVoid00371957ab83c29ad7c() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.MIN;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputHourZeroOutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.HOUR;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputHourZeroOutputVoid0034afc449c300cc824() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.HOUR;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Sleep.class, Thread.class})
  @Test
  public void sleepInputSecZeroOutputVoid001b37b939241fdbaa9() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final Sleep.Type type = Sleep.Type.SEC;
    final int num = 0;

    // Act
    Sleep.sleep(type, num);

    // The method returns void, testing that no exception is thrown
  }
}
