package model;

import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private String telefono;
    private ArrayList<Producto> productos;
    private ArrayList<Chat> chats;
    private ArrayList<Valoracion> valoraciones;

    public Vendedor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.productos = new ArrayList<Producto>();
        this.chats = new ArrayList<Chat>();
        this.valoraciones = new ArrayList<Valoracion>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(ArrayList<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    // Métodos
    public void addValoracion(Valoracion valoracion) {
        this.valoraciones.add(valoracion);
    }
}
