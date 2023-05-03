/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Paulo
 */
public class Persona {
    private String Nombre;
    private Date FechaNacimiento;

    public Persona() {
    }

    public Persona(String Nombre, Date FechaNacimiento) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
}
