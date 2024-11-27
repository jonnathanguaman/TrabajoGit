/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class Ventas {
    private Usuario cliente;
    private Productos producto;
    private int cantidadVendida;
    private double precioVenta;
    private Date fechaVenta;
    private List<Venta_Usuario> listaVentaUsuario;
    
    public Ventas() {
        listaVentaUsuario = new ArrayList<>();
    }

    public Ventas(Ventas venta) {
        this.cliente = venta.getCliente();
        this.producto = venta.getProducto();
        this.cantidadVendida = venta.getCantidadVendida();
        this.precioVenta = venta.getPrecioVenta();
        this.fechaVenta = venta.getFechaVenta();
        this.listaVentaUsuario = venta.getListaVentaUsuario();
    }
    
    public Ventas(Usuario cliente, Productos producto, int cantidadVendida, double precioVenta, Date fechaVenta) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
    }

    public List<Venta_Usuario> getListaVentaUsuario() {
        return listaVentaUsuario;
    }

    public void setListaVentaUsuario(List<Venta_Usuario> listaVentaUsuario) {
        this.listaVentaUsuario = listaVentaUsuario;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return  "cliente=" + cliente + ", producto=" + producto + ", cantidadVendida=" + cantidadVendida + ", precioVenta=" + precioVenta + ", fechaVenta=" + fechaVenta;
    }
    
    

}
