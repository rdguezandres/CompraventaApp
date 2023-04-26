package model;

public class Pago {
    private Compra compra;
    private MetodoPago metodoPago;

    public Pago(Compra compra, MetodoPago metodoPago) {
        this.compra = compra;
        this.metodoPago = metodoPago;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
