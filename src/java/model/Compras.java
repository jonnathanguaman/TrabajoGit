/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Compras {
    private Usuario proveedor;
    private Productos producto;
    private int cantidadComprada;
    private Date fechaCompra;

    public Compras() {
    }

    public Compras(Compras compra) {
        this.proveedor = compra.getProveedor();
        this.producto = compra.getProducto();
        this.cantidadComprada = compra.getCantidadComprada();
        this.fechaCompra = compra.getFechaCompra();
    }
    
    public Compras(Usuario proveedor, Productos producto, int cantidadComprada, Date fechaCompra) {
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.fechaCompra = fechaCompra;
    }

    public Usuario getProveedor() {
        return proveedor;
    }

    public void setProveedor(Usuario proveedor) {
        this.proveedor = proveedor;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
