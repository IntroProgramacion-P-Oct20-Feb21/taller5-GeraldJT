/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Variables
        double cantidadR;
        double precioUni;
        double descuento;
        double porcentaje = 15;
        double total;
        // Pido Datos
        System.out.println("Ingresar la cantidad requerida");
        cantidadR = entrada.nextDouble();
        System.out.println("Ingresar el precio unitario");
        precioUni = entrada.nextDouble();
        //Proceso 
        total = precioUni * cantidadR;
        if (cantidadR > 50){
            descuento = (total * porcentaje)/100;
            total = total - descuento; 
        }
        System.out.println("el valor total a pagar es:" + total);
                    
    }
}
