package org.armeria;

import java.util.ArrayList;

public class Inventario {
    private String marca;
    private int ud;
    private String tipo;
    public static ArrayList<Inventario> inventario = new ArrayList<>();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

    public int getUd() {
        return ud;
    }

    public void setUd(int ud) {
        this.ud = ud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static ArrayList<Inventario> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Inventario> inventario) {
        Inventario.inventario = inventario;
    }

    public Inventario(){

    }
    public Inventario(String marca, String tipo, int ud) {
        this.marca = marca;
        this.tipo = tipo;
        this.ud = ud;
    }

    public static void anadirInventario(){
        int nueva = 0;
        boolean flag = true;
        while (flag != false){
            System.out.println("-------------------------");
            System.out.println("|    AÑADIR ARTICULO    |");
            System.out.println("-------------------------");
            System.out.println("| 1.- Munición          |");
            System.out.println("| 2.- Mira              |");
            System.out.println("| 3.- Equipo            |");
            System.out.println("| 4.- Volver            |");
            System.out.println("-------------------------");
            try {

                String nuevaArma = Main.scanner.nextLine();
                nueva = Integer.parseInt(nuevaArma);
            } catch (Exception e){
                System.out.println("ha introducido un caracter no valido,\npor favor, introduzca un numero.");
                continue;
            }
            switch (nueva){
                case 1:
                    Municion.anadirMunicion();
                    break;
                case 2:
                    ArmaLarga.anadirArmaLarga();
                    break;
                case 3:

                case 4:
                    flag = false;
                    break;

            }
        }
    }
}
