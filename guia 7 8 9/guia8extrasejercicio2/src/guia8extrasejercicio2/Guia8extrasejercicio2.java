/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extrasejercicio2;

import entidades.NIF;
import servicios.NIFservicio;

/**
 *
 * @author Paulo
 */
public class Guia8extrasejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NIFservicio nifServicio = new NIFservicio();
        NIF nif = new NIF();
        nifServicio.crearNIF(nif);
        nifServicio.mostrar(nif);
    }
    
}
