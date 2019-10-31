package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;

public class DictSegment_getNodeCharTest_3_Test {
  @Test
  public void getNodeCharTest() throws Exception {
    // Arrange
    Character character = new Character('c');
    DictSegment dictSegment = new DictSegment(character);

    // Act
    Character actual = dictSegment.getNodeChar();

    // Assert
    Assert.assertSame(character, actual);
    Assert.assertEquals(Character.valueOf('c'), actual);
    Character nodeChar = dictSegment.getNodeChar();
    String toStringResult = dictSegment.toString();
    Assert.assertSame(character, nodeChar);
    Assert.assertFalse(dictSegment.hasNextNode());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
