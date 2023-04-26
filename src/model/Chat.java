package model;

import java.util.ArrayList;

public class Chat {

    private Compra compra;
    private ArrayList<Mensaje> mensajes;

    public Chat(Compra compra) {
        this.compra = compra;
        this.mensajes = new ArrayList<>();

    }

    public Compra getCompra() {
        return compra;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void sendMessage(String message, String emisor, String receptor) {
        Mensaje mensaje = new Mensaje(message, emisor, receptor);
        mensajes.add(mensaje);
    }
}
