package org.acme;

import java.util.Map;
import jakarta.xml.ws.BindingProvider;

/**
 * Implements the generally useful method for BPK update service.
 */
public class BpkUpdateUtil {
  // Apache CXF request context property keys for ws security username / password
  private static final String WSSEC_USERNAME_KEY = "ws-security.username";
  private static final String WSSEC_PASSWORD_KEY = "ws-security.password";

  /**
   * Sets username, password, and endpoint URL for a client stub.
   * @param <T>
   * @param stub
   * @param endpointUrl
   * @param username
   * @param password
   * @return
   */
  public static <T> T initializeClientStub(T stub, String endpointUrl, String username, String password) {
    if (isEmpty(username)) {
      throw new IllegalArgumentException("Username for WS-Security authentication is null or empty.");
    }
    if (isEmpty(password)) {
      throw new IllegalArgumentException("Password for WS-Security authentication is null or empty.");
    }
    if (isEmpty(endpointUrl)) {
      throw new IllegalArgumentException("Endpoint URL is null or empty.");
    }

    // Set endpoint
    Map<String, Object> context = ((BindingProvider) stub).getRequestContext();
    context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
    context.put(BindingProvider.USERNAME_PROPERTY, username);
    context.put(BindingProvider.PASSWORD_PROPERTY, password);
    context.put(WSSEC_USERNAME_KEY, username);
    context.put(WSSEC_PASSWORD_KEY, password);

    return stub;
  }

  public static boolean isEmpty(String str) {
    return str == null || str.isEmpty();
  }
}
