/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Venta_Usuario {
    
    private Ventas venta;
    private Usuario user;

    public Venta_Usuario() {
    }

    public Venta_Usuario(Ventas venta, Usuario user) {
        this.venta = new Ventas(venta);
        this.user = new Usuario(user);
    }

    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    
}
