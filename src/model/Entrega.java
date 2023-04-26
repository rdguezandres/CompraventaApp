package model;

public class Entrega {
    private Compra compra;
    private String direccion;
    private String fecha;

    public Entrega(Compra compra, String direccion) {
        this.compra = compra;
        this.direccion = direccion;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
