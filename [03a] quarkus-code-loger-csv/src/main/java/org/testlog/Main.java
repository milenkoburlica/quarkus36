package org.testlog;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

  // @Inject LogFactory logFactory;

  public static void main(String... args) {
    Quarkus.run(MyApp.class, args);
  }

  public static class MyApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {

      TestLogger testLogger = new TestLogger();
      testLogger.testLog();

      Quarkus.waitForExit();
      return 0;
    }
  }

}
