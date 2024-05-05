package org.armeria;

public class ArmaLarga extends Arma {
    private float alcance;
    private boolean visor;
    private String cadencia;
    public ArmaLarga() {
    }

    public ArmaLarga(String sn, boolean funcionando, float cal, float capacidad, float precio, String fabricante, float alcance, boolean visor, String cadencia) {
        super(sn, funcionando, cal, capacidad, precio, fabricante);
        this.alcance = alcance;
        this.visor = visor;
        this.cadencia = cadencia;
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

    public String getCadencia() {
        return cadencia;
    }

    public void setCadencia(String cadencia) {
        this.cadencia = cadencia;
    }
    public static void anadirArmaLarga(){
        System.out.println("Arma larga");
    }
}
