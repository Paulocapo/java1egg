/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package guia7extrasejercicio6;

/**
 *
 * @author Paulo
 */
public class Rectangulo {

    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void calcular_area() {
        int area;
        System.out.println("Para el objeto con lado 1: " + this.lado1
                + " y lado 2 : " + this.lado2);
        area = this.lado1 * this.lado2;
        System.out.println("El area del rectangulo es: " + area);

    }

    public void dibujarRectangulo() {

        for (int i = 0; i < this.lado1; i++) {
            for (int j = 0; j < this.lado2; j++) {

                if (i == 0 || i == (this.lado1 - 1)) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == (this.lado2 - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
