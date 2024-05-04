package org.armeria;

import java.util.ArrayList;

public abstract class Arma {
    private String sn;
    private boolean funcionando;
    private float cal;
    private float precio;
    private float capacidad;
    private String fabricante;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    public static ArrayList<Arma> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Arma> inventario) {
        Arma.inventario = inventario;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Arma() {
    }

    public Arma(String sn, boolean funcionando, float cal, float capacidad, float precio, String fabricante) {
        this.sn = sn;
        this.funcionando = funcionando;
        this.cal = cal;
        this.capacidad = capacidad;
        this.precio = precio;
        this.fabricante = fabricante;
    }
}
