/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class personaServicio {

    //a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public static Persona crearPersona() {
        Scanner scan = new Scanner(System.in);

        String Nombre;
        int dia, mes, anio;

        System.out.print("Indique el nombre completo de la persona: ");
        Nombre = scan.nextLine();

        System.out.println("Ingrese la fecha de nacimiento.");
        System.out.print("Día: ");
        dia = scan.nextInt();
        System.out.print("Mes: ");
        mes = scan.nextInt();
        System.out.print("Año: ");
        anio = scan.nextInt();

        /*
			anio - 1900 es requisito porque así está implementada la clase
			mes - 1 es más de lo mismo: los mese van de 0 a 11
         */
        return new Persona(Nombre, new Date(anio - 1900, mes - 1, dia));
    }

    //b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public static int calcularEdad(Persona p) {

        //Esto crea un objeto Date con los valores de "ahora".
        Date fa = new Date();

        //Calculamos cuál sería la edad si la persona ya cumplió los años
        int edad = fa.getYear() - p.getFechaNacimiento().getYear();

        //Si el mes actual es menor que el de nacimiento, o si es el mismo pero lo que es menor es el día, se resta 1 a la edad (aún no cumplió años).
        if (Integer.compare(fa.getMonth(), p.getFechaNacimiento().getMonth()) < 0 || (Integer.compare(fa.getMonth(), p.getFechaNacimiento().getMonth()) == 0 && Integer.compare(fa.getDate(), p.getFechaNacimiento().getDate()) < 0)) {
            edad--;
        }
        return edad;
    }

    //c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    public static boolean menorQue(Persona p, int edad) {
        //Solo uso este tipo de comparación para darle uso a la clase Integer...
        return Integer.compare(calcularEdad(p), edad) < 0;
    }

    //d) Método mostrarPersona que muestra la información de la persona deseada.
    public static void showPersonInfo(Persona p) {
        System.out.printf("Nombre: %s\nFecha de nacimiento: %d/%d/%d\n", p.getNombre(), p.getFechaNacimiento().getDate(), p.getFechaNacimiento().getMonth() + 1, p.getFechaNacimiento().getYear());
    }
}
