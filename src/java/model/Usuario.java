/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Usuario {
    private int idUsuario;
    private String correoelectronico;
    private String contrasena;
    private Persona persona;
    private List<Usuario_Rol> listaUsuarioRol;
    
    public Usuario() {
        listaUsuarioRol = new ArrayList<>();
    }
    
    public Usuario(Usuario user) {
        this.idUsuario = user.getIdUsuario();
        this.correoelectronico = user.getCorreoelectrónico();
        this.contrasena = user.getContraseña();
        this.persona = user.getPersona();
        this.listaUsuarioRol = user.getListaUsuarioRol();
    }

    public Usuario(int idUsuario, String correoelectrónico, String contraseña, Persona persona) {
        this.idUsuario = idUsuario;
        this.correoelectronico = correoelectrónico;
        this.contrasena = contraseña;
        this.persona = persona;
    }

    public Usuario(int idUsuario, String correoelectrónico, String contraseña, Persona persona, List<Usuario_Rol> listaUsuarioRol) {
        this.idUsuario = idUsuario;
        this.correoelectronico = correoelectrónico;
        this.contrasena = contraseña;
        this.persona = persona;
        this.listaUsuarioRol = listaUsuarioRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoelectrónico() {
        return correoelectronico;
    }

    public void setCorreoelectrónico(String correoelectrónico) {
        this.correoelectronico = correoelectrónico;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Usuario_Rol> getListaUsuarioRol() {
        return listaUsuarioRol;
    }

    public void setListaUsuarioRol(List<Usuario_Rol> listaUsuarioRol) {
        this.listaUsuarioRol = listaUsuarioRol;
    }

    @Override
    public String toString() {
        return  "persona=" + persona ;
    }
    
    
}
