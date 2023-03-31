/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg003.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Clase003Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        Scanner data = new Scanner(System.in);
        System.out.println("Escriba un número:");
                
        for (int i = 0; i!=4; i++) {
        num1 = data.nextInt();
            System.out.print(num1 + " ");
            for (int j = 0 ;!(j == num1);j++) {
             System.out.print('*');
            }
            System.out.println("");
        }
        
        
    }
}
