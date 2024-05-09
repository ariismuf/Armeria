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
                    Mira.anadirMira();
                    break;
                case 3:
                    Equipo.anadirEquipo();
                case 4:
                    flag = false;
                    break;

            }
        }
    }
    public static void eliminarInventario(){
            int menuInventario = 0;
            System.out.println("-------------------------");
            System.out.println("|   ELIMINAR articulo   |");
            System.out.println("-------------------------");
            System.out.println("| 1.- Eliminar articulo |");
            System.out.println("| 2.-Volver             |");
            System.out.println("-------------------------");
            String seleccion = Main.scanner.nextLine();
            menuInventario = Integer.parseInt(seleccion);
            switch (menuInventario){
                case 1:
                    int indice;
                    System.out.println("INDICA QUE ARMA QUIERES ELIMINAR");
                    getInventario();
                    String seleccionEliminar = Main.scanner.nextLine();
                    indice = Integer.parseInt(seleccionEliminar);
                    inventario.remove(indice);
                    break;
                case 2:
                    break;
            }
        }
    }

