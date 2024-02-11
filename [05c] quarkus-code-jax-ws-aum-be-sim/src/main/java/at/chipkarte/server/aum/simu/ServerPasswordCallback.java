/*
 * (C) SVC 2017
 */
package at.chipkarte.server.aum.simu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import io.quarkus.runtime.annotations.RegisterForReflection;

//import at.co.svc.elga.core.properties.ApplicationProperties;
//import at.siemens.ecard.server.common.EcardProperty;

/**
 * Password callback which defines the valid user and password.
 */
@RegisterForReflection
public class ServerPasswordCallback extends WSS4JInInterceptor implements CallbackHandler {
  public ServerPasswordCallback() {
    super();
    Map<String, Object> props = new HashMap<>();
    props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
    props.put(WSHandlerConstants.PW_CALLBACK_REF, this);
    setProperties(props);
    System.out.println("pw callback instantiated");
  }

  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

    // set the password on the callback. This will be compared to the
    // password which was sent from the client.
    WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
    if (pc.getIdentifier().equals(getProperty("AUM2BE_LGKK_WSSECURITY_USERNAME", "Franzi"))) {
      pc.setPassword(getGuardedProperty("AUM2BE_LGKK_WSSECURITY_PASSWORD", "Frnxnschlunzhund"));
    }
  }

  private String getProperty(String name, String def) {
    return System.getProperty(name, def);
  }

  //TODO fix this
  private String getGuardedProperty(String name, String def) {
    return System.getProperty(name, def);
  }
}
