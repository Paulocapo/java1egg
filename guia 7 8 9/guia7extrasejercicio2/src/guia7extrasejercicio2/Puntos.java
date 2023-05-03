/*
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html 
 */
package guia7extrasejercicio2;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Puntos {
    private double x1 ;
    private double y1 ;
    private double x2 ;
    private double y2 ;

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenadas de X1");
        this.x1 = (leer.nextInt());
        System.out.println("Ingrese la coordenadas de X2");
        this.x2 = (leer.nextInt());
        System.out.println("Ingrese la coordenada Y1");
        this.y1 = (leer.nextInt());
         System.out.println("Ingrese la coordenada Y2");
        this.y2 = (leer.nextInt());
    }

    public void distanciaEntrePuntos() {
        double distancia = Math.sqrt(((Math.pow((this.x2 - this.x1), 2)) + (Math.pow((this.y2 - this.y1), 2))));
        System.out.println("La distancia entre los puntos es de : " + distancia);
    }
}
