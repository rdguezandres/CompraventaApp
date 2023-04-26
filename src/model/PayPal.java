package model;

public class PayPal extends MetodoPago {
    private final String email;
    private String password;
    private final String nombre;
    private String telefono;

    public PayPal(String email, String password, String nombre, String telefono, Float saldo) {
        super(saldo);
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

