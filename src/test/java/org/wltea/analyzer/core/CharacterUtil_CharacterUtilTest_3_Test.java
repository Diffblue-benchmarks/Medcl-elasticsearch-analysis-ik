package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CharacterUtil;

public class CharacterUtil_CharacterUtilTest_3_Test {
  @Test
  public void CharacterUtilTest() throws Exception {
    // Arrange and Act
    CharacterUtil characterUtil = new CharacterUtil();

    // Assert
    Assert.assertNotNull(characterUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
