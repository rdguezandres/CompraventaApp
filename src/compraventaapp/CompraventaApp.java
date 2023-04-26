/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventaapp;
import model.*;
import gui.CompraventaForm;

/**
 *
 * @author Usuario
 */
public class CompraventaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pepe", "123 456 789");
        usuario.addTarjeta(new Tarjeta("1234 1234 1234 1234", usuario.getNombre(), "13/12", "111", 2000.0f));
        usuario.addTarjeta(new Tarjeta("4444 4444 4444 4444", usuario.getNombre(), "13/12", "111", 200.0f));
        usuario.addPayPal(new PayPal("correnuevo@hola.es", "1234", "Pepe", "123 456 789", 2000.0f));
        usuario.addPayPal(new PayPal("correoantiguo@adios.es", "1234", "Pepe", "123 456 789", 200.0f));
        Compraventa compraventa = new Compraventa(usuario);
        compraventa.addProducto(new Producto("StarUML", 100.0f, "Nueva versión de StarUML", new Vendedor("Juan", "123 456 789")));
        compraventa.addProducto(new Producto("Balon de Futbol", 200.0f, "Balón oficial del Mundial 2022", new Vendedor("Pedro", "123 456 789")));
        compraventa.addProducto(new Producto("Tabla de surf", 300.0f, "Tabla de surf de segunda mano con 2 años de uso", new Vendedor("Javier", "123 456 789")));
        CompraventaForm gui = new CompraventaForm(compraventa);
        compraventa.setGui(gui);
        gui.setVisible(true);
        }

}
