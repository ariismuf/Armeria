package org.armeria;

import javax.print.DocFlavor;

public class ArmaCorta extends Arma{
    private boolean tambor;
    private boolean rafaga;

    @Override
    public String toString() {
        return "ArmaCorta{" +
                "sn='" + getSn() + '\'' +
                ", funcionando=" + isFuncionando() +
                ", cal=" + getCal() +
                ", precio=" + getPrecio() +
                ", capacidad=" + getCapacidad() +
                ", fabricante='" + getFabricante() + '\'' +
                ", tambor=" + tambor +
                ", rafaga=" + rafaga +
                '}';
    }


    public ArmaCorta() {
    }


    public ArmaCorta(String sn, boolean funcionando, float cal, float capacidad, float precio, String fabricante, boolean tambor, boolean rafaga) {
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
   public static void anadirArmaCorta(){
       ArmaCorta nuevaArmaCorta = new ArmaCorta();
       System.out.println("Arma corta");
       System.out.println("indicar SN");
       String nSerie = Main.scanner.nextLine();
       nuevaArmaCorta.setSn(nSerie);
       inventario.add(nuevaArmaCorta);
    }
}
