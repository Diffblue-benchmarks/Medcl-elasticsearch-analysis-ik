package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.QuickSortSet;

public class QuickSortSet_isEmptyTest_8_Test {
  @Test
  public void isEmptyTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();

    // Act
    boolean actual = quickSortSet.isEmpty();

    // Assert
    Assert.assertTrue(actual);
    String toStringResult = quickSortSet.toString();
    boolean isEmptyResult = quickSortSet.isEmpty();
    QuickSortSet.Cell head = quickSortSet.getHead();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, quickSortSet.size());
    Assert.assertEquals(null, head);
    Assert.assertTrue(isEmptyResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
