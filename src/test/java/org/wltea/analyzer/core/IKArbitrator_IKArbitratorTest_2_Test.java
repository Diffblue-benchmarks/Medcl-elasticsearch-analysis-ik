package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.IKArbitrator;

public class IKArbitrator_IKArbitratorTest_2_Test {
  @Test
  public void IKArbitratorTest() throws Exception {
    // Arrange and Act
    IKArbitrator iKArbitrator = new IKArbitrator();

    // Assert
    Assert.assertNotNull(iKArbitrator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
