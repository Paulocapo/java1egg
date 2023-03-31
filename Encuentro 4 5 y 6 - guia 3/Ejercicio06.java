/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg003.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner opciones = new Scanner(System.in);
        double num1;
        double num2;
        int bandera = 0;
        String salida = "";
        
        System.out.println("Ingrese dos números:");

        num1 = opciones.nextDouble();
        num2 = opciones.nextDouble();

        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            bandera = opciones.nextInt();
            switch (bandera) {
                case 1:
                    System.out.println("El resultado es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Su resultado es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La operación da: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Su operación da: "+(num1/num2));
                    break;
                    default:
                        System.out.println("Opción invalida");
                    
            }
            if (bandera == 5) {
                do {
                System.out.println("¿Desea (S)alir?");
                salida = opciones.next().toLowerCase();
                } while (!"s".equals(salida));
            }
            
        }  while (bandera != 5 );      
        System.out.println("Saliendo...");
    
    }
}