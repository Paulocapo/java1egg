/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package guia11extrasejercicio1;

import Servicios.Adopcion;
import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Guia11extrasejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perroLista = new ArrayList();
        ArrayList<Persona> personaLista = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Boolean seguir = true;
        Adopcion ad1 = new Adopcion();

        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 - Cargar Perros: ");
            System.out.println("2 - Cargar Personas: ");
            System.out.println("3 - Mostrar Perros: ");
            System.out.println("4 - Mostrar Personas: ");
            System.out.println("5 - Listar persona para ver que perro desea Adoptar: ");
            System.out.println("6 - Pedir persona para ver que perro adoptar: ");
            System.out.println("7 - Mostrar Personas con Perros: ");
            System.out.println("8 - Salir ");

            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ad1.cargarPerro(perroLista);
                    break;
                case 2:
                    ad1.cargarPersona(personaLista);
                    break;
                case 3:
                    ad1.mostrarListaPerros(perroLista);
                    break;
                case 4:
                    ad1.mostrarListaPersonas(personaLista);
                    break;
                case 5:
                    ad1.adoptarPerro(personaLista, perroLista);
                    break;
                case 6:
                    ad1.adoptarPerroPidiendoPersona(personaLista, perroLista);
                    break;
                case 7:
                    ad1.mostrarListaPersonasConPerros(personaLista);
                    break;
                case 8:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (seguir);

    }
}
