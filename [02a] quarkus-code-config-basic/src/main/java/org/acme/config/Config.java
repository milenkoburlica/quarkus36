package org.acme.config;

import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import lombok.Setter;

@ApplicationScoped
@Getter @Setter
public class Config {


  @ConfigProperty(name = "greeting.city")
  Optional<String> city;

}
