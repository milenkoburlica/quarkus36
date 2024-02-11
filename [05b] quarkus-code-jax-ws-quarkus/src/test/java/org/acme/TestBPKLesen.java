package org.acme;


import java.util.Arrays;
import java.util.List;

import org.foo.CxfClientRestResource;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestBPKLesen {

  @Inject
  CxfClientRestResource _cxfClientRestResource;

  @Test
  public void bPKLesenTest() {
 
    System.out.println("Start");
    
    long zpvPartnerId = 12609317;
    List<String> bereiche = Arrays.asList("GH", "SV", "AS");
    _cxfClientRestResource.bpkLesen(zpvPartnerId, bereiche);
    System.out.println("Ende");

  }


}
