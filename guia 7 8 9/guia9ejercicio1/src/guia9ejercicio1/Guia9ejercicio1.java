/*
Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package guia9ejercicio1;

import entidades.Cadena;
import servicios.CadenaServicio;

/**
 *
 * @author Paulo
 */
public class Guia9ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs1 = new CadenaServicio();
        Cadena c1 = cs1.crearCadena();
        cs1.mostrarVocales(c1);
        cs1.invertirFrase2(c1);
        cs1.vecesRepetido(c1);
        cs1.compararLongitud(c1);
        cs1.unirFrases(c1);
        cs1.reemplazarLetra(c1);
        System.out.println(cs1.contiene(c1, Boolean.TRUE));
        
        
    }

}
