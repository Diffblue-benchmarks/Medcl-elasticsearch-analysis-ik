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

  @Test
  public void matchNonMatching() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('z');
    dictSegment.fillSegment(new char[]{'a'});
    final char[] charArray = {'a', 'b'};

    // Act
    final Hit actual = dictSegment.match(charArray, 0, 2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isUnmatch());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertEquals(1, actual.getEnd());
  }

  @Test
  public void matchMatching() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('z');
    dictSegment.fillSegment(new char[]{'f', 'o'});
    final char[] charArray = "abcdefoo".toCharArray();

    // Act
    final Hit actual = dictSegment.match(charArray, 5, 2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isMatch());
    Assert.assertEquals(5, actual.getBegin());
    Assert.assertEquals(6, actual.getEnd());
  }

  @Test
  public void matchPrefix() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('z');
    dictSegment.fillSegment(new char[]{'f', 'o', 'o'});
    final char[] charArray = new char[]{'f', 'o'};

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isPrefix());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertEquals(1, actual.getEnd());
  }

  @Test
  public void matchBigDictMatching() {

    // Arrange
    final DictSegment dictSegment = new DictSegment('z');
    dictSegment.fillSegment(new char[]{'b', 'a', 'b'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'c'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'd'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'f'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'g'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'h'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'j'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'k'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'l'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'm'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'n'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'p'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'r'});
    dictSegment.fillSegment(new char[]{'b', 'a', 's'});
    dictSegment.fillSegment(new char[]{'b', 'a', 't'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'v'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'y'});
    dictSegment.fillSegment(new char[]{'b', 'a', 'z'});
    final char[] charArray = "bam".toCharArray();

    // Act
    final Hit actual = dictSegment.match(charArray);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isMatch());
    Assert.assertEquals(0, actual.getBegin());
    Assert.assertEquals(2, actual.getEnd());
  }
}
