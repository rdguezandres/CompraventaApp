package model;

public class Producto {
    private String nombre;

    private float precioInicial;
    private float precio;
    private String descripcion;
    private Vendedor vendedor;

    private boolean precioNegociado;

    private boolean favorito;

    public Producto(String nombre, float precioInicial, String descripcion, Vendedor vendedor) {
        this.nombre = nombre;
        this.precioInicial = precioInicial;
        this.precio = precioInicial;
        this.descripcion = descripcion;
        this.vendedor = vendedor;
        this.favorito = false;
        this.precioNegociado = false;
    }

    // Getters y setters


    public boolean isPrecioNegociado() {
        return precioNegociado;
    }

    public void setPrecioNegociado(boolean precioNegociado) {
        this.precioNegociado = precioNegociado;
    }

    public float getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(float precioInicial) {
        this.precioInicial = precioInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return nombre.equals(producto.nombre) && vendedor.equals(producto.vendedor);
    }

}
