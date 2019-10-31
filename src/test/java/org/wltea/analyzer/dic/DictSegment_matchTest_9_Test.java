package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class DictSegment_matchTest_9_Test {
  @Test
  public void matchTest() throws Exception {
    // Arrange
    Character character = new Character('c');
    DictSegment dictSegment = new DictSegment(character);
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
    int begin = 1;
    int length = 1;
    Hit hit = new Hit();

    // Act
    Hit actual = dictSegment.match(charArray, begin, length, hit);

    // Assert
    Assert.assertSame(hit, actual);
    String toStringResult = actual.toString();
    boolean isUnmatchResult = actual.isUnmatch();
    int begin1 = actual.getBegin();
    boolean isMatchResult = actual.isMatch();
    DictSegment matchedDictSegment = actual.getMatchedDictSegment();
    int end = actual.getEnd();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(actual.isPrefix());
    Assert.assertEquals(1, end);
    Assert.assertEquals(null, matchedDictSegment);
    Assert.assertFalse(isMatchResult);
    Assert.assertEquals(0, begin1);
    Assert.assertTrue(isUnmatchResult);
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
    Assert.assertSame(actual, hit);
    Character nodeChar = dictSegment.getNodeChar();
    String toStringResult1 = dictSegment.toString();
    Assert.assertSame(character, nodeChar);
    Assert.assertEquals(Character.valueOf('c'), nodeChar);
    Assert.assertFalse(dictSegment.hasNextNode());
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
