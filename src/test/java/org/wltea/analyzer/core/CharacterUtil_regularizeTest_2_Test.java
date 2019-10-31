package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CharacterUtil;

public class CharacterUtil_regularizeTest_2_Test {
  @Test
  public void regularizeTest() throws Exception {
    // Arrange
    char input = 'c';
    boolean lowercase = true;

    // Act
    char actual = CharacterUtil.regularize(input, lowercase);

    // Assert
    Assert.assertEquals('c', actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
