package org.armeria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                int nueva = 0;
                boolean flag = true;
                while (flag != false){
                    System.out.println("-------------------------");
                    System.out.println("|       AÑADIR ARMA     |");
                    System.out.println("-------------------------");
                    System.out.println("| 1.- Arma corta        |");
                    System.out.println("| 2.- Arma larga        |");
                    System.out.println("| 3.- Vovler            |");
                    System.out.println("-------------------------");
                    try {

                        String nuevaArma = scanner.nextLine();
                        nueva = Integer.parseInt(nuevaArma);
                    } catch (Exception e){
                        System.out.println("ha introducido un caracter no valido,\npor favor, introduzca un numero.");
                        continue;
                    }
                    switch (nueva){
                        case 1:
                            System.out.println("ARMA CORTA");
                            break;
                        case 2:
                            System.out.println("ARMA LARGA");
                            break;
                        case 3:
                            flag = false;
                            break;

                    }
                }
                break;
            case 2:
                System.out.println("EDITAR ARMA");
                break;
            case 3:
                System.out.println("ELIMINAR ARMA");
                break;
            case 4:
                System.out.println("INVENTARIO ACTUAL");
                break;
        }

    }


    }
}