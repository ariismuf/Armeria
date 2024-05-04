package org.armeria;

public class ArmaCorta extends Arma{
    private boolean tambor;
    private boolean rafaga;



    public ArmaCorta(String sn, boolean funcionando, float cal, float capacidad, float precio, String fabricante, boolean tambor, boolean rafaga) {
        super(sn, funcionando, cal, capacidad, precio, fabricante);
        this.tambor = tambor;
        this.rafaga = rafaga;
    }

    public ArmaCorta() {
    }

    public boolean isTambor() {
        return tambor;
    }

    public void setTambor(boolean tambor) {
        this.tambor = tambor;
    }

    public boolean isRafaga() {
        return rafaga;
    }

    public void setRafaga(boolean rafaga) {
        this.rafaga = rafaga;
    }
}
