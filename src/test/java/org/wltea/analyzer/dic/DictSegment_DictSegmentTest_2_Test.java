package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;

public class DictSegment_DictSegmentTest_2_Test {
  @Test
  public void DictSegmentTest() throws Exception {
    // Arrange
    Character nodeChar = new Character('c');

    // Act
    DictSegment dictSegment = new DictSegment(nodeChar);

    // Assert
    String toStringResult = dictSegment.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(dictSegment.hasNextNode());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
