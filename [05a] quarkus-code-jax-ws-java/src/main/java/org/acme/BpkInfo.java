package org.acme;

public class BpkInfo {
  private String _bpk;
  private String _bereich;
  private boolean _verschluesselt;
  private boolean _gueltig;

  public BpkInfo(String bpk, String bereich, boolean verschluesselt, boolean gueltig) {
    super();
    _bpk = bpk;
    _bereich = bereich;
    _verschluesselt = verschluesselt;
    _gueltig = gueltig;
  }

  public String getBpk() {
    return _bpk;
  }
   public String getBereich() {
    return _bereich;
  }
  public boolean isVerschluesselt() {
    return _verschluesselt;
  }
  public boolean isGueltig() {
    return _gueltig;
  }

  @Override
  public String toString() {
    return "Bereich: " + _bereich + (_verschluesselt ? " verschluesselt" : " unverschluesselt") + ", Wert = " + _bpk +
        (_gueltig ? " aktiv" : " storniert");
  }
 }
