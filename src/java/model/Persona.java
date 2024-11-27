/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author USER
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cédula;
    private String dirección;
    private String númeroteléfono;

    public Persona() {
    }

    public Persona(Persona persona) {
        this.idPersona = persona.getIdPersona();
        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.cédula = persona.getCédula();
        this.dirección = persona.getDirección();
        this.númeroteléfono = persona.getNúmeroteléfono();
    }

    public Persona(int idPersona, String nombre, String apellido, String cédula, String dirección, String númeroteléfono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cédula = cédula;
        this.dirección = dirección;
        this.númeroteléfono = númeroteléfono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNúmeroteléfono() {
        return númeroteléfono;
    }

    public void setNúmeroteléfono(String númeroteléfono) {
        this.númeroteléfono = númeroteléfono;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", c\u00e9dula=" + cédula + ", direcci\u00f3n=" + dirección + ", n\u00famerotel\u00e9fono=" + númeroteléfono;
    }

    
    
    
}
