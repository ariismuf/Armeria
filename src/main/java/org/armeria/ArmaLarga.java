package org.armeria;

public class ArmaLarga extends Arma {
    private float alcance;
    private boolean visor;
    public ArmaLarga() {
    }

    public ArmaLarga(String sn, boolean funcionando, float cal, float capacidad, float precio, String fabricante, float alcance, boolean visor) {
        super(sn, funcionando, cal, capacidad, precio, fabricante);
        this.alcance = alcance;
        this.visor = visor;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }
}
