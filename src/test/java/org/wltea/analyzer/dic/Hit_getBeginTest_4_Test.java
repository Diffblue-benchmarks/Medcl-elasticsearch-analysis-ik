package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class Hit_getBeginTest_4_Test {
  @Test
  public void getBeginTest() throws Exception {
    // Arrange
    Hit hit = new Hit();

    // Act
    int actual = hit.getBegin();

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = hit.toString();
    boolean isUnmatchResult = hit.isUnmatch();
    int begin = hit.getBegin();
    boolean isMatchResult = hit.isMatch();
    DictSegment matchedDictSegment = hit.getMatchedDictSegment();
    int end = hit.getEnd();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hit.isPrefix());
    Assert.assertEquals(0, end);
    Assert.assertEquals(null, matchedDictSegment);
    Assert.assertFalse(isMatchResult);
    Assert.assertEquals(0, begin);
    Assert.assertTrue(isUnmatchResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
