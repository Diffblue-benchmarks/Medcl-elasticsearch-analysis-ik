package org.wltea.analyzer.core;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyChar;
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
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.LetterSegmenter;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

@RunWith(PowerMockRunner.class)
public class LetterSegmenterTest {

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException27()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_610_612_763);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 805_043_199);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000',
        '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
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
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-1);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 32_769, 0, 1, 65, 268_435_457, 4, 0, 1025, 0, 0, 5, 0, 1025,
                              1, 1,      1, 1, 0,  1,           3, 1, 0,    1, 5, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 27);
    Reflector.setField(context, "cursor", 26);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

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
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getOffset());
      Assert.assertEquals(0,
                          context.getOrgLexemes().getHead().getPrev().getLexeme().getLexemeType());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(26, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1_870_658_084);
    Reflector.setField(letterSegmenter, "englishEnd", -127_924_999);
    Reflector.setField(letterSegmenter, "arabicEnd", 276_825_563);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1_870_658_066);
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
    final int[] myIntArray = {2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1_870_658_067, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-1_870_658_066, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException4()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", -131_459);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_352_575);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_352_575);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4_194_306,      3, 4_194_305, 1, 4_194_306, 4_194_307,
                              -2_147_483_647, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException5()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_261);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
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
    final int[] myIntArray = {2, 3, 2, 2, 2, 4_194_307, 2, 2, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 6);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException6()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_646);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_261);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-196_610);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
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
    final int[] myIntArray = {2, 3, 2, 2, 2, 4_194_307, 2, 2, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 7);
    Reflector.setField(context, "cursor", 6);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(6, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(6, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException7()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_646);
    Reflector.setField(letterSegmenter, "arabicStart", -17);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_260);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-196_610);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2);
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
    final int[] myIntArray = {2, 3, 0, 1, 1, 4_194_304, 1, 1, 3, 129};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 7);
    Reflector.setField(context, "cursor", 6);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(2_147_483_263,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(1,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(-2, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(24, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-17, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(6, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException8()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_646);
    Reflector.setField(letterSegmenter, "arabicStart", -17);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_360);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 0, 1, 1, 4_194_304, 1, 1, 3, 129};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 7);
    Reflector.setField(context, "cursor", 6);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(24, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-17, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(6, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException9()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_641);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -131_074);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_147_483_641);
    Reflector.setField(letterSegmenter, "englishStart", -131_073);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_360);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_073);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 0, 1, 1, 4_194_304, 1, 1, 3, 129};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 7);
    Reflector.setField(context, "cursor", 6);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(2,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(6, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-131_073, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(6, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException10()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", -131_074);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_825);
    Reflector.setField(letterSegmenter, "end", 67_108_863);
    Reflector.setField(letterSegmenter, "englishStart", -131_073);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
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
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_360);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_073);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 0, 1, 1, 4_194_304, 1, 1, 3, 129};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-131_073, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(7, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException11()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", 8);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_352_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", 67_108_863);
    Reflector.setField(letterSegmenter, "englishStart", -131_073);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
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
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_360);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_073);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 0, 1, 1, 4_194_304, 1, 1, 3, 129};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException12()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -9);
    Reflector.setField(letterSegmenter, "englishEnd", -131_073);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 2_147_483_642);
    Reflector.setField(letterSegmenter, "englishStart", -131_073);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_359);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_073);
    Reflector.setField(cell1, "lexeme", lexeme);
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
    final int[] myIntArray = {-2_147_483_647, -2_147_483_645, 0, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
      Assert.assertEquals(9, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
      Assert.assertEquals(2,
                          context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
      Assert.assertEquals(-9, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
      Assert.assertEquals(context.getOrgLexemes().getHead(),
                          context.getOrgLexemes().getHead().getNext().getPrev());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-131_073, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException13()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -536_870_913);
    Reflector.setField(letterSegmenter, "arabicStart", 680_824_303);
    Reflector.setField(letterSegmenter, "englishEnd", -1_990_983_618);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_466_659_346);
    Reflector.setField(letterSegmenter, "end", -536_870_914);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 1);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException14()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -536_870_913);
    Reflector.setField(letterSegmenter, "arabicStart", 680_820_741);
    Reflector.setField(letterSegmenter, "englishEnd", 156_500_030);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_466_662_908);
    Reflector.setField(letterSegmenter, "end", -536_870_914);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1_744_830_448);
    Reflector.setField(context, "cursor", 17);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException15()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_610_612_733);
    Reflector.setField(letterSegmenter, "arabicStart", 680_820_743);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_466_662_906);
    Reflector.setField(letterSegmenter, "end", 1_610_612_732);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {18, 18, 19, 19, 19, 19, 19, 19, 19,
                              19, 19, 19, 19, 19, 19, 18, 19, 18};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException16()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_610_612_733);
    Reflector.setField(letterSegmenter, "arabicStart", 680_820_743);
    Reflector.setField(letterSegmenter, "englishEnd", -2);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_466_662_906);
    Reflector.setField(letterSegmenter, "end", 1_610_612_733);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
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
    final int[] myIntArray = {18, 18, 19, 19, 19, 19, 19, 19, 19,
                              19, 19, 19, 19, 19, 19, 18, 19, 18};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException17()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_645);
    Reflector.setField(letterSegmenter, "end", 1023);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 4);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1025);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
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
    lexeme1.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 512);
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
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 19);
    Reflector.setField(context, "cursor", 18);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException18()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -1_073_741_825);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_825);
    Reflector.setField(letterSegmenter, "end", -2_147_483_647);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
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
    lexeme1.setBegin(2_147_483_646);
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
    final int[] myIntArray = {0, 0, 2, 1, 1, 1, 1, 1, 1, 3, 1, 0, 1, 0, 1, 0, 2, 2, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException19()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -524_289);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -3);
    Reflector.setField(letterSegmenter, "end", -2_147_483_647);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 2, 1, 1, 1, 1, 1, 1, 3, 1, 0, 1, 0, 1, 0, 2, 2, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException20()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_073_741_587);
    Reflector.setField(letterSegmenter, "arabicStart", -1_629_706_802);
    Reflector.setField(letterSegmenter, "englishEnd", 1_082_334_253);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_621_114_372);
    Reflector.setField(letterSegmenter, "end", 15);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 3);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_113_929_216);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException21()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_073_741_587);
    Reflector.setField(letterSegmenter, "arabicStart", -65_537);
    Reflector.setField(letterSegmenter, "englishEnd", 1_082_332_201);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 15);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 3);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_113_929_216);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException22()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_073_741_587);
    Reflector.setField(letterSegmenter, "arabicStart", -65_537);
    Reflector.setField(letterSegmenter, "englishEnd", 1_082_332_201);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_610_678_209);
    Reflector.setField(letterSegmenter, "end", 15);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 3);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException23()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_073_741_587);
    Reflector.setField(letterSegmenter, "arabicStart", -65_537);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_610_678_209);
    Reflector.setField(letterSegmenter, "end", 15);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 3);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException24()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_013_265_855);
    Reflector.setField(letterSegmenter, "arabicStart", 1_610_612_671);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 2_013_265_854);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                              4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(33_554_432);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException25()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -136_314_882);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "arabicEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "end", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
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
    final int[] myIntArray = {5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_632);
    Reflector.setField(context, "cursor", 15);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(494_855_936, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-2, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(15, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException26()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -136_314_882);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "arabicEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "end", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 5, 1, 1, 1, 1, 5, 1, 1, 0, 0, 1, 1, 1, 1, 1, 5, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_632);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_113_929_216);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -9);
    Reflector.setField(letterSegmenter, "englishEnd", -2_067_792_257);
    Reflector.setField(letterSegmenter, "arabicEnd", -10);
    Reflector.setField(letterSegmenter, "end", -2_147_483_394);
    Reflector.setField(letterSegmenter, "englishStart", 79_691_777);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
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
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_530_920_960);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(79_691_777);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException28()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 26);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_622);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000',
        '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(27);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 32_770, 3, 2, 66, 268_435_458, 7, 3, 1026, 3, 3, 6, 3, 1026, 2,
                              0, 2,      2, 3, 2,  0,           2, 3, 2,    6, 2, 1, 2, 7,    2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 27);
    Reflector.setField(context, "cursor", 27);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException29()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -2_147_483_622);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 26);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 32_770, 3, 2, 66, 268_435_458, 7, 3, 2, 3, 3, 6, 3, 1026,
                              2, 2,      2, 2, 3,  2,           0, 2, 3, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(15, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(15, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException30()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -33);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_822);
    Reflector.setField(letterSegmenter, "englishEnd", 1_879_064_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_879_064_574);
    Reflector.setField(letterSegmenter, "end", 2_147_483_614);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_615);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_342_160_895);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_073_741_822);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1_075_315_456);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-33);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException31()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -35);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_822);
    Reflector.setField(letterSegmenter, "englishEnd", 1_879_064_574);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_827);
    Reflector.setField(letterSegmenter, "end", 2_147_483_612);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_615);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_648);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_073_741_822);
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
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException32()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -35);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_823);
    Reflector.setField(letterSegmenter, "englishEnd", -2);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_826);
    Reflector.setField(letterSegmenter, "end", 2_147_483_612);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_614);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_648);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_073_741_823);
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
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException33()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -35);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_823);
    Reflector.setField(letterSegmenter, "englishEnd", -2);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_073_741_822);
    Reflector.setField(letterSegmenter, "end", 2_147_483_612);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2_147_483_647);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_614);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_648);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_073_741_823);
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
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException34()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_646);
    Reflector.setField(letterSegmenter, "arabicStart", -4_194_369);
    Reflector.setField(letterSegmenter, "englishEnd", -4_194_305);
    Reflector.setField(letterSegmenter, "arabicEnd", -4_194_369);
    Reflector.setField(letterSegmenter, "end", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -4_194_305);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-734_920_706);
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
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException35()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -98);
    Reflector.setField(letterSegmenter, "arabicStart", 2_052_670);
    Reflector.setField(letterSegmenter, "englishEnd", 2_052_668);
    Reflector.setField(letterSegmenter, "arabicEnd", 2047);
    Reflector.setField(letterSegmenter, "end", -18);
    Reflector.setField(letterSegmenter, "englishStart", 2_052_668);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0000', '\u0000', '\u0001', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 81);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-939_524_090);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2, 3, 3, 3, 3, 3, 3, 1, 3, 2, 2, 3, 3, 3,
                              2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_632);
    Reflector.setField(context, "cursor", 15);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException36()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", 16_777_239);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 3, 1, 0, 0, 1, 1, 1,
                              0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException37()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 16_777_239);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 3, 1, 0, 0, 1, 1, 1,
                              0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException38()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", -2_147_483_626);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        1,       1,       262_144, 262_144, 262_144, 262_144, 262_144, 262_144, 262_146, 262_144,
        262_145, 262_145, 262_144, 262_144, 262_144, 262_145, 262_145, 262_147, 262_145, 262_145,
        262_145, 262_145, 262_145, 262_145, 262_144, 262_145, 262_145, 262_145, 262_145, 262_145};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 23);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException39()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_138_720_764);
    Reflector.setField(letterSegmenter, "arabicStart", 1_612_710_400);
    Reflector.setField(letterSegmenter, "englishEnd", -67_076_089);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_359_311);
    Reflector.setField(letterSegmenter, "end", -1_128_030_201);
    Reflector.setField(letterSegmenter, "englishStart", -67_076_089);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    Reflector.setField(context, "buffLocker", null);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException40()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicStart", 1_879_048_191);
    Reflector.setField(letterSegmenter, "englishEnd", -262_145);
    Reflector.setField(letterSegmenter, "arabicEnd", -268_435_457);
    Reflector.setField(letterSegmenter, "end", 10_690_562);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001'};
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
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_073_745_921);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException41()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -9);
    Reflector.setField(letterSegmenter, "arabicStart", 9);
    Reflector.setField(letterSegmenter, "englishEnd", -262_145);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_640);
    Reflector.setField(letterSegmenter, "end", 536_870_903);
    Reflector.setField(letterSegmenter, "englishStart", -262_145);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 33_554_432);
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
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 3, 3, 1, 3, 3, 3, 2, 1,  1, 1, 3, 3, 3,
                              2, 0, 3, 3, 1, 3, 3, 3, 2, 65, 3, 3, 3, 3, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_618);
    Reflector.setField(context, "cursor", 29);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException42()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_642);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 1_516_930_587);
    Reflector.setField(letterSegmenter, "arabicEnd", 532_248_969);
    Reflector.setField(letterSegmenter, "end", -67_108_856);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000'};
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
    Reflector.setField(lexeme, "length", 531_986_827);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
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
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 2, 0, 0, 1, 1, 2, 2, 2, 0, 0, 0, 1, 8_388_611, 1, 0, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(7, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(7, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException43()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_643);
    Reflector.setField(letterSegmenter, "arabicStart", -1025);
    Reflector.setField(letterSegmenter, "englishEnd", 1_516_930_587);
    Reflector.setField(letterSegmenter, "arabicEnd", 532_247_945);
    Reflector.setField(letterSegmenter, "end", -67_108_856);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000'};
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
    Reflector.setField(lexeme, "length", 531_986_827);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1025);
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
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 2, 0, 0, 1, 1, 2, 2, 2, 0, 0, 0, 1, 8_388_611, 1, 0, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(1033, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-1025, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(7, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException44()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_481_087);
    Reflector.setField(letterSegmenter, "arabicStart", -1025);
    Reflector.setField(letterSegmenter, "englishEnd", 1_516_930_587);
    Reflector.setField(letterSegmenter, "arabicEnd", 532_247_945);
    Reflector.setField(letterSegmenter, "end", 2_080_372_226);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000'};
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
    Reflector.setField(lexeme, "length", 531_986_827);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1025);
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
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {65_537, 65_536, 65_536,    65_536, 2,      65_536, 65_536,
                              65_537, 1,      65_538,    65_538, 65_538, 65_536, 65_536,
                              65_536, 65_537, 8_454_147, 65_537, 65_536, 65_538};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(532_248_971, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(-1025, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(7, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException45()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_551);
    Reflector.setField(letterSegmenter, "arabicStart", -1025);
    Reflector.setField(letterSegmenter, "englishEnd", -65);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_451_906);
    Reflector.setField(letterSegmenter, "end", -1_879_048_289);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-524_289);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 14);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNull(context.getOrgLexemes().getHead());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(14, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException46()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicStart", 2_134_638_111);
    Reflector.setField(letterSegmenter, "englishEnd", 12_845_535);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", -1_342_177_281);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 12_845_537);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_134_638_111);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 8, 1, 2, 1, 134_217_728, 2, 2, 1, 8, 2,    8, 1, 0,
                              1, 1, 1, 1, 1, 1, 2,           2, 2, 1, 1, 4096, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException47()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_641);
    Reflector.setField(letterSegmenter, "arabicStart", -2_147_483_641);
    Reflector.setField(letterSegmenter, "englishEnd", 0);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_145_386_490);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
        '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 256);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2_147_483_643);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 9,          0, 3, 3, 134_217_729, 2, 3, 0, 9, 3,    9, 17, 1,
                              0, 5, 33_554_433, 0, 0, 0, 3,           3, 3, 0, 0, 4096, 1, 0,  0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException48()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_641);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 0);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_145_386_490);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 256);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2_147_483_643);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 8,          1, 2, 3, 134_217_729, 2, 3, 2, 8,   2,    8, 17, 0,
                              1, 5, 33_554_433, 1, 1, 1, 2,           3, 2, 1, 256, 4096, 0, 1,  1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException49()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 0);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1_073_741_825);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 256);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-3_145_731);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_648,
                              -2_147_483_647,
                              -2_147_483_640,
                              -2_147_483_647,
                              -2_147_483_646,
                              -2_147_483_645,
                              -2_013_265_919,
                              -2_147_483_646,
                              -2_147_483_645,
                              -2_147_483_646,
                              -2_147_483_640,
                              -2_147_483_646,
                              -2_147_483_640,
                              -2_147_483_631,
                              -2_147_483_648,
                              -2_147_483_647,
                              -2_147_483_643,
                              -2_113_929_215,
                              -2_147_483_647,
                              -2_147_483_647,
                              1,
                              -2_147_483_646,
                              -2_147_483_645,
                              -2_147_483_646,
                              -2_147_483_647,
                              256,
                              4096,
                              -2_147_483_648,
                              1,
                              -2_147_483_647};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException50()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -134_217_705);
    Reflector.setField(letterSegmenter, "arabicStart", 1_778_384_896);
    Reflector.setField(letterSegmenter, "englishEnd", 333_144_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_241_513_983);
    Reflector.setField(letterSegmenter, "end", -72_408_554);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
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
    final int[] myIntArray = {65_538,
                              -2_147_483_645,
                              -2_147_483_640,
                              3,
                              -2_147_483_648,
                              1,
                              134_217_731,
                              0,
                              -2_147_483_647,
                              0,
                              8,
                              0,
                              10,
                              19,
                              66,
                              3,
                              5,
                              33_554_435,
                              -2_147_483_647,
                              1,
                              3,
                              258,
                              -2_147_483_647,
                              2,
                              3,
                              -2_147_483_390,
                              4096,
                              2,
                              3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_628);
    Reflector.setField(context, "cursor", 23);

    // Act
    thrown.expect(IllegalArgumentException.class);
    letterSegmenter.analyze(context);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputIllegalArgumentException2()
      throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 796_916_246);
    Reflector.setField(letterSegmenter, "arabicStart", -1_870_658_545);
    Reflector.setField(letterSegmenter, "englishEnd", 796_916_501);
    Reflector.setField(letterSegmenter, "arabicEnd", 276_825_102);
    Reflector.setField(letterSegmenter, "end", 805_305_109);
    Reflector.setField(letterSegmenter, "englishStart", 796_916_246);
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
    final int[] myIntArray = {4_194_306};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 0);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      letterSegmenter.analyze(context);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(context);
      Assert.assertNotNull(context.getOrgLexemes());
      Assert.assertNotNull(context.getOrgLexemes().getHead());
      Assert.assertNull(context.getOrgLexemes().getHead().getNext());
      Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
      Assert.assertEquals(256, context.getOrgLexemes().getHead().getLexeme().getLength());
      Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
      Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
      Assert.assertEquals(796_916_246, context.getOrgLexemes().getHead().getLexeme().getBegin());
      Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
      Assert.assertEquals(0, context.getBufferOffset());
      Assert.assertEquals(0, context.getCursor());
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 796_916_246);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 796_916_501);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 805_305_109);
    Reflector.setField(letterSegmenter, "englishStart", 796_916_246);
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
    final int[] myIntArray = {4_194_306};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(256, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(796_916_246,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(8_388_864, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(796_916_246, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 796_916_255);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 796_916_254);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 796_916_510);
    Reflector.setField(letterSegmenter, "englishStart", 796_916_255);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
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
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 796_916_255);
    Reflector.setField(letterSegmenter, "arabicStart", -134_217_729);
    Reflector.setField(letterSegmenter, "englishEnd", 796_916_254);
    Reflector.setField(letterSegmenter, "arabicEnd", -134_217_729);
    Reflector.setField(letterSegmenter, "end", 796_916_510);
    Reflector.setField(letterSegmenter, "englishStart", 796_916_255);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
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
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 796_916_255);
    Reflector.setField(letterSegmenter, "arabicStart", -268_435_457);
    Reflector.setField(letterSegmenter, "englishEnd", 796_916_254);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 796_916_510);
    Reflector.setField(letterSegmenter, "englishStart", 796_916_255);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void resetOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);

    // Act
    letterSegmenter.reset();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void constructorOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Act, creating object to test constructor
    final LetterSegmenter actual = new LetterSegmenter();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2_067_792_257);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2_147_483_394);
    Reflector.setField(letterSegmenter, "englishStart", 79_691_777);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_530_920_960);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(79_691_777);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        4_194_305,      -2_147_483_645, -2_143_289_344, 2, -2_143_289_342, -2_143_289_344, 2,
        -2_147_483_647, -2_147_483_646, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(256, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(2_147_483_647,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(2_147_483_263, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(79_691_777, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(7, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2_067_792_257);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -2_147_483_394);
    Reflector.setField(letterSegmenter, "englishStart", 79_691_777);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_530_920_960);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(79_691_777);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        4_194_305,      -2_147_483_645, -2_143_289_344, 2, -2_143_289_342, -2_143_289_344, 2,
        -2_147_483_647, -2_147_483_646, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(256, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(2_147_483_647,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(2_147_483_263, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(79_691_777, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(7, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid9() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2_067_792_257);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", 79_691_777);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_530_920_960);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(79_691_777);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {
        4_194_305,      -2_147_483_645, -2_143_289_344, 2, -2_143_289_342, -2_143_289_344, 2,
        -2_147_483_647, -2_147_483_646, -2_147_483_648};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(2_147_483_263, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(79_691_777, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(7, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid86() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_079_376_925);
    Reflector.setField(letterSegmenter, "englishEnd", -3_395_940);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_113_929_217);
    Reflector.setField(letterSegmenter, "end", 11_477_502);
    Reflector.setField(letterSegmenter, "englishStart", -68_105_059);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "length", -2_147_483_647);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_079_376_925);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 68_105_083);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-68_105_059);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {65_538,
                              -2_147_483_645,
                              -2_147_483_640,
                              3,
                              -2_147_483_648,
                              1,
                              134_217_731,
                              0,
                              -2_147_483_647,
                              0,
                              8,
                              0,
                              10,
                              19,
                              66,
                              3,
                              5,
                              33_554_435,
                              -2_147_483_647,
                              1,
                              3,
                              258,
                              -2_147_483_647,
                              2,
                              3,
                              -2_147_483_390,
                              4096,
                              2,
                              3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(-2_147_483_647,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(2_079_376_925,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(23, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(23, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid85() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -134_217_705);
    Reflector.setField(letterSegmenter, "arabicStart", 1_778_384_896);
    Reflector.setField(letterSegmenter, "englishEnd", 333_144_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_778_384_895);
    Reflector.setField(letterSegmenter, "end", -72_408_554);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
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
    final int[] myIntArray = {65_538,
                              -2_147_483_645,
                              -2_147_483_640,
                              3,
                              -2_147_483_648,
                              1,
                              134_217_731,
                              0,
                              -2_147_483_647,
                              0,
                              8,
                              0,
                              10,
                              19,
                              66,
                              3,
                              5,
                              33_554_435,
                              -2_147_483_647,
                              1,
                              3,
                              258,
                              -2_147_483_647,
                              2,
                              3,
                              -2_147_483_390,
                              4096,
                              2,
                              3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        2, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(
        1_778_384_896,
        context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead().getNext(),
                        context.getOrgLexemes().getHead().getNext().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(23, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(134_217_729, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-134_217_705, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(23, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid12() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_261);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
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
    final int[] myIntArray = {2, 3, 2, 2, 2, 4_194_307, 2, 2, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 7);
    Reflector.setField(context, "cursor", 6);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(6, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(6, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -33);
    Reflector.setField(letterSegmenter, "end", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_359);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2, 1, 1, 1, 4_194_305, 1, 0, 3, 128};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_640);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_359);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2, 1, 1, 1, 4_194_305, 1, 0, 3, 128};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid15() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -2);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_359);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme);
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
    final int[] myIntArray = {1, 3, 0, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid16() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -9);
    Reflector.setField(letterSegmenter, "englishEnd", -131_073);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -16_777_217);
    Reflector.setField(letterSegmenter, "englishStart", -131_073);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0001', '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_146_959_359);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_073);
    Reflector.setField(cell1, "lexeme", lexeme);
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
    final int[] myIntArray = {-2_147_483_647, -2_147_483_645, 0, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_647);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(9, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-9, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-131_073, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid17() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1);
    Reflector.setField(letterSegmenter, "arabicStart", 680_824_300);
    Reflector.setField(letterSegmenter, "englishEnd", -1_301_615_109);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_755_005_932);
    Reflector.setField(letterSegmenter, "end", 0);
    Reflector.setField(letterSegmenter, "englishStart", -1_458_115_076);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1_074_181_633, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(680_824_300, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid18() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 680_824_300);
    Reflector.setField(letterSegmenter, "englishEnd", -1_301_549_509);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_755_006_060);
    Reflector.setField(letterSegmenter, "end", -2);
    Reflector.setField(letterSegmenter, "englishStart", -1_458_049_540);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1_074_181_761, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(680_824_300, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid19() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 19);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 18);
    Reflector.setField(letterSegmenter, "end", 1023);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 4);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1025);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
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
    lexeme1.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 512);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(19);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 19);
    Reflector.setField(context, "cursor", 18);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1025, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(18, context.getCursor());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid21() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 33_554_433);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 1023);
    Reflector.setField(letterSegmenter, "englishStart", 33_554_433);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(14);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-536_866_817);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 1, 3, 3, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 13);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(13, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid22() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 33_554_433);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 1023);
    Reflector.setField(letterSegmenter, "englishStart", 33_554_433);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(14);
    Reflector.setField(cell1, "lexeme", lexeme);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-536_866_817);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 1, 0, 1, 3, 3, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(11, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid23() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1_073_741_825);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_813);
    Reflector.setField(letterSegmenter, "end", 11);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
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
    lexeme1.setBegin(2_147_483_646);
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
    final int[] myIntArray = {3, 3, 2, 2, 2, 2, 2, 2, 2, 0, 2, 3, 2, 3, 2, 3, 1, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-1, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(13, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_073_741_825, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(11, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid24() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1_073_741_825);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_073_741_813);
    Reflector.setField(letterSegmenter, "end", 11);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
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
    lexeme1.setBegin(2_147_483_646);
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
    final int[] myIntArray = {0, 0, 2, 1, 1, 1, 1, 1, 1, 3, 1, 0, 1, 0, 1, 0, 2, 2, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -524_289);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -3);
    Reflector.setField(letterSegmenter, "end", 1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_646);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 2, 1, 1, 1, 1, 1, 1, 3, 1, 0, 1, 0, 1, 0, 2, 2, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 5);
    Reflector.setField(context, "cursor", 11);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid84() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -134_217_705);
    Reflector.setField(letterSegmenter, "arabicStart", 1_778_384_896);
    Reflector.setField(letterSegmenter, "englishEnd", 333_144_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_778_384_895);
    Reflector.setField(letterSegmenter, "end", -72_408_554);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
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
    final int[] myIntArray = {65_538,
                              -2_147_483_645,
                              -2_147_483_640,
                              3,
                              -2_147_483_648,
                              1,
                              134_217_731,
                              0,
                              -2_147_483_647,
                              0,
                              8,
                              0,
                              10,
                              19,
                              66,
                              3,
                              5,
                              33_554_435,
                              -2_147_483_647,
                              1,
                              3,
                              258,
                              -2_147_483_647,
                              2,
                              3,
                              -2_147_483_390,
                              4096,
                              2,
                              3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_628);
    Reflector.setField(context, "cursor", 23);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(1_778_384_896, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(23, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid27() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2049);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -3);
    Reflector.setField(letterSegmenter, "end", -2047);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_642);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {524_288, 524_288, 524_290, 524_289, 524_289, 524_289, 524_289,
                              524_289, 524_289, 524_291, 524_289, 524_288, 524_289, 524_288,
                              524_289, 524_288, 524_290, 524_290, 524_288};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 1);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-1, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2049, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(1, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid83() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 67_108_864);
    Reflector.setField(letterSegmenter, "arabicStart", 1_778_384_896);
    Reflector.setField(letterSegmenter, "englishEnd", 333_144_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_778_384_895);
    Reflector.setField(letterSegmenter, "end", 128_918_015);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
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
    final int[] myIntArray = {2,
                              3,
                              -2_147_483_640,
                              -2_147_483_645,
                              0,
                              -2_147_483_647,
                              -2_013_265_917,
                              0,
                              -2_147_483_647,
                              0,
                              -2_147_483_640,
                              0,
                              -2_147_483_638,
                              -2_147_483_629,
                              2,
                              3,
                              -2_147_483_643,
                              33_554_435,
                              -2_147_483_647,
                              -2_147_483_647,
                              3,
                              -2_147_483_390,
                              -2_147_483_647,
                              -2_147_483_648,
                              -2_147_483_645,
                              258,
                              4096,
                              -2_147_483_646,
                              3,
                              1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_620);
    Reflector.setField(context, "cursor", 27);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(1_778_384_896,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(61_809_152, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(67_108_864, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(27, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid82() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 67_108_864);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 333_144_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_138_450_942);
    Reflector.setField(letterSegmenter, "end", 128_918_015);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
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
    final int[] myIntArray = {2,
                              3,
                              -2_147_483_640,
                              -2_147_483_645,
                              0,
                              -2_147_483_647,
                              -2_013_265_917,
                              0,
                              -2_147_483_647,
                              0,
                              -2_147_483_640,
                              0,
                              -2_147_483_638,
                              -2_147_483_629,
                              2,
                              3,
                              -2_147_483_643,
                              33_554_435,
                              -2_147_483_647,
                              -2_147_483_647,
                              3,
                              -2_147_483_390,
                              -2_147_483_647,
                              -2_147_483_648,
                              -2_147_483_645,
                              258,
                              4096,
                              -2_147_483_646,
                              3,
                              1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(61_809_152, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(67_108_864, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(27, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid30() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_610_612_736);
    Reflector.setField(letterSegmenter, "arabicStart", -1_073_741_825);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1_610_612_737);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                              4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(33_554_432);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid31() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_823);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -6);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
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
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 75_497_729);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1_073_758_209);
    Reflector.setField(cell3, "lexeme", lexeme1);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 138_244);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_643);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                              4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_113_929_216);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid32() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -268_435_457);
    Reflector.setField(letterSegmenter, "englishEnd", -1_879_048_192);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 1_686_110_458);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(lexeme1, "length", -36_863);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_584);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 612_368_641);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-5);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                              4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_113_929_216);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid33() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -4097);
    Reflector.setField(letterSegmenter, "englishEnd", -2_147_483_648);
    Reflector.setField(letterSegmenter, "arabicEnd", -4097);
    Reflector.setField(letterSegmenter, "end", 1_686_110_462);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_483_647);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-4097);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 612_368_641);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-1);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                              4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_618);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid34() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_520);
    Reflector.setField(letterSegmenter, "englishEnd", -2_147_483_521);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_521);
    Reflector.setField(letterSegmenter, "end", -2);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_483_520);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(lexeme1, "length", 256);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 4_194_560);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_520);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid35() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_520);
    Reflector.setField(letterSegmenter, "englishEnd", -2_147_483_521);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_521);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", 2_147_483_520);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(lexeme1, "length", 256);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 4_194_560);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_520);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid36() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -136_314_882);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", 90_031_102);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(33_554_432);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid37() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -136_314_882);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "arabicEnd", 524_287);
    Reflector.setField(letterSegmenter, "end", 90_031_102);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme1, "length", 524_289);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
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
    final int[] myIntArray = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(33_554_432);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid38() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -136_314_882);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 494_855_933);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_048_577);
    Reflector.setField(letterSegmenter, "end", 90_031_102);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_147_483_520);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
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
    final int[] myIntArray = {5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 5, 5, 5};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_632);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(494_855_936,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-2, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(226_345_985, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-136_314_882, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid39() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1_879_311_365);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000',
        '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 32_769, 0, 1, 65, 268_435_457, 4, 0, 1025, 0, 0, 5, 0, 1025,
                              1, 1,      1, 1, 0,  1,           3, 1, 0,    1, 5, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 27);
    Reflector.setField(context, "cursor", 26);

    // Act
    letterSegmenter.analyze(context);

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
    Assert.assertEquals(26, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid40() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 26);
    Reflector.setField(letterSegmenter, "arabicStart", 26);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 26);
    Reflector.setField(letterSegmenter, "end", 15);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000',
        '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0000', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
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
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 1);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(26);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell3);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 32_769, 0, 1, 65, 268_435_457, 4, 0, 1025, 0, 0, 5, 0, 1025,
                              1, 1,      1, 1, 0,  1,           3, 1, 0,    1, 5, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 27);
    Reflector.setField(context, "cursor", 26);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid41() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 15);
    Reflector.setField(letterSegmenter, "arabicStart", -2_147_483_622);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_623);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 32_770, 3, 2, 66, 268_435_458, 7, 3, 2, 3, 3, 6, 3, 1026,
                              2, 2,      2, 2, 3,  2,           0, 2, 3, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(15, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2_147_483_622, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid42() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -2_147_483_622);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_623);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 32_770, 3, 2, 66, 268_435_458, 7, 3, 2, 3, 3, 6, 3, 1026,
                              2, 2,      2, 2, 3,  2,           0, 2, 3, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(15, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2_147_483_622, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid43() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -2_147_483_622);
    Reflector.setField(letterSegmenter, "englishEnd", 15);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_483_623);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", 15);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 32_770, 3, 2, 66, 268_435_458, 7, 3, 2, 3, 3, 6, 3, 1026,
                              2, 2,      2, 2, 3,  2,           0, 2, 3, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(15, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-2_147_483_622, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid44() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -33);
    Reflector.setField(letterSegmenter, "arabicStart", 1_073_741_822);
    Reflector.setField(letterSegmenter, "englishEnd", 1_879_064_574);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_879_064_574);
    Reflector.setField(letterSegmenter, "end", 1_611_916_204);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_611_916_238);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(2_147_483_615);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_342_160_895);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_073_741_822);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 1_075_438_542);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-33);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid45() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_219_457);
    Reflector.setField(letterSegmenter, "arabicStart", -2_142_224_396);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_142_224_397);
    Reflector.setField(letterSegmenter, "end", -1_610_348_546);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_912);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_144_200_706);
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
    lexeme1.setBegin(-2_142_224_899);
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
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid46() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_219_457);
    Reflector.setField(letterSegmenter, "arabicStart", -2_142_224_396);
    Reflector.setField(letterSegmenter, "englishEnd", -1_048_577);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_142_224_397);
    Reflector.setField(letterSegmenter, "end", -1_610_348_546);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_912);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_144_200_706);
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
    lexeme1.setBegin(-2_142_224_899);
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
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid47() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_219_457);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1_610_348_546);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_912);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_144_200_706);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-513);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid81() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 67_108_864);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 467_362_301);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_138_450_942);
    Reflector.setField(letterSegmenter, "end", 128_918_015);
    Reflector.setField(letterSegmenter, "englishStart", 134_217_726);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_648,
                              1,
                              8,
                              1,
                              -2_147_483_646,
                              3,
                              134_217_729,
                              2,
                              3,
                              2,
                              8,
                              2,
                              8,
                              17,
                              -2_147_483_648,
                              1,
                              5,
                              33_554_433,
                              -2_147_483_647,
                              1,
                              1,
                              2,
                              3,
                              2,
                              1,
                              256,
                              4096,
                              0,
                              1,
                              -2_147_483_647};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid49() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -4_194_369);
    Reflector.setField(letterSegmenter, "englishEnd", -4_194_305);
    Reflector.setField(letterSegmenter, "arabicEnd", -4_194_369);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -4_194_305);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-734_920_706);
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
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid50() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 7713);
    Reflector.setField(letterSegmenter, "arabicEnd", 9743);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", 7);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-939_524_090);
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
    Reflector.setField(lexeme1, "length", 9745);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2);
    Reflector.setField(cell2, "lexeme", lexeme1);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 6155);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-6_291_449);
    Reflector.setField(cell3, "lexeme", lexeme2);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 3,
                              2, 3, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-939_524_090, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid51() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -97);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 7703);
    Reflector.setField(letterSegmenter, "arabicEnd", 9743);
    Reflector.setField(letterSegmenter, "end", -17);
    Reflector.setField(letterSegmenter, "englishStart", 7);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 81);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-939_524_090);
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
    Reflector.setField(lexeme1, "length", 9745);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2);
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
    final int[] myIntArray = {2, 3, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 3,
                              2, 3, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(113, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-97, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(15, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid52() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", 2_052_670);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_052_669);
    Reflector.setField(letterSegmenter, "end", 75);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0000', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 67_108_864);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 81);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_610_612_735);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_113_929_215);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_036_286);
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
    final int[] myIntArray = {2, 2, 3, 3, 3, 3, 3, 3, 1, 3, 2, 2, 3, 3, 3,
                              2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 28);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(
        81, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(
        1_610_612_735,
        context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead().getNext(),
                        context.getOrgLexemes().getHead().getNext().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(28, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(34, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-5, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(28, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid53() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_646);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 23);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 3, 1, 0, 0, 1, 1, 1,
                              0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 24);
    Reflector.setField(context, "cursor", 23);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid80() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 67_108_864);
    Reflector.setField(letterSegmenter, "arabicStart", 67_108_864);
    Reflector.setField(letterSegmenter, "englishEnd", 400_777_727);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_205_559_807);
    Reflector.setField(letterSegmenter, "end", 128_918_015);
    Reflector.setField(letterSegmenter, "englishStart", 67_633_152);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0000', '\u0002', '\u0001', '\u0002',
                                '\u0001', '\u0002', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
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
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell, "prev", cell2);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_648,
                              1,
                              8,
                              1,
                              -2_147_483_646,
                              3,
                              134_217_729,
                              2,
                              3,
                              2,
                              8,
                              2,
                              8,
                              17,
                              -2_147_483_648,
                              1,
                              5,
                              33_554_433,
                              -2_147_483_647,
                              1,
                              1,
                              2,
                              3,
                              2,
                              1,
                              256,
                              4096,
                              0,
                              1,
                              -2_147_483_647};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid79() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -65);
    Reflector.setField(letterSegmenter, "arabicStart", 2_134_638_111);
    Reflector.setField(letterSegmenter, "englishEnd", 12_845_535);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", -268_435_521);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 256);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
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
    Reflector.setField(lexeme1, "length", 66);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(2_140_144_476);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
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
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 12_845_537);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(2_134_638_111);
    Reflector.setField(cell3, "lexeme", lexeme3);
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
    final int[] myIntArray = {0, 1, 8, 1, 2, 1, 134_217_728, 2, 2, 1, 8, 2,    8, 1, 0,
                              1, 1, 1, 1, 1, 1, 2,           2, 2, 1, 1, 4096, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid78() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_134_638_111);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", -268_435_457);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
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
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-524_289);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 8, 1, 2, 1, 134_217_728, 2, 2, 1, 8, 2,    8, 1, 0,
                              1, 1, 1, 1, 1, 1, 2,           2, 2, 1, 1, 4096, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid57() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_138_622_466);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", -67_076_089);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1_127_931_903);
    Reflector.setField(letterSegmenter, "englishStart", -67_076_089);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001'};
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
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16);
    Reflector.setField(context, "cursor", 15);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid58() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -262_145);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 10_690_562);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001'};
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
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_073_745_921);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-1_073_741_824);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid59() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 432_085_365);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 2_021_659_001);
    Reflector.setField(letterSegmenter, "englishStart", -1_107_230_721);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0005', '\u0000', '\u0000', '\u0000', '\u0003',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0000', '\u0081', '\u0003', '\t',     '\u0000', '\u0000',
                                '\u0003', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001'};
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
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-33_492_994);
    Reflector.setField(cell, "lexeme", lexeme);
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
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                              0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 29);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(1_073_741_824);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid60() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 432_085_365);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 2_021_659_002);
    Reflector.setField(letterSegmenter, "englishStart", -1_107_230_721);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0005', '\u0001', '\u0000', '\u0000', '\u0003',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0000', '\u0081', '\u0003', '\t',     '\u0000', '\u0001',
                                '\u0003', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001'};
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
    Reflector.setField(lexeme, "length", -2_147_474_783);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-33_492_996);
    Reflector.setField(cell, "lexeme", lexeme);
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
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 1, 0,  0, 0, 0, 0, 0,
                              1, 1, 0, 0, 0, 0, 0, 0, 1, 65, 0, 0, 0, 0, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 30);
    Reflector.setField(context, "cursor", 8);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1_539_316_087, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_107_230_721, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(8, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid61() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 1_539_316_085);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 2_021_659_002);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0005', '\u0001', '\u0000', '\u0000', '\u0003',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0000', '\u0081', '\u0003', '\t',     '\u0000', '\u0001',
                                '\u0003', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001'};
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 1, 0,  0, 0, 0, 0, 0,
                              1, 1, 0, 0, 0, 0, 0, 0, 1, 65, 0, 0, 0, 0, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(8, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(8, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid62() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 8);
    Reflector.setField(letterSegmenter, "englishEnd", 1_610_612_733);
    Reflector.setField(letterSegmenter, "arabicEnd", 8);
    Reflector.setField(letterSegmenter, "end", 2_147_483_645);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0005', '\u0001', '\u0000', '\u0000', '\u0003',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0000', '\u0081', '\u0003', '\t',     '\u0000', '\u0001',
                                '\u0003', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001'};
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 0, 1,  1, 1, 1, 1, 1,
                              0, 0, 1, 1, 1, 1, 1, 1, 0, 65, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid63() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 8);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 8);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0005', '\u0001', '\u0000', '\u0000', '\u0003',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
                                '\u0000', '\u0081', '\u0003', '\t',     '\u0000', '\u0001',
                                '\u0003', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001'};
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
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 1, 1, 1, 1, 1, 1, 0, 1,  1, 1, 1, 1, 1,
                              0, 0, 1, 1, 1, 1, 1, 1, 0, 65, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid77() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_134_638_111);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_647);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
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
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-524_289);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 1, 8, 1, 2, 1, 134_217_728, 2, 2, 1, 8, 2,    8, 1, 0,
                              1, 1, 1, 1, 1, 1, 2,           2, 2, 1, 1, 4096, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid76() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 28);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_450_882);
    Reflector.setField(letterSegmenter, "end", 268_435_485);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
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
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-524_289);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(27, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid66() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -9);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 2_147_483_639);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 33_554_432);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(8);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "??");
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
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 2);
    Reflector.setField(lexeme2, "lexemeText", "??????????????????????????????????????");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(8);
    Reflector.setField(cell2, "lexeme", lexeme2);
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
    final int[] myIntArray = {2, 3, 3, 3, 1, 3, 3, 3, 2, 1, 1,  1, 3, 3,
                              3, 2, 0, 2, 3, 1, 3, 2, 3, 2, 65, 3, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(8, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(18, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(3, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-9, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(8, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid67() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 33_554_432);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(8);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "??");
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
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 2);
    Reflector.setField(lexeme2, "lexemeText", "??????????????????????????????????????");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(8);
    Reflector.setField(cell2, "lexeme", lexeme2);
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
    final int[] myIntArray = {2, 3, 3, 3, 1, 3, 3, 3, 2, 1, 1,  1, 3, 3,
                              3, 2, 0, 2, 3, 1, 3, 2, 3, 2, 65, 3, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 9);
    Reflector.setField(context, "cursor", 8);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(8, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(8, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid68() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -8_388_610);
    Reflector.setField(letterSegmenter, "englishEnd", 1_517_192_728);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_060_883_896);
    Reflector.setField(letterSegmenter, "end", 2_080_374_784);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
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
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
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
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -831_714_770);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2);
    Reflector.setField(cell2, "lexeme", lexeme1);
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
    final int[] myIntArray = {8_388_610, 8_388_611, 8_388_611, 8_388_611, 8_388_609, 8_388_611,
                              8_388_611, 8_388_611, 8_388_610, 8_388_609, 8_388_609, 8_388_609,
                              8_388_611, 8_388_611, 8_388_611, 8_388_610, 8_388_608, 8_388_610,
                              8_388_611, 8_388_609, 8_388_611, 8_388_610, 8_388_611, 8_388_610,
                              8_388_610, 8_388_611, 8_388_611};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 25);
    Reflector.setField(context, "cursor", 24);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext().getNext().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(
        1, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(
        -2, context.getOrgLexemes().getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead().getNext(),
                        context.getOrgLexemes().getHead().getNext().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getNext().getLexeme());
    Assert.assertEquals(1_517_192_731,
                        context.getOrgLexemes().getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-2, context.getOrgLexemes().getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(context.getOrgLexemes().getHead(),
                        context.getOrgLexemes().getHead().getNext().getPrev());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1_069_272_507, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(2, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-8_388_610, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(24, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid69() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -8_388_610);
    Reflector.setField(letterSegmenter, "englishEnd", 1_517_192_728);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_060_883_896);
    Reflector.setField(letterSegmenter, "end", 2_080_374_784);
    Reflector.setField(letterSegmenter, "englishStart", -2);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0005', '\u0001',
        '\u0000', '\u0000', '\u0003', '\u0000', '\u0000', '\u0000', '\u0000', '\u0001', '\u0001',
        '\u0000', '\u0081', '\u0003', '\u0001', '\u0000', '\u0001', '\u0001', '\u0000', '\u0000'};
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
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
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
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell2, "next", cell3);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -831_714_770);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2);
    Reflector.setField(cell2, "lexeme", lexeme1);
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
    final int[] myIntArray = {0, 1, 1,         1, 3, 1, 1, 1, 0, 3, 3, 3, 1, 1,
                              1, 0, 8_388_610, 0, 1, 3, 1, 0, 1, 0, 0, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 25);
    Reflector.setField(context, "cursor", 24);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(-2_147_483_648);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid70() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2_147_483_647);
    Reflector.setField(letterSegmenter, "arabicStart", 1_690_304_750);
    Reflector.setField(letterSegmenter, "englishEnd", -2_000_682_777);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_690_304_749);
    Reflector.setField(letterSegmenter, "end", -2_147_483_648);
    Reflector.setField(letterSegmenter, "englishStart", 1_757_413_607);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 64);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_681_916_014);
    Reflector.setField(cell, "lexeme", lexeme);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2_134_900_506);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 504);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid71() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 1_690_304_750);
    Reflector.setField(letterSegmenter, "englishEnd", -2_000_682_777);
    Reflector.setField(letterSegmenter, "arabicEnd", 1_690_304_749);
    Reflector.setField(letterSegmenter, "end", -2);
    Reflector.setField(letterSegmenter, "englishStart", 1_757_413_607);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 64);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_681_916_014);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 504);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid72() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -2_013_265_920);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -2);
    Reflector.setField(letterSegmenter, "englishStart", 1_744_830_464);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 64);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_677_721_600);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 504);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid75() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 28);
    Reflector.setField(letterSegmenter, "arabicStart", -1025);
    Reflector.setField(letterSegmenter, "englishEnd", -65);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_451_906);
    Reflector.setField(letterSegmenter, "end", 268_435_484);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-524_289);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 27);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(27, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid20() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 0);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", 1023);
    Reflector.setField(letterSegmenter, "englishStart", 0);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
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
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 2, 3, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 2, 0, 0, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 1);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid74() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -97);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -33_554_433);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_450_882);
    Reflector.setField(letterSegmenter, "end", 268_435_359);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 65);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 448);
    Reflector.setField(context, "cursor", 14);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(14, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid65() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -9);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 536_870_903);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 33_554_432);
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
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 3, 3, 1, 3, 3, 3, 2, 1,  1, 1, 3, 3, 3,
                              2, 0, 3, 3, 1, 3, 3, 3, 2, 65, 3, 3, 3, 3, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_618);
    Reflector.setField(context, "cursor", 29);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(29, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid64() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -9);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -262_145);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 536_870_903);
    Reflector.setField(letterSegmenter, "englishStart", -262_145);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 33_554_432);
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
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {2, 3, 3, 3, 1, 3, 3, 3, 2, 1,  1, 1, 3, 3, 3,
                              2, 0, 3, 3, 1, 3, 3, 3, 2, 65, 3, 3, 3, 3, 2};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", -2_147_483_618);
    Reflector.setField(context, "cursor", 29);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getPrev().getLexeme());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getPrev().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(29, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid56() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -2);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", -2_147_483_626);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {
        '\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
        '\u0001', '\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
        '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_647);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {-2_147_483_647,
                              -2_147_483_647,
                              0,
                              0,
                              0,
                              0,
                              0,
                              0,
                              2,
                              0,
                              1,
                              1,
                              0,
                              0,
                              0,
                              1,
                              1,
                              3,
                              1,
                              1,
                              1,
                              1,
                              1,
                              1,
                              0,
                              1,
                              1,
                              1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 28);
    Reflector.setField(context, "cursor", 16);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(16, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid55() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 23);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 0, 0, 0,
                              1, 1, 3, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 23);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(23, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicStart", -268_435_457);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -1_073_741_570);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_647);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_073_741_822);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 384);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2);
    Reflector.setField(letterSegmenter, "end", -1_073_741_570);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_647);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_073_741_822);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 384);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {4_194_304, 3, 4_194_305, 3, 4_194_307, 4_194_305, 3, 0, 2, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 16_385);
    Reflector.setField(context, "cursor", 7);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid73() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -2_147_450_882);
    Reflector.setField(letterSegmenter, "end", 268_435_455);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 65);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 448);
    Reflector.setField(context, "cursor", 27);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(27, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid28() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -32);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -3);
    Reflector.setField(letterSegmenter, "end", 10);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_616);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1,       3, 3,       3, 0,       3, 0, 1, 2,
                              3, 524_289, 3, 524_289, 3, 524_289, 2, 3, 1};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 8);
    Reflector.setField(context, "cursor", 8);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(8, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid26() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -5);
    Reflector.setField(letterSegmenter, "arabicStart", -524_289);
    Reflector.setField(letterSegmenter, "englishEnd", -1);
    Reflector.setField(letterSegmenter, "arabicEnd", -3);
    Reflector.setField(letterSegmenter, "end", 1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0000', '\u0001', '\u0000', '\u0001'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 8192);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(2_147_483_642);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 2, 1, 1, 1, 1, 1, 1, 3, 1, 0, 1, 0, 1, 0, 2, 2, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 15);
    Reflector.setField(context, "cursor", 1);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid11() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_261);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
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
    final int[] myIntArray = {2, 3, 2, 2, 2, 4_194_307, 2, 2, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 6);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(-385, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-131_074, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(6, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid10() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", 2_147_483_261);
    Reflector.setField(letterSegmenter, "arabicEnd", -134_217_729);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(context, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -385);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-131_074);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -385);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
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
    final int[] myIntArray = {2, 3, 2, 2, 2, 4_194_307, 2, 2, 1, 3};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 4);
    Reflector.setField(context, "cursor", 6);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(-385, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-131_074, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(6, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid29() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", 1_073_741_587);
    Reflector.setField(letterSegmenter, "arabicStart", -1_629_706_802);
    Reflector.setField(letterSegmenter, "englishEnd", 1_082_334_253);
    Reflector.setField(letterSegmenter, "arabicEnd", -1_621_114_372);
    Reflector.setField(letterSegmenter, "end", 1_073_741_587);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 14);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0)
        .thenReturn(33_554_432);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void analyzeInputNotNullOutputVoid48() throws InvocationTargetException {

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", -1);
    Reflector.setField(letterSegmenter, "englishEnd", -1_073_741_825);
    Reflector.setField(letterSegmenter, "arabicEnd", -1);
    Reflector.setField(letterSegmenter, "end", -1);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-730_726_402);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    letterSegmenter.analyze(context);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNotNull(context.getOrgLexemes().getHead());
    Assert.assertNull(context.getOrgLexemes().getHead().getNext());
    Assert.assertNotNull(context.getOrgLexemes().getHead().getLexeme());
    Assert.assertEquals(1, context.getOrgLexemes().getHead().getLexeme().getLength());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getOffset());
    Assert.assertEquals(0, context.getOrgLexemes().getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-730_726_402, context.getOrgLexemes().getHead().getLexeme().getBegin());
    Assert.assertNull(context.getOrgLexemes().getHead().getPrev());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LetterSegmenter.class, Arrays.class})
  @Test
  public void analyzeInputNotNullOutputVoid54() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final LetterSegmenter letterSegmenter =
        (LetterSegmenter)Reflector.getInstance("org.wltea.analyzer.core.LetterSegmenter");
    Reflector.setField(letterSegmenter, "start", -1);
    Reflector.setField(letterSegmenter, "arabicStart", 2_147_483_647);
    Reflector.setField(letterSegmenter, "englishEnd", 471_250_634);
    Reflector.setField(letterSegmenter, "arabicEnd", 2_147_483_646);
    Reflector.setField(letterSegmenter, "end", 23);
    Reflector.setField(letterSegmenter, "englishStart", -1);
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000', '\u0000', '\u0001', '\u0001', '\u0001', '\u0001',
                                '\u0001', '\u0001', '\u0001', '\u0001', '\u0000', '\u0000',
                                '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_676_233_012);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    final int[] myIntArray = {0, 0, 1, 1, 1, 1, 1, 1, 3, 1, 0, 0, 1, 1, 1,
                              0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Reflector.setField(context, "charTypes", myIntArray);
    Reflector.setField(context, "pathMap", null);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 29);
    Reflector.setField(context, "cursor", 23);
    PowerMockito.when(Arrays.binarySearch(or(isA(char[].class), isNull(char[].class)), anyChar()))
        .thenReturn(0);

    // Act
    letterSegmenter.analyze(context);

    // The method returns void, testing that no exception is thrown
  }
}
