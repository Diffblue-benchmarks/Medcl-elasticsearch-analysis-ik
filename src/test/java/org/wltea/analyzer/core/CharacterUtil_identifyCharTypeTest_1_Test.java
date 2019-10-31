package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CharacterUtil;

public class CharacterUtil_identifyCharTypeTest_1_Test {
  @Test
  public void identifyCharTypeTest() throws Exception {
    // Arrange
    char input = 'c';

    // Act
    int actual = CharacterUtil.identifyCharType(input);

    // Assert
    Assert.assertEquals(2, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
