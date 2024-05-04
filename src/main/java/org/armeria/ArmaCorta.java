package org.armeria;

public class ArmaCorta extends Arma{
    private boolean tambor;

    public ArmaCorta(String sn, boolean funcionando, float cal, boolean tambor) {
        super(sn, funcionando, cal);
        this.tambor =tambor;

    }

    public ArmaCorta() {
    }

    public boolean isTambor() {
        return tambor;
    }

    public void setTambor(boolean tambor) {
        this.tambor = tambor;
    }
}
