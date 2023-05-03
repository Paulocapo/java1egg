/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extrasejercicio1;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Paulo
 */
public class Guia8extrasejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices ecuacion = new Raices(36, -60, 25);
        RaicesServicio.calcular(ecuacion);
    }
    
}
