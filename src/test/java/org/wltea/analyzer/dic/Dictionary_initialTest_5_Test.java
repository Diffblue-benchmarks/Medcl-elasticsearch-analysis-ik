package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.dic.Dictionary;

public class Dictionary_initialTest_5_Test {
  @Test
  public void initialTest() throws Exception {
    // Arrange
    Configuration configuration = (Configuration) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    Dictionary.initial(configuration);
    Assert.assertEquals(null, configuration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
