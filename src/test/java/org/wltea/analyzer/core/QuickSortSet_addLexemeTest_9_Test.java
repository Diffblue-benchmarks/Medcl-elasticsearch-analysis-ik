package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class QuickSortSet_addLexemeTest_9_Test {
  @Test
  public void addLexemeTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();
    Lexeme lexeme = new Lexeme(1, 1, 1, 1);

    // Act
    boolean actual = quickSortSet.addLexeme(lexeme);

    // Assert
    Assert.assertTrue(actual);
    int offset = lexeme.getOffset();
    String toStringResult = lexeme.toString();
    int begin = lexeme.getBegin();
    int beginPosition = lexeme.getBeginPosition();
    int lexemeType = lexeme.getLexemeType();
    String lexemeTypeString = lexeme.getLexemeTypeString();
    int endPosition = lexeme.getEndPosition();
    int length = lexeme.getLength();
    Assert.assertEquals(1, offset);
    Assert.assertEquals("", lexeme.getLexemeText());
    Assert.assertEquals(1, length);
    Assert.assertEquals(3, endPosition);
    Assert.assertEquals("ENGLISH", lexemeTypeString);
    Assert.assertEquals(1, lexemeType);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-3 : null : \tENGLISH", toStringResult);
    String toStringResult1 = quickSortSet.toString();
    boolean isEmptyResult = quickSortSet.isEmpty();
    QuickSortSet.Cell head = quickSortSet.getHead();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(1, quickSortSet.size());
    String toStringResult2 = head.toString();
    QuickSortSet.Cell next = head.getNext();
    QuickSortSet.Cell prev = head.getPrev();
    Assert.assertFalse(isEmptyResult);
    Assert.assertSame(lexeme, head.getLexeme());
    Assert.assertEquals(null, prev);
    Assert.assertEquals(null, next);
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
