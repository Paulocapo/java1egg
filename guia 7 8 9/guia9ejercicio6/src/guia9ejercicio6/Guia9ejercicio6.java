/*
 Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
 */
package guia9ejercicio6;

import entidades.Curso;
import servicios.CursoServicios;

/**
 *
 * @author Paulo
 */
public class Guia9ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicios cs = new CursoServicios();
        Curso curso = cs.crearCurso();
        System.out.print("Ganancias por semana: " + cs.calcularGananciaSemanal(curso) + "\n\n");
    }
}
