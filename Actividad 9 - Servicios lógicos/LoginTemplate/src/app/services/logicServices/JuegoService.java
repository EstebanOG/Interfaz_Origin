package app.services.logicServices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import models.Juego;

public class JuegoService {

    private static JuegoService servicio;
    private ArrayList<Juego> acciones;

    public JuegoService() {
        acciones = new ArrayList<Juego>();
        cargarDatos();
    }

    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("src/archives/acciones.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split(",");
                Juego accion = new Juego();
                accion.setNombreJuego(atributos[0]);
                accion.setPrecioJuego(atributos[1]);
                accion.setImagenJuego(new ImageIcon(atributos[2]));
                acciones.add(accion);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Juego devolverAccion(int posicion) {
    try {
      return acciones.get(posicion);
    } catch (Exception e) {
      return null;
    }
  }
    public static JuegoService getService() {
        if (servicio == null) {
            servicio = new JuegoService();
        }
        return servicio;
    }
}
