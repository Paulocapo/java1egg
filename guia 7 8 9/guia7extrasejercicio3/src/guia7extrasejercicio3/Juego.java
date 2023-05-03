/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package guia7extrasejercicio3;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Juego {

    private double num1;
    private double num2;
    private double adi1;
    private double adi2;
    private int ganador1;
    private int ganador2;
    private int intentos1;
    private int intentos2;

    public Juego() {
    }

    public Juego(double num1, double num2, double adi1, double adi2) {
        this.num1 = num1;
        this.num2 = num2;
        this.adi1 = adi1;
        this.adi2 = adi2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getAdi1() {
        return adi1;
    }

    public void setAdi1(double adi1) {
        this.adi1 = adi1;
    }

    public double getAdi2() {
        return adi2;
    }

    public void setAdi2(double adi2) {
        this.adi2 = adi2;
    }

    public int getGanador1() {
        return ganador1;
    }

    public void setGanador1(int ganador1) {
        this.ganador1 = ganador1;
    }

    public int getGanador2() {
        return ganador2;
    }

    public void setGanador2(int ganador2) {
        this.ganador2 = ganador2;
    }

    public int getIntentos1() {
        return intentos1;
    }

    public void setIntentos1(int intentos1) {
        this.intentos1 = intentos1;
    }

    public int getIntentos2() {
        return intentos2;
    }

    public void setIntentos2(int intentos2) {
        this.intentos2 = intentos2;
    }

    public void iniciar_juego() {
        int cont1 = 0;
        int cont2 = 0;
        String seguir = "";

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
       

        System.out.println("Ingrese el numero jugador uno: ");
        num1 = leer.nextInt();
        do {
            System.out.println("Ingrese el numero para adivinar jugador dos: ");
            adi1 = leer2.nextInt();
            if (adi1 == num1) {
                System.out.println("Adivino el numero");
                this.intentos1++;
                ganador1++;
                cont1 = 4;
            }
            if (adi1 < num1) {
                System.out.println("El numero a adivinar es mayor ");
                cont1++;
                this.intentos1++;
            }
            if (adi1 > num1) {
                System.out.println("El numero a adivinar es menor ");
                cont1++;
                this.intentos1++;
            }
        } while (cont1 < 4);

        System.out.println("Ingrese el numero jugador dos: ");
        num2 = leer2.nextInt();

        do {
            System.out.println("Ingrese el numero para adivinar jugador uno: ");
            adi2 = leer2.nextInt();
            if (adi2 == num2) {
                System.out.println("Adivino el numero");
                this.intentos2++;
                ganador2++;
                cont2 = 4;
            }
            if (adi2 < num2) {
                System.out.println("El numero a adivinar es mayor ");
                cont2++;
                this.intentos2++;
            }
            if (adi2 > num2) {
                System.out.println("El numero a adivinar es menor ");
                cont2++;
                this.intentos2++;
            }
        } while (cont2 < 4);

    }
}
