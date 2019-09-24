package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;

import java.lang.reflect.InvocationTargetException;

public class LexemePathTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNullOutputIllegalArgumentException()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_714_487_295);
    Reflector.setField(lexemePath, "pathBegin", -1_998_454_786);
    Reflector.setField(lexemePath, "pathEnd", -1_998_454_786);
    Reflector.setField(lexemePath, "size", 0);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(quickSortSet4, "tail", cell8);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", -1_714_487_295);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-1_998_454_785);
    Reflector.setField(cell6, "lexeme", lexeme9);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(lexemePath, "tail", cell6);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexemePath.addCrossLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNullOutputIllegalArgumentException2() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexemePath.addCrossLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNullOutputIllegalArgumentException()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", -66_584_417);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 67_108_869);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-66_584_418);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(lexemePath, "tail", cell);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexemePath.addNotCrossLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNullOutputIllegalArgumentException2() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexemePath.addNotCrossLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 536_870_912);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(1_610_612_737);
    Reflector.setField(cell, "lexeme", lexeme3);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "tail", cell);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_912);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-536_870_911);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(536_870_912, lexemePath.getPayloadLength());
    Assert.assertEquals(-536_870_911, lexemePath.getPathBegin());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(536_870_912, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-536_870_911, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull00138e46b184d92397c() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -60);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-402_654_041);
    Reflector.setField(cell, "lexeme", lexeme4);
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
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(-60, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-402_654_041, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull4() throws InvocationTargetException {

    // Arrange
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell, "lexeme", null);
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
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull0005497a9590bd8518a() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull000e61c6f042f39c9a8() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(-1, actual.getPathBegin());
    Assert.assertEquals(-1, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull11() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNull(actual.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue000944ef9ac160fee65() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(0, lexemePath.getPathBegin());
    Assert.assertEquals(0, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_648);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_647);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 1_048_576);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(-2_143_289_344);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet1);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_073_741_824);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_073_741_824, lexemePath.getPathBegin());
    Assert.assertEquals(-1_073_741_824, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_073_741_824, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -861_951_923);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_647);
    Reflector.setField(lexemePath, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 271_763_456);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(-1_046_924_208);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet1);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell9, "this$0", quickSortSet3);
    Reflector.setField(cell9, "lexeme", null);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell8, "next", cell9);
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme6);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(cell8, "prev", cell10);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    Reflector.setField(cell11, "lexeme", null);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme7);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell12);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 2_133_248_944);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-1_042_729_904);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell13, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 2_120_666_032);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-2_138_570_750);
    Reflector.setField(cell13, "lexeme", lexeme9);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell14, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell14, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell14, "lexeme", lexeme10);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell13, "prev", cell14);
    Reflector.setField(cell7, "prev", cell13);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 2_120_666_032);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_046_924_208);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(1_935_693_747, lexemePath.getPayloadLength());
    Assert.assertEquals(1_073_741_824, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(271_763_456, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(2_120_666_032, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -861_951_923);
    Reflector.setField(lexemePath, "pathEnd", 1_073_741_825);
    Reflector.setField(lexemePath, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 271_763_456);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(-1_046_924_208);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet1);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell9, "this$0", quickSortSet3);
    Reflector.setField(cell9, "lexeme", null);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell8, "next", cell9);
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme6);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(cell8, "prev", cell10);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    Reflector.setField(cell11, "lexeme", null);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme7);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell12);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 2_133_248_944);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-1_042_729_904);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell13, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 2_120_666_032);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-2_138_570_750);
    Reflector.setField(cell13, "lexeme", lexeme9);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell14, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell14, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell14, "lexeme", lexeme10);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell13, "prev", cell14);
    Reflector.setField(cell7, "prev", cell13);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 2_120_666_032);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_046_924_208);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(1_935_693_748, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(271_763_456, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(2_120_666_032, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue6() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -1_935_693_747);
    Reflector.setField(lexemePath, "pathEnd", 1_073_741_825);
    Reflector.setField(lexemePath, "size", 16);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 271_763_456);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(-1_046_924_208);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet1);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell9, "this$0", quickSortSet3);
    Reflector.setField(cell9, "lexeme", null);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell8, "next", cell9);
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme6);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(cell8, "prev", cell10);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    Reflector.setField(cell11, "lexeme", null);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme7);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell12);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 2_133_248_944);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-1_042_729_904);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell13, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 2_120_666_032);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-2_138_570_750);
    Reflector.setField(cell13, "lexeme", lexeme9);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell14, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell14, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell14, "lexeme", lexeme10);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell13, "prev", cell14);
    Reflector.setField(cell7, "prev", cell13);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 2_120_666_032);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_046_924_208);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_285_531_724, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(271_763_456, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(2_120_666_032, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_046_924_208, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue0009794fd6f67f3d183()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_714_487_295);
    Reflector.setField(lexemePath, "pathBegin", 301_989_888);
    Reflector.setField(lexemePath, "pathEnd", 1_073_741_824);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    Reflector.setField(cell7, "lexeme", null);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
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
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme9);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", -1_714_487_295);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(-1_998_454_785);
    Reflector.setField(cell9, "lexeme", lexeme10);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_714_487_295);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_998_454_786);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(771_751_936, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(-1_714_487_293, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(-1_714_487_295, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_998_454_786, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_714_487_295);
    Reflector.setField(lexemePath, "pathBegin", -1_998_454_786);
    Reflector.setField(lexemePath, "pathEnd", -1_998_454_786);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    Reflector.setField(cell7, "lexeme", null);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
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
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme9);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", -1_714_487_295);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(-1_998_454_785);
    Reflector.setField(cell9, "lexeme", lexeme10);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_714_487_295);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_998_454_786);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_714_487_295, lexemePath.getPayloadLength());
    Assert.assertEquals(582_025_215, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(-1_714_487_293, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(-1_714_487_295, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_998_454_786, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -268_435_451);
    Reflector.setField(lexemePath, "pathBegin", -1_998_454_786);
    Reflector.setField(lexemePath, "pathEnd", -1_730_019_335);
    Reflector.setField(lexemePath, "size", -2_147_483_648);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(quickSortSet4, "tail", cell8);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 268_435_451);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-1_998_454_785);
    Reflector.setField(cell6, "lexeme", lexeme9);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(lexemePath, "tail", cell6);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 268_435_451);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_998_454_786);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(268_435_451, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(-1_714_487_293, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(268_435_451, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-1_998_454_786, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue004bf9b1d257fa9bab0()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_272_707_416);
    Reflector.setField(lexemePath, "pathEnd", 2_046_820_185);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 59_901_259);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(1_272_707_416);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_550_711_477);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-902_186_727);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_550_711_477);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-874_776_231);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(774_112_769, lexemePath.getPayloadLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue005932c7970a15ab714()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -874_776_232);
    Reflector.setField(lexemePath, "pathEnd", 2_046_820_185);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 59_901_259);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(1_272_707_416);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_550_711_477);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-902_186_727);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_550_711_477);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-874_776_231);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_373_370_879, lexemePath.getPayloadLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue0064c22bb075b6f8845()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -874_776_232);
    Reflector.setField(lexemePath, "pathEnd", 973_078_361);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 59_901_259);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(1_272_707_416);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_550_711_477);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-902_186_727);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_550_711_477);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-874_776_231);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_550_711_476, lexemePath.getPayloadLength());
    Assert.assertEquals(1_869_479_588, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue14() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_648_362_064);
    Reflector.setField(lexemePath, "pathEnd", 2_103_444_053);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 1_482_686_167);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-197_131_691);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_738_539_305);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-419_430_319);
    Reflector.setField(cell9, "lexeme", lexeme11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -1_738_539_305);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(-465_567_148);
    Reflector.setField(cell12, "lexeme", lexeme12);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell9, "prev", cell12);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_738_539_305);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-465_567_147);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(455_081_989, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(1_482_686_167, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-197_131_691, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(-1_738_539_305, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-465_567_147, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue15() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -499_121_584);
    Reflector.setField(lexemePath, "pathEnd", 2_103_444_053);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 1_482_686_167);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-197_131_691);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_738_539_305);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-419_430_319);
    Reflector.setField(cell9, "lexeme", lexeme11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -1_738_539_305);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(-465_567_148);
    Reflector.setField(cell12, "lexeme", lexeme12);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell9, "prev", cell12);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_738_539_305);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-465_567_147);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_692_401_659, lexemePath.getPayloadLength());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(1_482_686_167, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-197_131_691, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(-1_738_539_305, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-465_567_147, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputTrue16() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -499_121_584);
    Reflector.setField(lexemePath, "pathEnd", 2_036_335_189);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 1_482_686_167);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-197_131_691);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1_738_539_305);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-419_430_319);
    Reflector.setField(cell9, "lexeme", lexeme11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -1_738_539_305);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(-465_567_148);
    Reflector.setField(cell12, "lexeme", lexeme12);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell9, "prev", cell12);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_738_539_305);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-465_567_147);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_704_984_868, lexemePath.getPayloadLength());
    Assert.assertEquals(2_090_860_844, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(1_482_686_167, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-197_131_691, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(-1_738_539_305, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-465_567_147, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull10() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(1_870_237_945);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(-1, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(1_870_237_945, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull9() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-8_345_601);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(-1, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-8_345_601, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull12() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathBeginOutputNegative() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.getPathBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero000f7a13b6911733633() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final LexemePath o = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathEndOutputNegative() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathLengthOutputZero() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPathLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPayloadLengthOutputZero() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPayloadLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero000a68343aed8aac28a() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputPositive000ae8002946d116c5e() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeTailOutputNull00077a350fe1c05c2d6() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertNull(lexemePath.removeTail());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull000e2aa57fa5e5499e3() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();

    // Act and Assert result
    Assert.assertEquals("pathBegin  : -1\r\npathEnd  : -1\r\npayloadLength  : 0\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue000013bfccba93089cb() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(0, lexemePath.getPathBegin());
    Assert.assertEquals(0, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue0039d319c5cea819481() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, -2, 2_145_386_496, 0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_342_177_280);
    Reflector.setField(lexemePath, "pathEnd", 8_292_863);
    Reflector.setField(lexemePath, "size", 512);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell3);
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
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 226_588_161);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-536_870_911);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme6);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme8);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 226_588_161);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(175_507_967);
    Reflector.setField(cell8, "lexeme", lexeme10);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 226_588_161);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_115_589_119);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(226_588_161, lexemePath.getPayloadLength());
    Assert.assertEquals(-536_870_911, lexemePath.getPathBegin());
    Assert.assertEquals(1_342_177_280, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 310_299_135);
    Reflector.setField(lexemePath, "pathEnd", 8_309_247);
    Reflector.setField(lexemePath, "size", 512);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell3);
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
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -1_879_048_192);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-536_870_911);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme6);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme8);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", -1_879_048_192);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(175_524_351);
    Reflector.setField(cell8, "lexeme", lexeme10);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_879_048_192);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_115_605_503);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-1_879_048_192, lexemePath.getPayloadLength());
    Assert.assertEquals(-536_870_911, lexemePath.getPathBegin());
    Assert.assertEquals(-763_442_689, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue000188b92868b510555()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(0, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 2_080_899_230);
    Reflector.setField(lexemePath, "pathEnd", -66_584_545);
    Reflector.setField(lexemePath, "size", 4);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 67_108_869);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-33_029_986);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 67_108_871);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-66_584_418);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 67_108_869);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-66_584_418);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    Reflector.setField(cell9, "lexeme", null);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell8, "prev", cell9);
    Reflector.setField(cell7, "prev", cell8);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 67_108_869);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-66_584_418);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(67_108_869, lexemePath.getPayloadLength());
    Assert.assertEquals(-33_029_986, lexemePath.getPathBegin());
    Assert.assertEquals(524_451, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -1_207_435_065);
    Reflector.setField(lexemePath, "pathEnd", -368_574_386);
    Reflector.setField(lexemePath, "size", 4);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 67_108_869);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-133_693_297);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 67_108_871);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-1_106_771_809);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 67_108_869);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-368_574_257);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell7, "prev", cell8);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 67_108_869);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-368_574_257);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(67_108_869, lexemePath.getPayloadLength());
    Assert.assertEquals(-133_693_297, lexemePath.getPathBegin());
    Assert.assertEquals(-301_465_388, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue0037ee7ded2ba094a2b()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 64);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 33_554_433);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme10);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "?");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme11);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "next", cell11);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -2_147_483_647);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme12);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(cell9, "prev", cell10);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(1, lexemePath.getPayloadLength());
    Assert.assertEquals(1, lexemePath.getPathBegin());
    Assert.assertEquals(1, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue004e7b91f15a49e0e68()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_073_749_264);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 64);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1_073_748_993);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 33_554_433);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(1_073_748_992);
    Reflector.setField(cell9, "lexeme", lexeme10);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "?");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme11);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "next", cell11);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -2_147_483_647);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(1_073_748_992);
    Reflector.setField(cell10, "lexeme", lexeme12);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(cell9, "prev", cell10);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_073_748_992);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(1, lexemePath.getPayloadLength());
    Assert.assertEquals(1_073_748_993, lexemePath.getPathBegin());
    Assert.assertEquals(1_073_748_993, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue11() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 2);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    Reflector.setField(cell11, "lexeme", null);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "next", cell11);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet6);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "?");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet7);
    Reflector.setField(cell12, "lexeme", null);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell10, "prev", cell12);
    Reflector.setField(cell9, "next", cell10);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 33_554_433);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme11);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell13, "this$0", quickSortSet8);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -2_147_483_647);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme12);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(cell9, "prev", cell13);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(1, lexemePath.getPayloadLength());
    Assert.assertEquals(1, lexemePath.getPathBegin());
    Assert.assertEquals(1, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputTrue12() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", -543_268_901);
    Reflector.setField(lexemePath, "pathEnd", -1_614_806_515);
    Reflector.setField(lexemePath, "size", 2);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet6);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "next", cell11);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "?");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme11);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", 0);
    Reflector.setField(lexeme12, "lexemeText", null);
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme12);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell10, "prev", cell12);
    Reflector.setField(cell9, "next", cell10);
    final QuickSortSet quickSortSet9 = new QuickSortSet();
    Reflector.setField(quickSortSet9, "size", 0);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    Reflector.setField(cell13, "this$0", null);
    final Lexeme lexeme13 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme13, "length", 0);
    Reflector.setField(lexeme13, "lexemeText", "?");
    lexeme13.setOffset(0);
    lexeme13.setLexemeType(0);
    lexeme13.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme13);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(quickSortSet9, "head", cell13);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell14, "next", null);
    Reflector.setField(cell14, "this$0", null);
    final Lexeme lexeme14 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme14, "length", 0);
    Reflector.setField(lexeme14, "lexemeText", "");
    lexeme14.setOffset(0);
    lexeme14.setLexemeType(0);
    lexeme14.setBegin(0);
    Reflector.setField(cell14, "lexeme", lexeme14);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(quickSortSet9, "tail", cell14);
    Reflector.setField(cell9, "this$0", quickSortSet9);
    final Lexeme lexeme15 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme15, "length", 33_554_432);
    Reflector.setField(lexeme15, "lexemeText", "?");
    lexeme15.setOffset(0);
    lexeme15.setLexemeType(0);
    lexeme15.setBegin(543_275_110);
    Reflector.setField(cell9, "lexeme", lexeme15);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-543_268_961);

    // Act and Assert result
    Assert.assertTrue(lexemePath.addNotCrossLexeme(lexeme));

    // Assert side effects
    Assert.assertEquals(-543_268_961, lexemePath.getPathBegin());
    Assert.assertEquals(576_829_542, lexemePath.getPathEnd());
    Assert.assertNotNull(lexemePath.getHead());
    Assert.assertNotNull(lexemePath.getHead().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getNext().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getNext().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getNext().getLexeme().getBegin());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getNext());
    Assert.assertNotNull(lexemePath.getHead().getNext().getNext().getPrev().getLexeme());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLength());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getOffset());
    Assert.assertEquals(
        0, lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0,
                        lexemePath.getHead().getNext().getNext().getPrev().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getNext().getNext().getPrev().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getNext().getLexeme());
    Assert.assertEquals(-2_147_483_647, lexemePath.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(1, lexemePath.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(lexemePath.getHead(), lexemePath.getHead().getNext().getPrev());
    Assert.assertNotNull(lexemePath.getHead().getLexeme());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLength());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, lexemePath.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-543_268_961, lexemePath.getHead().getLexeme().getBegin());
    Assert.assertNull(lexemePath.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull8() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-291_491_313);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(-1, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-291_491_313, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void copyOutputNotNull7() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -1);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(-6_276_999);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act
    final LexemePath actual = lexemePath.copy();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPayloadLength());
    Assert.assertEquals(0, actual.getPathBegin());
    Assert.assertEquals(0, actual.getPathEnd());
    Assert.assertNotNull(actual.getHead());
    Assert.assertNull(actual.getHead().getNext());
    Assert.assertNotNull(actual.getHead().getLexeme());
    Assert.assertEquals(-1, actual.getHead().getLexeme().getLength());
    Assert.assertEquals(0, actual.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, actual.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-6_276_999, actual.getHead().getLexeme().getBegin());
    Assert.assertNull(actual.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse00016f36b2516963d40() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse0015894eeb9f285e8da() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, -1, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse002ef35c2ca4797d8bd() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    final Lexeme lexeme = new Lexeme(0, -2, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_648);
    Reflector.setField(lexemePath, "size", 2);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_714_487_295);
    Reflector.setField(lexemePath, "pathBegin", 1_375_731_712);
    Reflector.setField(lexemePath, "pathEnd", 1_073_741_824);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    Reflector.setField(cell7, "lexeme", null);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
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
    Reflector.setField(cell8, "this$0", null);
    Reflector.setField(cell8, "lexeme", null);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme9);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", -1_714_487_295);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(-1_998_454_785);
    Reflector.setField(cell9, "lexeme", lexeme10);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_714_487_295);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_998_454_786);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 268_435_450);
    Reflector.setField(lexemePath, "pathBegin", -2_006_843_394);
    Reflector.setField(lexemePath, "pathEnd", -1_998_454_786);
    Reflector.setField(lexemePath, "size", -2_147_483_648);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_714_487_293);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell7);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(quickSortSet4, "tail", cell8);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 268_435_451);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-1_998_454_785);
    Reflector.setField(cell6, "lexeme", lexeme9);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(lexemePath, "tail", cell6);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 268_435_451);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_998_454_786);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse001036dcbc707e8aaf6()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_097_152);
    Reflector.setField(lexemePath, "pathEnd", -35_651_583);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -1_610_612_736);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse0020146991c3ce6d176()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -69_206_015);
    Reflector.setField(lexemePath, "pathEnd", -35_651_583);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -1_610_612_736);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse003dae8700b926fa5d2()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 2_078_277_633);
    Reflector.setField(lexemePath, "pathEnd", -35_651_583);
    Reflector.setField(lexemePath, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
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
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme2);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -1_610_612_736);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme5);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme7);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", null);
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme8);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme9);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell8, "lexeme", lexeme11);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_097_152);
    Reflector.setField(lexemePath, "pathEnd", -10_485_759);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_073_741_824);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell9, "lexeme", lexeme11);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -35_651_583);
    Reflector.setField(lexemePath, "pathEnd", -10_485_759);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_073_741_824);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell9, "lexeme", lexeme11);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse11() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 2_111_832_065);
    Reflector.setField(lexemePath, "pathEnd", -10_485_759);
    Reflector.setField(lexemePath, "size", 1);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1_073_741_824);
    Reflector.setField(lexeme6, "lexemeText", null);
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-2_097_152);
    Reflector.setField(cell, "lexeme", lexeme6);
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
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
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
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet7, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet7, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet7);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-33_554_432);
    Reflector.setField(cell9, "lexeme", lexeme11);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(lexemePath, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_097_152);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse12() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse13() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addCrossLexemeInputNotNullOutputFalse2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_648);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 524_446);
    Reflector.setField(lexemePath, "pathEnd", -66_584_545);
    Reflector.setField(lexemePath, "size", 4);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", null);
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 67_108_869);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-33_029_986);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme7);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 67_108_871);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(-66_584_418);
    Reflector.setField(cell7, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 67_108_869);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(-66_584_418);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    Reflector.setField(cell9, "lexeme", null);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell8, "prev", cell9);
    Reflector.setField(cell7, "prev", cell8);
    Reflector.setField(lexemePath, "tail", cell7);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 67_108_869);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-66_584_418);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_648);
    Reflector.setField(lexemePath, "pathEnd", -66_584_417);
    Reflector.setField(lexemePath, "size", -2_147_483_648);
    Reflector.setField(lexemePath, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 67_108_869);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-66_584_418);
    Reflector.setField(cell1, "lexeme", lexeme1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "prev", cell1);
    Reflector.setField(lexemePath, "tail", cell);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 67_108_869);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-66_584_418);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_912);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-536_870_911);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse001e33ac17db241f52b()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", -2_147_483_648);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse0026d8b0feebaadc8b3()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", -2_147_483_648);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", -543_268_901);
    Reflector.setField(lexemePath, "pathEnd", -1_614_806_515);
    Reflector.setField(lexemePath, "size", 2);
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
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "next", cell2);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -2_147_483_647);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 10_592_354);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-543_268_961);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 310_299_135);
    Reflector.setField(lexemePath, "pathEnd", 1_216_268_799);
    Reflector.setField(lexemePath, "size", 512);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell3);
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
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -1_879_048_192);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-536_870_911);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme6);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", null);
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme8);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme9);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", -1_879_048_192);
    Reflector.setField(lexeme10, "lexemeText", null);
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(175_524_351);
    Reflector.setField(cell8, "lexeme", lexeme10);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(lexemePath, "tail", cell8);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_879_048_192);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_115_605_503);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_073_774_848);
    Reflector.setField(lexemePath, "pathEnd", 1_073_774_848);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 77_824);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_073_774_848);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addNotCrossLexemeInputNotNullOutputFalse9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 167_702_221);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 33_619_969);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(167_702_220);

    // Act and Assert result
    Assert.assertFalse(lexemePath.addNotCrossLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeTailOutputNotNull001bc19b5cf66666220() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -1);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 2);
    Reflector.setField(lexemePath, "head", null);
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
    lexeme5.setBegin(3);
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
    Reflector.setField(lexeme7, "length", 2_147_483_647);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(2_147_483_646);
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
    Reflector.setField(lexemePath, "tail", cell);

    // Act
    final Lexeme actual = lexemePath.removeTail();

    // Assert side effects
    Assert.assertEquals(-3, lexemePath.getPathEnd());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(3, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeTailOutputNull000b769024fed704307() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertNull(lexemePath.removeTail());

    // Assert side effects
    Assert.assertEquals(-1, lexemePath.getPathBegin());
    Assert.assertEquals(-1, lexemePath.getPathEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeTailOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 570_434_096);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 2);
    Reflector.setField(lexemePath, "head", null);
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
    Reflector.setField(lexeme7, "length", 4095);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(273);
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
    Reflector.setField(lexemePath, "tail", cell);

    // Act
    final Lexeme actual = lexemePath.removeTail();

    // Assert side effects
    Assert.assertEquals(4368, lexemePath.getPathEnd());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeTailOutputNotNull() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -1);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 1_073_741_825);
    Reflector.setField(lexemePath, "head", null);
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
    Reflector.setField(lexeme7, "length", 2_147_483_647);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(2_147_483_646);
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
    Reflector.setField(lexemePath, "tail", cell);

    // Act
    final Lexeme actual = lexemePath.removeTail();

    // Assert side effects
    Assert.assertEquals(-3, lexemePath.getPathEnd());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 853_278_721);
    Reflector.setField(lexemePath, "pathEnd", 872_293_482);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -19_014_762);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(872_293_482);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse004584a5c2ac2baff2c()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_113_929_216);
    Reflector.setField(lexemePath, "pathEnd", 50_393_630);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_058_999_793);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_124_135_439);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -1017);
    Reflector.setField(lexemePath, "pathBegin", -10_111_125);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(
        "pathBegin  : -10111125\r\npathEnd  : 1\r\npayloadLength  : -1017\r\nlexeme : null\r\n",
        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_073_741_824);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 853_278_721);
    Reflector.setField(lexemePath, "pathEnd", 872_293_483);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -19_014_762);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(872_293_482);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 853_278_721);
    Reflector.setField(lexemePath, "pathEnd", 872_293_482);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_054_727_064);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-201_448_342);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue002dad9e12a10fcc5c1()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_040_252_928);
    Reflector.setField(lexemePath, "pathEnd", 1_057_093_118);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -16_840_175);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_057_093_103);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue00306ec2f6a958c4f59()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1_040_252_928);
    Reflector.setField(lexemePath, "pathEnd", -1_090_390_530);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 2_132_740_625);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_090_390_545);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputTrue9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -1_073_747_250);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 536_870_916);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1_073_747_254);

    // Act and Assert result
    Assert.assertTrue(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse00059f0df3b20877069()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull9() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -3);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 1_342_177_280);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals("pathBegin  : 0\r\npathEnd  : 1342177280\r\npayloadLength  : -3\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 67_671_680);
    Reflector.setField(lexemePath, "pathBegin", 2056);
    Reflector.setField(lexemePath, "pathEnd", -100_000);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
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
    Reflector.setField(lexemePath, "tail", cell1);

    // Act and Assert result
    Assert.assertEquals(
        "pathBegin  : 2056\r\npathEnd  : -100000\r\npayloadLength  : 67671680\r\nlexeme : null\r\n",
        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", 2056);
    Reflector.setField(lexemePath, "pathEnd", -100_000);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "tail", cell);

    // Act and Assert result
    Assert.assertEquals("pathBegin  : 2056\r\npathEnd  : -100000\r\npayloadLength  : 1\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull001129fdf1e35ac8c4f() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -100);
    Reflector.setField(lexemePath, "pathBegin", -10_000_000);
    Reflector.setField(lexemePath, "pathEnd", -21);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -21);
    Reflector.setField(
        lexeme, "lexemeText",
        "????????????????????????????????????????????????????????????????????????????");
    lexeme.setOffset(-967_828_536);
    lexeme.setLexemeType(48);
    lexeme.setBegin(967_828_536);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(
        "pathBegin  : -10000000\r\npathEnd  : -21\r\npayloadLength  : -100\r\nlexeme : 0--21 : ???????????????????????????????????????????????????????????????????????????? : \tTYPE_CQUAN\r\n",
        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull000a52ba45b72b36fe9() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -100);
    Reflector.setField(lexemePath, "pathBegin", -10_000_000);
    Reflector.setField(lexemePath, "pathEnd", -21);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals("pathBegin  : -10000000\r\npathEnd  : -21\r\npayloadLength  : -100\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", -100_000);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(
        "pathBegin  : 0\r\npathEnd  : -100000\r\npayloadLength  : 1\r\nlexeme : null\r\n",
        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull3() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", -100_000);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals("pathBegin  : 0\r\npathEnd  : -100000\r\npayloadLength  : 1\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull2() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -1000);
    Reflector.setField(lexemePath, "pathBegin", -10);
    Reflector.setField(lexemePath, "pathEnd", 43);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals("pathBegin  : -10\r\npathEnd  : 43\r\npayloadLength  : -1000\r\n",
                        lexemePath.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse001e4ee4063a8881780()
      throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 1);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkCrossInputNotNullOutputFalse6() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_647);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexemePath.checkCross(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative6() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", -2_147_483_645);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme4);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero4() throws InvocationTargetException {

    // Arrange
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    Reflector.setField(o, "head", null);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", 42_929_635);
    Reflector.setField(lexemePath, "pathEnd", -68_088_387);
    Reflector.setField(lexemePath, "size", 93_840_956);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -864_596_175);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", 42_929_635);
    Reflector.setField(o, "pathEnd", -68_088_387);
    Reflector.setField(o, "size", 93_840_956);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 746_016_561);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", -2_036_465_622);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_644);
    Reflector.setField(lexemePath, "size", 93_840_956);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -864_596_175);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", 111_018_022);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 93_840_956);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 746_016_561);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", -359_006_206);
    Reflector.setField(lexemePath, "pathEnd", 5);
    Reflector.setField(lexemePath, "size", 93_840_956);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -864_596_175);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", -1_231_683_549);
    Reflector.setField(o, "pathEnd", 1);
    Reflector.setField(o, "size", 93_840_956);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 746_016_561);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", 2_060_879_803);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_645);
    Reflector.setField(lexemePath, "size", 2_007_882_900);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", -85_280_840);
    Reflector.setField(o, "pathEnd", 1);
    Reflector.setField(o, "size", 2_007_882_900);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", 1_250_797_498);
    Reflector.setField(lexemePath, "pathEnd", 1_342_177_282);
    Reflector.setField(lexemePath, "size", 2_007_882_900);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", -896_686_150);
    Reflector.setField(o, "pathEnd", -805_306_366);
    Reflector.setField(o, "size", 2_007_882_900);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero00059c18c175608d1a5() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    Reflector.setField(o, "head", null);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 2_013_265_924);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_644);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 1_282_846_927);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", -786_432);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 745_976_015);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", 1_678_636_033);
    Reflector.setField(lexemePath, "pathEnd", 1_567_618_011);
    Reflector.setField(lexemePath, "size", 93_840_956);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -864_596_175);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", -544_345_087);
    Reflector.setField(o, "pathEnd", -655_363_109);
    Reflector.setField(o, "size", 93_840_956);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 746_016_561);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative10() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", 42_929_635);
    Reflector.setField(lexemePath, "pathEnd", -68_088_387);
    Reflector.setField(lexemePath, "size", 93_840_956);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    Reflector.setField(cell3, "lexeme", null);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    Reflector.setField(cell4, "lexeme", null);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 1);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme1);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet4);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme2);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    Reflector.setField(cell6, "lexeme", null);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "prev", cell6);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", 42_929_635);
    Reflector.setField(o, "pathEnd", -68_088_387);
    Reflector.setField(o, "size", 93_840_956);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme3);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell8);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme4);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell9);
    Reflector.setField(cell7, "this$0", quickSortSet6);
    Reflector.setField(cell7, "lexeme", null);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet7);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme5);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet8);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme6);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "prev", cell11);
    Reflector.setField(cell7, "prev", cell10);
    Reflector.setField(o, "head", cell7);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", -891_910_213);
    Reflector.setField(lexemePath, "pathEnd", 1_342_177_283);
    Reflector.setField(lexemePath, "size", 2_007_882_900);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", -890_587_206);
    Reflector.setField(o, "pathEnd", -805_306_365);
    Reflector.setField(o, "size", 2_007_882_900);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", -896_686_150);
    Reflector.setField(lexemePath, "pathEnd", -805_306_366);
    Reflector.setField(lexemePath, "size", 2_007_882_900);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", 1_250_797_498);
    Reflector.setField(o, "pathEnd", 1_342_177_282);
    Reflector.setField(o, "size", 2_007_882_900);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
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
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell3);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 1);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "prev", cell6);
    Reflector.setField(cell, "prev", cell5);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell, "lexeme", null);
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
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    Reflector.setField(o, "head", null);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputZero4() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputPositive2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputPositive3() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputPositive4() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputPositive5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputZero000a0be9c8fe42292b7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputZero2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getXWeightOutputZero001cff20bab61a084e1() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet);
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell2, "this$0", quickSortSet1);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(cell1, "prev", cell2);
    Reflector.setField(cell, "next", cell1);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getXWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 541_557_612);
    Reflector.setField(lexemePath, "pathBegin", 2_013_265_924);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_644);
    Reflector.setField(lexemePath, "size", -1_591_800_257);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 1_282_846_927);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 541_557_612);
    Reflector.setField(o, "pathBegin", -786_432);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", -1_591_768_194);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 745_976_015);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive6() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 2_013_265_924);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_644);
    Reflector.setField(lexemePath, "size", 1024);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 1_282_846_927);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", -786_432);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 745_976_015);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_648);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_648);
    Reflector.setField(lexemePath, "size", -1_534_636_134);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", -1_031_332_910);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive2() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_977_125_588);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_648);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_648);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 1_977_125_588);
    Reflector.setField(o, "pathBegin", -1_073_741_824);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero0023e4c6cc5c883e2c2() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero5() throws InvocationTargetException {

    // Arrange
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero9() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero3() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
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
    Reflector.setField(cell, "lexeme", null);
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
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero0014bbeadcf701dc0d1() throws InvocationTargetException {

    // Arrange
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
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell2, "lexeme", lexeme1);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero4() throws InvocationTargetException {

    // Arrange
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "next", cell4);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme3);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme4);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero8() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPWeightOutputZero000c78c1986b55dfc13() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 0);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);

    // Act and Assert result
    Assert.assertEquals(0, lexemePath.getPWeight());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative5() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet1);
    Reflector.setField(cell3, "lexeme", null);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet2);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", null);
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme3);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -2_147_483_648);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme4);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet5);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme5);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme6);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme7);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell5, "this$0", quickSortSet6);
    Reflector.setField(cell5, "lexeme", null);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme8);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme9);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell5, "prev", cell11);
    Reflector.setField(o, "head", cell5);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive7() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -4_194_315);
    Reflector.setField(lexemePath, "pathBegin", 2_013_265_924);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_644);
    Reflector.setField(lexemePath, "size", -490);
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
    Reflector.setField(cell1, "lexeme", null);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    Reflector.setField(quickSortSet2, "head", null);
    Reflector.setField(quickSortSet2, "tail", null);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "foo");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme1);
    Reflector.setField(cell3, "prev", null);
    Reflector.setField(cell1, "prev", cell3);
    Reflector.setField(cell, "next", cell1);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet3, "head", cell4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme3);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet3);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 1_282_846_927);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet5);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "prev", cell7);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(lexemePath, "head", cell);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 2_143_289_333);
    Reflector.setField(o, "pathBegin", -786_432);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", -937);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "foo");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet6, "head", cell9);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet6, "tail", cell10);
    Reflector.setField(cell8, "this$0", quickSortSet6);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 745_976_015);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    final QuickSortSet quickSortSet7 = new QuickSortSet();
    Reflector.setField(quickSortSet7, "size", 0);
    Reflector.setField(quickSortSet7, "head", null);
    Reflector.setField(quickSortSet7, "tail", null);
    Reflector.setField(cell11, "this$0", quickSortSet7);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme10);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    final QuickSortSet quickSortSet8 = new QuickSortSet();
    Reflector.setField(quickSortSet8, "size", 0);
    Reflector.setField(quickSortSet8, "head", null);
    Reflector.setField(quickSortSet8, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet8);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(cell11, "prev", cell12);
    Reflector.setField(cell8, "prev", cell11);
    Reflector.setField(o, "head", cell8);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive() {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", -2_147_483_647);
    Reflector.setField(lexemePath, "pathBegin", 0);
    Reflector.setField(lexemePath, "pathEnd", 0);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 0);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    Reflector.setField(o, "head", null);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(1, lexemePath.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative() throws InvocationTargetException {

    // Arrange
    final LexemePath lexemePath = new LexemePath();
    Reflector.setField(lexemePath, "payloadLength", 1_115_471_414);
    Reflector.setField(lexemePath, "pathBegin", -2_147_483_648);
    Reflector.setField(lexemePath, "pathEnd", -2_147_483_648);
    Reflector.setField(lexemePath, "size", 0);
    Reflector.setField(lexemePath, "head", null);
    Reflector.setField(lexemePath, "tail", null);
    final LexemePath o = new LexemePath();
    Reflector.setField(o, "payloadLength", 156_090_109);
    Reflector.setField(o, "pathBegin", 0);
    Reflector.setField(o, "pathEnd", 0);
    Reflector.setField(o, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
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
    Reflector.setField(quickSortSet, "head", cell1);
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
    Reflector.setField(quickSortSet, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "foo");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell4, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", 0);
    Reflector.setField(lexeme3, "lexemeText", "foo");
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
    Reflector.setField(lexeme4, "length", 0);
    Reflector.setField(lexeme4, "lexemeText", "foo");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(0);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell5, "lexeme", lexeme5);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(cell3, "prev", cell5);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(o, "head", cell);
    Reflector.setField(o, "tail", null);

    // Act and Assert result
    Assert.assertEquals(-1, lexemePath.compareTo(o));
  }
}
