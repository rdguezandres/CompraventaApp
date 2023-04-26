/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.CompraventaForm;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Compraventa {
    private ArrayList<Producto> productos;
    private ArrayList<Compra> compras;

    private Usuario usuario;

    private CompraventaForm gui;

    public Compraventa(Usuario usuario) {
        this.usuario = usuario;
        productos = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        if(!productos.contains(producto)){
            productos.add(producto);
        }
    }

    public void addCompra(Compra compra){
        if(!compras.contains(compra)){
            compras.add(compra);
        }
    }

    public void setGui(CompraventaForm gui) {
        this.gui = gui;
    }

    public CompraventaForm getGui() {
        return gui;
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public ArrayList<Compra> getCompras(){
        return compras;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }
}
