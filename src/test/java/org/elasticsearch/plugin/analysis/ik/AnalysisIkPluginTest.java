package org.elasticsearch.plugin.analysis.ik;

import com.diffblue.deeptestutils.Reflector;
import org.elasticsearch.index.analysis.TokenizerFactory;
import org.elasticsearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.elasticsearch.plugin.analysis.ik.AnalysisIkPlugin;
import org.elasticsearch.plugins.Plugin;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@RunWith(PowerMockRunner.class)
public class AnalysisIkPluginTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(AnalysisIkPlugin.class)
  @Test
  public void constructorOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(Plugin.class));

    // Act, creating object to test constructor
    final AnalysisIkPlugin actual = new AnalysisIkPlugin();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("org.elasticsearch.plugin.analysis.ik.AnalysisIkPlugin");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void getAnalyzersOutput200028b879c5873c667a() {

    // Arrange
    final AnalysisIkPlugin analysisIkPlugin = new AnalysisIkPlugin();

    // Act
    final Map actual = analysisIkPlugin.getAnalyzers();

    // Assert result
    final HashMap hashMap = new HashMap();
    hashMap.put("ik_smart", null);
    hashMap.put("ik_max_word", null);
    Assert.assertEquals(hashMap, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getTokenizersOutput2000bfe0f0308bda7e0a() {

    // Arrange
    final AnalysisIkPlugin analysisIkPlugin = new AnalysisIkPlugin();

    // Act
    final Map<String, AnalysisProvider<TokenizerFactory>> actual = analysisIkPlugin.getTokenizers();

    // Assert result
    final HashMap<String, AnalysisProvider<TokenizerFactory>> hashMap =
        new HashMap<String, AnalysisProvider<TokenizerFactory>>();
    hashMap.put("ik_smart", null);
    hashMap.put("ik_max_word", null);
    Assert.assertEquals(hashMap, actual);
  }
}
