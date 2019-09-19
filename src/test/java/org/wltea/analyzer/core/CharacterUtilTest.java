package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.CharacterUtil;

public class CharacterUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CharacterUtil actual = new CharacterUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInput1OutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1, CharacterUtil.identifyCharType('1'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInput4OutputPositive0003c397e64c0f82bcb() {

    // Act and Assert result
    Assert.assertEquals(1, CharacterUtil.identifyCharType('4'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputaOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('a'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputAOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('A'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputAOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('A'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputcOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('c'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputtOutputPositive002432a578abdb79157() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('t'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInputTOutputPositive001b0dffd5b3a2a9042() {

    // Act and Assert result
    Assert.assertEquals(2, CharacterUtil.identifyCharType('T'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void identifyCharTypeInput0OutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1, CharacterUtil.identifyCharType('0'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputaFalseOutputa() {

    // Act and Assert result
    Assert.assertEquals('a', CharacterUtil.regularize('a', false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputbFalseOutputb() {

    // Act and Assert result
    Assert.assertEquals('b', CharacterUtil.regularize('b', false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputQTrueOutputq() {

    // Act and Assert result
    Assert.assertEquals('q', CharacterUtil.regularize('Q', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputBTrueOutputb() {

    // Act and Assert result
    Assert.assertEquals('b', CharacterUtil.regularize('B', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullFalseOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals('\u0000', CharacterUtil.regularize('\u0000', false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutput0() {

    // Act and Assert result
    Assert.assertEquals('0', CharacterUtil.regularize('\uff10', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals('\"', CharacterUtil.regularize('\"', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals('!', CharacterUtil.regularize('!', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutputNotNull3() {

    // Act and Assert result
    Assert.assertEquals(' ', CharacterUtil.regularize('\u3000', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutputNotNull4() {

    // Act and Assert result
    Assert.assertEquals('\u3010', CharacterUtil.regularize('\u3010', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullTrueOutputNotNull5() {

    // Act and Assert result
    Assert.assertEquals('\uff90', CharacterUtil.regularize('\uff90', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputPFalseOutputP() {

    // Act and Assert result
    Assert.assertEquals('P', CharacterUtil.regularize('P', false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputPTrueOutputp() {

    // Act and Assert result
    Assert.assertEquals('p', CharacterUtil.regularize('P', true));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputQFalseOutputQ() {

    // Act and Assert result
    Assert.assertEquals('Q', CharacterUtil.regularize('Q', false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputBFalseOutputB() {

    // Act and Assert result
    Assert.assertEquals('B', CharacterUtil.regularize('B', false));
  }
}
