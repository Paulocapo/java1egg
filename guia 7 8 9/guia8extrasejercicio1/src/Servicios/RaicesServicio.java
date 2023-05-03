/*
 a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class RaicesServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC());
    }

    public static boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public static boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public static void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            double discriminante = Math.sqrt(getDiscriminante(raices));
            double raiz1 = (-raices.getB() + discriminante) / (2 * raices.getA());
            double raiz2 = (-raices.getB() - discriminante) / (2 * raices.getA());
            System.out.println("Las dos raíces son: " + raiz1 + " y " + raiz2);
        }
    }

    public static void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double raiz = -raices.getB() / (2 * raices.getA());
            System.out.println("La única raíz es: " + raiz);
        }
    }

    public static void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay solución real para esta ecuación.");
        }
    }

}
