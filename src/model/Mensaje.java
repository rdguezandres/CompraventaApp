package model;

public class Mensaje {
    private String texto;
    private String emisor;
    private String receptor;

    public Mensaje(String texto, String emisor, String receptor) {
        this.texto = texto;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getTexto() {
        return texto;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getReceptor() {
        return receptor;
    }
}
