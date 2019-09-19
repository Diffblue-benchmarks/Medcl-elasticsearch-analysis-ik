package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.CN_QuantifierSegmenter;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;
import org.wltea.analyzer.dic.Hit;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CN_QuantifierSegmenterTest {

  // Test written by Diffblue Cover.

  @Test
  public void resetOutputVoid000413bce97ce427a89() {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final LinkedList<Hit> linkedList = new LinkedList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", linkedList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);

    // Act
    cNQuantifierSegmenter.reset();
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\uce00', '\uce01', '\uce03', '\uce01', '\uce01',
                                '\uce01', '\uce03', '\uce00', '\uce01', '\uce00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(288);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 69, 1_140_850_692, 65, 1_073_741_901, 84, 69, 4, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException4()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_643);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_640);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException5()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01',
                                '\uce01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e01', '\uce01', '\uce01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -14);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_644);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(2_147_483_646);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5,           5, 5, 5, 5, 5,          1, 5, 5,
                              5, 134_217_733, 5, 5, 4, 4, 33_554_437, 5, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 20);
    Reflector.setField(context, "cursor", 19);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException6()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    Reflector.setField(cNQuantifierSegmenter, "countHits", null);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {131_076};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException7()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    Reflector.setField(cNQuantifierSegmenter, "countHits", null);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 4);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException8()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    Reflector.setField(cNQuantifierSegmenter, "countHits", null);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 0);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077,
        131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077,
        131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_076};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException9()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 268_435_456);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 524_288);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5, 131_077, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException10()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    Reflector.setField(cNQuantifierSegmenter, "countHits", null);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_640);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_013_265_920);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_893);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_904);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -2_147_483_646);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_640);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 13, 1,
                              4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 4, 5,  4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException11()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_645);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_570);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-134_217_728);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1_610_612_745);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(-1_610_612_744);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 5, 1, 5, 5, 5, 0, 5, 1, 5, 1, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1_677_721_312);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1_677_721_311);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 262_143);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_647);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 5, 0, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 262_143);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_647);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 5, 0, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -536_870_913);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_071_644_671);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(1_610_612_735);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 4, 0, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_638);
    Reflector.setField(context, "cursor", 9);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_071_644_672);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 4, 0, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_644);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -3);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_645);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException10() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_080_374_779);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -6);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\uce00', '\uce01', '\uce01', '\uce01', '\uce01',
                                '\uce01', '\uce01', '\uce01', '\uce01', '\uce01',
                                '\uce01', '\uce01', '\uce01', '\uce01', '\uce00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException11() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\uce00', '\uce01', '\uce01', '\uce01', '\uce01',
                                '\uce01', '\uce01', '\uce01', '\uce01', '\uce01',
                                '\uce01', '\uce01', '\uce01', '\uce01', '\uce00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_647);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1);
    Reflector.setField(cell, "lexeme", lexeme);
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
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 3);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(2_147_483_644);
    Reflector.setField(cell2, "lexeme", lexeme3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell2, "prev", cell4);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(-2_147_483_647,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException12() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_630);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_645);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_645);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException13() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1_073_741_824);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01', '\uce01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("foo");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_073_741_825);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 12);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(2);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(-1_073_741_825,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(2_147_483_644,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(13, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(14, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException3()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_643);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_640);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException15() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1_073_741_825);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01', '\uce01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -29);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(14);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5,           5, 5, 5, 5, 5,          1, 5, 5,
                              5, 134_217_733, 5, 5, 4, 4, 33_554_437, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 13);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException16() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 4);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException17() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 1_073_741_823);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -79_964_165);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException18() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02', '\u4e01', '\u4e02', '\u4e02', '\u4e03'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                              5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 17);
    Reflector.setField(context, "cursor", 4);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException19() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e03', '\u4e01', '\u4e02', '\u4e02', '\u4e03'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2);
    Reflector.setField(lexeme1, "lexemeText", "????");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_611_133_056);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "??");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 5);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(1_073_741_824);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    Reflector.setField(cell5, "lexeme", null);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                              5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException20() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e03', '\u4e01', '\u4e02', '\u4e02', '\u4e03', '\u4e02',
                                '\u4e02', '\u4e00', '\u4e03', '\u4e02', '\u4e02', '\u4e02',
                                '\u4e02', '\u4e02', '\u4e01', '\u4e01', '\u4e03', '\u4e02',
                                '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e02',
                                '\u4e03', '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e03'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2);
    Reflector.setField(lexeme1, "lexemeText", "????");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "??");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 2053);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(16);
    lexeme3.setBegin(-285_507_762);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5,
                              5, 4, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException21() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -3);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e03', '\u4e01', '\u4e02', '\u4e02', '\u4e03', '\u4e02',
                                '\u4e02', '\u4e00', '\u4e03', '\u4e02', '\u4e02', '\u4e02',
                                '\u4e02', '\u4e02', '\u4e01', '\u4e01', '\u4e03', '\u4e02',
                                '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e02',
                                '\u4e03', '\u4e02', '\u4e02', '\u4e02', '\u4e02', '\u4e03'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 131_072);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 268_437_505);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(-268_437_476);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5,
                              5, 4, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException22() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 939_528_191);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e02', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
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
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 4, 5, 5, 4, 5, 5, 5, 4, 4, 5, 5, 5, 1, 1, 4, 4, 1, 5, 5, 5, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 2);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException23() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1_073_559_529);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u5105', '\u5105', '\u5105', '\u5105', '\u5105', '\u5105',
                                '\u5105', '\u5104', '\u5105', '\u5105', '\u5105'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {131_077, 131_077, 131_077, 131_077, 131_077, 5,
                              131_077, 4,       5,       131_077, 131_077, 131_077};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException24() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1', '\u53c1', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5,       131_077, 4,
                              5, 131_077, 131_077, 131_077, 5,       131_077, 131_077, 4,
                              4, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 17);
    Reflector.setField(context, "cursor", 16);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(16, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException25() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1', '\u53c1', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5,       131_077, 4,
                              5, 131_077, 131_077, 131_077, 5,       131_077, 131_077, 4,
                              4, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 65_553);
    Reflector.setField(context, "cursor", 16);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException26() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1', '\u53c1', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5,       131_077, 4,
                              5, 131_077, 131_077, 131_077, 5,       131_077, 131_077, 4,
                              4, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 65_553);
    Reflector.setField(context, "cursor", 16);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException27() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c1', '\u53c0', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1', '\u53c1', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0', '\u53c0'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5,       131_077, 4,
                              5, 131_077, 131_077, 131_077, 5,       131_077, 131_077, 4,
                              4, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077, 131_077};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 17);
    Reflector.setField(context, "cursor", 16);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException28() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_646);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 524_288);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5, 131_077, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException29() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_391);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4a01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 30);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(-2);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4,       131_077, 131_077, 131_077, 131_077, 5,
                              131_077, 4,       5,       131_077, 131_077, 131_077,
                              5,       131_077, 131_077, 4,       4,       131_077,
                              131_077, 131_077, 131_077, 131_077, 131_077, 131_077,
                              135_173, 131_077, 131_077, 135_173, 4,       -2_147_483_644};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 28);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException30() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);
    arrayList.add(hit);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_936_256_370);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(1_936_256_370,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException31() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_936_256_370);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(1_936_256_370,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException32() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_936_256_370);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(1_936_256_370,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException33() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 8);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 8);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_936_195_586);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_783);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_790);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(1_936_195_586,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(8, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(7, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException34() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
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
    final Hit hit5 = new Hit();
    hit5.setEnd(0);
    hit5.setBegin(0);
    hit5.setMatchedDictSegment(null);
    Reflector.setField(hit5, "hitState", 0);
    arrayList.add(hit5);
    final Hit hit6 = new Hit();
    hit6.setEnd(0);
    hit6.setBegin(0);
    hit6.setMatchedDictSegment(null);
    Reflector.setField(hit6, "hitState", 0);
    arrayList.add(hit6);
    final Hit hit7 = new Hit();
    hit7.setEnd(0);
    hit7.setBegin(0);
    hit7.setMatchedDictSegment(null);
    Reflector.setField(hit7, "hitState", 0);
    arrayList.add(hit7);
    final Hit hit8 = new Hit();
    hit8.setEnd(0);
    hit8.setBegin(0);
    hit8.setMatchedDictSegment(null);
    Reflector.setField(hit8, "hitState", 0);
    arrayList.add(hit8);
    final Hit hit9 = new Hit();
    hit9.setEnd(0);
    hit9.setBegin(0);
    hit9.setMatchedDictSegment(null);
    Reflector.setField(hit9, "hitState", 0);
    arrayList.add(hit9);
    final Hit hit10 = new Hit();
    hit10.setEnd(0);
    hit10.setBegin(0);
    hit10.setMatchedDictSegment(null);
    Reflector.setField(hit10, "hitState", 0);
    arrayList.add(hit10);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_640);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_013_265_920);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_904);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -2_147_483_646);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_640);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalStateException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException2()
      throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(288);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 69, 1_140_850_692, 65, 1_073_741_901, 84, 69, 4, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    cNQuantifierSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalStateException14() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01', '\uce01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("foo");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_073_741_837);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(14);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);
    try {

      // Act
      thrown.expect(IllegalStateException.class);
      cNQuantifierSegmenter.analyze(context);
    } catch (IllegalStateException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(-1_073_741_837,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(2_147_483_644,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(14, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(14, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1_677_721_312);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1_677_721_311);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0000a476004dad8b09d() {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();

    // Act
    cNQuantifierSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CN_QuantifierSegmenter actual = new CN_QuantifierSegmenter();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid39() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(268_402_686);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_895);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(10);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 17);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 13, 1,
                              4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5,  5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(-67_133_569, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(268_402_686, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\uce00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 3);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid32() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 8);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 8);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_936_195_586);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_783);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_790);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(1_936_195_586,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(16, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(8, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(7, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid28() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_391);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4a01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 30);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(-2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4,       131_077, 131_077, 131_077, 131_077, 5,
                              131_077, 4,       5,       131_077, 131_077, 131_077,
                              5,       131_077, 131_077, 4,       4,       131_077,
                              131_077, 131_077, 131_077, 131_077, 131_077, 131_077,
                              135_173, 131_077, 131_077, 135_173, 4,       -2_147_483_644};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 28);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(28, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid10() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1_073_741_823);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_145_386_495);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 4, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(7, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid11() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 1_140_850_692, 1, 1_073_741_837, 20, 5, 4, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid25() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_646);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u53c1', '\u53c0', '\u53c0', '\u53c0',
                                '\u53c0', '\u53c0', '\u53c0', '\u53c1'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 131_077, 131_077, 131_077, 131_077, 5, 131_077, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid22() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 4096);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e03', '\u4e00', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 15);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 4, 5, 5, 4, 5, 5, 5, 4, 4, 5, 5, 5, 1, 4, 4, 4, 1, 5, 5, 5, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 17);
    Reflector.setField(context, "cursor", 15);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid14() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_630);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_645);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(-2_147_483_630, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(2_147_483_645, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid15() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_629);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid21() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_646);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1_207_955_455);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e03', '\u4e00', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 16);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 4, 5, 5, 4, 5, 5, 5, 4, 4, 5, 5, 5, 1, 4,
                              4, 4, 1, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 17);
    Reflector.setField(context, "cursor", 16);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid17() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1_073_741_824);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01',
                                '\uce01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e01', '\uce01', '\uce01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_073_741_825);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 14);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(-2_147_483_632);
    lexeme1.setBegin(2);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 262_143);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_647);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2_097_156, 2_097_157, 1_142_947_844, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid18() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\uce01', '\u4e01', '\u4e01', '\uce01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_073_741_837);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(14);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 4, 4,           4, 4, 4, 4, 1,          4,
                              5, 4, 134_217_733, 4, 4, 5, 5, 33_554_437, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid20() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -524_289);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1_073_741_823);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e02', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 131_072);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 268_437_505);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(-268_437_482);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1,
                              1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid16() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_645);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_629);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_644);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet2);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_644, 5, -2_147_483_643, -2_147_483_643};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid13() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_475_451);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -8192);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e00', '\u4e00', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    Reflector.setField(context, "orgLexemes", null);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid23() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_647);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2_147_479_552);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e03', '\u4e00', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2);
    Reflector.setField(lexeme, "lexemeText", "????");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 15);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(3);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5,           5,           536_870_917, 8197, 5,  -2_147_483_643,
                              536_870_917, 268_435_461, 5,           5,    69, 1_048_581,
                              4,           0,           5,           5,    4,  0,
                              4,           7,           133,         4,    5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid24() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e03', '\u4e00', '\u4e00',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e00', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2);
    Reflector.setField(lexeme, "lexemeText", "????");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 15);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(3);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5,           5,           536_870_917, 8197, 5,  -2_147_483_643,
                              536_870_917, 268_435_461, 5,           5,    69, 1_048_581,
                              4,           0,           5,           5,    4,  0,
                              4,           7,           133,         4,    5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid12() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 262_143);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e03', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(288);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {68, 69, 1_140_850_756, 1, 1_073_741_837, 20, 69, 68, 64};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid26() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_639);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u800c', '\u800d', '\u800d', '\u800d', '\u800d', '\u800d',
                                '\u800d', '\u800c', '\u800d', '\u800d', '\u800d', '\u800d',
                                '\u800d', '\u800d', '\u800d', '\u800c', '\u800c', '\u800d',
                                '\u800d', '\u800d', '\u800d', '\u800d', '\u800d', '\u800d'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(-2_147_483_646);
    lexeme1.setBegin(-2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4100, 135_173, 135_173, 135_173, 135_173, 4101,    135_173, 4100,
                              4101, 135_173, 135_173, 135_173, 4101,    135_173, 135_173, 4100,
                              4100, 135_173, 135_173, 135_173, 135_173, 135_173, 135_173, 135_173};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_631);
    Reflector.setField(context, "cursor", 16);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid27() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_639);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u800c', '\u800d', '\u800d', '\u800d', '\u800d', '\u800d',
                                '\u800d', '\u800c', '\u800d', '\u800d', '\u800d', '\u800d',
                                '\u800d', '\u800d', '\u800d', '\u800c', '\u800c', '\u800d',
                                '\u800d', '\u800d', '\u800d', '\u800d', '\u800d', '\u800d'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(-2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4100, 135_173, 135_173, 135_173, 135_173, 4101,    135_173, 4100,
                              4101, 135_173, 135_173, 135_173, 4101,    135_173, 135_173, 4100,
                              4100, 135_173, 135_173, 135_173, 135_173, 135_173, 135_173, 135_173};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_631);
    Reflector.setField(context, "cursor", 16);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid9() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\uce00', '\uce01', '\uce03', '\uce01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("foo");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_647);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(16);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        -2_147_483_644, -2_147_483_643, -1_006_632_956, 1, -1_073_741_811, -2_147_483_628,
        -2_147_483_643, -2_147_483_643, -2_147_483_648, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid29() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_645);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -3);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4a01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_073_741_779);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(1_073_741_807);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {20,      131_093, 131_093, 131_093, 131_093, 21,
                              131_093, 20,      21,      131_093, 131_093, 131_093,
                              21,      131_093, 131_093, 20,      20,      131_093,
                              131_093, 131_093, 131_093, 131_093, 131_093, 131_093,
                              135_189, 131_093, 131_093, 135_189, 20,      -2_147_483_628};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4_194_333);
    Reflector.setField(context, "cursor", 28);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid30() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 2_147_483_645);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -3);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4a01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_073_741_779);
    Reflector.setField(lexeme1, "lexemeText", "??");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(1_073_741_807);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {20,      131_093, 131_093, 131_093, 131_093, 21,
                              131_093, 20,      21,      131_093, 131_093, 131_093,
                              21,      131_093, 131_093, 20,      20,      131_093,
                              131_093, 131_093, 131_093, 131_093, 131_093, 131_093,
                              135_189, 131_093, 131_093, 135_189, 20,      -2_147_483_628};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 28);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid31() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4a01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
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
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_073_741_777);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(0);
    lexeme.setLexemeType(2);
    lexeme.setBegin(1_073_741_806);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {20,      131_093, 131_093, 131_093, 131_093, 21,
                              131_093, 20,      21,      131_093, 131_093, 131_093,
                              21,      131_093, 131_093, 20,      20,      131_093,
                              131_093, 131_093, 131_093, 131_093, 131_093, 131_093,
                              135_189, 131_093, 131_093, 135_189, 20,      -2_147_483_628};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_619);
    Reflector.setField(context, "cursor", 28);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid19() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -524_289);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 1_073_741_823);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e03', '\u4e00', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e02', '\u4e00', '\u4e00', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00',
                                '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 131_072);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 268_437_505);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(-268_437_482);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1,
                              1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 23);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid33() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 0);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_915_224_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 13, 1, 4, 4, 4, 4, 4, 4, 4, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid34() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 0);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_915_224_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 13, 1, 4, 4, 4, 4, 4, 4, 4, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid35() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_648);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_915_224_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 13, 1, 4, 4, 4, 4, 4, 4, 4, 4};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid36() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_648);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_915_224_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {12, 13, 13, 13, 5,  13, 13, 12, 13, 13, 13, 13,
                              13, 5,  9,  13, 13, 13, 13, 13, 13, 13, 12};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 22);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid37() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -2_147_483_648);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_915_224_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {12, 13, 13, 13, 5,  13, 13, 12, 13, 13, 13, 13,
                              13, 5,  9,  13, 13, 13, 13, 13, 13, 13, 12};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid38() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_569);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(268_402_686);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -536_870_903);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(536_870_910);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_647);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {12, 13, 13, 13, 5,  13, 13, 12, 13, 13, 13, 13,
                              13, 5,  9,  13, 13, 13, 13, 13, 13, 13, 12};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 7);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 3);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_647);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1_073_741_828};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid40() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
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
    final Hit hit5 = new Hit();
    hit5.setEnd(0);
    hit5.setBegin(0);
    hit5.setMatchedDictSegment(null);
    Reflector.setField(hit5, "hitState", 0);
    arrayList.add(hit5);
    final Hit hit6 = new Hit();
    hit6.setEnd(0);
    hit6.setBegin(0);
    hit6.setMatchedDictSegment(null);
    Reflector.setField(hit6, "hitState", 0);
    arrayList.add(hit6);
    final Hit hit7 = new Hit();
    hit7.setEnd(0);
    hit7.setBegin(0);
    hit7.setMatchedDictSegment(null);
    Reflector.setField(hit7, "hitState", 0);
    arrayList.add(hit7);
    final Hit hit8 = new Hit();
    hit8.setEnd(0);
    hit8.setBegin(0);
    hit8.setMatchedDictSegment(null);
    Reflector.setField(hit8, "hitState", 0);
    arrayList.add(hit8);
    final Hit hit9 = new Hit();
    hit9.setEnd(0);
    hit9.setBegin(0);
    hit9.setMatchedDictSegment(null);
    Reflector.setField(hit9, "hitState", 0);
    arrayList.add(hit9);
    final Hit hit10 = new Hit();
    hit10.setEnd(0);
    hit10.setBegin(0);
    hit10.setMatchedDictSegment(null);
    Reflector.setField(hit10, "hitState", 0);
    arrayList.add(hit10);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e00', '\u4e01', '\u4e01', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e00', '\u4e01', '\u4e01',
                                '\u4e01', '\u4e01', '\u4e01', '\u4e01'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -67_133_570);
    Reflector.setField(lexeme, "lexemeText", "");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-134_217_728);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1_610_612_745);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(2);
    lexeme1.setBegin(-1_610_612_744);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -2_147_483_645);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_641);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 5, 1, 5, 5, 5, 0, 5, 1, 5, 1, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e00'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1_073_741_828};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", -1);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u4e02'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    cNQuantifierSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid0003f07ffc03fcb1426() {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    arrayList.add(null);
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 0);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);

    // Act
    cNQuantifierSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetOutputVoid000a1f9775d14db01d7() {

    // Arrange
    final CN_QuantifierSegmenter cNQuantifierSegmenter = new CN_QuantifierSegmenter();
    final ArrayList<Hit> arrayList = new ArrayList<Hit>();
    Reflector.setField(cNQuantifierSegmenter, "countHits", arrayList);
    Reflector.setField(cNQuantifierSegmenter, "nStart", 0);
    Reflector.setField(cNQuantifierSegmenter, "nEnd", 0);

    // Act
    cNQuantifierSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }
}
