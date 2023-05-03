/*
 A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package guia8ejercicio31mal;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Paulo
 */
public class Guia8ejercicio31mal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio perser1 = new PersonaServicio();

        Persona[] p = new Persona[4];
        double maedad = 0, meedad = 0, bajopeso = 0, pesoideal = 0, sobrepeso = 0;
        int[] vectorimc = new int[4];
        boolean[] vectormayo = new boolean[4];

        for (int i = 0; i < 4; i++) {
            p[i] = perser1.crearPersona();
            if (perser1.esMayorDeEdad(p[i]) == true) {
                System.out.println("Es mayor de Edad ");
                maedad++;
                vectormayo[i] = perser1.esMayorDeEdad(p[i]);

            } else {
                System.out.println("No es Mayor de Edad");
                meedad++;
            }
            switch (perser1.calcularIMC(p[i])) {
                case -1:
                    System.out.println("Esta debajo de su peso ideal");
                    bajopeso++;
                    vectorimc[i] = perser1.calcularIMC(p[i]);

                    break;
                case 0:
                    System.out.println("Esta en su peso ideal");
                    pesoideal++;
                    vectorimc[i] = perser1.calcularIMC(p[i]);
                    break;
                case 1:
                    System.out.println(" La persona tiene sobrepeso ");
                    sobrepeso++;
                    vectorimc[i] = perser1.calcularIMC(p[i]);
                    break;
            }
        }
        System.out.println("porcentaje mayor de edad: " + (maedad / 4));
        System.out.println("porcentaje menor de edad: " + (meedad / 4));
        System.out.println("porcentaje bajo peso: " + (bajopeso / 4));
        System.out.println("porcentaje peso ideal: " + (pesoideal / 4));
        System.out.println("porcentaje sobrepeso: " + (sobrepeso / 4));

        System.out.println("El valor del vector IMC es: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + vectorimc[i] + "]");
        }
        System.out.println(" ");
        System.out.println("El valor del vector es es mayor de edad: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + vectormayo[i] + "]");
        }
    }
}
