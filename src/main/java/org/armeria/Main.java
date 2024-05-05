package org.armeria;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int seleccion = 0;
    while (seleccion != 5 ){
        System.out.println("-------------------------");
        System.out.println("| SELECCIONE UNA OPCIÓN |");
        System.out.println("-------------------------");
        System.out.println("| 1.- Añadir arma       |");
        System.out.println("| 2.- Editar arma       |");
        System.out.println("| 3.- Eliminar arma     |");
        System.out.println("| 4.- Inventario actual |");
        System.out.println("| 5.- Salir             |");
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
                System.out.println("EDITAR ARMA");
                break;
            case 3:
                System.out.println("ELIMINAR ARMA");
                Arma.eliminarInventario();
                break;
            case 4:
                System.out.println("INVENTARIO ACTUAL");
                Arma.getInventario();
                break;
        }

    }


    }
}