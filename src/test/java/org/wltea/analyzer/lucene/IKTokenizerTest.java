package org.wltea.analyzer.lucene;

import static org.mockito.Matchers.anyInt;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.lucene.IKTokenizer;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

@RunWith(PowerMockRunner.class)
public class IKTokenizerTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(Tokenizer.class)
  @Test
  public void resetOutputVoid000c67dba27b5673968()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final IKTokenizer iKTokenizer = PowerMockito.mock(IKTokenizer.class);
    PowerMockito.doCallRealMethod().when(iKTokenizer);
    iKTokenizer.reset();
    Reflector.setField(iKTokenizer, "termAtt", null);
    Reflector.setField(iKTokenizer, "skippedPositions", 0);
    Reflector.setField(iKTokenizer, "typeAtt", null);
    Reflector.setField(iKTokenizer, "offsetAtt", null);
    Reflector.setField(iKTokenizer, "posIncrAtt", null);
    Reflector.setField(iKTokenizer, "endPosition", 0);
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList arrayList = new ArrayList();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final Object analyzeContext = Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList linkedList = new LinkedList();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);
    Reflector.setField(iKTokenizer, "_IKImplement", iKSegmenter);
    Reflector.setField(iKTokenizer, "input", null);

    // Act
    iKTokenizer.reset();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Tokenizer.class)
  @Test
  public void resetOutputVoid0003e85b9da8897f0c9()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final IKTokenizer iKTokenizer = PowerMockito.mock(IKTokenizer.class);
    PowerMockito.doCallRealMethod().when(iKTokenizer);
    iKTokenizer.reset();
    Reflector.setField(iKTokenizer, "termAtt", null);
    Reflector.setField(iKTokenizer, "skippedPositions", 0);
    Reflector.setField(iKTokenizer, "typeAtt", null);
    Reflector.setField(iKTokenizer, "offsetAtt", null);
    Reflector.setField(iKTokenizer, "posIncrAtt", null);
    Reflector.setField(iKTokenizer, "endPosition", 0);
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList arrayList = new ArrayList();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final Object analyzeContext = Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet hashSet = new HashSet();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList linkedList = new LinkedList();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap hashMap = new HashMap();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);
    Reflector.setField(iKTokenizer, "_IKImplement", iKSegmenter);
    Reflector.setField(iKTokenizer, "input", null);

    // Act
    iKTokenizer.reset();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Tokenizer.class)
  @Test
  public void resetOutputVoid3() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final IKTokenizer iKTokenizer = PowerMockito.mock(IKTokenizer.class);
    PowerMockito.doCallRealMethod().when(iKTokenizer);
    iKTokenizer.reset();
    Reflector.setField(iKTokenizer, "termAtt", null);
    Reflector.setField(iKTokenizer, "skippedPositions", 0);
    Reflector.setField(iKTokenizer, "typeAtt", null);
    Reflector.setField(iKTokenizer, "offsetAtt", null);
    Reflector.setField(iKTokenizer, "posIncrAtt", null);
    Reflector.setField(iKTokenizer, "endPosition", 0);
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList arrayList = new ArrayList();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final Object analyzeContext = Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet hashSet = new HashSet();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList linkedList = new LinkedList();
    linkedList.add(null);
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);
    Reflector.setField(iKTokenizer, "_IKImplement", iKSegmenter);
    Reflector.setField(iKTokenizer, "input", null);

    // Act
    iKTokenizer.reset();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Tokenizer.class, OffsetAttribute.class, IKTokenizer.class,
                   PositionIncrementAttribute.class})
  @Test
  public void
  endOutputVoid() throws Exception, IOException {

    // Arrange
    final IKTokenizer iKTokenizer = PowerMockito.mock(IKTokenizer.class);
    PowerMockito.doCallRealMethod().when(iKTokenizer);
    iKTokenizer.end();
    final Method correctOffsetMethod =
        DTUMemberMatcher.method(IKTokenizer.class, "correctOffset", int.class);
    PowerMockito.doReturn(0).when(iKTokenizer, correctOffsetMethod).withArguments(anyInt());
    Reflector.setField(iKTokenizer, "termAtt", null);
    Reflector.setField(iKTokenizer, "skippedPositions", 0);
    Reflector.setField(iKTokenizer, "typeAtt", null);
    final OffsetAttribute offsetAttribute = PowerMockito.mock(OffsetAttribute.class);
    Reflector.setField(iKTokenizer, "offsetAtt", offsetAttribute);
    final PositionIncrementAttribute positionIncrementAttribute =
        PowerMockito.mock(PositionIncrementAttribute.class);
    final Method getPositionIncrementMethod =
        DTUMemberMatcher.method(PositionIncrementAttribute.class, "getPositionIncrement");
    PowerMockito.doReturn(0)
        .when(positionIncrementAttribute, getPositionIncrementMethod)
        .withNoArguments();
    Reflector.setField(iKTokenizer, "posIncrAtt", positionIncrementAttribute);
    Reflector.setField(iKTokenizer, "endPosition", 0);
    Reflector.setField(iKTokenizer, "_IKImplement", null);
    Reflector.setField(iKTokenizer, "input", null);

    // Act
    iKTokenizer.end();

    // The method returns void, testing that no exception is thrown
  }
}
