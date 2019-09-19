package org.wltea.analyzer.dic;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.env.Environment;
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
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.dic.Hit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@RunWith(PowerMockRunner.class)
public class DictionaryTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, Dictionary.class, Executors.class})
  @Test
  public void staticInitOutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Executors.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method newScheduledThreadPoolMethod =
        DTUMemberMatcher.method(Executors.class, "newScheduledThreadPool", int.class);
    PowerMockito.doReturn(null)
        .when(Executors.class, newScheduledThreadPoolMethod)
        .withArguments(anyInt());

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(Dictionary.class, null, "pool"));
    Assert.assertNull(Reflector.getInstanceField(Dictionary.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, Dictionary.class, Executors.class})
  @Test
  public void staticInitOutputVoid000cf410af5774afa69()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Executors.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(logger)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final ScheduledExecutorService scheduledExecutorService =
        PowerMockito.mock(ScheduledExecutorService.class);
    final Method newScheduledThreadPoolMethod =
        DTUMemberMatcher.method(Executors.class, "newScheduledThreadPool", int.class);
    PowerMockito.doReturn(scheduledExecutorService)
        .when(Executors.class, newScheduledThreadPoolMethod)
        .withArguments(anyInt());

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LogManager.class, Dictionary.class, Executors.class})
  @Test
  public void staticInitOutputVoid0007dd9f36241d0f911()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Executors.class);
    PowerMockito.mockStatic(LogManager.class);

    // Arrange
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LogManager.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LogManager.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method newScheduledThreadPoolMethod =
        DTUMemberMatcher.method(Executors.class, "newScheduledThreadPool", int.class);
    PowerMockito.doReturn(null)
        .when(Executors.class, newScheduledThreadPoolMethod)
        .withArguments(anyInt());

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(Dictionary.class, null, "logger"));
    Assert.assertNull(Reflector.getInstanceField(Dictionary.class, null, "pool"));
  }

  // Test written by Diffblue Cover.

  @Test
  public void getExtStopWordDictionarysOutput03() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getExtDictionarysOutput03() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, FileInputStream.class, Dictionary.class, Properties.class,
                   Environment.class, Path.class})
  @Test
  public void
  reLoadMainDictOutputIllegalStateException000ce90886711aea8a5()
      throws Exception, InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment = PowerMockito.mock(Environment.class);
    final Path path = PowerMockito.mock(Path.class);
    final Path path1 = PowerMockito.mock(Path.class);
    final Path path2 = PowerMockito.mock(Path.class);
    final Method toFileMethod = DTUMemberMatcher.method(Path.class, "toFile");
    PowerMockito.doReturn(null).when(path2, toFileMethod).withNoArguments();
    final Method resolveMethod = DTUMemberMatcher.method(Path.class, "resolve", String.class);
    PowerMockito.doReturn(path2)
        .when(path1, resolveMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method resolveMethod1 = DTUMemberMatcher.method(Path.class, "resolve", String.class);
    PowerMockito.doReturn(path1)
        .when(path, resolveMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method configFileMethod = DTUMemberMatcher.method(Environment.class, "configFile");
    PowerMockito.doReturn(path).when(environment, configFileMethod).withNoArguments();
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(dictionary, "configuration", configuration);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final FileInputStream fileInputStream = PowerMockito.mock(FileInputStream.class);
    Reflector.setField(fileInputStream, "closed", false);
    Reflector.setField(fileInputStream, "path", null);
    PowerMockito.whenNew(FileInputStream.class)
        .withParameterTypes(File.class)
        .withArguments(or(isA(File.class), isNull(File.class)))
        .thenReturn(fileInputStream);
    final Properties properties = PowerMockito.mock(Properties.class);
    Reflector.setField(properties, "defaults", null);
    PowerMockito.whenNew(Properties.class).withNoArguments().thenReturn(properties);

    // Act
    thrown.expect(IllegalStateException.class);
    dictionary.reLoadMainDict();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void getRemoteExtDictionarysOutput03() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getRemoteExtStopWordDictionarysOutput03() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNullPointerException() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    thrown.expect(NullPointerException.class);
    dictionary.getProperty(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, FileInputStream.class, Dictionary.class, Properties.class,
                   Environment.class, Path.class})
  @Test
  public void
  reLoadMainDictOutputIllegalStateException() throws Exception, InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment = PowerMockito.mock(Environment.class);
    final Path path = PowerMockito.mock(Path.class);
    final Path path1 = PowerMockito.mock(Path.class);
    final Path path2 = PowerMockito.mock(Path.class);
    final File file = PowerMockito.mock(File.class);
    Reflector.setField(file, "prefixLength", 0);
    Reflector.setField(file, "path", null);
    final Method toFileMethod = DTUMemberMatcher.method(Path.class, "toFile");
    PowerMockito.doReturn(file).when(path2, toFileMethod).withNoArguments();
    final Method resolveMethod = DTUMemberMatcher.method(Path.class, "resolve", String.class);
    PowerMockito.doReturn(path2)
        .when(path1, resolveMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method resolveMethod1 = DTUMemberMatcher.method(Path.class, "resolve", String.class);
    PowerMockito.doReturn(path1)
        .when(path, resolveMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method configFileMethod = DTUMemberMatcher.method(Environment.class, "configFile");
    PowerMockito.doReturn(path).when(environment, configFileMethod).withNoArguments();
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(dictionary, "configuration", configuration);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final FileInputStream fileInputStream = PowerMockito.mock(FileInputStream.class);
    Reflector.setField(fileInputStream, "closed", false);
    Reflector.setField(fileInputStream, "path", null);
    PowerMockito.whenNew(FileInputStream.class)
        .withParameterTypes(File.class)
        .withArguments(or(isA(File.class), isNull(File.class)))
        .thenReturn(fileInputStream);
    final Properties properties = PowerMockito.mock(Properties.class);
    Reflector.setField(properties, "defaults", null);
    PowerMockito.whenNew(Properties.class).withNoArguments().thenReturn(properties);

    // Act
    thrown.expect(IllegalStateException.class);
    dictionary.reLoadMainDict();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSingletonOutputIllegalStateException000584c4efc4ac2c085() {

    // Act
    thrown.expect(IllegalStateException.class);
    Dictionary.getSingleton();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getExtStopWordDictionarysOutput0000a99d99f1c0e0d66c()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchWithHitInput1ZeroNotNullOutputNotNull000a63fd0b95de8291e()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final char[] charArray = {'\u0000'};
    final Hit matchedHit = new Hit();
    matchedHit.setEnd(0);
    matchedHit.setBegin(0);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    matchedHit.setMatchedDictSegment(dictSegment);
    Reflector.setField(matchedHit, "hitState", 0);

    // Act
    final Hit actual = dictionary.matchWithHit(charArray, 0, matchedHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addWordsInput0OutputVoid() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(dictionary, "configuration", configuration);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    Reflector.setField(dictionary, "_SuffixDict", dictSegment1);
    final ArrayList<String> words = new ArrayList<String>();

    // Act
    dictionary.addWords(words);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void disableWordsInput0OutputVoid() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final ArrayList<String> words = new ArrayList<String>();

    // Act
    dictionary.disableWords(words);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void disableWordsInput0OutputVoid2() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final ArrayList<String> words = new ArrayList<String>();

    // Act
    dictionary.disableWords(words);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRemoteExtDictionarysOutput0000b3bd3d7a931dbcb6() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRemoteExtDictionarysOutput000105a9de3fbf4fc1e4() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getExtDictionarysOutput0000d453169f17cf4ac6() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRemoteExtStopWordDictionarysOutput0000c69f8c615f7dc0f5()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRemoteExtStopWordDictionarysOutput0001bffbb9d3207fc789()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getRemoteExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getExtDictionarysOutput0001e90fde158cd41854() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void disableWordsInput1OutputVoid() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);
    final ArrayList<String> words = new ArrayList<String>();
    words.add(null);

    // Act
    dictionary.disableWords(words);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getExtStopWordDictionarysOutput0001ee0e1119b9e2ba19()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    final List<String> actual = dictionary.getExtStopWordDictionarys();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void visitFileFailedInputNotNullNotNullOutputNull()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final SimpleFileVisitor dictionary1 =
        (SimpleFileVisitor)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary$1");
    Reflector.setField(dictionary1, "this$0", null);
    Reflector.setField(dictionary1, "val$files", null);
    final Path file = PowerMockito.mock(Path.class);
    final IOException e = (IOException)Reflector.getInstance("java.io.IOException");
    Reflector.setField(e, "cause", null);
    Reflector.setField(e, "detailMessage", null);

    // Act
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.dic.Dictionary$1");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("visitFileFailed", Reflector.forName("java.nio.file.Path"),
                                         Reflector.forName("java.io.IOException"));
    methodUnderTest.setAccessible(true);
    final FileVisitResult actual = (FileVisitResult)methodUnderTest.invoke(dictionary1, file, e);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNotNullOutputNull001aba72c4db4337aa0()
      throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNotNullOutputNull3() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    properties.setProperty("", "?");
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(" "));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull0008715977e0486e105() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull2() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull3() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    properties.setProperty("", "");
    Reflector.setField(dictionary, "props", properties);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull4() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    properties.setProperty("\u0000", "");
    Reflector.setField(dictionary, "props", properties);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull5() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNullOutputNull6() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    final Properties properties = new Properties();
    properties.setProperty("", "");
    Reflector.setField(dictionary, "props", properties);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPropertyInputNotNullOutputNull() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertNull(dictionary.getProperty("foo"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.wltea.analyzer.dic.Dictionary$1"})
  @Test
  public void constructorInputNotNull1OutputVoid()
      throws Exception, NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(SimpleFileVisitor.class));

    // Arrange
    final Dictionary this$0 =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(this$0, "_PrepDict", null);
    Reflector.setField(this$0, "_StopWords", null);
    Reflector.setField(this$0, "props", null);
    Reflector.setField(this$0, "_MainDict", null);
    Reflector.setField(this$0, "conf_dir", null);
    Reflector.setField(this$0, "_SurnameDict", null);
    Reflector.setField(this$0, "configuration", null);
    Reflector.setField(this$0, "_QuantifierDict", null);
    Reflector.setField(this$0, "_SuffixDict", null);
    final ArrayList arg2a = new ArrayList();
    arg2a.add(null);

    // Act, creating object to test constructor
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.dic.Dictionary$1");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("org.wltea.analyzer.dic.Dictionary"),
        Reflector.forName("java.util.List"));
    ctor.setAccessible(true);
    final SimpleFileVisitor actual = (SimpleFileVisitor)ctor.newInstance(this$0, arg2a);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.wltea.analyzer.dic.Dictionary$1"}, value = Path.class)
  @Test
  public void visitFileInputNotNullNotNullOutputNull()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final SimpleFileVisitor dictionary1 =
        (SimpleFileVisitor)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary$1");
    Reflector.setField(dictionary1, "this$0", null);
    final ArrayList arrayList = new ArrayList();
    Reflector.setField(dictionary1, "val$files", arrayList);
    final Path file = PowerMockito.mock(Path.class);
    final Method toStringMethod = DTUMemberMatcher.method(Path.class, "toString");
    PowerMockito.doReturn("foo").when(file, toStringMethod).withNoArguments();
    final BasicFileAttributes attrs = PowerMockito.mock(BasicFileAttributes.class);

    // Act
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.dic.Dictionary$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "visitFile", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
    methodUnderTest.setAccessible(true);
    final FileVisitResult actual =
        (FileVisitResult)methodUnderTest.invoke(dictionary1, file, attrs);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.wltea.analyzer.dic.Dictionary$1"}, value = Path.class)
  @Test
  public void visitFileInputNotNullNullOutputNull0006c31f044eb05c8d7()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final SimpleFileVisitor dictionary1 =
        (SimpleFileVisitor)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary$1");
    Reflector.setField(dictionary1, "this$0", null);
    final ArrayList arrayList = new ArrayList();
    Reflector.setField(dictionary1, "val$files", arrayList);
    final Path file = PowerMockito.mock(Path.class);
    final Method toStringMethod = DTUMemberMatcher.method(Path.class, "toString");
    PowerMockito.doReturn(null).when(file, toStringMethod).withNoArguments();
    final BasicFileAttributes attrs = null;

    // Act
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.dic.Dictionary$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "visitFile", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
    methodUnderTest.setAccessible(true);
    final FileVisitResult actual =
        (FileVisitResult)methodUnderTest.invoke(dictionary1, file, attrs);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"org.wltea.analyzer.dic.Dictionary$1"}, value = Path.class)
  @Test
  public void visitFileInputNotNullNullOutputNull2()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final SimpleFileVisitor dictionary1 =
        (SimpleFileVisitor)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary$1");
    Reflector.setField(dictionary1, "this$0", null);
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Reflector.setField(dictionary1, "val$files", arrayList);
    final Path file = PowerMockito.mock(Path.class);
    final Method toStringMethod = DTUMemberMatcher.method(Path.class, "toString");
    PowerMockito.doReturn(null).when(file, toStringMethod).withNoArguments();
    final BasicFileAttributes attrs = null;

    // Act
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.dic.Dictionary$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "visitFile", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
    methodUnderTest.setAccessible(true);
    final FileVisitResult actual =
        (FileVisitResult)methodUnderTest.invoke(dictionary1, file, attrs);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Path.class, Dictionary.class})
  @Test
  public void getDictRootOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    final Path path = PowerMockito.mock(Path.class);
    final Path path1 = PowerMockito.mock(Path.class);
    final Method toStringMethod = DTUMemberMatcher.method(Path.class, "toString");
    PowerMockito.doReturn("foo").when(path1, toStringMethod).withNoArguments();
    final Method toAbsolutePathMethod = DTUMemberMatcher.method(Path.class, "toAbsolutePath");
    PowerMockito.doReturn(path1).when(path, toAbsolutePathMethod).withNoArguments();
    Reflector.setField(dictionary, "conf_dir", path);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act and Assert result
    Assert.assertEquals("foo", dictionary.getDictRoot());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addWordsInputNullOutputVoid000db81ec08a1fc6aed() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    dictionary.addWords(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void disableWordsInputNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    Reflector.setField(dictionary, "_MainDict", null);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    dictionary.disableWords(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void disableWordsInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Dictionary dictionary =
        (Dictionary)Reflector.getInstance("org.wltea.analyzer.dic.Dictionary");
    Reflector.setField(dictionary, "_PrepDict", null);
    Reflector.setField(dictionary, "_StopWords", null);
    Reflector.setField(dictionary, "props", null);
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    Reflector.setField(dictionary, "_MainDict", dictSegment);
    Reflector.setField(dictionary, "conf_dir", null);
    Reflector.setField(dictionary, "_SurnameDict", null);
    Reflector.setField(dictionary, "configuration", null);
    Reflector.setField(dictionary, "_QuantifierDict", null);
    Reflector.setField(dictionary, "_SuffixDict", null);

    // Act
    dictionary.disableWords(null);

    // The method returns void, testing that no exception is thrown
  }
}
