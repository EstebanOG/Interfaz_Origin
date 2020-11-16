package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorPrincipal, colorCeleste, colorGrisClaro;
    private Font fontPrincipal, fontPrincipalNegrilla, fontTitulo, fontEncabezado;
    private Cursor cMano;
    private Border bInferiorPrincipal = createMatteBorder(0, 0, 3, 0, colorPrincipal);

    static private RecursosService servicio;

    private RecursosService() {
        generarFuentes();
        this.crearColores();
        this.crearFuentes();
        this.crearCursores();
        this.crearBordes();
    }

    private void crearColores() {
        colorPrincipal = new Color(245, 108, 45);
        colorCeleste = new Color(44, 197, 245);
        colorGrisClaro = new Color(101, 106, 109);
    }

    private void crearFuentes() {
        fontPrincipal = new Font("Open Sans Light", Font.PLAIN, 15);
        fontTitulo = new Font("Open Sans Light", Font.PLAIN, 20);
        fontEncabezado = new Font("Open Sans Light", Font.BOLD, 11);
        fontPrincipalNegrilla = new Font("Open Sans Light", Font.BOLD, 15);
    }

    private void crearCursores() {
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    private void crearBordes() {
        bInferiorPrincipal = createMatteBorder(0, 0, 3, 0, colorPrincipal);
    }


    private void generarFuentes() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("src/assets/fonts/OpenSans-Light.ttf")
            ));
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorGrisClaro() {
        return colorGrisClaro;
    }

    public Color getColorCeleste() {
        return colorCeleste;
    }

    public Font getFontPrincipal() {
        return fontPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontEncabezado() {
        return fontEncabezado;
    }

    public Font getFontPrincipalNegrilla() {
        return fontPrincipalNegrilla;
    }

    public Cursor getCMano() {
        return cMano;
    }

    public Border getBInferiorPrincipal() {
        return bInferiorPrincipal;
    }


    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }
}
