package model;

public class Valoracion {
    private int estrellas;
    private Usuario comprador;
    private Producto producto;

    public Valoracion(int estrellas, Usuario comprador, Producto producto) {
        this.estrellas = estrellas;
        this.comprador = comprador;
        this.producto = producto;
    }

    // Getters and Setters
    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
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
}
