package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;

public class DictSegment_compareToTest_7_Test {
  @Test
  public void compareToTest() throws Exception {
    // Arrange
    Character character = new Character('c');
    DictSegment dictSegment = new DictSegment(character);
    DictSegment dictSegment1 = new DictSegment(new Character('c'));

    // Act
    int actual = dictSegment.compareTo(dictSegment1);

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = dictSegment1.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(dictSegment1.hasNextNode());
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
