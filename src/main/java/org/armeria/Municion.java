package org.armeria;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class Municion extends Inventario{
    private int calibre;
    private float grains;
    private int cantidad;
    private String revestimiento;
    private Boolean civil;

    @Override
    public String toString() {
        return "Municion{" +
                "marca ='" + getMarca() + '\'' +
                ", unidades =" + getUd() +
                ", tipo ='" + getTipo() + '\'' +
                "calibre =" + calibre +
                ", grains =" + grains +
                ", cantidad =" + cantidad +
                ", revestimiento ='" + revestimiento + '\'' +
                ", civil =" + civil +
                '}';
    }

    public Municion() {
    }
    public Municion(String marca, String tipo, int ud, int calibre, float grains, int cantidad, String revestimiento, Boolean civil) {
        super(marca, tipo, ud);
        this.calibre = calibre;
        this.grains = grains;
        this.cantidad = cantidad;
        this.revestimiento = revestimiento;
        this.civil = civil;

    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public float getGrains() {
        return grains;
    }

    public void setGrains(float grains) {
        this.grains = grains;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getRevestimiento() {
        return revestimiento;
    }

    public void setRevestimiento(String revestimiento) {
        this.revestimiento = revestimiento;
    }

    public Boolean getCivil() {
        return civil;
    }

    public void setCivil(Boolean civil) {
        this.civil = civil;
    }

    public static void anadirMunicion(){
        Municion NuevaMunicion = new Municion();
        System.out.println("Añadir munición");

    }
}
