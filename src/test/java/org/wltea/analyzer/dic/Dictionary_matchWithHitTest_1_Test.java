package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.dic.Hit;

public class Dictionary_matchWithHitTest_1_Test {
//failed_run   @Test
//  public void matchWithHitTest() throws Exception {
//    // Arrange
//    Dictionary dictionary = Whitebox.newInstance(Dictionary.class);
//    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
//    int currentIndex = 1;
//    Hit hit = new Hit();
//
//    // Act
//    Hit actual = dictionary.matchWithHit(charArray, currentIndex, hit);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//    Assert.assertEquals(8, charArray.length);
//    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
//    String toStringResult = hit.toString();
//    boolean isUnmatchResult = hit.isUnmatch();
//    int begin = hit.getBegin();
//    boolean isMatchResult = hit.isMatch();
//    DictSegment matchedDictSegment = hit.getMatchedDictSegment();
//    int end = hit.getEnd();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(hit.isPrefix());
//    Assert.assertEquals(0, end);
//    Assert.assertEquals(null, matchedDictSegment);
//    Assert.assertFalse(isMatchResult);
//    Assert.assertEquals(0, begin);
//    Assert.assertTrue(isUnmatchResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
