/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class PersonaServicio {

    public boolean esMayorDeEdad( Persona per1) {
        int verificar = per1.getEdad();

        if (verificar > 17) {
           return true;
        }
        else{
            return false;
    }
    }
    public Persona crearPersona() {
        Persona per1 = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre de la persona: ");
//        String nombre = leer.next();
        per1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
//        int edad = leer.nextInt();
        per1.setEdad(leer.nextInt());
        boolean validar = false;

        do {
            System.out.println("Ingrese el sexo: (h,m,o): ");
            String sexo = leer.next().toLowerCase();
            if (sexo.equals("h") || sexo.equals("m") || sexo.equals("o")) {
                per1.setSexo(sexo);
                validar = true;
            }
        } while (!validar);

        System.out.println(" Ingrese el peso: ");
        per1.setPeso(leer.nextDouble());
//        double peso = leer.nextDouble();
        System.out.println("Ingresa la altura: ");
        per1.setAltura(leer.nextDouble());
//        double altura = leer.nextDouble();
        return per1;
    }

    public int calcularIMC(Persona per1) {
        double IMC = per1.getPeso() / Math.pow(per1.getAltura(), 2);

        if (IMC < 20) {
            return -1;
        } else if (IMC < 26) {
            return 0;

        } else {
            return 1;
        }
    }
    
}
