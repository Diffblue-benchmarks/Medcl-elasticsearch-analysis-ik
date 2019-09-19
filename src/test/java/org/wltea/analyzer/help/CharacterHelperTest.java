package org.wltea.analyzer.help;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.help.CharacterHelper;

public class CharacterHelperTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CharacterHelper actual = new CharacterHelper();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue3() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter('\b'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue6() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter('\r'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue5() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter('\n'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue4() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter('\u00a0'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue2() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter('\t'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue001b8b246a76368eba5() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isSpaceLetter(' '));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputFalse2() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isSpaceLetter('\u0000'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputFalse000fd1b2aec20ad7de5() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isSpaceLetter('$'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputUOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isEnglishLetter('U'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputNotNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isEnglishLetter('<'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputaOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isEnglishLetter('a'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputNotNullOutputFalse2() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isEnglishLetter('}'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInput9OutputTrue() {

    // Act and Assert result
    Assert.assertTrue(CharacterHelper.isArabicNumber('9'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInputNotNullOutputFalse2() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isArabicNumber(')'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInputNotNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(CharacterHelper.isArabicNumber(';'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputaOutputa00135b00e48ef9cafa4() {

    // Act and Assert result
    Assert.assertEquals('a', CharacterHelper.regularize('a'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputQOutputq00285d09a8e27ccd93f() {

    // Act and Assert result
    Assert.assertEquals('q', CharacterHelper.regularize('Q'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull000f02bad3219d6bdbc() {

    // Act and Assert result
    Assert.assertEquals('!', CharacterHelper.regularize('!'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals('\u0000', CharacterHelper.regularize('\u0000'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull3() {

    // Act and Assert result
    Assert.assertEquals(';', CharacterHelper.regularize('\uff1b'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull4() {

    // Act and Assert result
    Assert.assertEquals('\ufc3b', CharacterHelper.regularize('\ufc3b'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull5() {

    // Act and Assert result
    Assert.assertEquals('\uffbb', CharacterHelper.regularize('\uffbb'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull6() {

    // Act and Assert result
    Assert.assertEquals(' ', CharacterHelper.regularize('\u3000'));
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputKOutputk() {

    // Act and Assert result
    Assert.assertEquals('k', CharacterHelper.regularize('K'));
  }
}
