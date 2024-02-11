package org.acme;

public class BpkKey {
  private String _bereich;
  private boolean _verschluesselt;
  public BpkKey(String bereich, boolean verschluesselt) {
    _bereich = bereich;
    _verschluesselt = verschluesselt;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_bereich == null) ? 0 : _bereich.hashCode());
    result = prime * result + (_verschluesselt ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof BpkKey)) {
      return false;
    }
    BpkKey other = (BpkKey) obj;
    if (_bereich == null) {
      if (other._bereich != null) {
        return false;
      }
    }
    else if (!_bereich.equals(other._bereich)) {
      return false;
    }
    return _verschluesselt == other._verschluesselt;
  }
}
