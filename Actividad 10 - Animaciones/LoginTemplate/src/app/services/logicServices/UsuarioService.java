package app.services.logicServices;

import logic.ControlUsuarios;
import models.Usuario;

public class UsuarioService {

    private static UsuarioService servicio;
    private ControlUsuarios cUsuario;
    private Usuario usuarioConectado;

    public UsuarioService() {
        cUsuario = new ControlUsuarios();
    }

    public boolean verificarDatosUsuario(
            String nombreUsuario, String claveUsuario, String regionUsuario
    ) {
        if (cUsuario.verificarUsuario(nombreUsuario, claveUsuario, regionUsuario)) {
            this.usuarioConectado = cUsuario.devolverUsuario(nombreUsuario);
            return true;
        }
        return false;
    }

    public Usuario getUsuarioConectado() {
        return this.usuarioConectado;
    }

    public static UsuarioService getService() {
        if (servicio == null) {
            servicio = new UsuarioService();
        }
        return servicio;
    }
}
