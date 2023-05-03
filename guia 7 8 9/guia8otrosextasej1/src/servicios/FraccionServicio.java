/*
 Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package servicios;

import entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class FraccionServicio {
    Fraccion f1 = new Fraccion();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fraccion crearFraccion(){
        System.out.println("Ingrese el numerador de la fraccion 1:");
        f1.setNumerador1(leer.nextDouble());
        System.out.println("Ingrese el denominador de la fraccion 1:");
        f1.setDenominador1(leer.nextDouble());
        System.out.println("Ingrese el numerador de la fraccion 2:");
        f1.setNumerador2(leer.nextDouble());
        System.out.println("Ingrese el denominador de la fraccion 2:");
        f1.setDenominador2(leer.nextDouble());
        
        return f1;
    }
}
