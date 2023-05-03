/*
 * Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package guia7ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Circunferencia {
    private Double radio;

    public Circunferencia() {
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio = leer.nextDouble();
    }
    
    public void area(){
        double area = Math.PI*(radio*radio);
        System.out.println("El area es: " + area);
    }
    
    public void perimetro(){
        double perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro es: " + perimetro);
    }
}


