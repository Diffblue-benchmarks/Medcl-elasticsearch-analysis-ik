package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class Hit_setMatchTest_10_Test {
  @Test
  public void setMatchTest() throws Exception {
    // Arrange
    Hit hit = new Hit();

    // Act
    hit.setMatch();

    // Assert
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
    Assert.assertTrue(isMatchResult);
    Assert.assertEquals(0, begin);
    Assert.assertFalse(isUnmatchResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
