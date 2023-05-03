/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CadenaServicio {

//    Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        String frase;
        int longitud;
        System.out.println("ingrese la frase: ");
        frase = leer.nextLine();
        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena c1) {
        int contadorVocales = 0;
        System.out.println("la longitud de la cadena es:" + c1.getLongitud());
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase("A")
                    || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("E")
                    || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("I")
                    || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("O")
                    || c1.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                contadorVocales++;
            }
        }
        System.out.println("Se contaron: " + contadorVocales + "  vocales");
        System.out.println(" la frase es: " + c1.getFrase());

    }

//    public void invertirFrase(Cadena c1) {
//        String fraseinvertida = "";
//
//        for (int i = c1.getLongitud() ; i > 0; i--) {
//            fraseinvertida = c1.getFrase().substring(i, i-i);
//        }
//        System.out.println(" La frase invertida es: " + fraseinvertida );
//    }
    public void invertirFrase2(Cadena c1) {

        StringBuilder sb = new StringBuilder(c1.getFrase());
        sb.reverse();
        System.out.println("Frase invertida: " + sb.toString());
    }

    public void vecesRepetido(Cadena c1) {
        String letra;
        int contadorletra = 0;
        System.out.println("Ingrese la letra a buscar en la frase: ");
        letra = leer.next();

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contadorletra++;
            }
        }
        System.out.println("La letra ingresada se repite:  " + contadorletra + " veces");
    }

    public void compararLongitud(Cadena c1) {
        String fraseac;
        System.out.println("Ingrese una frase para comparar la longitud con la frase primaria: ");
        fraseac = leer2.nextLine();
        System.out.println("La lontigud de su frase es: " + fraseac.length());
        if (fraseac.length() == c1.getLongitud()) {
            System.out.println("Las longitudes de las frases son iguales");
        } else {
            System.out.println("Las longitudes de las frases  no son iguales");
        }
    }

    public void unirFrases(Cadena c1) {
        String fraseaunir;
        String frasefinal = c1.getFrase();
        System.out.println("Ingrese una frase para unirla con la frase primaria: ");
        fraseaunir = leer2.nextLine();
        System.out.println(frasefinal);
        for (int i = 0; i < fraseaunir.length(); i++) {
            frasefinal = frasefinal + fraseaunir.substring(i, i + 1);
        }
        System.out.println(frasefinal);
    }

    public void reemplazarLetra(Cadena c1) {
        String letrar;
        String frasefinal = "";
        System.out.println("Ingrese una letra para reemplazar en las 'a' de la frase primaria: ");
        letrar = leer2.next();

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                frasefinal = frasefinal + letrar;
            } else {
                frasefinal = frasefinal + c1.getFrase().substring(i, i + 1);
            }
        }
        System.out.println(frasefinal);
    }

    public boolean contiene(Cadena c1, Boolean seencu) {
        String letrab;
        int encontro = 0;
        System.out.println("Ingrese una letra para buscar si esta en la frase: ");
        letrab = leer2.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letrab)) {
                encontro++;
            }
        }
        if (encontro != 0) {
            seencu = true;
        } else {
            seencu = false;
        }
        return seencu;

    }
    
}
