package org.acme;

import java.util.HashMap;
import java.util.Map;

public class ZpvPartnerInfo {
  private long _zpvPartnerId;
  private String _svnr;
  private Map<BpkKey, BpkInfo> _bpkInfos = new HashMap<>();
  private boolean _gueltig;
  public ZpvPartnerInfo(long zpvPartnerId, boolean gueltig, String svnr) {
    _zpvPartnerId = zpvPartnerId;
    _gueltig = gueltig;
    _svnr = svnr;
  }

  public ZpvPartnerInfo(long zpvPartnerId) {
    this(zpvPartnerId, false, null);
  }

  public long getZpvPartnerId() {
    return _zpvPartnerId;
  }

  public void addBpkInfo(String bpk, String bereich, boolean verschluesselt, boolean gueltig) {
    BpkKey key = new BpkKey(bereich, verschluesselt);
    if (checkAdd(key)) {
      _bpkInfos.put(key, new BpkInfo(bpk.trim(), bereich, verschluesselt, gueltig));
    }
  }

  public Map<BpkKey, BpkInfo> getBpkInfos() {
    return new HashMap<>(_bpkInfos);
  }

  public String getSvnr() {
    return _svnr;
  }

  public boolean isGueltig() {
    return _gueltig;
  }

  /**
   * Add the new value if there is no bPK for this bereich / verschluesselt; or if there is one, but it is invalid.
   * @param key
   * @return
   */
  private boolean checkAdd(BpkKey key) {
    BpkInfo found = _bpkInfos.get(key);
    return found == null || !found.isGueltig();
  }


}
