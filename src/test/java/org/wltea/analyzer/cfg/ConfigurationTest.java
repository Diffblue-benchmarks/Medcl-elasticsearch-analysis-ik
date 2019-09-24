package org.wltea.analyzer.cfg;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.elasticsearch.common.io.PathUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.cfg.Configuration;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Path;
import java.security.CodeSource;
import java.security.ProtectionDomain;

@RunWith(PowerMockRunner.class)
public class ConfigurationTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();
  // Test written by Diffblue Cover.
  @PrepareForTest({URL.class, Class.class, Configuration.class, CodeSource.class,
                   ProtectionDomain.class, File.class})
  @Test
  public void
  getConfigInPluginDirOutputNullPointerException() throws Exception, InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenThrow(nullPointerException);

    // Act
    thrown.expect(NullPointerException.class);
    configuration.getConfigInPluginDir();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PathUtils.class, URL.class, Class.class, Configuration.class, CodeSource.class,
                   ProtectionDomain.class, Path.class, File.class})
  @Test
  public void
  getConfigInPluginDirOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(PathUtils.class);

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    final File file = PowerMockito.mock(File.class);
    PowerMockito.when(file.getParent()).thenReturn(null);
    Reflector.setField(file, "prefixLength", 1_073_741_824);
    Reflector.setField(file, "path", "foo");
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(file);
    final Path path = PowerMockito.mock(Path.class);
    final Path path1 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Method toAbsolutePathMethod = DTUMemberMatcher.method(Path.class, "toAbsolutePath");
    PowerMockito.doReturn(path1).when(path, toAbsolutePathMethod).withNoArguments();
    final Method getMethod =
        DTUMemberMatcher.method(PathUtils.class, "get", String.class, java.lang.String[].class);
    PowerMockito.doReturn(path)
        .when(PathUtils.class, getMethod)
        .withArguments(
            or(isA(String.class), isNull(String.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    final Path actual = configuration.getConfigInPluginDir();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PathUtils.class, URL.class, Class.class, Configuration.class, CodeSource.class,
                   ProtectionDomain.class, Path.class, File.class})
  @Test
  public void
  getConfigInPluginDirOutputNull000ab03e4f5ca57b124() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(PathUtils.class);

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    final File file = PowerMockito.mock(File.class);
    PowerMockito.when(file.getParent()).thenReturn(null);
    Reflector.setField(file, "prefixLength", 1);
    Reflector.setField(file, "path", "");
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(file);
    final Path path = PowerMockito.mock(Path.class);
    final Method toAbsolutePathMethod = DTUMemberMatcher.method(Path.class, "toAbsolutePath");
    PowerMockito.doReturn(null).when(path, toAbsolutePathMethod).withNoArguments();
    final Method getMethod =
        DTUMemberMatcher.method(PathUtils.class, "get", String.class, java.lang.String[].class);
    PowerMockito.doReturn(path)
        .when(PathUtils.class, getMethod)
        .withArguments(
            or(isA(String.class), isNull(String.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    final Path actual = configuration.getConfigInPluginDir();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PathUtils.class, URL.class, Class.class, Configuration.class, CodeSource.class,
                   ProtectionDomain.class, Path.class, File.class})
  @Test
  public void
  getConfigInPluginDirOutputNull3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(PathUtils.class);

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    final File file = PowerMockito.mock(File.class);
    PowerMockito.when(file.getParent()).thenReturn("");
    Reflector.setField(file, "prefixLength", -1_073_741_824);
    Reflector.setField(file, "path", "");
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(file);
    final Path path = PowerMockito.mock(Path.class);
    final Method toAbsolutePathMethod = DTUMemberMatcher.method(Path.class, "toAbsolutePath");
    PowerMockito.doReturn(null).when(path, toAbsolutePathMethod).withNoArguments();
    final Method getMethod =
        DTUMemberMatcher.method(PathUtils.class, "get", String.class, java.lang.String[].class);
    PowerMockito.doReturn(path)
        .when(PathUtils.class, getMethod)
        .withArguments(
            or(isA(String.class), isNull(String.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    final Path actual = configuration.getConfigInPluginDir();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PathUtils.class, URL.class, Class.class, Configuration.class, CodeSource.class,
                   ProtectionDomain.class, Path.class, File.class})
  @Test
  public void
  getConfigInPluginDirOutputNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(PathUtils.class);

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    final File file = PowerMockito.mock(File.class);
    PowerMockito.when(file.getParent()).thenReturn(null);
    Reflector.setField(file, "prefixLength", 65_537);
    Reflector.setField(file, "path", "foo");
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(file);
    final Path path = PowerMockito.mock(Path.class);
    final Method toAbsolutePathMethod = DTUMemberMatcher.method(Path.class, "toAbsolutePath");
    PowerMockito.doReturn(null).when(path, toAbsolutePathMethod).withNoArguments();
    final Method getMethod =
        DTUMemberMatcher.method(PathUtils.class, "get", String.class, java.lang.String[].class);
    PowerMockito.doReturn(path)
        .when(PathUtils.class, getMethod)
        .withArguments(
            or(isA(String.class), isNull(String.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    final Path actual = configuration.getConfigInPluginDir();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUseSmartOutputFalse() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act and Assert result
    Assert.assertFalse(configuration.isUseSmart());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setUseSmartInputFalseOutputNotNull() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act
    final Configuration actual = configuration.setUseSmart(false);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getEnvironmentOutputNull() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act and Assert result
    Assert.assertNull(configuration.getEnvironment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSettingsOutputNull() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act and Assert result
    Assert.assertNull(configuration.getSettings());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnableRemoteDictOutputFalse() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act and Assert result
    Assert.assertFalse(configuration.isEnableRemoteDict());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnableLowercaseOutputFalse() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act and Assert result
    Assert.assertFalse(configuration.isEnableLowercase());
  }
}
