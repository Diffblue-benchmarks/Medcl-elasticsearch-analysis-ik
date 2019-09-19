package org.elasticsearch.index.analysis;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.IkAnalyzerProvider;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class IkAnalyzerProviderTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(IkAnalyzerProvider.class)
  @Test
  public void getIkSmartAnalyzerProviderInputNotNullNotNullNotNullNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Arrange
    final IndexSettings indexSettings = PowerMockito.mock(IndexSettings.class);
    final Environment env = PowerMockito.mock(Environment.class);
    final String name = "foo";
    final Settings settings = PowerMockito.mock(Settings.class);
    final IkAnalyzerProvider ikAnalyzerProvider = PowerMockito.mock(IkAnalyzerProvider.class);
    final IKAnalyzer iKAnalyzer = PowerMockito.mock(IKAnalyzer.class);
    final Configuration configuration =
        (Configuration)Reflector.getInstance("org.wltea.analyzer.cfg.Configuration");
    Reflector.setField(configuration, "settings", settings);
    Reflector.setField(configuration, "useSmart", true);
    Reflector.setField(configuration, "enableLowercase", false);
    Reflector.setField(configuration, "environment", env);
    Reflector.setField(configuration, "enableRemoteDict", false);
    Reflector.setField(iKAnalyzer, "configuration", configuration);
    Reflector.setField(ikAnalyzerProvider, "analyzer", iKAnalyzer);
    PowerMockito.whenNew(IkAnalyzerProvider.class)
        .withParameterTypes(IndexSettings.class, Environment.class, String.class, Settings.class,
                            boolean.class)
        .withArguments(or(isA(IndexSettings.class), isNull(IndexSettings.class)),
                       or(isA(Environment.class), isNull(Environment.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(Settings.class), isNull(Settings.class)), anyBoolean())
        .thenReturn(ikAnalyzerProvider);

    // Act
    final IkAnalyzerProvider actual =
        IkAnalyzerProvider.getIkSmartAnalyzerProvider(indexSettings, env, name, settings);

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(Dictionary.class, null, "singleton"));

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getOutputNull() throws InvocationTargetException {

    // Arrange
    final IkAnalyzerProvider ikAnalyzerProvider = (IkAnalyzerProvider)Reflector.getInstance(
        "org.elasticsearch.index.analysis.IkAnalyzerProvider");
    Reflector.setField(ikAnalyzerProvider, "analyzer", null);

    // Act
    final IKAnalyzer actual = ikAnalyzerProvider.get();

    // Assert result
    Assert.assertNull(actual);
  }
}
