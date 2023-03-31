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
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Escribe los datos del limite");
        int limite = datos.nextInt();
        int cuenta=0;
        while (cuenta < limite ){
            System.out.println("Numero a sumar:");
            cuenta += datos.nextInt();
        }
        System.out.println("Supero el limite de "+ limite);
    }
}
