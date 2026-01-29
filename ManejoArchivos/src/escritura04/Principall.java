package escritura04;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Principall {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        for (int i = 1; i < 4; i++) {
            cadenaFinal = "";
            System.out.println("Ingrese su cédula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo");
            String correo = entrada.nextLine();

            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    cedula,
                    nombre, correo);
            Secundaria.agregarRegistros(cadenaFinal, cedula);
        }

    } // fin de main
}
