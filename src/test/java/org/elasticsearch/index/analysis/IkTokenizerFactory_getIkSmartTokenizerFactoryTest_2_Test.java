package org.elasticsearch.index.analysis;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.IkTokenizerFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IkTokenizerFactory_getIkSmartTokenizerFactoryTest_2_Test {
  @Test
  public void getIkSmartTokenizerFactoryTest() throws Exception {
    // Arrange
    IndexSettings indexSettings = (IndexSettings) null;
    Environment environment = (Environment) null;
    String name = "aaaaa";
    Settings settings = (Settings) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    IkTokenizerFactory.getIkSmartTokenizerFactory(indexSettings, environment, name, settings);
    Assert.assertEquals(null, indexSettings);
    Assert.assertEquals(null, environment);
    Assert.assertEquals(null, settings);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
