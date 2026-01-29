/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author Lenovo
 */
public class Texto {

    public static void agregarRegistros(String valor, String placa) {
        String i = placa.substring(0, 1);
        i = i.toUpperCase();
        String ruta = "";
        switch (i) {
            case ("L"):
                ruta = "Loja";
                break;
            case ("P"):
                ruta = "Pichincha";
                break;
            case ("G"):
                ruta = "Guayas";
                break;
            default:
                ruta = "varios";
                break;

        }
        ruta = String.format("data/%s.txt", ruta);
        try {
            FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

}
