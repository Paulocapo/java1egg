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
public class Ejercicio02 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba un texto:");
                
        String dato= lectura.nextLine();
        String prueba= "eureka";
        boolean esIgual = dato.equals(prueba);
        if (esIgual) {
            System.out.println("Es la correcta");
        } else {
            System.out.println("No era correcto");
        }
                
    }
 
}
