package org.wltea.analyzer.dic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.Dictionary;

public class Dictionary_getSingletonTest_9_Test {
  @Test
  public void getSingletonTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    Dictionary.getSingleton();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
