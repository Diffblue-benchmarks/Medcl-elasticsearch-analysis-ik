package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QuickSortSetTest {

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNullOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -64);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-142_557);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme11);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "prev", cell11);
    Reflector.setField(cell9, "next", cell10);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    Reflector.setField(cell12, "lexeme", null);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell12);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    Reflector.setField(cell13, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", 0);
    Reflector.setField(lexeme12, "lexemeText", null);
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme12);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell13);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme13 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme13, "length", -1);
    Reflector.setField(lexeme13, "lexemeText", null);
    lexeme13.setOffset(0);
    lexeme13.setLexemeType(0);
    lexeme13.setBegin(-142_559);
    Reflector.setField(cell9, "lexeme", lexeme13);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell9);

    // Act
    thrown.expect(IllegalArgumentException.class);
    quickSortSet.addLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNullOutputIllegalArgumentException002588482020ce7d4fc()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_073_741_825);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-454_922);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
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
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -1);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-192_777);
    Reflector.setField(cell2, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -17);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(-454_922);
    Reflector.setField(cell5, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    Reflector.setField(cell6, "this$0", null);
    Reflector.setField(cell6, "lexeme", null);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "prev", cell6);
    Reflector.setField(cell2, "prev", cell5);
    Reflector.setField(quickSortSet, "tail", cell2);

    // Act
    thrown.expect(IllegalArgumentException.class);
    quickSortSet.addLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNullOutputIllegalArgumentException3() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet1, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -17);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(134_287_094);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -1);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(134_549_239);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    Reflector.setField(cell6, "lexeme", null);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell3, "prev", cell6);
    Reflector.setField(quickSortSet, "tail", cell3);

    // Act
    thrown.expect(IllegalArgumentException.class);
    quickSortSet.addLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNullOutputIllegalArgumentException4() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act
    thrown.expect(IllegalArgumentException.class);
    quickSortSet.addLexeme(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNullNullOutputIllegalArgumentException() throws Throwable {

    // Arrange
    final QuickSortSet this$0 = null;
    final Lexeme lexeme = null;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("org.wltea.analyzer.core.QuickSortSet$Cell");
      final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
          Reflector.forName("org.wltea.analyzer.core.QuickSortSet"),
          Reflector.forName("org.wltea.analyzer.core.Lexeme"));
      ctor.setAccessible(true);
      final QuickSortSet.Cell actual = (QuickSortSet.Cell)ctor.newInstance(this$0, lexeme);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputFalse() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_048_980_070);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-1);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_048_980_070);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-1);

    // Act and Assert result
    Assert.assertFalse(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
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
    Reflector.setField(quickSortSet1, "head", cell1);
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
    Reflector.setField(quickSortSet1, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme3 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme3, "length", -1_834_773_110);
    Reflector.setField(lexeme3, "lexemeText", null);
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme3);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
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
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme5);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(cell3, "prev", cell4);
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
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
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme8);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell5, "next", cell6);
    Reflector.setField(cell5, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", -1_833_790_054);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(1);
    Reflector.setField(cell5, "lexeme", lexeme9);
    Reflector.setField(cell5, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell5);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1_834_773_094);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNotNull(quickSortSet.getHead().getNext());
    Assert.assertNull(quickSortSet.getHead().getNext().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getNext().getLexeme());
    Assert.assertEquals(-1_834_773_110, quickSortSet.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(quickSortSet.getHead(), quickSortSet.getHead().getNext().getPrev());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(-1_834_773_094, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue00017a54835a237b54e()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNull(quickSortSet.getHead().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue6() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -64);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-142_557);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    Reflector.setField(cell10, "lexeme", null);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell10);
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
    Reflector.setField(quickSortSet4, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet4);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", -1);
    Reflector.setField(lexeme11, "lexemeText", null);
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(-142_559);
    Reflector.setField(cell9, "lexeme", lexeme11);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-142_557);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue7() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_648);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -64);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1_626_913);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme11);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "prev", cell11);
    Reflector.setField(cell9, "next", cell10);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    Reflector.setField(cell12, "lexeme", null);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell12);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    Reflector.setField(cell13, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", 0);
    Reflector.setField(lexeme12, "lexemeText", null);
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme12);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell13);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme13 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme13, "length", -1);
    Reflector.setField(lexeme13, "lexemeText", null);
    lexeme13.setOffset(0);
    lexeme13.setLexemeType(0);
    lexeme13.setBegin(1_757_985);
    Reflector.setField(cell9, "lexeme", lexeme13);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell15 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell15, "next", null);
    Reflector.setField(cell15, "this$0", null);
    Reflector.setField(cell15, "lexeme", null);
    Reflector.setField(cell15, "prev", null);
    Reflector.setField(cell14, "next", cell15);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell14, "this$0", quickSortSet6);
    final Lexeme lexeme14 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme14, "length", -1);
    Reflector.setField(lexeme14, "lexemeText", "foo");
    lexeme14.setOffset(0);
    lexeme14.setLexemeType(0);
    lexeme14.setBegin(1_626_913);
    Reflector.setField(cell14, "lexeme", lexeme14);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell9, "prev", cell14);
    Reflector.setField(quickSortSet, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_626_915);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue001fa05bb7f1b56a9af()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -1_073_741_825);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-454_922);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
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
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -1);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(-192_777);
    Reflector.setField(cell2, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -17);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(-454_922);
    Reflector.setField(cell5, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    Reflector.setField(cell6, "this$0", null);
    Reflector.setField(cell6, "lexeme", null);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "prev", cell6);
    Reflector.setField(cell2, "prev", cell5);
    Reflector.setField(quickSortSet, "tail", cell2);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-454_922);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNotNull(quickSortSet.getHead().getNext());
    Assert.assertNull(quickSortSet.getHead().getNext().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getNext().getLexeme());
    Assert.assertEquals(-1_073_741_825, quickSortSet.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(-454_922, quickSortSet.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(quickSortSet.getHead(), quickSortSet.getHead().getNext().getPrev());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(-1, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(-454_922, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue004f3bd2eca965ebaa9()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 2);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_647_572_489);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
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
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 674_270_602);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(1_647_834_880);
    Reflector.setField(cell2, "lexeme", lexeme4);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    Reflector.setField(cell6, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "next", cell6);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 1);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1_647_572_233);
    Reflector.setField(cell5, "lexeme", lexeme6);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 2);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(1_159_181_218);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell5, "prev", cell7);
    Reflector.setField(cell2, "prev", cell5);
    Reflector.setField(quickSortSet, "tail", cell2);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 2);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_647_572_489);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue10() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell1, "next", cell2);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    Reflector.setField(quickSortSet1, "head", null);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell1, "this$0", quickSortSet1);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "??");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme2);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
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
    Reflector.setField(lexeme6, "length", -17);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(-192_778);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme7);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
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
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", null);
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "?");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell10);
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
    Reflector.setField(quickSortSet4, "tail", cell11);
    Reflector.setField(cell9, "this$0", quickSortSet4);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", -1);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(-454_921);
    Reflector.setField(cell9, "lexeme", lexeme12);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-192_778);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue11() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet1, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -17);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(134_287_094);
    Reflector.setField(cell, "lexeme", lexeme1);
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
    Reflector.setField(cell, "prev", cell3);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell5 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell5, "next", null);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
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
    Reflector.setField(quickSortSet3, "head", cell6);
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(quickSortSet3, "tail", cell7);
    Reflector.setField(cell5, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -1);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(134_549_239);
    Reflector.setField(cell5, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell8, "this$0", quickSortSet4);
    Reflector.setField(cell8, "lexeme", null);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell5, "prev", cell8);
    Reflector.setField(quickSortSet, "tail", cell5);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(134_287_094);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNotNull(quickSortSet.getHead().getNext());
    Assert.assertNull(quickSortSet.getHead().getNext().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getNext().getLexeme());
    Assert.assertEquals(-17, quickSortSet.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(134_287_094, quickSortSet.getHead().getNext().getLexeme().getBegin());
    Assert.assertEquals(quickSortSet.getHead(), quickSortSet.getHead().getNext().getPrev());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(-1, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(134_287_094, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue12() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
    Reflector.setField(cell2, "lexeme", null);
    Reflector.setField(cell2, "prev", null);
    Reflector.setField(quickSortSet1, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -2_147_483_648);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(923_525_119);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell4 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell4, "next", null);
    Reflector.setField(cell4, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
    lexeme2.setOffset(0);
    lexeme2.setLexemeType(0);
    lexeme2.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme2);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell3, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", -367_260_512);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(1_795_940_350);
    Reflector.setField(cell3, "lexeme", lexeme4);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    Reflector.setField(cell7, "lexeme", null);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", -2_147_483_648);
    Reflector.setField(lexeme5, "lexemeText", null);
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(898_359_295);
    Reflector.setField(cell6, "lexeme", lexeme5);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell3, "prev", cell6);
    Reflector.setField(quickSortSet, "tail", cell3);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(923_525_119);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue13() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNull(quickSortSet.getHead().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue14() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-2_147_483_647);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertEquals(0, quickSortSet.size());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputFalse0039ef9119befdb562d()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1_073_741_824);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet1, "head", cell1);
    Reflector.setField(quickSortSet1, "tail", null);
    Reflector.setField(cell, "this$0", quickSortSet1);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(1_647_572_489);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
    final QuickSortSet.Cell cell3 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell3, "next", null);
    Reflector.setField(cell3, "this$0", null);
    final Lexeme lexeme2 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme2, "length", 0);
    Reflector.setField(lexeme2, "lexemeText", "?");
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
    Reflector.setField(lexeme3, "lexemeText", "?");
    lexeme3.setOffset(0);
    lexeme3.setLexemeType(0);
    lexeme3.setBegin(0);
    Reflector.setField(cell4, "lexeme", lexeme3);
    Reflector.setField(cell4, "prev", null);
    Reflector.setField(quickSortSet2, "tail", cell4);
    Reflector.setField(cell2, "this$0", quickSortSet2);
    final Lexeme lexeme4 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme4, "length", 674_270_600);
    Reflector.setField(lexeme4, "lexemeText", "?");
    lexeme4.setOffset(0);
    lexeme4.setLexemeType(0);
    lexeme4.setBegin(1_647_834_880);
    Reflector.setField(cell2, "lexeme", lexeme4);
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
    lexeme5.setBegin(1_647_572_489);
    Reflector.setField(cell5, "lexeme", lexeme5);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell6, "next", null);
    Reflector.setField(cell6, "this$0", null);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1_159_181_218);
    Reflector.setField(cell6, "lexeme", lexeme6);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(cell5, "prev", cell6);
    Reflector.setField(cell2, "prev", cell5);
    Reflector.setField(quickSortSet, "tail", cell2);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_647_572_489);

    // Act and Assert result
    Assert.assertFalse(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue000cc07a7bf1d288787() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNull(quickSortSet.getHead().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero00019ffdf1bf5e79fed() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final QuickSortSet.Cell quickSortSetCell = quickSortSet.new Cell(lexeme);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    final Lexeme lexeme1 = new Lexeme(0, 0, 0, 0);
    final QuickSortSet.Cell o = quickSortSet1.new Cell(lexeme1);

    // Act and Assert result
    Assert.assertEquals(0, quickSortSetCell.compareTo(o));
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final QuickSortSet this$0 = new QuickSortSet();
    Reflector.setField(this$0, "size", 0);
    Reflector.setField(this$0, "head", null);
    Reflector.setField(this$0, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act, creating object to test constructor
    final QuickSortSet.Cell actual = this$0.new Cell(lexeme);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputVoid00017f43bc07c0307dd()
      throws InvocationTargetException {

    // Arrange
    final QuickSortSet this$0 = new QuickSortSet();
    Reflector.setField(this$0, "size", 0);
    Reflector.setField(this$0, "head", null);
    Reflector.setField(this$0, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act, creating object to test constructor
    final QuickSortSet.Cell actual = this$0.new Cell(lexeme);

    // Assert side effects
    Assert.assertNotNull(actual.getLexeme());
    Assert.assertEquals(0, actual.getLexeme().getLength());
    Assert.assertEquals(0, actual.getLexeme().getOffset());
    Assert.assertEquals(0, actual.getLexeme().getLexemeType());
    Assert.assertEquals(0, actual.getLexeme().getBegin());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final QuickSortSet this$0 = new QuickSortSet();
    Reflector.setField(this$0, "size", 0);
    Reflector.setField(this$0, "head", null);
    Reflector.setField(this$0, "tail", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    Reflector.setField(lexeme, "offset", 0);
    Reflector.setField(lexeme, "lexemeType", 0);
    Reflector.setField(lexeme, "begin", 0);

    // Act, creating object to test constructor
    final QuickSortSet.Cell actual = this$0.new Cell(lexeme);

    // Assert side effects
    Assert.assertNotNull(actual.getLexeme());
    Assert.assertEquals(0, actual.getLexeme().getLength());
    Assert.assertEquals(0, actual.getLexeme().getOffset());
    Assert.assertEquals(0, actual.getLexeme().getLexemeType());
    Assert.assertEquals(0, actual.getLexeme().getBegin());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNullNotNullOutputVoid()
      throws NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {

    // Arrange
    final QuickSortSet this$0 = null;
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act, creating object to test constructor
    final Class<?> classUnderTest = Reflector.forName("org.wltea.analyzer.core.QuickSortSet$Cell");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("org.wltea.analyzer.core.QuickSortSet"),
        Reflector.forName("org.wltea.analyzer.core.Lexeme"));
    ctor.setAccessible(true);
    final QuickSortSet.Cell actual = (QuickSortSet.Cell)ctor.newInstance(this$0, lexeme);

    // Assert side effects
    Assert.assertNotNull(actual.getLexeme());
    Assert.assertEquals(0, actual.getLexeme().getLength());
    Assert.assertEquals(0, actual.getLexeme().getOffset());
    Assert.assertEquals(0, actual.getLexeme().getLexemeType());
    Assert.assertEquals(0, actual.getLexeme().getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", -449_669_734);
    Reflector.setField(lexeme1, "lexemeText", null);
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(-4);
    Reflector.setField(cell, "lexeme", lexeme1);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -450_652_774);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-4);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final QuickSortSet actual = new QuickSortSet();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHeadOutputNull() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeOutputNotNull000126870d356750cc7() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final QuickSortSet.Cell quickSortSetCell = quickSortSet.new Cell(lexeme);

    // Act
    final Lexeme actual = quickSortSetCell.getLexeme();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextOutputNull0002a27ece2f497972a() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final QuickSortSet.Cell quickSortSetCell = quickSortSet.new Cell(lexeme);

    // Act and Assert result
    Assert.assertNull(quickSortSetCell.getNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPrevOutputNull00037334a2fcc8427b8() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final QuickSortSet.Cell quickSortSetCell = quickSortSet.new Cell(lexeme);

    // Act and Assert result
    Assert.assertNull(quickSortSetCell.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull00083fb821605519f7d() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addLexemeInputNotNullOutputFalse2() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", -2_147_483_647);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", -64);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(1_626_913);
    Reflector.setField(cell, "lexeme", lexeme6);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
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
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "foo");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme8);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "foo");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme9);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    Reflector.setField(quickSortSet4, "head", null);
    Reflector.setField(quickSortSet4, "tail", null);
    Reflector.setField(cell10, "this$0", quickSortSet4);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "foo");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme11);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(cell10, "prev", cell11);
    Reflector.setField(cell9, "next", cell10);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell12, "next", null);
    Reflector.setField(cell12, "this$0", null);
    Reflector.setField(cell12, "lexeme", null);
    Reflector.setField(cell12, "prev", null);
    Reflector.setField(quickSortSet5, "head", cell12);
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    Reflector.setField(cell13, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", 0);
    Reflector.setField(lexeme12, "lexemeText", null);
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme12);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(quickSortSet5, "tail", cell13);
    Reflector.setField(cell9, "this$0", quickSortSet5);
    final Lexeme lexeme13 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme13, "length", -1);
    Reflector.setField(lexeme13, "lexemeText", null);
    lexeme13.setOffset(0);
    lexeme13.setLexemeType(0);
    lexeme13.setBegin(1_757_985);
    Reflector.setField(cell9, "lexeme", lexeme13);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell15 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell15, "next", null);
    Reflector.setField(cell15, "this$0", null);
    Reflector.setField(cell15, "lexeme", null);
    Reflector.setField(cell15, "prev", null);
    Reflector.setField(cell14, "next", cell15);
    final QuickSortSet quickSortSet6 = new QuickSortSet();
    Reflector.setField(quickSortSet6, "size", 0);
    Reflector.setField(quickSortSet6, "head", null);
    Reflector.setField(quickSortSet6, "tail", null);
    Reflector.setField(cell14, "this$0", quickSortSet6);
    final Lexeme lexeme14 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme14, "length", -1);
    Reflector.setField(lexeme14, "lexemeText", "foo");
    lexeme14.setOffset(0);
    lexeme14.setLexemeType(0);
    lexeme14.setBegin(1_626_915);
    Reflector.setField(cell14, "lexeme", lexeme14);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell9, "prev", cell14);
    Reflector.setField(quickSortSet, "tail", cell9);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_626_915);

    // Act and Assert result
    Assert.assertFalse(quickSortSet.addLexeme(lexeme));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyOutputTrue00009b8275b80a61d50() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertTrue(quickSortSet.isEmpty());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull00045b843f2e4ed23a7() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNull0003f8ffb2146973cda() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekFirstOutputNull00098ab51d339e56545() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekFirstOutputNull00000f706120058cd17() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekFirstOutputNull001134dff40779e1b6e() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekFirstOutputNull5() throws InvocationTargetException {

    // Arrange
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

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekFirstOutputNull001c18a0e846184577b() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
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
    Reflector.setField(cell8, "this$0", null);
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
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull8() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 262_144);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull7() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull002642408583f4b7e1d() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull001b000e688438d7e3b() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 2);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNotNull(quickSortSet.getHead().getNext());
    Assert.assertNull(quickSortSet.getHead().getNext().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getNext().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getNext().getPrev());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNotNull(quickSortSet.getHead().getPrev());
    Assert.assertNull(quickSortSet.getHead().getPrev().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getPrev().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull4() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 5);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    final QuickSortSet quickSortSet1 = new QuickSortSet();
    Reflector.setField(quickSortSet1, "size", 0);
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
    Reflector.setField(quickSortSet1, "head", cell1);
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
    Reflector.setField(quickSortSet1, "tail", cell2);
    Reflector.setField(cell, "this$0", quickSortSet1);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull3() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 5);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());

    // Assert side effects
    Assert.assertNotNull(quickSortSet.getHead());
    Assert.assertNotNull(quickSortSet.getHead().getNext());
    Assert.assertNull(quickSortSet.getHead().getNext().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getNext().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getNext().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getNext().getPrev());
    Assert.assertNotNull(quickSortSet.getHead().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getLexeme().getBegin());
    Assert.assertNotNull(quickSortSet.getHead().getPrev());
    Assert.assertNull(quickSortSet.getHead().getPrev().getNext());
    Assert.assertNotNull(quickSortSet.getHead().getPrev().getLexeme());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getLength());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getOffset());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getLexemeType());
    Assert.assertEquals(0, quickSortSet.getHead().getPrev().getLexeme().getBegin());
    Assert.assertNull(quickSortSet.getHead().getPrev().getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNotNull001a02fad7f37cfff55() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme5);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act
    final Lexeme actual = quickSortSet.pollFirst();

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollFirstOutputNull00021ac2da48ed19418() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollFirst());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNull5() throws InvocationTargetException {

    // Arrange
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

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNull3() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
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
    Reflector.setField(cell8, "this$0", null);
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
    Reflector.setField(quickSortSet, "tail", cell);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNull000a998d97c642fe1f7() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNotNull() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
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
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
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
    Reflector.setField(quickSortSet, "tail", cell);

    // Act
    final Lexeme actual = quickSortSet.peekLast();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekLastOutputNull0012d50a5246dd6e836() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell7, "next", null);
    Reflector.setField(cell7, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme5);
    Reflector.setField(cell7, "prev", null);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell6, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme6);
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme7);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell6, "prev", cell8);
    Reflector.setField(cell, "prev", cell6);
    Reflector.setField(quickSortSet, "tail", cell);

    // Act and Assert result
    Assert.assertNull(quickSortSet.peekLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNotNull002ba42bbf9c4b195b5() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 5);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "foo");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme5);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "foo");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
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
    Reflector.setField(cell7, "prev", cell9);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
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
    Reflector.setField(quickSortSet4, "head", cell10);
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
    Reflector.setField(quickSortSet4, "tail", cell11);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "foo");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell6, "lexeme", lexeme10);
    Reflector.setField(cell6, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell6);

    // Act
    final Lexeme actual = quickSortSet.pollLast();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull7() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 262_144);
    Reflector.setField(quickSortSet, "head", null);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull0004893b05c8f061c66() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull001be5cf02e25580207() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull0014913135b04d3ef04() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull00251e0f71a4bbb25a2() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 5);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell2 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell2, "next", null);
    Reflector.setField(cell2, "this$0", null);
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
    Reflector.setField(cell3, "this$0", null);
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
    final QuickSortSet quickSortSet2 = new QuickSortSet();
    Reflector.setField(quickSortSet2, "size", 0);
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
    Reflector.setField(quickSortSet2, "head", cell4);
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
    Reflector.setField(quickSortSet2, "tail", cell5);
    Reflector.setField(cell, "this$0", quickSortSet2);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell6 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell7 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell8 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell8, "next", null);
    Reflector.setField(cell8, "this$0", null);
    final Lexeme lexeme5 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme5, "length", 0);
    Reflector.setField(lexeme5, "lexemeText", "?");
    lexeme5.setOffset(0);
    lexeme5.setLexemeType(0);
    lexeme5.setBegin(0);
    Reflector.setField(cell8, "lexeme", lexeme5);
    Reflector.setField(cell8, "prev", null);
    Reflector.setField(cell7, "next", cell8);
    final QuickSortSet quickSortSet3 = new QuickSortSet();
    Reflector.setField(quickSortSet3, "size", 0);
    Reflector.setField(quickSortSet3, "head", null);
    Reflector.setField(quickSortSet3, "tail", null);
    Reflector.setField(cell7, "this$0", quickSortSet3);
    final Lexeme lexeme6 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme6, "length", 0);
    Reflector.setField(lexeme6, "lexemeText", "?");
    lexeme6.setOffset(0);
    lexeme6.setLexemeType(0);
    lexeme6.setBegin(0);
    Reflector.setField(cell7, "lexeme", lexeme6);
    final QuickSortSet.Cell cell9 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell9, "next", null);
    Reflector.setField(cell9, "this$0", null);
    final Lexeme lexeme7 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme7, "length", 0);
    Reflector.setField(lexeme7, "lexemeText", "?");
    lexeme7.setOffset(0);
    lexeme7.setLexemeType(0);
    lexeme7.setBegin(0);
    Reflector.setField(cell9, "lexeme", lexeme7);
    Reflector.setField(cell9, "prev", null);
    Reflector.setField(cell7, "prev", cell9);
    Reflector.setField(cell6, "next", cell7);
    final QuickSortSet quickSortSet4 = new QuickSortSet();
    Reflector.setField(quickSortSet4, "size", 0);
    final QuickSortSet.Cell cell10 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell10, "next", null);
    Reflector.setField(cell10, "this$0", null);
    final Lexeme lexeme8 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme8, "length", 0);
    Reflector.setField(lexeme8, "lexemeText", "?");
    lexeme8.setOffset(0);
    lexeme8.setLexemeType(0);
    lexeme8.setBegin(0);
    Reflector.setField(cell10, "lexeme", lexeme8);
    Reflector.setField(cell10, "prev", null);
    Reflector.setField(quickSortSet4, "head", cell10);
    final QuickSortSet.Cell cell11 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell11, "next", null);
    Reflector.setField(cell11, "this$0", null);
    final Lexeme lexeme9 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme9, "length", 0);
    Reflector.setField(lexeme9, "lexemeText", "?");
    lexeme9.setOffset(0);
    lexeme9.setLexemeType(0);
    lexeme9.setBegin(0);
    Reflector.setField(cell11, "lexeme", lexeme9);
    Reflector.setField(cell11, "prev", null);
    Reflector.setField(quickSortSet4, "tail", cell11);
    Reflector.setField(cell6, "this$0", quickSortSet4);
    Reflector.setField(cell6, "lexeme", null);
    final QuickSortSet.Cell cell12 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell13 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell13, "next", null);
    Reflector.setField(cell13, "this$0", null);
    final Lexeme lexeme10 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme10, "length", 0);
    Reflector.setField(lexeme10, "lexemeText", "?");
    lexeme10.setOffset(0);
    lexeme10.setLexemeType(0);
    lexeme10.setBegin(0);
    Reflector.setField(cell13, "lexeme", lexeme10);
    Reflector.setField(cell13, "prev", null);
    Reflector.setField(cell12, "next", cell13);
    final QuickSortSet quickSortSet5 = new QuickSortSet();
    Reflector.setField(quickSortSet5, "size", 0);
    Reflector.setField(quickSortSet5, "head", null);
    Reflector.setField(quickSortSet5, "tail", null);
    Reflector.setField(cell12, "this$0", quickSortSet5);
    final Lexeme lexeme11 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme11, "length", 0);
    Reflector.setField(lexeme11, "lexemeText", "?");
    lexeme11.setOffset(0);
    lexeme11.setLexemeType(0);
    lexeme11.setBegin(0);
    Reflector.setField(cell12, "lexeme", lexeme11);
    final QuickSortSet.Cell cell14 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell14, "next", null);
    Reflector.setField(cell14, "this$0", null);
    final Lexeme lexeme12 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme12, "length", 0);
    Reflector.setField(lexeme12, "lexemeText", "?");
    lexeme12.setOffset(0);
    lexeme12.setLexemeType(0);
    lexeme12.setBegin(0);
    Reflector.setField(cell14, "lexeme", lexeme12);
    Reflector.setField(cell14, "prev", null);
    Reflector.setField(cell12, "prev", cell14);
    Reflector.setField(cell6, "prev", cell12);
    Reflector.setField(quickSortSet, "tail", cell6);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());
  }

  // Test written by Diffblue Cover.
  @Test
  public void pollLastOutputNull6() throws InvocationTargetException {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    Reflector.setField(cell, "lexeme", null);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertNull(quickSortSet.pollLast());

    // Assert side effects
    Assert.assertNull(quickSortSet.getHead());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyOutputFalse000fc8a4578831cfb99() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertFalse(quickSortSet.isEmpty());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyOutputTrue3() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.isEmpty());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyOutputTrue001f0d6aaffafc35144() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertTrue(quickSortSet.isEmpty());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyOutputFalse2() {

    // Arrange
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 1);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);

    // Act and Assert result
    Assert.assertFalse(quickSortSet.isEmpty());
  }
}
