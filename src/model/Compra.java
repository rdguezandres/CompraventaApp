package model;

public class Compra {
    private Usuario comprador;
    private Producto producto;

    private Chat chat;
    private Entrega entrega;
    private Pago pago;

    public Compra(Usuario comprador, Producto producto) {
        this.comprador = comprador;
        this.producto = producto;
        this.chat = new Chat(this);
    }

    // Getters and Setters
    public Chat getChat() {
        return chat;
    }
    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return comprador.equals(compra.comprador) && producto.equals(compra.producto);
    }

    @Override
    public String toString() {
        return producto.getNombre()+" - "+producto.getPrecio()+"€"+" - "+
                (pago!=null ? "Pagado" : "No pagado") + " - " +
                (entrega!=null ? "Entregado" : "No entregado");
    }

    public boolean getPagado() {
        return pago!=null;
    }

    public boolean getEnviado() {
        return entrega!=null;
    }
}
