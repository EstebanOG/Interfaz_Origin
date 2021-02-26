package models;

public class Usuario {

    private String nombreUsuario;
    private String claveUsuario;
    private String regionUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getRegionUsuario() {
        return regionUsuario;
    }

    public void setRegionUsuario(String regioUsuario) {
        this.regionUsuario = regioUsuario;
    }
    
}
