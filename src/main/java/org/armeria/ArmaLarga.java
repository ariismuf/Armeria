package org.armeria;

public class ArmaLarga extends Arma {
    private float alcance;

    public ArmaLarga() {
    }

    public ArmaLarga(String sn, boolean funcionando, float cal, float alcance) {
        super(sn, funcionando, cal);
        this.alcance = alcance;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }
}
