package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.IKArbitrator;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;

public class IKArbitratorTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final IKArbitrator actual = new IKArbitrator();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void processInputNotNullFalseOutputVoid() throws InvocationTargetException {

    // Arrange
    final IKArbitrator iKArbitrator = new IKArbitrator();
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    Reflector.setField(quickSortSet, "head", null);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    Reflector.setField(context, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(context, "pathMap", hashMap);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    iKArbitrator.process(context, false);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void processInputNotNullFalseOutputVoid2() throws InvocationTargetException {

    // Arrange
    final IKArbitrator iKArbitrator = new IKArbitrator();
    final AnalyzeContext context =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(context, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("foo");
    Reflector.setField(context, "buffLocker", hashSet);
    Reflector.setField(context, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 18);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    Reflector.setField(cell1, "lexeme", null);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(cell, "next", cell1);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", -62_052_348);
    Reflector.setField(lexeme, "lexemeText", null);
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(196_265_856);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    Reflector.setField(quickSortSet, "tail", null);
    Reflector.setField(context, "orgLexemes", quickSortSet);
    Reflector.setField(context, "results", null);
    Reflector.setField(context, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(context, "pathMap", hashMap);
    Reflector.setField(context, "buffOffset", 0);
    Reflector.setField(context, "available", 0);
    Reflector.setField(context, "cursor", 0);

    // Act
    iKArbitrator.process(context, false);

    // Assert side effects
    Assert.assertNotNull(context);
    Assert.assertNotNull(context.getOrgLexemes());
    Assert.assertNull(context.getOrgLexemes().getHead());
    Assert.assertEquals(0, context.getBufferOffset());
    Assert.assertEquals(0, context.getCursor());
  }
}
