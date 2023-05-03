/*
 Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CafeteraServicio {

    public Cafetera llenarCafereta() {
        double capacidadMaxima = 1000;
        double capacidadActual = 1000;
        return new Cafetera(capacidadMaxima, capacidadActual);
    }

    public void servirTaza(Cafetera capacidadActual) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int tamanotaza;
        System.out.println("Ingrese el tamaño de la taza: ");
        tamanotaza = leer.nextInt();
        double capacidad = capacidadActual.getCapacidadActual();
        if (capacidad > tamanotaza) {
            capacidadActual.setCapacidadActual(capacidadActual.getCapacidadActual() - tamanotaza);
        } else {
            System.out.println("No hay suficiente para llenar la taza");
        }
    }

    public void vaciarCafetera(Cafetera capacidadActual) {
        capacidadActual.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera capacidadActual) {
        Scanner leer = new Scanner(System.in);
        int ingreso;
        System.out.println("Cuanto cafe Ingresa ? ");
        ingreso = leer.nextInt();
        capacidadActual.setCapacidadActual(capacidadActual.getCapacidadActual() + ingreso);
    }
}
