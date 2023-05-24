/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio2;

/**
 *
 * @author Paulo
 */
import entidades.Juego;

/**
 *
 * @author no_de
 */
public class Guia11ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Juego game = new Juego();

        game.llenarJuego();
        game.ronda();

    }

}
