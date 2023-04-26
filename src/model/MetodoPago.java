package model;

public class MetodoPago {
    protected Float saldo;

    public MetodoPago(Float saldo) {
        this.saldo = saldo;
    }

    public Float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void addSaldo(Float saldo) {
        this.saldo += saldo;
    }

    public void removeSaldo(Float saldo) {
        this.saldo -= saldo;
    }
}
