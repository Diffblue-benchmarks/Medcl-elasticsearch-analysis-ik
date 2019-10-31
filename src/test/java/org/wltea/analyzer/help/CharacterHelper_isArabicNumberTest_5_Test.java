package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelper_isArabicNumberTest_5_Test {
  @Test
  public void isArabicNumberTest() throws Exception {
    // Arrange
    char input = 'c';

    // Act
    boolean actual = CharacterHelper.isArabicNumber(input);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
