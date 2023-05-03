/*
 */
package guia8ejercicio2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Guia8ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafetera1 = new CafeteraServicio();
        String seguir;
        Cafetera c1 = cafetera1.llenarCafereta();
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("BIENVENIDO ! a Nexpreso");

        System.out.println("Ingrese una opcion : \n"
                + "OPCION 1 = Llenar cafetera \n"
                + "OPCION 2 = Servir taza \n"
                + "OPCION 3 = Vaciar cafetera \n"
                + "OPCION 4 = Agregar cafe \n"
        );
        int var = leer.nextInt();
        switch (var) {
            case 1:
                cafetera1.llenarCafereta();
                break;
            case 2:
                cafetera1.servirTaza(c1);
                break;
            case 3:
                cafetera1.vaciarCafetera(c1);
                break;
            case 4:
                cafetera1.agregarCafe(c1);
                break;
        }
            System.out.println("Volver al menu s/n: ");
            seguir = leer.next().toLowerCase();
        } while (seguir.equals("s"));

    }
}