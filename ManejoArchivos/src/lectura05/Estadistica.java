/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Estadistica {

    public static double sacarPromedio() {
        double sum = 0;
        int contador = 0;
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                try {
                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    ArrayList<String> linea_partes = new ArrayList<>(lista);

                    if (linea_partes.size() < 5) {
                        throw new Exception("Línea incompleta");
                    }
                    double empl = Double.parseDouble(linea_partes.get(2));

                    sum = sum + empl;
                    contador = contador + 1;
                } catch (Exception e) {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
            return 0;
        }

        if (contador == 0) {
            return 0;
        }
        double promedio;
        promedio = (double) sum / contador;

        promedio = Math.round(promedio);

        return promedio;
    }
}
