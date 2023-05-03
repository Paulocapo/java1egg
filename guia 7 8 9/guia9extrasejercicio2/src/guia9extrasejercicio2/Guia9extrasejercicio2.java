/*
 */
package guia9extrasejercicio2;

import entidades.ahorcado;
import servicios.ahorcadoServicio;

/**
 *
 * @author Paulo
 */
public class Guia9extrasejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ahorcadoServicio juego = new ahorcadoServicio();
        ahorcado parametros = new ahorcado();
        parametros = juego.crearJuego();

        do {
            juego.mostrarLongitud(parametros);
            juego.encontradas(parametros);
            juego.intentos(parametros);
            if (parametros.getCantLetrasEncontradas() == parametros.getLongitud()) {
                System.out.println("¡Has ganado!");
                parametros.setCantJugadasMaximas(0);
                break;
            }
            if (parametros.getCantJugadasMaximas() == 0) {
                System.out.println("Lo siento te has quedado sin intentos.");
            }
        } while (parametros.getCantJugadasMaximas() > 0);

        System.out.println("Fin del programa.");

    }
}
