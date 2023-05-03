/*
 d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CursoServicios {

    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos(String[] nombres) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            nombres[i] = leer2.nextLine();
        }
        return nombres;
    }

    public Curso crearCurso() {

        String nombreCurso;
        double cantidadHorasPorDia;
        double cantidadDiasPorSemana;
        char turno;
        double precioPorHoras;
        String[] alumnos;

        System.out.print("Indique el nombre del curso: ");
        nombreCurso = leer.nextLine();
        System.out.print("Indique la cantidad de horas por día: ");
        cantidadHorasPorDia = leer.nextDouble();
        System.out.print("Indique la cantidad de días por semana: ");
        cantidadDiasPorSemana = leer.nextInt();
        System.out.print("Indique el turno (m/t): ");
        turno = leer.next().charAt(0);
        System.out.print("Indique el precio por hora: ");
        precioPorHoras = leer.nextDouble();

        alumnos = cargarAlumnos(new String[5]);

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHoras, alumnos);
    }

    public double calcularGananciaSemanal(Curso curso) {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHoras() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    }
}
