package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.QuickSortSet;

public class QuickSortSet_peekLastTest_1_Test {
  @Test
  public void peekLastTest() throws Exception {
    // Arrange
    QuickSortSet quickSortSet = new QuickSortSet();

    // Act
    Lexeme actual = quickSortSet.peekLast();

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
