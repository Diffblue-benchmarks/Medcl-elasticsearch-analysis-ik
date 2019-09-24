package org.wltea.analyzer.dic;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
public class DictSegmentTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 2, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull15() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, null, dictSegment2};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput9PositivePositiveOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 5, 7);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput17OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput14PositivePositiveOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment2, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", -2_147_483_646);
    final DictSegment[] dictSegmentArray2 = {null, null, null, null, null, null, null};
    Reflector.setField(dictSegment3, "childrenArray", dictSegmentArray2);
    Reflector.setField(dictSegment3, "nodeChar", '\u0000');
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput14PositivePositiveOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment2, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", -2_147_483_646);
    final DictSegment[] dictSegmentArray2 = {null, null, null, null, null, null, null};
    Reflector.setField(dictSegment3, "childrenArray", dictSegmentArray2);
    Reflector.setField(dictSegment3, "nodeChar", '\u0000');
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput9PositivePositiveOutputNotNull5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, dictSegment1, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = 1_073_741_824;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(6, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput9PositivePositiveOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null, null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = 536_870_919;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput9PositivePositiveOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 5, 7);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull0003c0d15208a4dd3b2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('!');
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u0000');
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull000a366f2fa9153c754() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull0011ff5e5bb590c619e()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull5() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('0', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'0'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull6() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('0', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'0'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull7() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('0', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'0'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull8() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'0'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1OutputNotNull9() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull10() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull11() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull16() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment2, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull17() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment2, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull18() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, dictSegment1, null,
                                            dictSegment2, null, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull19() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, dictSegment1, null,
                                            dictSegment2, null, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1OutputNotNull20() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull0000d9212eea14cd9a1() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('!');
    final char[] charArray = {'\u0000'};
    final Hit searchHit = new Hit();

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u0000');
    final char[] charArray = {'\u0000'};
    final Hit searchHit = new Hit();

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroNullOutputNotNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroNullOutputNotNull3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroOutputNotNull0009f8d27dd6ee97c5e() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('!');
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroOutputNotNull2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u0000');
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroOutputNotNull00088302f79e7f26d1f()
      throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroOutputNotNull0015002d61ea8b554b6()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'('};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroOutputNotNull7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroOutputNotNull8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroOutputNotNull9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput2OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroNegativeNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, -1_610_612_734, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 2, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput9PositiveNegativeOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, dictSegment1, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u8000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = -2_147_483_648;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};
    final int begin = 0;
    final int length = 2;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_646);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};
    final int begin = 0;
    final int length = 2;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", -2_147_483_647);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", -2_147_483_647);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput2ZeroPositiveNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    hashMap1.put(null, null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'!', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput2ZeroPositiveOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    final int begin = 0;
    final int length = 2;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3OutputNotNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(-2_147_483_646);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3OutputNotNull3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", 0);
    Reflector.setField(dictSegment3, "childrenArray", null);
    Reflector.setField(dictSegment3, "nodeChar", null);
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, dictSegment1, null,
                                            dictSegment2, null, dictSegment3};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2)
        .thenReturn(-2_147_483_644);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3ZeroPositiveOutputNotNull6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0001'};
    final int begin = 0;
    final int length = 2;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3ZeroPositiveOutputNotNull7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0001'};
    final int begin = 0;
    final int length = 2;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(-2_147_483_646);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3ZeroPositiveOutputNotNull8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0001'};
    final int begin = 0;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3ZeroPositiveOutputNotNull9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0001'};
    final int begin = 0;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput3ZeroZeroOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0001'};
    final int begin = 0;
    final int length = 0;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput4OutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput4OutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('0', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'0', '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositiveNegativeOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = -2_147_483_648;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput5PositivePositiveOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 3, 3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput5PositivePositiveOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 3, 3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositivePositiveOutputNotNull3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = 262_147;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositivePositiveOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = 262_147;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositivePositiveOutputNotNull5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = 262_147;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(4, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositivePositiveOutputNotNull6()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput5PositivePositiveOutputNotNull7()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 3;
    final int length = 1;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(3, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositiveNegativeNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", -2_147_483_648);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, null, dictSegment1,
                                            dictSegment2, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};
    final int begin = 1;
    final int length = -2_147_483_648;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(3);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray, 2, 5, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(2, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", -2_147_483_648);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, null, dictSegment1,
                                            dictSegment2, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};
    final int begin = 1;
    final int length = 9;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(3);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};

    // Act
    final Hit actual = dictSegment.match(charArray, 1, 9, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", -2_147_483_648);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, null, null, dictSegment1, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};
    final int begin = 1;
    final int length = 9;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", -2_147_483_648);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null,         null, null, dictSegment1,
                                            dictSegment2, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};
    final int begin = 1;
    final int length = 1;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(3);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNullOutputNotNull6()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment dictSegment3 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment3, "nodeState", 0);
    Reflector.setField(dictSegment3, "storeSize", -2_147_483_584);
    final DictSegment[] dictSegmentArray2 = {null, null, null};
    Reflector.setField(dictSegment3, "childrenArray", dictSegmentArray2);
    Reflector.setField(dictSegment3, "nodeChar", '\u0000');
    Reflector.setField(dictSegment3, "childrenMap", null);
    final DictSegment dictSegment4 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment4, "nodeState", 0);
    Reflector.setField(dictSegment4, "storeSize", 0);
    Reflector.setField(dictSegment4, "childrenArray", null);
    Reflector.setField(dictSegment4, "nodeChar", '\u0000');
    Reflector.setField(dictSegment4, "childrenMap", null);
    final DictSegment dictSegment5 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment5, "nodeState", 0);
    Reflector.setField(dictSegment5, "storeSize", -2_147_483_648);
    Reflector.setField(dictSegment5, "childrenArray", null);
    Reflector.setField(dictSegment5, "nodeChar", null);
    Reflector.setField(dictSegment5, "childrenMap", null);
    final DictSegment dictSegment6 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment6, "nodeState", 0);
    Reflector.setField(dictSegment6, "storeSize", 2);
    final DictSegment[] dictSegmentArray3 = {null, null};
    Reflector.setField(dictSegment6, "childrenArray", dictSegmentArray3);
    Reflector.setField(dictSegment6, "nodeChar", null);
    Reflector.setField(dictSegment6, "childrenMap", null);
    final DictSegment dictSegment7 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment7, "nodeState", 0);
    Reflector.setField(dictSegment7, "storeSize", 0);
    final DictSegment[] dictSegmentArray4 = {null, null};
    Reflector.setField(dictSegment7, "childrenArray", dictSegmentArray4);
    Reflector.setField(dictSegment7, "nodeChar", '\u0000');
    Reflector.setField(dictSegment7, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, dictSegment2, dictSegment3, dictSegment4,
                                            dictSegment5, dictSegment6, dictSegment7};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001'};
    final int begin = 1;
    final int length = 1;
    final Hit searchHit = null;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(1, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput8OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput8OutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput8OutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput8OutputNotNull4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put(null, null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput9PositivePositiveOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 5;
    final int length = 7;
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_392);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(5, actual.getEnd());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullOutputIllegalArgumentException001a27efc7ac57d8ea3() {

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new DictSegment(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullOutputIllegalArgumentException2() {

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new DictSegment(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2)
        .thenReturn(-2_147_483_646);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '\u0001');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(-1, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void disableSegmentInput1OutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void disableSegmentInput1OutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment2);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void disableSegmentInput1OutputVoid12() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void disableSegmentInput1OutputVoid13() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_643);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void disableSegmentInput1OutputVoid15() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u0000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final int begin = 0;
    final int length = 0;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'('};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput1ZeroZeroNotNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 0, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid16() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_644);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid17() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_644);
    final DictSegment[] dictSegmentArray = {null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid18() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_644);
    final DictSegment[] dictSegmentArray = {null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid19() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 536_870_916);
    final DictSegment[] dictSegmentArray = {null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid20() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 536_870_916);
    final DictSegment[] dictSegmentArray = {null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 5);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid21() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 536_870_916);
    final DictSegment[] dictSegmentArray = {null, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 5);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid22() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 5);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1, null, null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid23() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid24() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid26() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid27() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput2OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_643);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 4);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput2OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_643);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", -2_147_483_644);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(2);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput2OutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 65);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, dictSegment1, dictSegment2};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('\u0000', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput5OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_643);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput9OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap1 = new HashMap();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput9OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap1 = new HashMap();
    Reflector.setField(dictSegment1, "childrenMap", hashMap1);
    hashMap.put('!', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput9OutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 5);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                              '\u0000', '\u0000', '\u0000', '\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap = new HashMap();
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2);

    // Act
    dictSegment.fillSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void fillSegmentInput1OutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 268_435_456);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 4);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap = new HashMap();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap.put(null, dictSegment2);
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.fillSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 3);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_475_456);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 11);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u401f'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", null);
    final HashMap hashMap = new HashMap();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap.put(null, dictSegment2);
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 131_073, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(1, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNull(searchHit.getMatchedDictSegment());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveNotNullOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, searchHit);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveNotNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(0, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNull(searchHit.getMatchedDictSegment());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNull(actual.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput3ZeroPositiveNotNullOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment1, "nodeChar", ' ');
    Reflector.setField(dictSegment1, "childrenMap", null);
    hashMap.put('(', dictSegment1);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'(', '\u0000', '\u0001'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    searchHit.setMatchedDictSegment(null);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 1, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(0, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character(' '), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void fillSegmentInput1OutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 11);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '>');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 4);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap.put('?', dictSegment2);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'?'};

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Map.class)
  @Test
  public void fillSegmentInput1OutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 11);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '>');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 4);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap.put('?', dictSegment2);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'?'};

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 8);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 131_072);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '9');
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'?'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito
        .when(concurrentHashMap.put(or(isA(Object.class), isNull(Object.class)),
                                    or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid10() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'8'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput1OutputVoid11() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 3);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {']'};
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito
        .when(concurrentHashMap.put(or(isA(Object.class), isNull(Object.class)),
                                    or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput2OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2)
        .thenReturn(2);

    // Act
    dictSegment.fillSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput2OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1)
        .thenReturn(-2_147_483_646)
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput2OutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 4);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    final ConcurrentHashMap concurrentHashMap1 = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito
        .when(concurrentHashMap1.put(or(isA(Object.class), isNull(Object.class)),
                                     or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 3);
    final DictSegment[] dictSegmentArray1 = {};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    PowerMockito.when(concurrentHashMap.get(or(isA(Object.class), isNull(Object.class))))
        .thenReturn(dictSegment1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_648);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput2OutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(-2_147_483_646);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput2OutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_640);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '>');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('X', null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap1);
    final char[] charArray = {'?', '\u0018'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput3OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\"');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_641)
        .thenReturn(-2_147_483_643)
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput3OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_640);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '>');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('X', null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 1);
    Reflector.setField(dictSegment2, "storeSize", 4);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap1.put('?', dictSegment2);
    Reflector.setField(dictSegment, "childrenMap", hashMap1);
    final char[] charArray = {'?', '\u0018', '\u013e'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(0)
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void fillSegmentInput3OutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", -2_147_483_640);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 131_072);
    final DictSegment[] dictSegmentArray1 = {null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", '>');
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    hashMap.put('8', null);
    Reflector.setField(dictSegment1, "childrenMap", hashMap);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap1 = new HashMap<Character, DictSegment>();
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 1);
    Reflector.setField(dictSegment2, "storeSize", 4);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", null);
    Reflector.setField(dictSegment2, "childrenMap", null);
    hashMap1.put('?', dictSegment2);
    Reflector.setField(dictSegment, "childrenMap", hashMap1);
    final char[] charArray = {'?', '8', '\u013e'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    dictSegment.fillSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNodeCharOutputNotNull000986559468d144d78() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('!');

    // Act and Assert result
    Assert.assertEquals(new Character('!'), dictSegment.getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNodeCharOutputNotNull2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u0000');

    // Act and Assert result
    Assert.assertEquals(new Character('\u0000'), dictSegment.getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputFalse0000bbcd9e3e8c41b68() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('!');

    // Act and Assert result
    Assert.assertFalse(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputFalse2() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u0000');

    // Act and Assert result
    Assert.assertFalse(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", 'b');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '7');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(1, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", 'u');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", 'Z');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(1, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('\u17ff');
    final DictSegment o = new DictSegment('\u17ff');

    // Act and Assert result
    Assert.assertEquals(0, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u3bf7');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '\u3bf7');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(0, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositiveNegativeNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = -2_147_483_648;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment2);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u2fb2');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '\u2fb2');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(0, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment1);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 2, 5, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = 5;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment1);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_617);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment[] dictSegmentArray = {null};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = 5;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment1);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 0);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", '\u0000');
    Reflector.setField(dictSegment1, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment1);
    Reflector.setField(searchHit, "hitState", 0);

    // Act
    final Hit actual = dictSegment.match(charArray, 2, 5, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    Reflector.setField(dictSegment1, "childrenArray", null);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {null, null, dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = 1_073_741_824;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment2);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(2);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(3, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull6()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 1);
    final DictSegment[] dictSegmentArray1 = {null, null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = 1;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment2);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertNull(searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertNull(actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class})
  @Test
  public void matchInput7PositivePositiveNotNullOutputNotNull7()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final DictSegment dictSegment1 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment1, "nodeState", 1);
    Reflector.setField(dictSegment1, "storeSize", 0);
    final DictSegment[] dictSegmentArray1 = {null, null};
    Reflector.setField(dictSegment1, "childrenArray", dictSegmentArray1);
    Reflector.setField(dictSegment1, "nodeChar", null);
    Reflector.setField(dictSegment1, "childrenMap", null);
    final DictSegment[] dictSegmentArray = {dictSegment1};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", null);
    final HashMap<Character, DictSegment> hashMap = new HashMap<Character, DictSegment>();
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    final char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    final int begin = 2;
    final int length = 1;
    final Hit searchHit = new Hit();
    searchHit.setEnd(0);
    searchHit.setBegin(0);
    final DictSegment dictSegment2 =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment2, "nodeState", 0);
    Reflector.setField(dictSegment2, "storeSize", 0);
    Reflector.setField(dictSegment2, "childrenArray", null);
    Reflector.setField(dictSegment2, "nodeChar", '\u0000');
    Reflector.setField(dictSegment2, "childrenMap", null);
    searchHit.setMatchedDictSegment(dictSegment2);
    Reflector.setField(searchHit, "hitState", 0);
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    final Hit actual = dictSegment.match(charArray, begin, length, searchHit);

    // Assert side effects
    Assert.assertNotNull(searchHit);
    Assert.assertEquals(2, searchHit.getEnd());
    Assert.assertEquals(0, searchHit.getBegin());
    Assert.assertNotNull(searchHit.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), searchHit.getMatchedDictSegment().getNodeChar());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.getEnd());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertNotNull(actual.getMatchedDictSegment());
    Assert.assertEquals(new Character('\u0000'), actual.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u7ea6');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '\u7ea6');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(0, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final DictSegment actual = new DictSegment('!');

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull00023e87589605681e4() {

    // Act, creating object to test constructor
    final DictSegment actual = new DictSegment('!');

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(new Character('!'), actual.getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull000b696d127e6b6519f() {

    // Act, creating object to test constructor
    final DictSegment actual = new DictSegment('\u0000');

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(new Character('\u0000'), actual.getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull4() {

    // Act, creating object to test constructor
    final DictSegment actual = new DictSegment('\u0000');

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(new Character('\u0000'), actual.getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u2011');
    Reflector.setField(dictSegment, "childrenMap", null);
    final DictSegment o = (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(o, "nodeState", 0);
    Reflector.setField(o, "storeSize", 0);
    Reflector.setField(o, "childrenArray", null);
    Reflector.setField(o, "nodeChar", '\u4032');
    Reflector.setField(o, "childrenMap", null);

    // Act and Assert result
    Assert.assertEquals(-1, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive000bd554c5bace6373f() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('b');
    final DictSegment o = new DictSegment('_');

    // Act and Assert result
    Assert.assertEquals(1, dictSegment.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid000867f07ce3f9a8e47()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_643);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(0);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_643);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '\u0000');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(1);

    // Act
    dictSegment.disableSegment(charArray);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DictSegment.class, Arrays.class, Map.class})
  @Test
  public void disableSegmentInput1OutputVoid6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", '!');
    Reflector.setField(dictSegment, "childrenMap", null);
    final char[] charArray = {'\u0000'};
    PowerMockito
        .when(
            Arrays.binarySearch(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                                anyInt(), anyInt(), or(isA(Object.class), isNull(Object.class))))
        .thenReturn(-2_147_483_643)
        .thenReturn(-2_147_483_646);

    // Act
    dictSegment.disableSegment(charArray);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DictSegment.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(concurrentHashMap);

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputTrue4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 1);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertTrue(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputTrue3() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 1_073_741_824);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertTrue(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputTrue2() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 536_870_912);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertTrue(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputTrue001a21e4474912bfc46() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 1);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertTrue(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputFalse4() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertFalse(dictSegment.hasNextNode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextNodeOutputFalse000f37a9368a86c25d0() throws InvocationTargetException {

    // Arrange
    final DictSegment dictSegment =
        (DictSegment)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    Reflector.setField(dictSegment, "childrenArray", null);
    Reflector.setField(dictSegment, "nodeChar", null);
    Reflector.setField(dictSegment, "childrenMap", null);

    // Act and Assert result
    Assert.assertFalse(dictSegment.hasNextNode());
  }
}
