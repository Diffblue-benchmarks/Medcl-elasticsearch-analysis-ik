package org.wltea.analyzer.core;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.AnalyzeContext;
import org.wltea.analyzer.core.CJKSegmenter;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.ISegmenter;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.core.LexemePath;
import org.wltea.analyzer.core.QuickSortSet.Cell;
import org.wltea.analyzer.core.QuickSortSet;
import org.wltea.analyzer.dic.Hit;

import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class IKSegmenterTest {

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNullNullOutputVoid00014a9ef2329043bbf() {

    // Arrange
    final Reader input = null;
    final Configuration configuration = null;

    // Act, creating object to test constructor
    final IKSegmenter actual = new IKSegmenter(input, configuration);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);
    final StringReader input = (StringReader)Reflector.getInstance("java.io.StringReader");
    Reflector.setField(input, "mark", 0);
    Reflector.setField(input, "next", 0);
    Reflector.setField(input, "length", 3);
    Reflector.setField(input, "str", "foo");
    Reflector.setField(input, "skipBuffer", null);
    Reflector.setField(input, "lock", 0);

    // Act
    iKSegmenter.reset(input);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);

    // Act
    iKSegmenter.reset(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    final CJKSegmenter cJKSegmenter = new CJKSegmenter();
    final ArrayList<Hit> arrayList1 = new ArrayList<Hit>();
    final Hit hit = new Hit();
    hit.setEnd(0);
    hit.setBegin(0);
    final Comparable dictSegment =
        (Comparable)Reflector.getInstance("org.wltea.analyzer.dic.DictSegment");
    Reflector.setField(dictSegment, "nodeState", 0);
    Reflector.setField(dictSegment, "storeSize", 0);
    final Object[] dictSegmentArray = {};
    Reflector.setField(dictSegment, "childrenArray", dictSegmentArray);
    Reflector.setField(dictSegment, "nodeChar", ' ');
    final HashMap<Character, Comparable> hashMap = new HashMap<Character, Comparable>();
    hashMap.put(' ', null);
    Reflector.setField(dictSegment, "childrenMap", hashMap);
    hit.setMatchedDictSegment(dictSegment);
    Reflector.setField(hit, "hitState", 0);
    arrayList1.add(hit);
    Reflector.setField(cJKSegmenter, "tmpHits", arrayList1);
    arrayList.add(cJKSegmenter);
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    linkedList.add(null);
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap1 = new HashMap<Integer, LexemePath>();
    hashMap1.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap1);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);

    // Act
    iKSegmenter.reset(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNullOutputVoid000728e3c467ff8e570() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);

    // Act
    iKSegmenter.reset(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    Reflector.setField(analyzeContext, "segmentBuff", null);
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add(null);
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    Reflector.setField(analyzeContext, "orgLexemes", null);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    hashMap.put(null, null);
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);

    // Act
    iKSegmenter.reset(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInputNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final IKSegmenter iKSegmenter =
        (IKSegmenter)Reflector.getInstance("org.wltea.analyzer.core.IKSegmenter");
    Reflector.setField(iKSegmenter, "arbitrator", null);
    Reflector.setField(iKSegmenter, "configuration", null);
    Reflector.setField(iKSegmenter, "input", null);
    final ArrayList<ISegmenter> arrayList = new ArrayList<ISegmenter>();
    Reflector.setField(iKSegmenter, "segmenters", arrayList);
    final AnalyzeContext analyzeContext =
        (AnalyzeContext)Reflector.getInstance("org.wltea.analyzer.core.AnalyzeContext");
    final char[] myCharArray = {};
    Reflector.setField(analyzeContext, "segmentBuff", myCharArray);
    final HashSet<String> hashSet = new HashSet<String>();
    Reflector.setField(analyzeContext, "buffLocker", hashSet);
    Reflector.setField(analyzeContext, "cfg", null);
    final QuickSortSet quickSortSet = new QuickSortSet();
    Reflector.setField(quickSortSet, "size", 0);
    final QuickSortSet.Cell cell =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell, "next", null);
    Reflector.setField(cell, "this$0", null);
    final Lexeme lexeme = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme, "length", 0);
    Reflector.setField(lexeme, "lexemeText", "?");
    lexeme.setOffset(0);
    lexeme.setLexemeType(0);
    lexeme.setBegin(0);
    Reflector.setField(cell, "lexeme", lexeme);
    Reflector.setField(cell, "prev", null);
    Reflector.setField(quickSortSet, "head", cell);
    final QuickSortSet.Cell cell1 =
        (QuickSortSet.Cell)Reflector.getInstance("org.wltea.analyzer.core.QuickSortSet$Cell");
    Reflector.setField(cell1, "next", null);
    Reflector.setField(cell1, "this$0", null);
    final Lexeme lexeme1 = (Lexeme)Reflector.getInstance("org.wltea.analyzer.core.Lexeme");
    Reflector.setField(lexeme1, "length", 0);
    Reflector.setField(lexeme1, "lexemeText", "?");
    lexeme1.setOffset(0);
    lexeme1.setLexemeType(0);
    lexeme1.setBegin(0);
    Reflector.setField(cell1, "lexeme", lexeme1);
    Reflector.setField(cell1, "prev", null);
    Reflector.setField(quickSortSet, "tail", cell1);
    Reflector.setField(analyzeContext, "orgLexemes", quickSortSet);
    final LinkedList<Lexeme> linkedList = new LinkedList<Lexeme>();
    Reflector.setField(analyzeContext, "results", linkedList);
    Reflector.setField(analyzeContext, "charTypes", null);
    final HashMap<Integer, LexemePath> hashMap = new HashMap<Integer, LexemePath>();
    Reflector.setField(analyzeContext, "pathMap", hashMap);
    Reflector.setField(analyzeContext, "buffOffset", 0);
    Reflector.setField(analyzeContext, "available", 0);
    Reflector.setField(analyzeContext, "cursor", 0);
    Reflector.setField(iKSegmenter, "context", analyzeContext);

    // Act
    iKSegmenter.reset(null);

    // The method returns void, testing that no exception is thrown
  }
}
