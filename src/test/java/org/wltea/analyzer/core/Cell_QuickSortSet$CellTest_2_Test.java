package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class Cell_QuickSortSet$CellTest_2_Test {
  @Test
  public void QuickSortSet$CellTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);

    // Act
    QuickSortSet.Cell cell = quickSortSet.new Cell(lexeme);

    // Assert
    String toStringResult = cell.toString();
    QuickSortSet.Cell next = cell.getNext();
    QuickSortSet.Cell prev = cell.getPrev();
    Lexeme lexeme1 = cell.getLexeme();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(lexeme, lexeme1);
    int offset = lexeme1.getOffset();
    String toStringResult1 = lexeme1.toString();
    int begin = lexeme1.getBegin();
    int beginPosition = lexeme1.getBeginPosition();
    int lexemeType = lexeme1.getLexemeType();
    String lexemeTypeString = lexeme1.getLexemeTypeString();
    int endPosition = lexeme1.getEndPosition();
    int length = lexeme1.getLength();
    Assert.assertEquals(null, prev);
    Assert.assertEquals(null, next);
    Assert.assertEquals(1, length);
    Assert.assertEquals(3, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult1);
    Assert.assertEquals(1, offset);
    Assert.assertEquals("", lexeme1.getLexemeText());
    String toStringResult2 = quickSortSet.toString();
    boolean isEmptyResult = quickSortSet.isEmpty();
    QuickSortSet.Cell head = quickSortSet.getHead();
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(0, quickSortSet.size());
    Assert.assertEquals(null, head);
    Assert.assertTrue(isEmptyResult);
    Assert.assertSame(lexeme1, lexeme);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
