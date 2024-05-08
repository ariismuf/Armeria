package org.armeria;

public class ArmaLarga extends Arma {
    private float alcance;
    private boolean visor;
    private String cadencia;

    @Override
    public String toString() {
        return "ArmaLarga {" +
                "sn = '" + getSn() + '\'' +
                ", funcionando = " + isFuncionando() +
                ", cal = " + getCal() +
                ", precio = " + getPrecio() + " €" +
                ", capacidad = " + getCapacidad() +
                ", fabricante = '" + getFabricante() + '\'' +
                ", alcance = " + alcance +
                "m , visor = " + visor +
                ", cadencia = '" + cadencia + '\'' +
                '}';
    }

    public void dispara() {
        if (cadencia.equals("repeticion")){
            System.out.println("sonido de disparo: pium (recarga) pium");
        }else if(cadencia.equals("semiautomatica")){
            System.out.println("sonido de disparo: pium pium");
        }else {
            System.out.println("sonido de disparo: prrrrrrrrrrr");
        }
    }

    public ArmaLarga() {
    }

    public ArmaLarga(String sn, boolean funcionando, float cal, int capacidad, float precio, String fabricante, float alcance, boolean visor, String cadencia) {
        super(sn, funcionando, cal, capacidad, precio, fabricante);
        this.alcance = alcance;
        this.visor = visor;
        this.cadencia = cadencia;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }

    public String getCadencia() {
        return cadencia;
    }

    public void setCadencia(String cadencia) {
        this.cadencia = cadencia;
    }

    public static void anadirArmaLarga() {
        ArmaLarga nuevaArmaLarga = new ArmaLarga();
        System.out.println("Arma larga");
        System.out.println("indicar SN");
        String nSerie = Main.scanner.nextLine();
        nuevaArmaLarga.setSn(nSerie);
        int i = 0;
        while (i != 1) {
            System.out.println("El arma funcina? (SI/NO)");
            String estado = Main.scanner.nextLine();
            try {
                if (estado.equals("si")) {

                    nuevaArmaLarga.setFuncionando(Boolean.parseBoolean("true"));
                    i = 1;
                } else if (estado.equals("no")) {
                    nuevaArmaLarga.setFuncionando(Boolean.parseBoolean("false"));
                    i = 1;
                } else {
                    System.out.println("respuesta invalida");
                }


            } catch (Exception e) {
                System.out.println("Respuesta invalida");
            }
        }
            System.out.println("indicar calibre");
            String iCalibre = Main.scanner.nextLine();
            float calibre = Float.parseFloat(iCalibre);
            nuevaArmaLarga.setCal(calibre);

            System.out.println("indicar precio");
            String iPrecio = Main.scanner.nextLine();
            float nPrecio = Float.parseFloat(iPrecio);
            nuevaArmaLarga.setPrecio(nPrecio);

            System.out.println("indicar capacidad");
            String iCapacidad = Main.scanner.nextLine();
            int nCapacidad = Integer.parseInt(iCapacidad);
            nuevaArmaLarga.setCapacidad(nCapacidad);

            System.out.println("indicar fabricante");
            String nFabricante = Main.scanner.nextLine();
            nuevaArmaLarga.setFabricante(nFabricante);

            System.out.println("indicar Alcance");
            String nAlcance = Main.scanner.nextLine();
            float iAlcance = Float.parseFloat(nAlcance);
            nuevaArmaLarga.setAlcance(iAlcance);

            int o = 0;
            while (o != 1) {
                System.out.println("El arma tiene visor? (SI/NO)");
                String mira = Main.scanner.nextLine();
                try {
                    if (mira.equals("si")) {

                        nuevaArmaLarga.setVisor(Boolean.parseBoolean("true"));
                        o = 1;
                    } else if (mira.equals("no")) {
                        nuevaArmaLarga.setVisor(Boolean.parseBoolean("false"));
                        o = 1;
                    } else {
                        System.out.println("respuesta invalida");
                    }

                } catch (Exception e) {
                    System.out.println("Respuesta invalida");
                }

                System.out.println("Que cadencia tiene?");
                String nCadencia = Main.scanner.nextLine();
                nuevaArmaLarga.setCadencia(nCadencia);


                armeria.add(nuevaArmaLarga);
                nuevaArmaLarga.dispara();
            }
    }
}

