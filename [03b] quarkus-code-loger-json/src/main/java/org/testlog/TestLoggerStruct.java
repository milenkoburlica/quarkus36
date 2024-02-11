package org.testlog;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.quarkiverse.loggingjson.providers.KeyValueStructuredArgument;

@ApplicationScoped
public class TestLoggerStruct {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestLoggerStruct.class);

    public void testLog() {

      LOGGER.info("This is a message.", jsonLogObject("Hello", null));

    }
    public Object[] jsonLogObject(String message, Throwable t) {
      
      String applicationName = "EcSrvPst";
      String applicationVersion = "23.2.3.1";
      String serviceName = "EcSrvPstImport";
      String podName = "SName1";
      String namespace = "SName2";
    
      Map<String, Object> dynamicArguments = new HashMap<>();

      dynamicArguments.put("logLevel", "INFOSTAN");
      dynamicArguments.put("applicationName", applicationName);
      dynamicArguments.put("applicationVersion", applicationVersion);
      dynamicArguments.put("serviceName", serviceName);
      dynamicArguments.put("podName", podName);
      dynamicArguments.put("namespace", namespace);
      dynamicArguments.put("message", message);
      if (t != null)
        dynamicArguments.put("exception", t);

      Object[] structuredArguments = dynamicArguments.entrySet()
              .stream()
              .map(entry -> KeyValueStructuredArgument.kv(entry.getKey(), entry.getValue()))
              .toArray();

      return structuredArguments;
    }

}
