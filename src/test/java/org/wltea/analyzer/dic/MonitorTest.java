package org.wltea.analyzer.dic;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.SpecialPermission;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.dic.Monitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

@RunWith(PowerMockRunner.class)
public class MonitorTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, HttpClients.class})
  @Test
  public void staticInitOutputVoid000182971237995c041()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClients.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    PowerMockito.doReturn(null).when(HttpClients.class);
    HttpClients.createDefault();

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Monitor");

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(Monitor.class, null, "logger"));
    Assert.assertNull(Reflector.getInstanceField(Monitor.class, null, "httpclient"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, HttpClients.class})
  @Test
  public void staticInitOutputVoid00049ce1f91bd9c32f0()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClients.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    PowerMockito.doReturn(null).when(HttpClients.class);
    HttpClients.createDefault();

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Monitor");

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(Monitor.class, null, "httpclient"));
    Assert.assertNull(Reflector.getInstanceField(Monitor.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, HttpClients.class})
  @Test
  public void staticInitOutputVoid0002b0ef262553eff34()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClients.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final CloseableHttpClient closeableHttpClient = PowerMockito.mock(CloseableHttpClient.class);
    PowerMockito.doReturn(closeableHttpClient).when(HttpClients.class);
    HttpClients.createDefault();

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Monitor");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", "??????????????????????????????????????");
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Monitor.class, AccessController.class, SpecialPermission.class})
  @Test
  public void runOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(SpecialPermission.class);
    PowerMockito.mockStatic(AccessController.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", "foo");
    Reflector.setField(monitor, "eTags", null);
    final Method doPrivilegedMethod =
        DTUMemberMatcher.method(AccessController.class, "doPrivileged", PrivilegedAction.class);
    PowerMockito.doReturn(0)
        .when(AccessController.class, doPrivilegedMethod)
        .withArguments(or(isA(PrivilegedAction.class), isNull(PrivilegedAction.class)));

    // Act
    monitor.run();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", "foo");
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           Header.class, RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid00784be5e4ce7343aa9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           Header.class, RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid005f72a31162a0efb25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "?");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           Header.class, RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid22() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(
        monitor, "last_modified",
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "????????????????????");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           Header.class, RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid21() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(
        monitor, "last_modified",
        "????????????????????????????????????????????????????????????????????????????????????????????");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "????????????????????");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           Header.class, RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid20() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "????????????????????");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid000800df62b7ce786a7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", "foo");
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "foo");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid11() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid004f72a31162a0efb25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "?");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid002408574ef12f65ce9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid003a04919d8a5c18fb3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "foo");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {Logger.class, StatusLine.class, CloseableHttpResponse.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid10() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid000408574ef12f65ce9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "foo");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid001408574ef12f65ce9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid16() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid17() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "?");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid00684be5e4ce7343aa9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "?");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "foo");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid008d9b55106e78a6590() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid19() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "????");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(null).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, RequestConfig.class,
                           HttpHead.class, Monitor.class, CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", null);
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", null);
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.apache.http.client.config.RequestConfig$Builder"},
                  value = {StatusLine.class, CloseableHttpResponse.class, Header.class,
                           RequestConfig.class, HttpHead.class, Monitor.class,
                           CloseableHttpClient.class})
  @Test
  public void
  runUnprivilegedOutputVoid8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(RequestConfig.class);

    // Arrange
    final Monitor monitor = (Monitor)Reflector.getInstance("org.wltea.analyzer.dic.Monitor");
    Reflector.setField(monitor, "last_modified", "foo");
    Reflector.setField(monitor, "location", null);
    Reflector.setField(monitor, "eTags", "foo");
    final HttpHead httpHead = PowerMockito.mock(HttpHead.class);
    PowerMockito.whenNew(HttpHead.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(httpHead);
    final RequestConfig.Builder builder = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder1 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder2 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig.Builder builder3 = PowerMockito.mock(RequestConfig.Builder.class);
    final RequestConfig requestConfig =
        (RequestConfig)Reflector.getInstance("org.apache.http.client.config.RequestConfig");
    final Method buildMethod = DTUMemberMatcher.method(RequestConfig.Builder.class, "build");
    PowerMockito.doReturn(requestConfig).when(builder3, buildMethod).withNoArguments();
    final Method setSocketTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setSocketTimeout", int.class);
    PowerMockito.doReturn(builder3).when(builder2, setSocketTimeoutMethod).withArguments(anyInt());
    final Method setConnectTimeoutMethod =
        DTUMemberMatcher.method(RequestConfig.Builder.class, "setConnectTimeout", int.class);
    PowerMockito.doReturn(builder2).when(builder1, setConnectTimeoutMethod).withArguments(anyInt());
    final Method setConnectionRequestTimeoutMethod = DTUMemberMatcher.method(
        RequestConfig.Builder.class, "setConnectionRequestTimeout", int.class);
    PowerMockito.doReturn(builder1)
        .when(builder, setConnectionRequestTimeoutMethod)
        .withArguments(anyInt());
    PowerMockito.doReturn(builder).when(RequestConfig.class);
    RequestConfig.custom();

    // Act
    monitor.runUnprivileged();

    // The method returns void, testing that no exception is thrown
  }
}
