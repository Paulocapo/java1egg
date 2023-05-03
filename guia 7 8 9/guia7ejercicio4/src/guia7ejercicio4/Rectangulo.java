/*
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia7ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        altura = sc.nextDouble();
    }
    
    public void superficie(){      
        double superficie = base*altura;
        System.out.println("La superficie es: " + superficie);     
    }
    
     public void perimetro(){      
        double perimetro = (base+altura)*2;
        System.out.println("El perimetro es: " + perimetro);     
    }
    
    public void dibujarRectangulo(){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                
                if(i == 0 || i == (altura-1)){
                    System.out.print("*");
                }else{
                    if (j == 0 || j == (base-1 )) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println("");
        }
        
    }
}
