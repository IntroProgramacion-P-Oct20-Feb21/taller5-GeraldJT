/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //Variables
        double costoK;
        double consumidosK;
        double total;
        double descuento;
        double porcentaje = 10;
        int edad;
        //Pido Datos
        System.out.println("Ingresar el costo de kilovatios por hora");
        costoK = entrada.nextDouble();
        System.out.println("Ingresar el total de kilovatios consumidos al mes");
        consumidosK = entrada.nextDouble();
        System.out.println("Ingresar la edad del usuario");
        edad = entrada.nextInt();
        //Proceso
        total = costoK * consumidosK;
        if (edad > 65){
            descuento = (total * porcentaje)/100;
            total = total - descuento;            
       }
        System.out.println("El valor total a pagar es:" + total);
            
    }
     
}
