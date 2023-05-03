/*
 Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package entidades;

/**
 *
 * @author Paulo
 */
public class Fraccion {
    private double numerador1;
    private double denominador1;
    private double numerador2;
    private double denominador2;

    public Fraccion() {
    }

    public Fraccion(double numerador1, double denominador1, double numerador2, double denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    public double getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(double numerador1) {
        this.numerador1 = numerador1;
    }

    public double getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(double denominador1) {
        this.denominador1 = denominador1;
    }

    public double getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(double numerador2) {
        this.numerador2 = numerador2;
    }

    public double getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(double denominador2) {
        this.denominador2 = denominador2;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador1=" + numerador1 + ", denominador1=" + denominador1 + ", numerador2=" + numerador2 + ", denominador2=" + denominador2 + '}';
    }
    
    
    
}
