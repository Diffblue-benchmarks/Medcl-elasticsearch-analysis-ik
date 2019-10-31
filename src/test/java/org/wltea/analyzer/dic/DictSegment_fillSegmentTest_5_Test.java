package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;

public class DictSegment_fillSegmentTest_5_Test {
  @Test
  public void fillSegmentTest() throws Exception {
    // Arrange
    DictSegment dictSegment = new DictSegment(new Character('c'));
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};

    // Act
    dictSegment.fillSegment(charArray);

    // Assert
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
    String toStringResult = dictSegment.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(dictSegment.hasNextNode());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
