/*
Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
 */
package guia11ejercicio1;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Paulo
 */
public class Guia11ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perro p1 = new Perro( "pichu","bullterrier", 4 ,"Mediano");
        Perro p2 = new Perro( "fer","chiquito", 1 ,"Chico");
        
        Persona per1 = new Persona("Juan", "Rodriguez", 26310399, 45 , p2);
        Persona per2 = new Persona("Marta", "Sanchez", 17896543, 16 , p1);
        
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        
    }
    
}
