/*
 */
package servicios;

import entidades.ahorcado;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class ahorcadoServicio {
    Scanner leer = new Scanner(System.in);

    public ahorcado crearJuego() {
        /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
        Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
        en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que 
        ingresó el usuario.*/
        ahorcado ahorcado1 = new ahorcado();
        String palabra;//Definimos una variable palabra.
        System.out.println("Ingrese la palabra.");
        palabra = leer.next();
        char[] letras = new char[palabra.length()]; //Definimos un vector de letras.
        ahorcado1.setLongitud(palabra.length()); //Seteamos la longitud
        for (int i = 0; i < ahorcado1.getLongitud(); i++) {
            letras[i] = palabra.charAt(i); //Asiganmos cada letra de la palabra a una posición del vector.
        }
        ahorcado1.setLetras(letras); //Seteamos la palabra
        System.out.println("Ingrese la cantidad de jugadas máximas.");
        ahorcado1.setCantJugadasMaximas(leer.nextInt()); //Seteamos la cantidad de jugadas máx.

        return ahorcado1;
    }

    public void mostrarLongitud(ahorcado ahorcado1) {
        /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el 
        vector.length.*/
        System.out.println("La longitud de la palabra a buscar es de " + ahorcado1.getLongitud() + " letras.");
    }

    public int buscarLetra(ahorcado ahorcado1) {
        /*Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra 
        ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
        int contador = 0;
        char letra;
        char[] letras = new char[ahorcado1.getLongitud()];
        letras = ahorcado1.getLetras();
        System.out.println("Ingrese una letra.");
        letra = leer.next().charAt(0);
        for (int i = 0; i < ahorcado1.getLongitud(); i++) {
            if (letra == letras[i]) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("La letra ingresada es parte de la palabra buscada.");
        } else {
            System.out.println("La letra ingresada no es parte de la palabra buscada.");
        }
        return contador;
    }

    public boolean encontradas(ahorcado ahorcado1) {
        /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas 
        letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si 
        la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no 
        esté, se le restará uno a sus oportunidades.*/
        int contador = buscarLetra(ahorcado1);
        ahorcado1.setCantLetrasEncontradas(contador + ahorcado1.getCantLetrasEncontradas()); //Seteamos cantidad de lentras encontradas
        int faltantes = ahorcado1.getLongitud() - ahorcado1.getCantLetrasEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado1.getCantLetrasEncontradas() + "," + faltantes + ")");

        if (contador > 0) {
            return true;
        } else {
            ahorcado1.setCantJugadasMaximas(ahorcado1.getCantJugadasMaximas() - 1);
            return false;
        }
    }

    public int intentos(ahorcado ahorcado1) {
        System.out.println("Número de oportunidades restantes: " + ahorcado1.getCantJugadasMaximas());
        return ahorcado1.getCantJugadasMaximas();
    }
}
