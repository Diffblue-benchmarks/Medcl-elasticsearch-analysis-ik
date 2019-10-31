package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelper_CharacterHelperTest_1_Test {
  @Test
  public void CharacterHelperTest() throws Exception {
    // Arrange and Act
    CharacterHelper characterHelper = new CharacterHelper();

    // Assert
    Assert.assertNotNull(characterHelper.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
