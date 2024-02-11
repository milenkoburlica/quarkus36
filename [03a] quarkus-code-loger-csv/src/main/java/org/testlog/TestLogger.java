package org.testlog;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

import java.util.UUID;
import org.jboss.logmanager.MDC;


@ApplicationScoped
public class TestLogger {

  private static final Logger LOGGER = Logger.getLogger(TestLogger.class);

  public void testLog() {
    
    MDC.put("request.id", UUID.randomUUID().toString());
    MDC.put("request.path", "/hello/test");

    LOGGER.debug("1: This is DEBUG");
    LOGGER.info("2: This is INFO");
    LOGGER.warn("3: This is WARN");
    LOGGER.error("4: This is ERROR");
    LOGGER.trace("5: This is TRACE");

  }
}
