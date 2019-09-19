package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.CJKSegmenter;
import org.wltea.analyzer.core.QuickSortSet;
import org.wltea.analyzer.dic.Hit;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CJKSegmenterTest {

  // Test written by Diffblue Cover.

  @Test
  public void resetOutputVoid0008348e573a59c4c9c() {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final LinkedList<Hit> linkedList = new LinkedList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", linkedList);

    // Act
    cJKSegmenter.reset();
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 13);
    Reflector.setField(context, "cursor", 8);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_648,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_648);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
        -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
        -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
        -2_147_483_648, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
        -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
        -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);
    arrayList.add(hit);
    final Hit hit1 = new Hit();
    hit1.setEnd(0);
    hit1.setBegin(0);
    hit1.setMatchedDictSegment(null);
    Reflector.setField(hit1, "hitState", 0);
    arrayList.add(hit1);
    final Hit hit2 = new Hit();
    hit2.setEnd(0);
    hit2.setBegin(0);
    hit2.setMatchedDictSegment(null);
    Reflector.setField(hit2, "hitState", 0);
    arrayList.add(hit2);
    final Hit hit3 = new Hit();
    hit3.setEnd(0);
    hit3.setBegin(0);
    hit3.setMatchedDictSegment(null);
    Reflector.setField(hit3, "hitState", 0);
    arrayList.add(hit3);
    final Hit hit4 = new Hit();
    hit4.setEnd(0);
    hit4.setBegin(0);
    hit4.setMatchedDictSegment(null);
    Reflector.setField(hit4, "hitState", 0);
    arrayList.add(hit4);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 2);
    Reflector.setField(context, "cursor", 1);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_646);
    Reflector.setField(context, "cursor", 1);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_648,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException10() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {9, 9, 9, 9, 8};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 4);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException11() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);
    arrayList.add(hit);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_648);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException12() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_647,
                              -2_147_483_647, -2_147_483_647, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 13);
    Reflector.setField(context, "cursor", 8);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {9, 9, 9, 9, 8};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 4);

    // Act
    thrown.expect(IllegalStateException.class);
    cJKSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CJKSegmenter actual = new CJKSegmenter();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid000f2c5efe345a0c0f4() {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();

    // Act
    cJKSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_648);
    Reflector.setField(context, "cursor", 29);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 2);
    Reflector.setField(context, "cursor", 1);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_646);
    Reflector.setField(context, "cursor", 1);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid9() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 4);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid10() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 4);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid11() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);
    arrayList.add(hit);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_648);
    Reflector.setField(context, "cursor", 15);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid12() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);
    arrayList.add(hit);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 13);
    Reflector.setField(context, "cursor", 8);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 7);

    // Act
    cJKSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0001f7b0f5ac0f526b9() {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);

    // Act
    cJKSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0000d92891b6f16f81e() {

    // Arrange
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList);

    // Act
    cJKSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }
}
