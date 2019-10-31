package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelper_regularizeTest_3_Test {
  @Test
  public void regularizeTest() throws Exception {
    // Arrange
    char input = 'c';

    // Act
    char actual = CharacterHelper.regularize(input);

    // Assert
    Assert.assertEquals('c', actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
