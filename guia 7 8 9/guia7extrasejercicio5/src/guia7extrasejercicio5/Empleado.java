/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia7extrasejercicio5;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        this.nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario actual: ");
        this.salario = leer.nextDouble();

        if (this.edad > 30) {
            System.out.println(this.nombre + " el aumento de salario que le corresponde por su edad es:$  "
                    + (this.salario * 0.10) + "\nPor lo tanto su salario con el aumento es de: $  "
                    + (this.salario + (this.salario * 0.10)));

        } else {
            System.out.println(this.nombre + " el aumento de salario que le corresponde por su edad es:$  "
                    + (this.salario * 0.05) + "\nPor lo tanto su salario con el aumento es de: $  "
                    + (this.salario + (this.salario * 0.05)));
        }

    }
}
