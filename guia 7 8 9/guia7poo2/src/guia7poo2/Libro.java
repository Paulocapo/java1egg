/*
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package guia7poo2;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
// Constructor con todos los atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    // Constructor vacío
    public Libro() {
    }
   // Método para cargar los datos de un libro desde la entrada estándar
    
    public void cargarLibro(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Metodo de carga de libros ");
        System.out.println("Escriba el ISBN: ");
        this.isbn = scanner.nextLine();

        System.out.println("Escriba el Título: ");
        this.titulo = scanner.nextLine();

        System.out.println("Escriba el Autor: ");
        this.autor = scanner.nextLine();

        System.out.println("Escriba el Número de páginas: ");
        this.numPaginas = scanner.nextInt();
}
    // Método para mostrar los datos de un libro
    public void mostrarLibro() {
         System.out.println("Metodo Visualizar libros ");
        
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}