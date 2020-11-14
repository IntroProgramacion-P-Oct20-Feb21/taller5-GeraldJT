/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //Variables
        String marca;
        String origen;
        double costo;
        double impuesto;
        double total;
        double porcentajeAl = 20;
        double porcentajeJap = 30;
        double porcentajeIta = 15;
        double porcentajeUS = 8;
        //Pido Datos
        System.out.println("Ingresar la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingresar el origen del automóvil");
        origen = entrada.nextLine();
        System.out.println("Ingresar el costo del automóvil");
        costo = entrada.nextDouble();
        // Proceso
        if (origen.equals("Alemania")){
            impuesto = (costo * porcentajeAl)/100;
            total = costo + impuesto;
            System.out.printf("El valor del impusto total a pagar es:%s\n"
                 +"El valor total de venta es: %s\n", impuesto, total);
        }else{
            
            if (origen.equals("Japon")){
                impuesto = (costo * porcentajeJap)/100;
                total = costo + impuesto;
                
                System.out.printf("El valor del impusto total a pagar es:%s\n"
                 +"El valor total de venta es: %s\n", impuesto, total);
            }else{
                
                if (origen.equals("Italia")){
                    impuesto = (costo * porcentajeIta);
                    total = costo + impuesto;
                 System.out.printf("El valor del impusto total a pagar es:%s\n"
                 +"El valor total de venta es: %s\n", impuesto, total);
                }else{
                    
                    if (origen.equals("USA")){
                        impuesto = (costo * porcentajeUS)/100;
                        total = costo + impuesto; 
                  System.out.printf("El valor del impusto total a pagar es:%s\n"
                 +"El valor total de venta es: %s\n", impuesto, total);
                    }else{
                  System.out.println("El origen del vehículo no es válido");
                    }
                }
        
            }
        } 
    }
}

