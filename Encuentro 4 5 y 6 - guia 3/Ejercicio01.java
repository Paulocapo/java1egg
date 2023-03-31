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
public class Ejercicio01 {
    public static void main(String[] args) {
        
        int num1 = 0;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escriba un número:");
        num1 = leer.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es impar");
        }
    }
}
