package org.armeria;

public class Mira extends Inventario{
    private String  aumento;
    private String tipoMira;
    private boolean bateria;

    @Override
    public String toString() {
        return "Mira{" +
                "marca ='" + getMarca() + '\'' +
                ", unidades =" + getUd() +
                ", tipo ='" + getTipo() + '\'' +
                "aumento ='" + aumento + '\'' +
                ", tipoMira ='" + tipoMira + '\'' +
                ", bateria =" + bateria +
                '}';
    }

    public Mira() {
    }

    public Mira(String marca, String tipo, int ud, String aumento, String tipoMira, boolean bateria) {
        super(marca, tipo, ud);
        this.aumento = aumento;
        this.tipoMira = tipoMira;
        this.bateria = bateria;
    }

    public String getAumento() {
        return aumento;
    }

    public void setAumento(String aumento) {
        this.aumento = aumento;
    }

    public String getTipoMira() {
        return tipoMira;
    }

    public void setTipoMira(String tipoMira) {
        this.tipoMira = tipoMira;
    }

    public boolean isBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public static void anadirMira(){
        Mira nuevaMira = new Mira();
        System.out.println("Añadir mira");
        System.out.println("Indicar marca");
        String marca = Main.scanner.nextLine();
        nuevaMira.setMarca(marca);

        System.out.println("indicar la cantidad de paquetes");
        String nUnidades = Main.scanner.nextLine();
        int unidades = Integer.parseInt(nUnidades);
        nuevaMira.setUd(unidades);

        System.out.println("Indica el tipo de arma (Corta/Larga)");
        String tipo = Main.scanner.nextLine();
        nuevaMira.setTipo(tipo);

        System.out.println("Indicar el aumento");
        String aumento = Main.scanner.nextLine();
        nuevaMira.setAumento(aumento);

        System.out.println("Indicar el tipo de mira");
        String tipoMira = Main.scanner.nextLine();
        nuevaMira.setTipoMira(tipoMira);

        int n = 0;
        while (n != 1) {
            System.out.println("indicar si la mira utiliza baterias (SI/NO)");
            String uso = Main.scanner.nextLine();
            try {
                if (uso.equals("si")) {

                    nuevaMira.setBateria(Boolean.parseBoolean("true"));
                    n = 1;
                } else if (uso.equals("no")) {
                    nuevaMira.setBateria(Boolean.parseBoolean("false"));
                    n = 1;
                } else {
                    System.out.println("respuesta invalida");
                }

            } catch (Exception e) {
                System.out.println("Respuesta invalida");
            }
        }
        inventario.add(nuevaMira);
    }
}
