package org.acme;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "server")
public interface PropertiesReader {

	public String userName();
	public String userPassword();
}
