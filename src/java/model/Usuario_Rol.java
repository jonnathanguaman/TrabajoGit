/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Usuario_Rol {
    
    private Usuario usuario;
    private Rol rol;

    public Usuario_Rol() {
    }

    public Usuario_Rol(Usuario usuario, Rol rol) {
        this.usuario = new Usuario(usuario);
        this.rol = new Rol(rol);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
}
