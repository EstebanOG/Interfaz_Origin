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

    private Color colorPrincipal, colorCeleste, colorGrisClaro,colorAzulOscuro,colorGrisClaroCuerpo,colorGrisHover, colorGrisStore, colorNegroTransparente;
    private Font fontPrincipal, fontPrincipalNegrilla, fontPrincipalNegrilla2,fontPrincipalNegrillaPequena ,fontTitulo, fontEncabezado, fontSimbolos;
    private Cursor cMano;
    private Border bInferiorPrincipal,bLateralNaranja,bGris,bGrisCompleto;
    private ImageIcon iCerrar, iMinimizar;

    static private RecursosService servicio;

    private RecursosService() {
        generarFuentes();
        this.crearColores();
        this.crearFuentes();
        this.crearCursores();
        this.crearBordes();
        this.crearImagenes();
    }

    private void crearColores() {
        colorPrincipal = new Color(245, 108, 45);
        colorCeleste = new Color(44, 197, 245);
        colorGrisClaro = new Color(101, 106, 109);
        colorGrisClaroCuerpo = new Color(175, 178, 186);
        colorGrisHover = new Color(111,114,123);
        colorAzulOscuro = new Color(30,38,44);
        colorGrisStore = new Color(237,241,242);
        colorNegroTransparente = new Color(43,53,65,220);
    }

    private void crearFuentes() {
        fontPrincipal = new Font("Open Sans Light", Font.PLAIN, 15);
        fontTitulo = new Font("Open Sans Light", Font.PLAIN, 20);
        fontEncabezado = new Font("Open Sans Light", Font.BOLD, 11);
        fontPrincipalNegrilla = new Font("Open Sans Light", Font.BOLD, 15);
        fontPrincipalNegrilla2 = new Font("sans serif", Font.BOLD, 15);
        fontPrincipalNegrillaPequena = new Font("sans serif", Font.BOLD, 13);
        fontSimbolos = new Font("sans serif", Font.BOLD, 8);
    }

    private void crearImagenes() {
        iCerrar = new ImageIcon("src/assets/images/cerrar.png");
        iMinimizar = new ImageIcon("src/assets/images/minimizar.png");
    }

    private void crearCursores() {
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    private void crearBordes() {
        bInferiorPrincipal = createMatteBorder(0, 0, 3, 0, colorPrincipal);
        bLateralNaranja = createMatteBorder(0, 5, 0, 0, colorPrincipal);
        bGris = createMatteBorder(1, 0, 1, 0, colorGrisClaroCuerpo);
        bGrisCompleto = createMatteBorder(1, 1, 1, 1, colorGrisClaroCuerpo);
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
    
    public Color getColorGrisClaroCuerpo() {
        return colorGrisClaroCuerpo;
    }

    public Color getColorCeleste() {
        return colorCeleste;
    }
    
    public Color getGrisHover() {
        return colorGrisHover;
    }
    
    public Color getColorAzulOscuro() {
        return colorAzulOscuro;
    }
    
    public Color getColorGrisStore(){
        return colorGrisStore;
    }
    
    public Color getColorNegroTransparente(){
        return colorNegroTransparente;
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
    
    public Font getFontPrincipalNegrilla2() {
        return fontPrincipalNegrilla2;
    }
    
    public Font getFontPrincipalNegrillaPequena() {
        return fontPrincipalNegrillaPequena;
    }

    public Font getFontSimbolos() {
        return fontSimbolos;
    }
    
    public Cursor getCMano() {
        return cMano;
    }

    public Border getBInferiorPrincipal() {
        return bInferiorPrincipal;
    }
    
    public Border getBLateralNaranja() {
        return bLateralNaranja;
    }
    
    public Border getBGris() {
        return bGris;
    }
    
    public Border getBGrisCompleto() {
        return bGrisCompleto;
    }

    public ImageIcon getICerrar() {
        return iCerrar;
    }

    public ImageIcon getIMinimizar() {
        return iMinimizar;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }
}
