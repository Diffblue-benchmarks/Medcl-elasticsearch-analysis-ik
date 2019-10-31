package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class Hit_setMatchedDictSegmentTest_1_Test {
  @Test
  public void setMatchedDictSegmentTest() throws Exception {
    // Arrange
    Hit hit = new Hit();
    Character character = new Character('c');
    DictSegment dictSegment = new DictSegment(character);

    // Act
    hit.setMatchedDictSegment(dictSegment);

    // Assert
    Character nodeChar = dictSegment.getNodeChar();
    String toStringResult = dictSegment.toString();
    Assert.assertSame(character, nodeChar);
    Assert.assertEquals(Character.valueOf('c'), nodeChar);
    Assert.assertFalse(dictSegment.hasNextNode());
    Assert.assertNotNull(toStringResult);
    String toStringResult1 = hit.toString();
    boolean isUnmatchResult = hit.isUnmatch();
    int begin = hit.getBegin();
    boolean isMatchResult = hit.isMatch();
    DictSegment matchedDictSegment = hit.getMatchedDictSegment();
    int end = hit.getEnd();
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hit.isPrefix());
    Assert.assertEquals(0, end);
    Assert.assertSame(dictSegment, matchedDictSegment);
    Assert.assertFalse(isMatchResult);
    Assert.assertEquals(0, begin);
    Assert.assertTrue(isUnmatchResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
