/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Adopcion {

    public void cargarPerro(ArrayList<Perro> perroLista) {
        Scanner leer = new Scanner(System.in);
        String seguir = "s";
        while (seguir.equalsIgnoreCase("s")) {
            System.out.print("Nombre del perro: ");
            String nombre = leer.next();
            System.out.print("Raza del perro: ");
            String raza = leer.next();
            System.out.print("Edad del perro: ");
            int edad = leer.nextInt();
            System.out.print("Tamaño del perro: ");
            String tamanio = leer.nextLine();
            perroLista.add(new Perro(nombre, raza, edad, tamanio));
            leer.nextLine();
            System.out.print("Desea realizar otro ingreso? (S/N)");
            seguir = leer.nextLine();
        }
    }

    public void cargarPersona(ArrayList<Persona> personaLista) {
        Scanner leer = new Scanner(System.in);

        String seguir = "s";
        while (seguir.equalsIgnoreCase("s")) {
            System.out.print("Nombre de la persona: ");
            String nombre = leer.next();
            System.out.print("Apellido de la persona : ");
            String apellido = leer.next();
            System.out.print("Dni de la persona: ");
            int dni = leer.nextInt();
            System.out.print("Edad de la persona: ");
            int edad = leer.nextInt();
            personaLista.add(new Persona(nombre, apellido, dni, edad));
            leer.nextLine();
            System.out.print("Desea realizar otro ingreso? (S/N)");
            seguir = leer.nextLine();
        }
    }

    public void mostrarListaPerros(ArrayList<Perro> perroLista) {
        for (Perro perro : perroLista) {
            System.out.println(perro);
        }
    }

    public void mostrarListaPersonas(ArrayList<Persona> personaLista) {
        for (Persona persona : personaLista) {
            System.out.print(persona.getNombre()+ "  ");
            System.out.print(persona.getApellido() + " ");
            System.out.print(persona.getDni()+ "  ");
            System.out.println(persona.getEdad());
        }
    }

    public void adoptarPerro(ArrayList<Persona> personaLista, ArrayList<Perro> perroLista) {
        Scanner leer = new Scanner(System.in);
        for (Persona persona : personaLista) {

            System.out.println(persona.getNombre() + " Desea Adoptar ? S/N :");
            String resp = leer.nextLine().toUpperCase();
            if (resp.equals("S")) {

                System.out.println("---LISTA PERROS PARA ADOPTAR---");
                for (Perro perro : perroLista) {
                    System.out.println(perro);
                }
                System.out.println("Elija el NOMBRE del PERRO para Adoptar :");
                String adop = leer.nextLine();
                System.out.println("\n");
                for (Perro perro : perroLista) {
                    if (perro.getNombre().equals(adop)) {
                        if (perro.isAdoptado()) {
                            System.out.println("Este Perro ya fue adoptado, Disculpe");
                            break;
                        } else {
                            persona.setPerro(perro);
                            perro.setAdoptado(true);

                            break;
                        }
                    }
                }

            }
        }

    }

    public void adoptarPerroPidiendoPersona(ArrayList<Persona> personaLista, ArrayList<Perro> perroLista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Persona que desea adoptar el perro:");
        String resp = leer.nextLine();
        for (Persona persona : personaLista) {
            if (resp.equalsIgnoreCase(persona.getNombre())) {

                System.out.println("---LISTA PERROS PARA ADOPTAR---");
                for (Perro perro : perroLista) {
                    System.out.println(perro);
                }
                System.out.println("Elija el NOMBRE del PERRO para Adoptar :");
                String adop = leer.nextLine();
                System.out.println("\n");
                for (Perro perro : perroLista) {
                    if (perro.getNombre().equals(adop)) {
                        if (perro.isAdoptado()) {
                            System.out.println("Este Perro ya fue adoptado, Disculpe");
                            break;
                        } else {
                            persona.setPerro(perro);
                            perro.setAdoptado(true);

                            break;
                        }
                    }
                }
            }
        }
    }
public void mostrarListaPersonasConPerros(ArrayList<Persona> personaLista) {
        for (Persona persona : personaLista) {
            System.out.println(persona);
        }
    }
}
