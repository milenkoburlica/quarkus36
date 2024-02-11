package org.acme;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestBPKLesen {

  @Inject
  BPKLesenSoap _bpkLesenSoap;

  @Test
  public void bPKLesenTest() {
 
    ZpvPartnerInfo res = _bpkLesenSoap.bpkLesen(12609317, Arrays.asList("GH", "SV", "AS"));

    assertNotNull(res);
    assertEquals(12609317, res.getZpvPartnerId());
    assertNotNull(res.getBpkInfos());
    assertTrue(res.isGueltig());
    Map<BpkKey, BpkInfo> svInfo = res.getBpkInfos();
    assertEquals("6425200371", res.getSvnr());
    assertEquals(4, svInfo.size());
    assertContainsBereich(svInfo, "AS", true);
    assertContainsBereich(svInfo, "GH", true);
    assertContainsBereich(svInfo, "SV", true);
    assertContainsBereich(svInfo, "SV", false);

  }

  private void assertContainsBereich(Map<BpkKey, BpkInfo> res, String bereich, boolean verschluesselt) {
    assertTrue(res.containsKey(new BpkKey(bereich, verschluesselt)));
  }

}
