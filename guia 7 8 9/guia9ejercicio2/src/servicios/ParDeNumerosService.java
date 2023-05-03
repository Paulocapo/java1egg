/*
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author Paulo
 */
public class ParDeNumerosService {

    ParDeNumeros p1 = new ParDeNumeros();

    public void mostrarValores() {
        System.out.println(" El primer numero guardado es: " + p1.getNumero1());
        System.out.println(" El segundo numero guardado es: " + p1.getNumero2());
    }

    public double devolverMayor() {
        if (p1.getNumero1() >= p1.getNumero2()) {
            return p1.getNumero1();
        } else {
            return p1.getNumero2();
        }
    }

    public void calcularPotencia() {
        double resultado;
        if (p1.getNumero1() > p1.getNumero2()) {
            resultado = Math.pow(p1.getNumero1(), p1.getNumero2());
        } else {
            resultado = Math.pow(p1.getNumero2(), p1.getNumero1());
        }
        System.out.println("La potencia es : " + Math.round(resultado));
    }

    public void calculaRaiz() {
        //Math.min() se utiliza para obtener el valor absoluto y calcular el menor de los dos valores.
        //Math.abs() para obtener el valor absoluto de ambos números
        //Math.sqrt() Calcular la raíz cuadrada
        double menorNumero = Math.min(Math.abs(p1.getNumero1()), Math.abs(p1.getNumero2()));
        double resultado = Math.sqrt(menorNumero);
        System.out.println("La Raiz es : " + resultado);
    }
}
