package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.Monitor;

public class Monitor_runUnprivilegedTest_1_Test {
  @Test
  public void runUnprivilegedTest() throws Exception {
    // Arrange
    Monitor monitor = new Monitor("aaaaa");

    // Act
    monitor.runUnprivileged();

    // Assert
    Assert.assertNotNull(monitor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
