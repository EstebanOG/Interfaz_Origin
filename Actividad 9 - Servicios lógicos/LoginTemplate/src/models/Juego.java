package models;

import javax.swing.ImageIcon;

public class Juego {

    private String nombreJuego;
    private String precioJuego;
    private ImageIcon imagenJuego;

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getPrecioJuego() {
        return precioJuego;
    }

    public void setPrecioJuego(String precioJuego) {
        this.precioJuego = precioJuego;
    }

    public ImageIcon getImagenJuego() {
        return imagenJuego;
    }

    public void setImagenJuego(ImageIcon imagenJuego) {
        this.imagenJuego = imagenJuego;
    }
}
