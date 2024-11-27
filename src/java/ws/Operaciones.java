/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.IngresoEgreso;
import model.Persona;
import model.Productos;
import model.Rol;
import model.Usuario;
import model.Usuario_Rol;
import model.Venta_Usuario;
import model.Ventas;

/**
 *
 * @author USER
 */
@WebService(serviceName = "Operaciones")
public class Operaciones {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Usuario> listaUsuario = new ArrayList<>();
    private ArrayList<Usuario_Rol> listaUsuarioRol;
    private ArrayList<Venta_Usuario> listaVentaUsuario;
    private ArrayList<IngresoEgreso> listaDeEgresos;
    
    private void crearSuperAdmin() {
        Persona cliente = new Persona(1, "jonnathan", "Guaman", "0106775646", "Cuenca", "0992978704");
        listaPersonas = new ArrayList<>();
        listaPersonas.add(cliente);

        Persona socio = new Persona(2, "socio", "socio", "0106775646", "Cuenca", "0992978704");
        listaPersonas = new ArrayList<>();
        listaPersonas.add(socio);

        Persona proveedor = new Persona(3, "Juan", "proveedor", "0106775646", "Cuenca", "0992978704");
        listaPersonas = new ArrayList<>();
        listaPersonas.add(proveedor);

        Persona admin = new Persona(4, "admin", "admin", "0106775646", "Cuenca", "0992978704");
        listaPersonas = new ArrayList<>();
        listaPersonas.add(admin);

        Usuario user = new Usuario(1, "cliente@gmail.com", "123", cliente);
        Usuario userSocio = new Usuario(2, "socio@gmail.com", "123", socio);
        Usuario userProveedor = new Usuario(3, "proveedor@gmail.com", "123", proveedor);
        Usuario userAdmin = new Usuario(4, "admin@gmail.com", "123", admin);
        listaUsuario.add(user);
        listaUsuario.add(userSocio);
        listaUsuario.add(userProveedor);
        listaUsuario.add(userAdmin);

        Rol rolsocio = new Rol(2, "Socios");
        listaUsuarioRol = new ArrayList<>();
        listaUsuarioRol.add(new Usuario_Rol(userSocio, rolsocio));
        rolsocio.setListaUsuairioRol(listaUsuarioRol);
        userSocio.setListaUsuarioRol(listaUsuarioRol);

        Rol rolCliente = new Rol(3, "Cliente");
        listaUsuarioRol = new ArrayList<>();
        listaUsuarioRol.add(new Usuario_Rol(user, rolCliente));
        rolCliente.setListaUsuairioRol(listaUsuarioRol);
        user.setListaUsuarioRol(listaUsuarioRol);

        Rol rolProveedor = new Rol(3, "Proveedor");
        listaUsuarioRol = new ArrayList<>();
        listaUsuarioRol.add(new Usuario_Rol(userProveedor, rolProveedor));
        rolCliente.setListaUsuairioRol(listaUsuarioRol);
        userProveedor.setListaUsuarioRol(listaUsuarioRol);

        Rol rolAdmin = new Rol(3, "Admin");
        listaUsuarioRol = new ArrayList<>();
        listaUsuarioRol.add(new Usuario_Rol(userAdmin, rolAdmin));
        rolAdmin.setListaUsuairioRol(listaUsuarioRol);
        userAdmin.setListaUsuarioRol(listaUsuarioRol);
                
        Map<String, String> atributosCarro = new HashMap<>();
        atributosCarro.put("color", "rojo");
        atributosCarro.put("tamaño", "2.5cm");
        Productos producto1 = new Productos("carro", "carro de niños", "niños", 10, atributosCarro, 10, 120);
        listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        
        Ventas venta1 = new Ventas(user, producto1, 2, 25, new Date());
        listaVentaUsuario = new ArrayList<>();
        listaVentaUsuario.add(new Venta_Usuario(venta1, user));
        venta1.setListaVentaUsuario(listaVentaUsuario);
        
        int egresos = (int) (producto1.getCantidadDisponible() * producto1.getPrecioEmprendedor());
        int ganancia = (int) (venta1.getCantidadVendida() * venta1.getPrecioVenta());
        
        int egresoIngreso = ganancia - egresos;
        IngresoEgreso ingre = new IngresoEgreso(userProveedor, ganancia, egresoIngreso);
        listaDeEgresos = new ArrayList<>();
        listaDeEgresos.add(ingre);
    }

    private ArrayList<Productos> listaProductos;
    
   
    
    public String login(String correo, String contrasena) {
        crearSuperAdmin();
        
        Usuario_Rol usuarioEncontrado = null;

        for (Usuario user : listaUsuario) {
            if (user.getCorreoelectrónico().equals(correo) && user.getContraseña().equals(contrasena)) {
                for (Usuario_Rol userRol : user.getListaUsuarioRol()) {
                    if (user.getIdUsuario() == userRol.getUsuario().getIdUsuario()) {
                        usuarioEncontrado = userRol;
                        if (userRol.getRol().getRol().equals("Admin")) {
                            for (Venta_Usuario ventas : listaVentaUsuario) {
                                return "Usted cargo un producto, el nombre es: " + listaProductos.get(0).getNombre() + "Tiene una venta de: " +  ventas.getUser().getPersona().getCédula() + "\n" 
                                        + "Resumen de la venta: " + ventas.getVenta().toString();
                            }
                        }else if(userRol.getRol().getRol().equals("Proveedor")){
                            for (IngresoEgreso ig : listaDeEgresos) {
                                return "Hola "  + ig.getUser().getPersona().getNombre() + " su producto tuvo datos para la empresa: \n" + "Ingresos: " + ig.getIngresos() + " Egresos: " + ig.getEgresos();
                            }
                        }else if(userRol.getRol().getRol().equals("Socios")){
                            for (IngresoEgreso ig : listaDeEgresos) {
                                return "Bienvenido socio";
                            }
                        }else{
                            return "Bienvenido cliente";
                        }
                    }
                }
            }
        }
        return "Usuario no encontrado";
    }
}
