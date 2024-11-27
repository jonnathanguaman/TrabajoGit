/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class IngresoEgreso {
    private Usuario user;
    private double ingresos;
    private double egresos;
    
    public IngresoEgreso() {
    }

    public IngresoEgreso(IngresoEgreso ingreEgre) {
        this.user = ingreEgre.getUser();
        this.ingresos = ingreEgre.getIngresos();
        this.egresos = ingreEgre.getEgresos();
    }
    
    public IngresoEgreso(Usuario user, double ingresos, double egresos) {
        this.user = user;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }


}