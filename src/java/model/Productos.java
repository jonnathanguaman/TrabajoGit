/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Map;

/**
 *
 * @author USER
 */
public class Productos {
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precioEmprendedor;
    private double pvp;
    private Map<String, String> atributos;
    private int cantidadDisponible;

    public Productos() {
    }
    
    public Productos(Productos produc) {
        this.nombre = produc.getNombre();
        this.descripcion = produc.getDescripcion();
        this.categoria = produc.getCategoria();
        this.precioEmprendedor = produc.getPrecioEmprendedor();
        this.atributos = produc.getAtributos();
        this.cantidadDisponible = produc.getCantidadDisponible();
        this.pvp = produc.getPvp(); 
    }

    public Productos(String nombre, String descripcion, String categoria, double precioEmprendedor,Map<String, String> atributos, int cantidadDisponible, int pvp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioEmprendedor = precioEmprendedor;
        this.atributos = atributos;
        this.cantidadDisponible = cantidadDisponible;
        this.pvp = pvp; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioEmprendedor() {
        return precioEmprendedor;
    }

    public void setPrecioEmprendedor(double precioEmprendedor) {
        this.precioEmprendedor = precioEmprendedor;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public Map<String, String> getAtributos() {
        return atributos;
    }

    public void setAtributos(Map<String, String> atributos) {
        this.atributos = atributos;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", precioEmprendedor=" + precioEmprendedor + ", pvp=" + pvp + ", atributos=" + atributos + ", cantidadDisponible=" + cantidadDisponible ;
    }

    
}
