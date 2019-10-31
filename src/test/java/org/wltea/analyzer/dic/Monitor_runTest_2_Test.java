package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.Monitor;

public class Monitor_runTest_2_Test {
  @Test
  public void runTest() throws Exception {
    // Arrange
    Monitor monitor = new Monitor("aaaaa");

    // Act
    monitor.run();

    // Assert
    Assert.assertNotNull(monitor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
