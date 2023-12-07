import java.util.Scanner;
public class Menu {
    public static void menu(ListaAeropuerto listaAeropuerto, ListaVuelos listaVuelos){
        Output output = new Output();
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar el listado de Aeropueros.");
            System.out.println("2. Mostrar el listado de las salidas por cada Aeropuerto.");
            System.out.println("3. Mostrar el listado de las entradas por cada Aeropuerto.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            System.out.println(" ");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:
                    output.listaAeropuertos(listaAeropuerto);
                    break;
                case 2:
                    output.listaSalidas(listaVuelos, listaAeropuerto);
                    break;
                case 3:
                    output.listaEntradas(listaVuelos, listaAeropuerto);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Seleccione un número de 1 al 4: ");
                    System.out.println(" ");
                    break;
            }
        } while (opc != 4);
        scanner.close();
    }
}