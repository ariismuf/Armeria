package org.armeria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int seleccion = 0;
    while (seleccion != 7 ){
        System.out.println("-------------------------");
        System.out.println("| SELECCIONE UNA OPCIÓN |");
        System.out.println("-------------------------");
        System.out.println("| 1.- Añadir arma       |");
        System.out.println("| 2.- Eliminar arma     |");
        System.out.println("| 3.- Añadir articulo   |");
        System.out.println("| 4.- ");
        System.out.println("| 5.- Armeria           |");
        System.out.println("| 6.- Inventario        |");
        System.out.println("| 7.- Salir             |");
        System.out.println("-------------------------");

        try {

            String seleccionString = scanner.nextLine();
            seleccion = Integer.parseInt(seleccionString);
        } catch (Exception e){
            System.out.println("ha introducido un caracter no valido,\npor favor, introduzca un numero.");
            continue;
        }
        switch (seleccion){
            case 1:
                Arma.menuArma();
                break;
            case 2:
                Arma.eliminarArmeria();
                break;
            case 3:
                Inventario.anadirInventario();
                break;
            case 4:
                Inventario.eliminarInventario();
                break;
            case 5:
                System.out.println("ARMERIA");
                Arma.getArmeria();
                break;
            case 6:
                System.out.println("INVENTARIO");
                Inventario.getInventario();
                break;
        }

    }


    }
}