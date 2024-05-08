    package org.armeria;

    import java.util.ArrayList;

    public abstract class Arma {
        private String sn;
        private boolean funcionando;
        private float cal;
        private float precio;
        private int capacidad;
        private String fabricante;
        public static ArrayList <Arma> armeria = new ArrayList<>();


        public abstract void dispara();

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }

        public float getCal() {
            return cal;
        }

        public void setCal(float cal) {
            this.cal = cal;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }
        public static void getArmeria() {
            for (Arma a : armeria){
                System.out.println(armeria.indexOf(a) + "- " + a.toString());
            }
        }

        public static void eliminarArmeria() {
            int menu = 0;
                System.out.println("-------------------------");
                System.out.println("|     ELIMINAR ARMA     |");
                System.out.println("-------------------------");
                System.out.println("| 1.- Eliminar arma     |");
                System.out.println("| 2.-Volver             |");
                System.out.println("-------------------------");
                String opcion = Main.scanner.nextLine();
                menu = Integer.parseInt(opcion);
                switch (menu){
                    case 1:
                        int indice;
                        System.out.println("INDICA QUE ARMA QUIERES ELIMINAR");
                        getArmeria();
                        String seleccion = Main.scanner.nextLine();
                        indice = Integer.parseInt(seleccion);
                        armeria.remove(indice);
                        break;
                    case 2:
                        break;
                }
        }

        public static void setArmeria(ArrayList<Arma> armeria) {
            Arma.armeria = armeria;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public Arma() {
        }

        public Arma(String sn, boolean funcionando, float cal, int capacidad, float precio, String fabricante) {
            this.sn = sn;
            this.funcionando = funcionando;
            this.cal = cal;
            this.capacidad = capacidad;
            this.precio = precio;
            this.fabricante = fabricante;
        }
        public static void menuArma(){
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

                    String nuevaArma = Main.scanner.nextLine();
                    nueva = Integer.parseInt(nuevaArma);
                } catch (Exception e){
                    System.out.println("ha introducido un caracter no valido,\npor favor, introduzca un numero.");
                    continue;
                }
                switch (nueva){
                    case 1:
                        ArmaCorta.anadirArmaCorta();
                        break;
                    case 2:
                        ArmaLarga.anadirArmaLarga();
                        break;
                    case 3:
                        flag = false;
                        break;

                }
            }
        }
    }
