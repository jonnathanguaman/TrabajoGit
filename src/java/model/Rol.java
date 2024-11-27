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
public class Rol {
    
    private int id_rol;
    private String rol;
    private List<Usuario_Rol> listaUsuairioRol;
    
    public Rol() {
        listaUsuairioRol = new ArrayList<>();
    }
    
    public Rol(int id_rol, String rol) {
        this.id_rol = id_rol;
        this.rol = rol;
    }

    public Rol(Rol rol) {
        this.id_rol = rol.getId_rol();
        this.rol = rol.getRol();
        this.listaUsuairioRol = rol.getListaUsuairioRol();
    }

    public List<Usuario_Rol> getListaUsuairioRol() {
        return listaUsuairioRol;
    }

    public void setListaUsuairioRol(List<Usuario_Rol> listaUsuairioRol) {
        this.listaUsuairioRol = listaUsuairioRol;
    }
    
    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
