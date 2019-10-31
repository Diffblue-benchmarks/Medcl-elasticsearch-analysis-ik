package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class Cell_getLexemeTest_3_Test {
  @Test
  public void getLexemeTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);
    QuickSortSet.Cell cell = quickSortSet.new Cell(lexeme);

    // Act
    Lexeme actual = cell.getLexeme();

    // Assert
    Assert.assertSame(lexeme, actual);
    int offset = actual.getOffset();
    String toStringResult = actual.toString();
    int begin = actual.getBegin();
    int beginPosition = actual.getBeginPosition();
    int lexemeType = actual.getLexemeType();
    String lexemeTypeString = actual.getLexemeTypeString();
    int endPosition = actual.getEndPosition();
    int length = actual.getLength();
    Assert.assertEquals(1, offset);
    Assert.assertEquals("", actual.getLexemeText());
    Assert.assertEquals(1, length);
    Assert.assertEquals(3, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult);
    String toStringResult1 = cell.toString();
    QuickSortSet.Cell next = cell.getNext();
    QuickSortSet.Cell prev = cell.getPrev();
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(actual, cell.getLexeme());
    Assert.assertEquals(null, prev);
    Assert.assertEquals(null, next);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
