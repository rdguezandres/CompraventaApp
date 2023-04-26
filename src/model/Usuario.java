package model;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String telefono;
    private ArrayList<Compra> compras;
    private Monedero monedero;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<PayPal> paypals;
    private ArrayList<Chat> chats;
    private ArrayList<Valoracion> valoraciones;

    public Usuario(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.compras = new ArrayList<>();
        this.monedero = new Monedero();
        this.tarjetas = new ArrayList<>();
        this.paypals = new ArrayList<>();
        this.chats = new ArrayList<>();
        this.valoraciones = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public Monedero getMonedero() {
        return monedero;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public ArrayList<PayPal> getPaypals() {
        return paypals;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public ArrayList<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public void setMonedero(Monedero monedero) {
        this.monedero = monedero;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void setPaypals(ArrayList<PayPal> paypals) {
        this.paypals = paypals;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public void setValoraciones(ArrayList<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    // Métodos
    public void addCompra(Compra compra) {
        compras.add(compra);
    }

    public void addTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public void addPayPal(PayPal paypal) {
        paypals.add(paypal);
    }

    public void addChat(Chat chat) {
        chats.add(chat);
    }

    public void addValoracion(Valoracion valoracion) {
        valoraciones.add(valoracion);
    }

    public void addSaldoMonedero(float saldo, MetodoPago from) {
        if(!(from instanceof Monedero) && from.getSaldo() >= saldo) {
            monedero.addSaldo(saldo);
            from.removeSaldo(saldo);
        } else {
            System.out.println("No se puede transferir saldo desde el monedero");
        }
    }

    public void valorarProducto(Producto producto, int estrellas) {
        Valoracion val = new Valoracion(estrellas, this, producto);
        valoraciones.add(val);
        producto.getVendedor().addValoracion(val);
    }

    public ArrayList<MetodoPago> getMetodosPago() {
        ArrayList<MetodoPago> metodos = new ArrayList<MetodoPago>();
        metodos.addAll(tarjetas);
        metodos.addAll(paypals);
        return metodos;
    }



}
