package org.armeria;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class Municion extends Inventario{
    private float calibre;
    private float grains;
    private int cantidad;
    private String revestimiento;
    private boolean civil;

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

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
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
        Municion nuevaMunicion = new Municion();
        System.out.println("Añadir munición");
        System.out.println("Indicar marca");
        String marca = Main.scanner.nextLine();
        nuevaMunicion.setMarca(marca);

        System.out.println("indicar la cantidad de paquetes");
        String nUnidades = Main.scanner.nextLine();
        int unidades = Integer.parseInt(nUnidades);
        nuevaMunicion.setUd(unidades);

        System.out.println("Indica el tipo de arma (Corta/Larga)");
        String tipo = Main.scanner.nextLine();
        nuevaMunicion.setTipo(tipo);

        System.out.println("indicar calibre");
        String iCalibre = Main.scanner.nextLine();
        float calibre = Float.parseFloat(iCalibre);
        nuevaMunicion.setCalibre(calibre);

        System.out.println("indicar grains");
        String nGrains = Main.scanner.nextLine();
        float grains = Float.parseFloat(nGrains);
        nuevaMunicion.setGrains(grains);

        System.out.println("Canidad de cartuchos");
        String nCantidad = Main.scanner.nextLine();
        int cantidad = Integer.parseInt(nCantidad);
        nuevaMunicion.setCantidad(cantidad);

        System.out.println("indicar el revestimiento del proyectil");
        String revestimiento = Main.scanner.nextLine();
        nuevaMunicion.setRevestimiento(revestimiento);

        int n = 0;
        while (n != 1) {
            System.out.println("indicar si la munición es para uso civil (SI/NO)");
            String uso = Main.scanner.nextLine();
            try {
                if (uso.equals("si")) {

                    nuevaMunicion.setCivil(Boolean.parseBoolean("true"));
                    n = 1;
                } else if (uso.equals("no")) {
                    nuevaMunicion.setCivil(Boolean.parseBoolean("false"));
                    n = 1;
                } else {
                    System.out.println("respuesta invalida");
                }

            } catch (Exception e) {
                System.out.println("Respuesta invalida");
            }
        }
        inventario.add(nuevaMunicion);

    }
}
