package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class Hit_setBeginTest_11_Test {
  @Test
  public void setBeginTest() throws Exception {
    // Arrange
    Hit hit = new Hit();
    int begin = 1;

    // Act
    hit.setBegin(begin);

    // Assert
    String toStringResult = hit.toString();
    boolean isUnmatchResult = hit.isUnmatch();
    int begin1 = hit.getBegin();
    boolean isMatchResult = hit.isMatch();
    DictSegment matchedDictSegment = hit.getMatchedDictSegment();
    int end = hit.getEnd();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hit.isPrefix());
    Assert.assertEquals(0, end);
    Assert.assertEquals(null, matchedDictSegment);
    Assert.assertFalse(isMatchResult);
    Assert.assertEquals(1, begin1);
    Assert.assertTrue(isUnmatchResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
