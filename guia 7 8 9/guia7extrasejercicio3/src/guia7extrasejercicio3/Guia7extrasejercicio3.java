/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extrasejercicio3;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Guia7extrasejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer4 = new Scanner(System.in);
        Juego ju1 = new Juego();
        String seguir = "";

        do {
            ju1.iniciar_juego();

            System.out.println("Desea seguir jugando: s / n ");
            seguir = leer4.next().toLowerCase();
        } while (seguir.equals("s"));

        System.out.println("el jugador 1 gano: " + ju1.getGanador1() + " veces ");
        System.out.println("el jugador 1 tuvo: " + ju1.getIntentos1() + " intentos ");
        System.out.println("el jugador 2 gano: " + ju1.getGanador2() + " veces ");
        System.out.println("el jugador 2 tuvo: " + ju1.getIntentos2() + " intentos ");

    }

}
