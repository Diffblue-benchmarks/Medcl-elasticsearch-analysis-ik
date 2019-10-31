package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.QuickSortSet;

public class QuickSortSet_getHeadTest_2_Test {
  @Test
  public void getHeadTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();

    // Act
    QuickSortSet.Cell actual = quickSortSet.getHead();

    // Assert
    Assert.assertEquals(null, actual);
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
