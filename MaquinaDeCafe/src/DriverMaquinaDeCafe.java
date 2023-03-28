import java.util.Scanner;
public class DriverMaquinaDeCafe {
    public static void main(String[] args) {
        maquinaDeCafe MaquinaDeCafe1 = new maquinaDeCafe(5000, 1000, 1500, 50);
        Scanner scanner=new Scanner(System.in);
        System.out.println("La maquina esta lista para usarse");
        MaquinaDeCafe1.mostrarCantidades();

        while (true) {
            System.out.println("Que bebida deseas" + '\n' + "1.-Americano" + '\n' + "2.-Expreso" + '\n' + "3.-Capuchino" + '\n'+"0.-Salir");
            int opcion=scanner.nextInt();


            switch (opcion) {
                case 1:
                if (MaquinaDeCafe1.checarmateriales(180, 15, 0)) {
                    MaquinaDeCafe1.prepararAmericano();
                    MaquinaDeCafe1.mostrarCantidades();
                }else {
                    System.out.println("La máquina de café se ha quedado sin recursos.");
                    MaquinaDeCafe1.mostrarCantidades();
                }
                break;
                case 2:
                if(MaquinaDeCafe1.checarmateriales(120, 20, 0)) {
                    MaquinaDeCafe1.prepararExpreso();
                    MaquinaDeCafe1.mostrarCantidades();
                } else {
                    System.out.println("La máquina de café se ha quedado sin recursos.");
                    MaquinaDeCafe1.mostrarCantidades();
                }
                break;
                case 3:
                 if(MaquinaDeCafe1.checarmateriales(100, 14, 70)) {
                    MaquinaDeCafe1.preparaCapuchino();
                    MaquinaDeCafe1.mostrarCantidades();
                } else {
                     System.out.println("La máquina de café se ha quedado sin recursos.");
                     MaquinaDeCafe1.mostrarCantidades();
                 }
                 break;
                case 0:
                    System.out.println("Saliendo de la máquina de café.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }
        }
    }
}
