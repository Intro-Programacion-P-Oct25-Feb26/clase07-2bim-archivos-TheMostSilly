/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import escritura03.CrearArchivoTexto;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        boolean sal = true;
        int x;

        while (sal) {
            String cadenaFinal = "";
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la placa del vehículo");
            String placa = entrada.nextLine();
            System.out.println("Ingrese la marca de su carro");
            String marca = entrada.nextLine();
            
            System.out.println("Ingresar 0 si terminaste de añadir datos");
            x = entrada.nextInt();
            entrada.nextLine();
            if (x!=0){
                
            }else{
                sal = false;
            }

            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    nombre,
                    placa, marca);
            Texto.agregarRegistros(cadenaFinal, placa);
        }
        

    } // fin de main
}

       
            
    

