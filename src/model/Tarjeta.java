package model;

public class Tarjeta extends MetodoPago {
    private final String numero;
    private final String titular;
    private String fechaCaducidad;
    private String codigoSeguridad;

    public Tarjeta(String numero, String titular, String fechaCaducidad, String codigoSeguridad, Float saldo) {
        super(saldo);
        this.numero = numero;
        this.titular = titular;
        this.fechaCaducidad = fechaCaducidad;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Getters and Setters
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String numeroOculto(){
        String numeroOculto = "**** **** **** " + numero.substring(15);
        return numeroOculto;
    }
}
