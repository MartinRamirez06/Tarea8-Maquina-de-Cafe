public class maquinaDeCafe {
    private int cantidadDeAgua;
    private int cantidadDeCafe;
    private int cantidadDeCrema;
    private int cantidadDeVasosTermicos;

    public maquinaDeCafe() {
    }

    public maquinaDeCafe(int cantidadDeAgua, int cantidadDeCafe, int cantidadDeCrema, int cantidadDeVasosTermicos) {
        this.cantidadDeAgua = 5000;
        this.cantidadDeCafe = 1000;
        this.cantidadDeCrema = 1500;
        this.cantidadDeVasosTermicos = 50;
    }

    public int getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(int cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public int getCantidadDeCafe() {
        return cantidadDeCafe;
    }

    public void setCantidadDeCafe(int cantidadDeCafe) {
        this.cantidadDeCafe = cantidadDeCafe;
    }

    public int getCantidadDeCrema() {
        return cantidadDeCrema;
    }

    public void setCantidadDeCrema(int cantidadDeCrema) {
        this.cantidadDeCrema = cantidadDeCrema;
    }

    public int getCantidadDeVasosTermicos() {
        return cantidadDeVasosTermicos;
    }

    public void setCantidadDeVasosTermicos(int cantidadDeVasosTermicos) {
        this.cantidadDeVasosTermicos = cantidadDeVasosTermicos;
    }

    @Override
    public String toString() {
        return "maquinaDeCafe{" +
                "cantidadDeAgua=" + cantidadDeAgua +
                ", cantidadDeCafe=" + cantidadDeCafe +
                ", cantidadDeCrema=" + cantidadDeCrema +
                ", cantidadDeVasosTermicos=" + cantidadDeVasosTermicos +
                '}';
    }

    public boolean checarmateriales(int aguaNesesaria, int cafeNecesario, int cremaNecesaria){
        return (this.cantidadDeAgua>=aguaNesesaria && this.cantidadDeCafe>=cafeNecesario && this.cantidadDeCrema>=cremaNecesaria && this.cantidadDeVasosTermicos>0);
    }
    public void prepararAmericano() {
        if (checarmateriales(180, 15, 0)) {
            this.cantidadDeAgua -= 180;
            this.cantidadDeCafe -= 15;
            this.cantidadDeVasosTermicos--;
            System.out.println("Tu Americano esta servido." + '\n' + "Quedan " + cantidadDeVasosTermicos + " Vasos.");
        }
    else {
            System.out.println("No se ha podido servir tu cafe porque ya no hay materiales necesarios");
        }
    }

    public void prepararExpreso() {
            if (checarmateriales(120, 20, 0)) {
                this.cantidadDeAgua -= 120;
                this.cantidadDeCafe -= 20;
                this.cantidadDeVasosTermicos--;
                System.out.println("Tu Expreso esta servido." + '\n' + "Quedan " + cantidadDeVasosTermicos + " Vasos.");
            } else {
                System.out.println("No se ha podido servir tu cafe porque ya no hay materiales necesarios");
            }
        }
    public void preparaCapuchino(){
                if (checarmateriales(100,14,70)){
                this.cantidadDeAgua -=100;
                this.cantidadDeCafe -=14;
                this.cantidadDeCrema -=70;
                this.cantidadDeVasosTermicos--;
                    System.out.println("Tu Capuchino esta servido"+'\n'+"Quedan "+ cantidadDeVasosTermicos + " Vasos.");
                }else {
                    System.out.println("No se ha podido servir tu cafe porque ya no hay materiales necesarios");
                }

            }
     public void mostrarCantidades(){
         System.out.println("Cantidad de Recursos actuales");
         System.out.println("Agua: "+cantidadDeAgua +"ml");
         System.out.println("Cafe: "+cantidadDeCafe +"gr");
         System.out.println("Crema: "+cantidadDeCrema+"ml");
         System.out.println("Vasos:"+cantidadDeVasosTermicos);
     }

}



