package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.Lexeme;

import java.lang.reflect.InvocationTargetException;

public class LexemeTest {

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputIllegalArgumentException3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexeme.setLength(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputIllegalArgumentException001d5e1e0192df66255()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexeme.setLength(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputIllegalArgumentException() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    lexeme.setLength(-2_147_483_648);

    // Act
    thrown.expect(IllegalArgumentException.class);
    lexeme.setLength(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  constructorInputZeroZeroNegativeZeroOutputIllegalArgumentException001e1068f0997550a7a() {

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new Lexeme(0, 0, -2_147_483_648, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroNegativeZeroOutputIllegalArgumentException2() {

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new Lexeme(0, 0, -2_147_483_648, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull18() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid0001539ca8d03493055() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setLexemeText("foo");

    // Assert side effects
    Assert.assertEquals(3, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -2, 0, 0);
    final Lexeme other = new Lexeme(0, -1, 0, 0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative2() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -2_145_894_400, 1024, 0);
    final Lexeme other = new Lexeme(0, -2_145_894_400, 0, 0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative0027cdc170c9176b82f() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -1_337_789_873, 2_147_483_647, 0);
    final Lexeme other = new Lexeme(0, -1_337_789_745, 2_147_483_647, 0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative004eee6a851981d7b6d() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -1_337_789_873, 3, 0);
    final Lexeme other = new Lexeme(0, -1_337_789_873, 1, 0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputVoid0007ecadc78e9671edb() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setLength(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputFalse0003f51c4b715083e32() {

    // Arrange
    final Lexeme lexeme = new Lexeme(1, 0, 0, 0);
    final Lexeme l = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setOffsetInputZeroOutputVoid000b3075e5182f35bce() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setOffset(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputTrue0014fe1ce55a769c603() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final Lexeme l = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setBeginInputZeroOutputVoid0008e3e6e9d1e1190cd() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setBegin(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() {

    // Arrange
    final Lexeme lexeme = new Lexeme(367_019_413, -1_376_364_563, 1_077_604_491, 0);

    // Act and Assert result
    Assert.assertEquals(1_367_331_074, lexeme.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -2_147_483_646, 0, 0);
    final Lexeme other = new Lexeme(0, -2_147_483_647, 0, 0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive2() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -2_145_894_400, 0, 0);
    final Lexeme other = new Lexeme(0, -2_145_894_400, 1024, 0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive001c16c5d7e5eb4f3f4() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final Lexeme other = new Lexeme(0, -2_147_483_648, 0, 0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive003ded49fb92ac136b7() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, -1_337_789_873, 1, 0);
    final Lexeme other = new Lexeme(0, -1_337_789_873, 3, 0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive0008b5b0a358d569668() {

    // Arrange
    final Lexeme lexeme = new Lexeme(-999_467_694, -326_128_398, 691_729_812, 0);

    // Act and Assert result
    Assert.assertEquals(1_096_094_236, lexeme.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOffsetOutputZero00009c7000612438cc4() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getOffset());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull25() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 3);

    // Act and Assert result
    Assert.assertEquals("LETTER", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull24() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 2);

    // Act and Assert result
    Assert.assertEquals("ARABIC", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero000825b5b32e392694c() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final Lexeme other = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull23() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 4);

    // Act and Assert result
    Assert.assertEquals("CN_WORD", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull22() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 8);

    // Act and Assert result
    Assert.assertEquals("OTHER_CJK", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTypeInputZeroOutputVoid000f58a178fd009eb9c() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setLexemeType(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid2() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act
    lexeme.setLexemeText("?");

    // Assert side effects
    Assert.assertEquals(1, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroZeroZeroOutputNotNull() {

    // Act, creating object to test constructor
    final Lexeme actual = new Lexeme(0, 0, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroZeroZeroOutputNotNull000e049b5a9686cad63() {

    // Act, creating object to test constructor
    final Lexeme actual = new Lexeme(0, 0, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroZeroZeroOutputNotNull3() {

    // Act, creating object to test constructor
    final Lexeme actual = new Lexeme(0, 0, 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getLength());
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertEquals(0, actual.getLexemeType());
    Assert.assertEquals(0, actual.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0005464bef77303afc6() {

    // Arrange
    final Lexeme lexeme = new Lexeme(1, 0, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse001f53cb6c652b67fd3() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 1_073_741_824, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 134_217_728, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse002f4ed729d7e0c0a44() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 1, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull21() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 64);

    // Act and Assert result
    Assert.assertEquals("CN_CHAR", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull20() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 32);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull19() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 48);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull17() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 1);

    // Act and Assert result
    Assert.assertEquals("ENGLISH", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull009491baa8ff1474aea() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 262_208);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull0071eb03e6d5176bef5() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 48);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull006c505d9c3baaff4c1() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 32);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull005e9bf302ae2b494a5() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 16);

    // Act and Assert result
    Assert.assertEquals("TYPE_CNUM", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue00391d0f90b6f8e6952() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);
    final Lexeme o = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull00332d92738f6de030c() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 4);

    // Act and Assert result
    Assert.assertEquals("CN_WORD", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull00287bb3c30dfd38049() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 1);

    // Act and Assert result
    Assert.assertEquals("ENGLISH", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull10() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 16_777_280);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull00827817a040ccb89c3() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 64);

    // Act and Assert result
    Assert.assertEquals("CN_CHAR", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull8() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 32);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBeginOutputZero0004632c807d14674aa() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getBegin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBeginPositionOutputZero00084fce961e7547849() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getBeginPosition());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getEndPositionOutputZero000b4e3aaee42e017f9() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getEndPosition());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLengthOutputZero000b4fa364a3e8f7524() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull0009baedda7054f6c05() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals("", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull7() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 48);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull6() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 1);

    // Act and Assert result
    Assert.assertEquals("ENGLISH", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull00441cb81fc5d800687() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 8);

    // Act and Assert result
    Assert.assertEquals("OTHER_CJK", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull4() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 16);

    // Act and Assert result
    Assert.assertEquals("TYPE_CNUM", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull3() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 4);

    // Act and Assert result
    Assert.assertEquals("CN_WORD", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeOutputZero000d44b38976860dce5() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.getLexemeType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull000ef5b0fdba2d958d4() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 2);

    // Act and Assert result
    Assert.assertEquals("ARABIC", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull001e0a3c22d09a3827b() {

    // Arrange
    final Lexeme lexeme = new Lexeme(0, 0, 0, 3);

    // Act and Assert result
    Assert.assertEquals("LETTER", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse003cf95de07688f7418() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1_073_741_824);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue001bbd2827576c0eaa9() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue004bbd2827576c0eaa9() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0045017c3489114c933() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse000aefe73e4407ae2e9() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0028ffe1bb95a6a6847() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse002d7db39c176e9270a() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0011bd8c82195ca60bb() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0038ffe1bb95a6a6847() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse2() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme o = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(o, "length", 0);
    Reflector.setField(o, "lexemeText", null);
    o.setOffset(0);
    o.setLexemeType(0);
    o.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive001667c585faef8c292()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero00028b33e23d0820fc9()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(0, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive8() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive7() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(1);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive0039932dc3db2f3b02e()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(10);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(3);

    // Act and Assert result
    Assert.assertEquals(1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative10() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative9() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2_147_483_647);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative0040d14333005b2a30a()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(516);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(516);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative7() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_073_741_824);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(9);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(9);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative6() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1_073_741_824);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(9);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 536_870_912);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(9);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative00253b1770caa7f73ef()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -2_147_483_648);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(-2);
    final Lexeme other = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(other, "length", 0);
    Reflector.setField(other, "lexemeText", null);
    other.setOffset(0);
    other.setLexemeType(0);
    other.setBegin(-1);

    // Act and Assert result
    Assert.assertEquals(-1, lexeme.compareTo(other));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull23() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 40);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(3);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("3-43 : ?? : \tLETTER", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull22() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 40);
    Reflector.setField(lexeme, "lexemeText", "??");
    lexeme.setOffset(3);
    lexeme.setLexemeType(2);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("3-43 : ?? : \tARABIC", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull21() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -524_373);
    Reflector.setField(lexeme, "lexemeText", "?????????????????????????????????????????????????");
    lexeme.setOffset(-2_146_435_072);
    lexeme.setLexemeType(1);
    lexeme.setBegin(2_146_959_360);

    // Act and Assert result
    Assert.assertEquals(
        "524288--85 : ????????????????????????????????????????????????? : \tENGLISH",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0094deff015c55f3158() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(48);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tTYPE_CQUAN",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0081547999856421453() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(64);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tCN_CHAR",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0073df560a470421a95() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(40);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("-1000--5 : ??????????????????????????????????????????????????? : \tUNKONW",
                        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull006d3200943d9d35c89() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(32);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("-1000--5 : ??????????????????????????????????????????????????? : \tCOUNT",
                        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull00590bceb40b289e88e() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(16);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tTYPE_CNUM",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull004cc6da34913e346b3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(8);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tOTHER_CJK",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull003ff89dba1d3f9e2e9() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(4);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tCN_WORD",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull002e46c289de9feb0f7() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("-1000--5 : ??????????????????????????????????????????????????? : \tLETTER",
                        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0010bdccd9e8036be7e() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(2);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("-1000--5 : ??????????????????????????????????????????????????? : \tARABIC",
                        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0002bf2c90b0e41ae29() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 995);
    Reflector.setField(lexeme, "lexemeText", "???????????????????????????????????????????????????");
    lexeme.setOffset(-1000);
    lexeme.setLexemeType(1);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals(
        "-1000--5 : ??????????????????????????????????????????????????? : \tENGLISH",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull009eea7c53737fde6a0() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(64);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tCN_CHAR", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0081cdd4d9c00b5d1bb() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(32);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tCOUNT", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0072a2f66d00cb23a9a() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(48);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tTYPE_CQUAN", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0067641c1fcb35d8ad5() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(-2_147_483_584);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tUNKONW", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0054c9fb173ce87dd8f() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(16);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tTYPE_CNUM", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull004a2bc177ecda63bc7() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(8);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tOTHER_CJK", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0033774500b0bd98ec6() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(2);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tARABIC", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull0028be7603684628118() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(3);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tLETTER", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull001117d02ff4645e9d7() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(4);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tCN_WORD", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull30() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -524_373);
    Reflector.setField(lexeme, "lexemeText", "?????????????????????????????????????????????????");
    lexeme.setOffset(-2_146_435_072);
    lexeme.setLexemeType(64);
    lexeme.setBegin(2_146_959_360);

    // Act and Assert result
    Assert.assertEquals(
        "524288--85 : ????????????????????????????????????????????????? : \tCN_CHAR",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull000b231ed2654c46f42() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -6);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(-2_147_483_645);
    lexeme.setLexemeType(1);
    lexeme.setBegin(2_147_483_646);

    // Act and Assert result
    Assert.assertEquals("1--5 : foo : \tENGLISH", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull29() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 40);
    Reflector.setField(lexeme, "lexemeText", "???????");
    lexeme.setOffset(3);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("3-43 : ??????? : \tUNKONW", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull26() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 1000);
    Reflector.setField(lexeme, "lexemeText", "???????");
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("0-1000 : ??????? : \tTYPE_CNUM", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull28() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 42);
    Reflector.setField(lexeme, "lexemeText", "????");
    lexeme.setOffset(1);
    lexeme.setLexemeType(48);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("1-43 : ???? : \tTYPE_CQUAN", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull27() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 40);
    Reflector.setField(lexeme, "lexemeText", "???");
    lexeme.setOffset(3);
    lexeme.setLexemeType(32);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("3-43 : ??? : \tCOUNT", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull25() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 6);
    Reflector.setField(lexeme, "lexemeText", "??????");
    lexeme.setOffset(1);
    lexeme.setLexemeType(8);
    lexeme.setBegin(-6);

    // Act and Assert result
    Assert.assertEquals("-5-1 : ?????? : \tOTHER_CJK", lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull24() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -524_373);
    Reflector.setField(lexeme, "lexemeText", "?????????????????????????????????????????????????");
    lexeme.setOffset(-2_146_435_072);
    lexeme.setLexemeType(4);
    lexeme.setBegin(2_146_959_360);

    // Act and Assert result
    Assert.assertEquals(
        "524288--85 : ????????????????????????????????????????????????? : \tCN_WORD",
        lexeme.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputTrue0023b4d185167139b2a()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme l = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(l, "length", 0);
    Reflector.setField(l, "lexemeText", null);
    l.setOffset(0);
    l.setLexemeType(0);
    l.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputFalse2() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme l = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(l, "length", 0);
    Reflector.setField(l, "lexemeText", null);
    l.setOffset(0);
    l.setLexemeType(0);
    l.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputTrue2() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme l = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(l, "length", 0);
    Reflector.setField(l, "lexemeText", null);
    l.setOffset(0);
    l.setLexemeType(0);
    l.setBegin(0);

    // Act and Assert result
    Assert.assertTrue(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNotNullZeroOutputFalse0016f1c5b6d65881cf5()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(1);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    final Lexeme l = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(l, "length", 0);
    Reflector.setField(l, "lexemeText", null);
    l.setOffset(0);
    l.setLexemeType(0);
    l.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(l, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputVoid00016da5f654bb5b95f() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLength(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLengthInputZeroOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLength(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull000b6e301c0f7808a16() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("?", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("?", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull0010f56deb3bc81552d() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTextOutputNotNull0004072dc86353420ba() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "foo");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("foo", lexeme.getLexemeText());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNullOutputVoid000f8d853ef623c39ec()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLexemeText(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLexemeText("?");

    // Assert side effects
    Assert.assertEquals(1, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid0014491fed000ada633()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLexemeText("??");

    // Assert side effects
    Assert.assertEquals(2, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLexemeText("foo");

    // Assert side effects
    Assert.assertEquals(3, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLexemeTextInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act
    lexeme.setLexemeText("foo");

    // Assert side effects
    Assert.assertEquals(3, lexeme.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull45() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(8);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("OTHER_CJK", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull44() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(4);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("CN_WORD", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull43() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("LETTER", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull42() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(2);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("ARABIC", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull009e9e09bfffe199bea()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(2);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("ARABIC", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull008c507dca29e0d0d7f()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("LETTER", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull005edf7c9798c2abd74()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("TYPE_CNUM", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull0043453b55852f9441a()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(48);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull003a1fab5ba6e196488()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(32);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull001218223a6576ad0cd()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(-2_147_483_647);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull49() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(64);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("CN_CHAR", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull008e9e09bfffe199bea()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(2);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("ARABIC", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull0078db8f54ffe75fda2()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(4);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("CN_WORD", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull006455769655aea6065()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(8);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("OTHER_CJK", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull0053453b55852f9441a()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(48);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull004a1fab5ba6e196488()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(32);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull003edf7c9798c2abd74()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(16);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("TYPE_CNUM", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull00263cef675d4eecc0d()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(64);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("CN_CHAR", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull001afcfbec92c302ec2()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(32_769);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull000ed0e552c299f4806()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(1);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("ENGLISH", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull48() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("UNKONW", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull47() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(48);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("TYPE_CQUAN", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull46() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(32);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("COUNT", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLexemeTypeStringOutputNotNull009c507dca29e0d0d7f()
      throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(3);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertEquals("LETTER", lexeme.getLexemeTypeString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendInputNullZeroOutputFalse0004c6a40c6f5c1cfbd() throws InvocationTargetException {

    // Arrange
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);

    // Act and Assert result
    Assert.assertFalse(lexeme.append(null, 0));
  }
}
