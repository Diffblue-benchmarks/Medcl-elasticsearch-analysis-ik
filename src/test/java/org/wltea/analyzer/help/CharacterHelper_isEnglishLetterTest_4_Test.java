package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelper_isEnglishLetterTest_4_Test {
  @Test
  public void isEnglishLetterTest() throws Exception {
    // Arrange
    char input = 'c';

    // Act
    boolean actual = CharacterHelper.isEnglishLetter(input);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
