package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;

public class DictSegment_disableSegmentTest_4_Test {
  @Test
  public void disableSegmentTest() throws Exception {
    // Arrange
    Character character = new Character('c');
    DictSegment dictSegment = new DictSegment(character);
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};

    // Act
    dictSegment.disableSegment(charArray);

    // Assert
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
    Character nodeChar = dictSegment.getNodeChar();
    String toStringResult = dictSegment.toString();
    Assert.assertSame(character, nodeChar);
    Assert.assertEquals(Character.valueOf('c'), nodeChar);
    Assert.assertFalse(dictSegment.hasNextNode());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
