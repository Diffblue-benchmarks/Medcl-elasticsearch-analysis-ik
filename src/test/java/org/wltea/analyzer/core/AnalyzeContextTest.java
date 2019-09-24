package org.wltea.analyzer.core;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import org.elasticsearch.common.settings.Settings;
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
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

@RunWith(PowerMockRunner.class)
public class AnalyzeContextTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();
  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", -2_147_479_552);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 95);
    Reflector.setField(
        reader, "str",
        "\u7ffe\u1612\u77b2\u7fec\u7ffc\u7fec\u7ffb\u7fe1???????????????????????????????????????????????????????????????????????????????????????");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNullOutputNullPointerException3()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 2_147_483_647);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Reader reader = null;
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", -2_147_483_648);
    Reflector.setField(analyzeContext, "available", -2_147_483_646);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException3()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 5);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 2047);
    Reflector.setField(analyzeContext, "cursor", -2_147_481_604);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 5);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    final char[] myCharArray = {};
    Reflector.setField(reader, "skipBuffer", myCharArray);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 3614);
    Reflector.setField(analyzeContext, "cursor", 2_147_483_647);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 1_610_612_833);
    Reflector.setField(reader, "length", 98);
    Reflector.setField(
        reader, "str",
        "\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe");
    final char[] myCharArray = {};
    Reflector.setField(reader, "skipBuffer", myCharArray);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", -2_147_483_648);
    Reflector.setField(analyzeContext, "available", 1023);
    Reflector.setField(analyzeContext, "cursor", 970);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", -2_147_483_648);
    Reflector.setField(analyzeContext, "available", -1_090_514_944);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 1);
    Reflector.setField(reader, "next", 2_147_352_565);
    Reflector.setField(reader, "length", 13);
    Reflector.setField(reader, "str", ">>>>>>>>>>>>>");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputIndexOutOfBoundsException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 2_147_479_553);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 2_147_483_615);
    Reflector.setField(reader, "length", 64);
    Reflector.setField(
        reader, "str",
        "\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNullOutputIndexOutOfBoundsException()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 4095);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Reader reader = null;
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNullOutputNullPointerException0006dd4d21394453f7b()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 4095);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Reader reader = null;
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AnalyzeContext.class, System.class})
  @Test
  public void fillBufferInputNullOutputNullPointerException2()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 1);
    Reflector.setField(analyzeContext, "available", 2_139_099_136);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Reader reader = null;
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    analyzeContext.fillBuffer(reader);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException14() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -69);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_827_889);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_895);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 63);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_768);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_827_947);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 4);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(715_827_883);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_827_895);
    linkedList.add(lexeme2);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException37() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(16);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(415_674_765);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 8190);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(18_747_434);
    lexeme.setLexemeType(2);
    lexeme.setBegin(7_995_393);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 8190);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(18_747_434);
    lexeme.setLexemeType(2);
    lexeme.setBegin(7_995_393);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 640);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(17_964);
    lexeme.setLexemeType(0);
    lexeme.setBegin(7141);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 640);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(17_964);
    lexeme.setLexemeType(0);
    lexeme.setBegin(7141);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -32);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_870);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_867);
    linkedList.add(lexeme);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -32);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_870);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_867);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -32);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_870);
    lexeme.setLexemeType(17);
    lexeme.setBegin(715_827_867);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_870);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(715_827_867);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -32);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_870);
    lexeme.setLexemeType(16);
    lexeme.setBegin(715_827_867);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_870);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(715_827_867);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_862);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_858);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_827);
    lexeme1.setLexemeType(18);
    lexeme1.setBegin(715_827_887);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException10() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_862);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_858);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_827);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(715_827_887);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException11() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(715_827_858);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_862);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 4);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_831);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_827_883);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException12() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -7);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_827_891);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_895);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 5);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_832);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_827_947);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException13() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -7);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_827_891);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_827_895);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 5);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_827_832);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_827_947);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(715_827_891);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_827_895);
    linkedList.add(lexeme2);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNullOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -64);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme3);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    analyzeContext.addLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException15() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(32);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException16() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(32);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException17() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(2);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(23);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(5);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(23);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(5);
    linkedList.add(lexeme2);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException18() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(2);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(23);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(5);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(23);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(5);
    linkedList.add(lexeme2);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException19() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(2);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(23);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(5);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException20() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(23);
    lexeme.setLexemeType(18);
    lexeme.setBegin(5);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(23);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(5);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException21() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(183);
    lexeme.setLexemeType(2);
    lexeme.setBegin(37);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(631);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(101);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException22() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(183);
    lexeme.setLexemeType(2);
    lexeme.setBegin(37);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(631);
    lexeme1.setLexemeType(-2_147_483_632);
    lexeme1.setBegin(101);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException23() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(183);
    lexeme.setLexemeType(2);
    lexeme.setBegin(37);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(631);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(101);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException24() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_830_079);
    lexeme.setLexemeType(32);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException25() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_830_079);
    lexeme.setLexemeType(32);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException26() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_830_079);
    lexeme.setLexemeType(32);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException27() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_832_127);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_830_078);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(715_818_354);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException28() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_832_127);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_830_078);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_818_354);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException29() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_832_127);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_817_842);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_830_078);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_818_354);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1537);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(715_832_127);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_817_842);
    linkedList.add(lexeme2);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException30() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -15_717);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_824_019);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_833_809);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1697);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_817_633);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_836_107);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1537);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(715_832_127);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_817_842);
    linkedList.add(lexeme2);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException31() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -15_717);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_824_019);
    lexeme.setLexemeType(2);
    lexeme.setBegin(715_833_809);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1697);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_817_633);
    lexeme1.setLexemeType(17);
    lexeme1.setBegin(715_836_107);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1537);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(715_832_127);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_817_842);
    linkedList.add(lexeme2);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException32() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -15_717);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(715_824_019);
    lexeme.setLexemeType(16);
    lexeme.setBegin(715_833_809);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -14_593);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(715_817_633);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(715_836_107);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1537);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(715_832_127);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_817_842);
    linkedList.add(lexeme2);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException33() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 232_478_779);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-818_465_594);
    lexeme.setLexemeType(16);
    lexeme.setBegin(-367_847_853);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -6172);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(1_048_671);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(-954_883_339);
    linkedList.add(lexeme1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1537);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(715_832_127);
    lexeme2.setLexemeType(32);
    lexeme2.setBegin(715_817_842);
    linkedList.add(lexeme2);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException34() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(2);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(415_674_765);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException35() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(2);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(415_674_765);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException36() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(2);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(-2_147_483_632);
    lexeme1.setBegin(415_674_765);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException38() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(16);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(33);
    lexeme1.setBegin(415_674_765);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException39() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2065);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(2);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 2035);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_799_024);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(415_674_752);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException40() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2065);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_972);
    lexeme.setLexemeType(2);
    lexeme.setBegin(415_674_765);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 2035);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_799_024);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(415_674_752);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException41() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -30);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-311_796_940);
    lexeme.setLexemeType(16);
    lexeme.setBegin(415_674_764);
    linkedList.add(lexeme);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(-311_796_972);
    lexeme1.setLexemeType(32);
    lexeme1.setBegin(415_674_766);
    linkedList.add(lexeme1);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputIllegalStateException42() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -131_072);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(-312_275_628);
    lexeme.setLexemeType(32);
    lexeme.setBegin(417_024_846);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    analyzeContext.getNextLexeme();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0005d2b55a967b2da77() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.reset();

    // Assert side effects
    Assert.assertNotNull(analyzeContext.getOrgLexemes());
    Assert.assertNull(analyzeContext.getOrgLexemes().getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid12() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {0,
                              0,
                              0,
                              4,
                              0,
                              0,
                              4,
                              0,
                              -2_147_483_648,
                              262_148,
                              -2_147_221_504,
                              262_148,
                              262_144,
                              537_133_056,
                              0,
                              536_870_916,
                              -2_147_221_498,
                              142_606_342,
                              2_359_305,
                              -805_306_355,
                              1_208_221_700,
                              -2_147_482_624,
                              -2_147_221_495,
                              -1_610_350_578,
                              32,
                              8_388_617,
                              -2_147_483_640,
                              -1_442_840_568,
                              -2_147_483_587,
                              134_217_741};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -60_144_881);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_315_498_983);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(lexemePath, "head", cell2);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(6, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 10);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid11() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {0, 0, 0, 8, 134_217_736, 0, 0, 0, 8, 0, 8, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 2);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(10, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 7);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid10() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    linkedList.add(lexeme);
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {0, 0, 0, 4, 0, 0, 0, -2_147_483_640, 8, 0, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 9);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(8, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 6);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid9() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0, 8_388_608,  0, 33_554_432, 0,           0,          0,    2,   0,
                              0, 33_554_432, 0, 0,          335_544_320, 34_603_012, 1024, 1026};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", -2_147_483_136);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(2, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 9);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    analyzeContext.addLexeme(lexeme);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final LexemePath path = new LexemePath();
    Reflector.setField(path, "payloadLength", 0);
    Reflector.setField(path, "pathBegin", 0);
    Reflector.setField(path, "pathEnd", 0);
    Reflector.setField(path, "size", 0);
    Reflector.setField(path, "head", null);
    Reflector.setField(path, "tail", null);

    // Act
    analyzeContext.addLexemePath(path);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final LexemePath path = new LexemePath();
    Reflector.setField(path, "payloadLength", 0);
    Reflector.setField(path, "pathBegin", 0);
    Reflector.setField(path, "pathEnd", 0);
    Reflector.setField(path, "size", 0);
    Reflector.setField(path, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(path, "tail", cell);

    // Act
    analyzeContext.addLexemePath(path);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(-2_147_483_648, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final LexemePath path = new LexemePath();
    Reflector.setField(path, "payloadLength", 0);
    Reflector.setField(path, "pathBegin", 0);
    Reflector.setField(path, "pathEnd", 0);
    Reflector.setField(path, "size", 0);
    Reflector.setField(path, "head", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet3);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell2, "prev", cell4);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    Reflector.setField(cell6, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(quickSortSet4, "tail", cell6);
    Reflector.setField(cell1, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme6);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet6);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme8);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell7, "prev", cell9);
    Reflector.setField(cell1, "prev", cell7);
    Reflector.setField(path, "tail", cell1);

    // Act
    analyzeContext.addLexemePath(path);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid6() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {4,
                              3072,
                              -2_147_483_648,
                              -2_147_483_648,
                              1024,
                              -2_147_483_648,
                              -2_147_450_878,
                              0,
                              134_250_496,
                              0,
                              0,
                              12,
                              0,
                              2053,
                              -2_147_483_648,
                              4,
                              -2_147_475_456,
                              0,
                              0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_288_173_161);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_852_125_901);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(0, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 705_713_864);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid5() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {4, 1024, 0, 0, 1024, 0, -2_147_450_878, 0, 134_250_496, 0,
                              0, 12,   0, 5, 0,    4, -2_147_483_648, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(1, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {0, 8, 0, 0, 6, 0, -2_147_450_878, 0, 134_250_500, 0,
                              0, 0, 0, 0, 0, 4, -2_147_483_648, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(4, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 2);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0, 2_097_152, 0, 0, 6, 0, -2_147_450_878, 0, 134_250_500, 0,
                              0, 0,         0, 0, 0, 4, -2_147_483_648, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(4, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 2);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputVoid0000b5e2af6c6961c21()
      throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    analyzeContext.addLexeme(lexeme);

    // Assert side effects
    Assert.assertNotNull(analyzeContext.getOrgLexemes());
    Assert.assertNotNull(analyzeContext.getOrgLexemes().getHead());
    Assert.assertNull(analyzeContext.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(analyzeContext.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, analyzeContext.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, analyzeContext.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, analyzeContext.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, analyzeContext.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(analyzeContext.getOrgLexemes().getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final LexemePath path = new LexemePath();
    Reflector.setField(path, "payloadLength", 0);
    Reflector.setField(path, "pathBegin", 0);
    Reflector.setField(path, "pathEnd", 0);
    Reflector.setField(path, "size", 0);
    Reflector.setField(path, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(path, "tail", cell);

    // Act
    analyzeContext.addLexemePath(path);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNotNullOutputVoid001f5c5bc72df14a9a3()
      throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    final LexemePath path = new LexemePath();
    Reflector.setField(path, "payloadLength", 0);
    Reflector.setField(path, "pathBegin", 0);
    Reflector.setField(path, "pathEnd", 0);
    Reflector.setField(path, "size", 0);
    Reflector.setField(path, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(path, "tail", cell);

    // Act
    analyzeContext.addLexemePath(path);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.reset();

    // Assert side effects
    Assert.assertNotNull(analyzeContext.getOrgLexemes());
    Assert.assertNull(analyzeContext.getOrgLexemes().getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);

    // Act, creating object to test constructor
    final AnalyzeContext actual = new AnalyzeContext(configuration);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0009f8eef92b38baf2a() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.reset();

    // Assert side effects
    Assert.assertNotNull(analyzeContext.getOrgLexemes());
    Assert.assertNull(analyzeContext.getOrgLexemes().getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void moveCursorOutputTrue() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '1'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", true);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 9);
    Reflector.setField(analyzeContext, "cursor", 5);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.moveCursor());

    // Assert side effects
    Assert.assertEquals(6, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void initCursorOutputVoid000a1329c034f27513f() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'1'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.initCursor();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void moveCursorOutputTrue2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0010', '\u0010', '\u0000', '\u0010', 'h', '\u0010',
                                '\u0010', '\u0000', 'h',      '\u0010', 'h', '\u0010',
                                '\u0010', '\u0010', '\u0010', 'h',      'h'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    final Settings settings =
        (Settings)Reflector.getInstance("org.elasticsearch.common.settings.Settings");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    final Environment environment =
        (Environment)Reflector.getInstance("org.elasticsearch.env.Environment");
    Reflector.setField(configuration, "environment", environment);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 201_326_592);
    Reflector.setField(analyzeContext, "cursor", 15);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.moveCursor());

    // Assert side effects
    Assert.assertEquals(16, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(0, analyzeContext.fillBuffer(reader));
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputNegative3()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", -2_147_483_648);
    Reflector.setField(analyzeContext, "cursor", 2_147_483_646);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 2_147_483_615);
    Reflector.setField(reader, "length", 64);
    Reflector.setField(
        reader, "str",
        "\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff\uffff");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(-1, analyzeContext.fillBuffer(reader));

    // Assert side effects
    Assert.assertEquals(0, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 67_583);
    Reflector.setField(analyzeContext, "cursor", 67_583);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 5);
    Reflector.setField(reader, "length", 3);
    Reflector.setField(reader, "str", "foo");
    final char[] myCharArray1 = {};
    Reflector.setField(reader, "skipBuffer", myCharArray1);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(0, analyzeContext.fillBuffer(reader));

    // Assert side effects
    Assert.assertEquals(0, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputNegative2()
      throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 2_147_483_647);
    Reflector.setField(analyzeContext, "cursor", 0);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 1);
    Reflector.setField(reader, "next", 2_147_483_633);
    Reflector.setField(reader, "length", 13);
    Reflector.setField(reader, "str", ">>>>>>>>>>>>>");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(-1, analyzeContext.fillBuffer(reader));
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputNegative() throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\ufffe', '\ufffb', '\ufff3', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 3614);
    Reflector.setField(analyzeContext, "cursor", 2_147_483_647);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 1_610_612_833);
    Reflector.setField(reader, "length", 98);
    Reflector.setField(
        reader, "str",
        "\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe");
    final char[] myCharArray1 = {};
    Reflector.setField(reader, "skipBuffer", myCharArray1);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(-1, analyzeContext.fillBuffer(reader));

    // Assert side effects
    Assert.assertEquals(0, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillBufferInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", -2_147_483_648);
    final StringReader reader = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(reader, "mark", 0);
    Reflector.setField(reader, "next", 0);
    Reflector.setField(reader, "length", 95);
    Reflector.setField(
        reader, "str",
        "\u7ffe\u1612\u77b2\u7fec\u7ffc\u7fec\u7ffb\u7fe1???????????????????????????????????????????????????????????????????????????????????????");
    Reflector.setField(reader, "skipBuffer", null);
    Reflector.setField(reader, "lock", 0);

    // Act and Assert result
    Assert.assertEquals(0, analyzeContext.fillBuffer(reader));

    // Assert side effects
    Assert.assertEquals(0, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCursorOutputZero() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertEquals(0, analyzeContext.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSegmentBuffOutputNull() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getSegmentBuff());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCurrentCharOutputNotNull() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 8);

    // Act and Assert result
    Assert.assertEquals('\u0000', analyzeContext.getCurrentChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCurrentCharTypeOutputPositive() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0, 1, 0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 8);

    // Act and Assert result
    Assert.assertEquals(1, analyzeContext.getCurrentCharType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBufferOffsetOutputZero() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertEquals(0, analyzeContext.getBufferOffset());
  }

  // Test written by Diffblue Cover.
  @Test
  public void moveCursorOutputFalse000e237dfd5db2bd835() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.moveCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lockBufferInputNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.lockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lockBufferInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.lockBuffer("\ue002");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lockBufferInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.lockBuffer("foo");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lockBufferInputNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.lockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lockBufferInputNullOutputVoid0004c1ec5390f816bbb() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.lockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer("foo");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer("?");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void unlockBufferInputNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.unlockBuffer(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferLockedOutputTrue001dea34eb892ad0a48() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.isBufferLocked());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse11() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("??");
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 3997);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputTrue002f694972fdb6ca0c3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputTrue003f694972fdb6ca0c3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputTrue3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 3997);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputTrue4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferLockedOutputTrue2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("?");
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.isBufferLocked());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse002fb0d33df01f214e5() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse003fb0d33df01f214e5() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse5() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("foo");
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4031);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferLockedOutputFalse000cc7fe64c851d98a8() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.isBufferLocked());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferConsumedOutputFalse000403846e08d00bc0a() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.isBufferConsumed());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferConsumedOutputFalse2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 3_145_728);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.isBufferConsumed());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferConsumedOutputTrue2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", -1);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.isBufferConsumed());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferConsumedOutputFalse3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.isBufferConsumed());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBufferConsumedOutputTrue0010de050a8861ada8e() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", -1);

    // Act and Assert result
    Assert.assertTrue(analyzeContext.isBufferConsumed());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse9() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 1983);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse10() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 3983);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 3996);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse12() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 2047);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse13() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 8190);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse14() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse0003a8531f0e7b6bbde() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse00412f67111dba12990() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 3983);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse001884ec4a6a8c3804f() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 4096);
    Reflector.setField(analyzeContext, "cursor", 4095);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void needRefillBufferOutputFalse8() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 4096);

    // Act and Assert result
    Assert.assertFalse(analyzeContext.needRefillBuffer());
  }

  // Test written by Diffblue Cover.
  @Test
  public void markBufferOffsetOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.markBufferOffset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemePathInputNullOutputVoid000ee4567da820e141d()
      throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.addLexemePath(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOrgLexemesOutputNull() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getOrgLexemes());
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid8() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", -2_147_483_136);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(3, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 4);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(1, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    Reflector.setField(analyzeContext, "results", null);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", -2_147_483_648);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputToResultOutputVoid7() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", null);
    Reflector.setField(configuration, "useSmart", false);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", null);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(analyzeContext, "cfg", configuration);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    Reflector.setField(analyzeContext, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 2);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    hashMap.put(7, lexemePath);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", -850_361_894);

    // Act
    analyzeContext.outputToResult();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputNull000bd6ec93688b58bd6() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getNextLexeme());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputNull4() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000'};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getNextLexeme());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputNull3() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getNextLexeme());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextLexemeOutputNull2() throws InvocationTargetException {

    // Arrange
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    Reflector.setField(analyzeContext, "buffLocker", null);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    final int[] myIntArray = {};
    Reflector.setField(analyzeContext, "charTypes", myIntArray);
    Reflector.setField(analyzeContext, "pathMap", null);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);

    // Act and Assert result
    Assert.assertNull(analyzeContext.getNextLexeme());
  }
}
