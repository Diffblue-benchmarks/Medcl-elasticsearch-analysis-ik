package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.Sleep;

public class Sleep_SleepTest_1_Test {
  @Test
  public void SleepTest() throws Exception {
    // Arrange and Act
    Sleep sleep = new Sleep();

    // Assert
    Assert.assertNotNull(sleep.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
