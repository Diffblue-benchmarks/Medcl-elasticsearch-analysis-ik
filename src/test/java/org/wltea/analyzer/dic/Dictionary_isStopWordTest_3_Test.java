package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;
import org.wltea.analyzer.dic.Dictionary;

public class Dictionary_isStopWordTest_3_Test {
//failed_run   @Test
//  public void isStopWordTest() throws Exception {
//    // Arrange
//    Dictionary dictionary = Whitebox.newInstance(Dictionary.class);
//    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
//    int begin = 1;
//    int length = 1;
//
//    // Act
//    boolean actual = dictionary.isStopWord(charArray, begin, length);
//
//    // Assert
//    Assert.assertFalse(actual);
//    Assert.assertEquals(8, charArray.length);
//    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
