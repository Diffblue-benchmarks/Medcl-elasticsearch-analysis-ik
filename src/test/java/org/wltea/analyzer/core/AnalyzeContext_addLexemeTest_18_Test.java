package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class AnalyzeContext_addLexemeTest_18_Test {
  @Test
  public void addLexemeTest() throws Exception {
    // Arrange
    AnalyzeContext analyzeContext = new AnalyzeContext(null);
    Lexeme lexeme = new Lexeme(1, 1, 1, 167772161);

    // Act
    analyzeContext.addLexeme(lexeme);

    // Assert
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
    Assert.assertEquals("UNKONW", lexemeTypeString);
    Assert.assertEquals(167772161, lexemeType);
    Assert.assertEquals(2, beginPosition);
    Assert.assertEquals(1, begin);
    Assert.assertEquals("2-3 : null : \tUNKONW", toStringResult);
    Lexeme nextLexeme = analyzeContext.getNextLexeme();
    String toStringResult1 = analyzeContext.toString();
    char[] segmentBuff = analyzeContext.getSegmentBuff();
    int cursor = analyzeContext.getCursor();
    char currentChar = analyzeContext.getCurrentChar();
    QuickSortSet orgLexemes = analyzeContext.getOrgLexemes();
    int currentCharType = analyzeContext.getCurrentCharType();
    int bufferOffset = analyzeContext.getBufferOffset();
    boolean isBufferLockedResult = analyzeContext.isBufferLocked();
    Assert.assertEquals(null, nextLexeme);
    Assert.assertFalse(analyzeContext.isBufferConsumed());
    Assert.assertFalse(isBufferLockedResult);
    Assert.assertEquals(0, bufferOffset);
    Assert.assertEquals(0, currentCharType);
    String toStringResult2 = orgLexemes.toString();
    boolean isEmptyResult = orgLexemes.isEmpty();
    QuickSortSet.Cell head = orgLexemes.getHead();
    Assert.assertEquals('\u0000', currentChar);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, cursor);
    Assert.assertEquals(4096, segmentBuff.length);
    Assert.assertEquals('\u0000', segmentBuff[0]);
    Assert.assertEquals('\u0000', segmentBuff[1]);
    Assert.assertEquals('\u0000', segmentBuff[2]);
    Assert.assertEquals('\u0000', segmentBuff[4093]);
    Assert.assertEquals('\u0000', segmentBuff[4094]);
    Assert.assertEquals('\u0000', segmentBuff[4095]);
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(1, orgLexemes.size());
    Assert.assertFalse(isEmptyResult);
    String toStringResult3 = head.toString();
    QuickSortSet.Cell next = head.getNext();
    QuickSortSet.Cell prev = head.getPrev();
    Assert.assertNotNull(toStringResult3);
    Assert.assertSame(lexeme, head.getLexeme());
    Assert.assertEquals(null, prev);
    Assert.assertEquals(null, next);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
