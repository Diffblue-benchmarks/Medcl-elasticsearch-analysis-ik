package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelper_isSpaceLetterTest_2_Test {
  @Test
  public void isSpaceLetterTest() throws Exception {
    // Arrange
    char input = 'c';

    // Act
    boolean actual = CharacterHelper.isSpaceLetter(input);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
