/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosService;

/**
 *
 * @author Paulo
 */
public class Guia9ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService p1 = new ParDeNumerosService();
//        ParDeNumeros pa1 = new ParDeNumeros();
        p1.mostrarValores();
        System.out.println(p1.devolverMayor());
        
        
    }
    
}
