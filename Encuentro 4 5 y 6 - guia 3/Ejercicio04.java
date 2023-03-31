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
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner frase=new Scanner(System.in);
        
        System.out.println("Escribe algo:");
        String letra = frase.nextLine();
        
        if (letra.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
