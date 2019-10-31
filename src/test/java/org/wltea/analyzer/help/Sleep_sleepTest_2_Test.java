package org.wltea.analyzer.help;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.Sleep;

public class Sleep_sleepTest_2_Test {
  @Test
  public void sleepTest() throws Exception {
    // Arrange
    Sleep.Type type = Sleep.Type.MSEC;
    int num = 1;

    // Act
    Sleep.sleep(type, num);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
