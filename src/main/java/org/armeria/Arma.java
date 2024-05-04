package org.armeria;

import java.util.ArrayList;

public abstract class Arma {
    private String sn;
    private boolean funcionando;
    private float cal;
    private static ArrayList <Arma> inventario = new ArrayList<>();


    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }

    public float getCal() {
        return cal;
    }

    public void setCal(float cal) {
        this.cal = cal;
    }

    public static ArrayList<Arma> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Arma> inventario) {
        Arma.inventario = inventario;
    }

    public Arma() {
    }

    public Arma(String sn, boolean funcionando, float cal) {
        this.sn = sn;
        this.funcionando = funcionando;
        this.cal = cal;
    }
}
