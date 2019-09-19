package org.wltea.analyzer.dic;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.dic.DictSegment;
import org.wltea.analyzer.dic.Hit;

public class HitTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Hit actual = new Hit();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setUnmatchOutputVoid() {

    // Arrange
    final Hit hit = new Hit();

    // Act
    hit.setUnmatch();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getEndOutputZero() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertEquals(0, hit.getEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMatchedDictSegmentOutputNull() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertNull(hit.getMatchedDictSegment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isMatchOutputFalse0004bdda5af061b8a75() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertFalse(hit.isMatch());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPrefixOutputVoid() {

    // Arrange
    final Hit hit = new Hit();

    // Act
    hit.setPrefix();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMatchOutputVoid() {

    // Arrange
    final Hit hit = new Hit();

    // Act
    hit.setMatch();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPrefixOutputFalse000f82ec21a67e9a65c() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertFalse(hit.isPrefix());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMatchedDictSegmentInputNotNullOutputVoid() {

    // Arrange
    final Hit hit = new Hit();
    final DictSegment matchedDictSegment = new DictSegment('!');

    // Act
    hit.setMatchedDictSegment(matchedDictSegment);

    // Assert side effects
    Assert.assertNotNull(hit.getMatchedDictSegment());
    Assert.assertEquals(new Character('!'), hit.getMatchedDictSegment().getNodeChar());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBeginOutputZero() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertEquals(0, hit.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setEndInputZeroOutputVoid() {

    // Arrange
    final Hit hit = new Hit();

    // Act
    hit.setEnd(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnmatchOutputTrue0000f9cb7aea83f7e8a() {

    // Arrange
    final Hit hit = new Hit();

    // Act and Assert result
    Assert.assertTrue(hit.isUnmatch());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setBeginInputZeroOutputVoid() {

    // Arrange
    final Hit hit = new Hit();

    // Act
    hit.setBegin(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isMatchOutputTrue() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 1);

    // Act and Assert result
    Assert.assertTrue(hit.isMatch());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isMatchOutputFalse2() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);

    // Act and Assert result
    Assert.assertFalse(hit.isMatch());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPrefixOutputFalse2() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);

    // Act and Assert result
    Assert.assertFalse(hit.isPrefix());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPrefixOutputTrue() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 16);

    // Act and Assert result
    Assert.assertTrue(hit.isPrefix());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnmatchOutputTrue2() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 0);

    // Act and Assert result
    Assert.assertTrue(hit.isUnmatch());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnmatchOutputFalse() {

    // Arrange
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    hit.setMatchedDictSegment(null);
    Reflector.setField(hit, "hitState", 1);

    // Act and Assert result
    Assert.assertFalse(hit.isUnmatch());
  }
}
