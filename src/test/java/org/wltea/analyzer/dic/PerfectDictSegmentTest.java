package org.wltea.analyzer.dic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PerfectDictSegmentTest {

  @PrepareForTest({DictSegment.class})
  @Test
  public void fillSegment() throws Exception {
    // Arrange
    final DictSegment dictSegment = new DictSegment('x');

    // Act
    dictSegment.fillSegment(new char[]{'f', 'o', 'o'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'r'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'z'});

    // Assert
    Assert.assertTrue(dictSegment.match(new char[]{'f', 'o', 'o'}).isMatch());
    Assert.assertFalse(dictSegment.match(new char[]{'f', 'a', 'z'}).isMatch());
    Assert.assertTrue(dictSegment.match(new char[]{'b', 'a', 'r'}).isMatch());
    Assert.assertTrue(dictSegment.match(new char[]{'b', 'a', 'z'}).isMatch());
    Assert.assertFalse(dictSegment.match(new char[]{'b', 'a', 'c'}).isMatch());
  }
}
