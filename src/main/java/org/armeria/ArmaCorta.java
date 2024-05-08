package org.armeria;

import javax.print.DocFlavor;

public class ArmaCorta extends Arma {
    private boolean tambor;
    private boolean rafaga;

    @Override
    public String toString() {
        return "ArmaCorta {" +
                "sn = '" + getSn() + '\'' +
                ", funcionando = " + isFuncionando() +
                ", cal = " + getCal() +
                ", precio = " + getPrecio() + " €"+
                ", capacidad = " + getCapacidad() +
                ", fabricante = '" + getFabricante() + '\'' +
                ", tambor = " + tambor +
                ", rafaga = " + rafaga +
                '}';
    }

    public void dispara() {
        if (rafaga == true){
            System.out.println("sonido de disparo: prrrr prrrr");
        }else{
            System.out.println("sonido de disparo: pium pium");
        }
    }

    public ArmaCorta() {
    }


    public ArmaCorta(String sn, boolean funcionando, float cal, int capacidad, float precio, String fabricante, boolean tambor, boolean rafaga) {
        super(sn, funcionando, cal, capacidad, precio, fabricante);
        this.tambor = tambor;
        this.rafaga = rafaga;
    }


    public boolean isTambor() {
        return tambor;
    }

    public void setTambor(boolean tambor) {
        this.tambor = tambor;
    }

    public boolean isRafaga() {
        return rafaga;
    }

    public void setRafaga(boolean rafaga) {
        this.rafaga = rafaga;
    }

    public static void anadirArmaCorta() {
        ArmaCorta nuevaArmaCorta = new ArmaCorta();
        System.out.println("Arma corta");
        System.out.println("indicar SN");
        String nSerie = Main.scanner.nextLine();
        nuevaArmaCorta.setSn(nSerie);
        int i = 0;
        while (i != 1) {
            System.out.println("El arma funcina? (SI/NO)");
            String estado = Main.scanner.nextLine();
            try {
                if (estado.equals("si")) {

                    nuevaArmaCorta.setFuncionando(Boolean.parseBoolean("true"));
                    i = 1;
                } else if (estado.equals("no")) {
                    nuevaArmaCorta.setFuncionando(Boolean.parseBoolean("false"));
                    i = 1;
                } else {
                    System.out.println("respuesta invalida");
                }

            } catch (Exception e) {
                System.out.println("Respuesta invalida");
            }
            System.out.println("indicar calibre");
            String iCalibre = Main.scanner.nextLine();
            float calibre = Float.parseFloat(iCalibre);
            nuevaArmaCorta.setCal(calibre);

            System.out.println("indicar precio");
            String iPrecio = Main.scanner.nextLine();
            float nPrecio = Float.parseFloat(iPrecio);
            nuevaArmaCorta.setPrecio(nPrecio);

            System.out.println("indicar capacidad");
            String iCapacidad = Main.scanner.nextLine();
            int nCapacidad = Integer.parseInt(iCapacidad);
            nuevaArmaCorta.setCapacidad(nCapacidad);

            System.out.println("indicar fabricante");
            String nFabricante = Main.scanner.nextLine();
            nuevaArmaCorta.setFabricante(nFabricante);

            int n = 0;
            while (n != 1) {
                System.out.println("El arma tiene tambor? (SI/NO)");
                String nTambor = Main.scanner.nextLine();
                try {
                    if (nTambor.equals("si")) {

                        nuevaArmaCorta.setTambor(Boolean.parseBoolean("true"));
                        n = 1;
                    } else if (nTambor.equals("no")) {
                        nuevaArmaCorta.setTambor(Boolean.parseBoolean("false"));
                        n = 1;
                    } else {
                        System.out.println("respuesta invalida");
                    }

                } catch (Exception e) {
                    System.out.println("Respuesta invalida");
                }
            }

                int o = 0;
                while (o != 1) {
                    System.out.println("El arma tiene rafaga? (SI/NO)");
                    String nRafaga = Main.scanner.nextLine();
                    try {
                        if (nRafaga.equals("si")) {

                            nuevaArmaCorta.setRafaga(Boolean.parseBoolean("true"));
                            o = 1;
                        } else if (nRafaga.equals("no")) {
                            nuevaArmaCorta.setRafaga(Boolean.parseBoolean("false"));
                            o = 1;
                        } else {
                            System.out.println("respuesta invalida");
                        }

                    } catch (Exception e) {
                        System.out.println("Respuesta no valida");
                    }

                }
                armeria.add(nuevaArmaCorta);
                nuevaArmaCorta.dispara();
        }
    }
}