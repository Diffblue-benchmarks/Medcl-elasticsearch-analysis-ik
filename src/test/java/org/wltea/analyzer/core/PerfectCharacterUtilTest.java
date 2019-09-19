package org.wltea.analyzer.core;

import org.junit.Assert;
import org.junit.Test;

import org.wltea.analyzer.core.CharacterUtil;

public class PerfectCharacterUtilTest {

  // Test written by hand
  @Test
  public void identifyCharType() {
      Assert.assertEquals(CharacterUtil.CHAR_ARABIC, CharacterUtil.identifyCharType('0'));
      Assert.assertEquals(CharacterUtil.CHAR_ARABIC, CharacterUtil.identifyCharType('9'));

      Assert.assertEquals(CharacterUtil.CHAR_ENGLISH, CharacterUtil.identifyCharType('a'));
      Assert.assertEquals(CharacterUtil.CHAR_ENGLISH, CharacterUtil.identifyCharType('z'));
      Assert.assertEquals(CharacterUtil.CHAR_ENGLISH, CharacterUtil.identifyCharType('A'));
      Assert.assertEquals(CharacterUtil.CHAR_ENGLISH, CharacterUtil.identifyCharType('Z'));

      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('一'));
      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('鿕'));
      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('豈'));
      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('龎'));
      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('㐀'));
      Assert.assertEquals(CharacterUtil.CHAR_CHINESE, CharacterUtil.identifyCharType('䶵'));

      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('！'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('￮'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('가'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('힣'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ᄀ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ᇿ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ㄱ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ㆎ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('あ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('を'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ア'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ヲ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ㇰ'));
      Assert.assertEquals(CharacterUtil.CHAR_OTHER_CJK, CharacterUtil.identifyCharType('ㇿ'));

      Assert.assertEquals(CharacterUtil.CHAR_USELESS, CharacterUtil.identifyCharType('|'));
  }

    // Test written by hand.
    @Test
    public void regularize() {
        Assert.assertEquals('a', CharacterUtil.regularize('a', false));
        Assert.assertEquals('P', CharacterUtil.regularize('P', false));
        Assert.assertEquals('b', CharacterUtil.regularize('B', true));

        Assert.assertEquals(' ', CharacterUtil.regularize('\u3000', true));
        Assert.assertEquals('\uff00', CharacterUtil.regularize('\uff00', true));
        Assert.assertEquals('!', CharacterUtil.regularize('\uff01', true));
        Assert.assertEquals('~', CharacterUtil.regularize('\uff5e', true));
        Assert.assertEquals('\uff5f', CharacterUtil.regularize('\uff5f', true));
    }
}
