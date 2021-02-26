package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Usuario;

public class ControlUsuarios {
     private ArrayList<Usuario> usuarios;

  public ControlUsuarios() {
    usuarios = new ArrayList<Usuario>();
    cargarDatos();
  }

  public void cargarDatos() {
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    try {
      archivo = new File("src/archives/usuario.txt");
      fr = new FileReader(archivo);
      br = new BufferedReader(fr);

      String linea;
      while ((linea = br.readLine()) != null) {
        String[] atributos = linea.split(",");
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(atributos[0]);
        usuario.setClaveUsuario(atributos[1]);
        usuario.setRegionUsuario(atributos[2]);
        usuarios.add(usuario);
      }
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public boolean verificarUsuario(
    String nombreUsuario, String claveUsuario, String regionUsuario
  ) {
    for (Usuario usuario : usuarios) {
      if (usuario.getNombreUsuario().equals(nombreUsuario))
        if (usuario.getClaveUsuario().equals(claveUsuario))
          if (usuario.getRegionUsuario().equals(regionUsuario))
            return true;
    }
    return false;
  }

  public Usuario devolverUsuario(String nombreUsuario) {
    for (Usuario usuario : usuarios) {
      if (usuario.getNombreUsuario().equals(nombreUsuario))
        return usuario;
    }
    return null;
  }
}
