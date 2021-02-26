package app.client.components.navegacionUsuario;

import app.services.graphicServices.ObjGraficosService;
import app.services.graphicServices.RecursosService;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class NavegacionUsuarioTemplate extends JPanel {

    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración objetos gráficos
    private JPanel pSuperior, pInferior;
    private JButton bInicio, bEaPlay, bStore, bBrowseGames, bDeals, bLibrary, bOriginBanner, bNotifications, bAbout, bDownload, bHelp, bUsuario;
    private JTextField field;

    // Declaración Objetos Decoradores
    private ImageIcon iIconoUsuario, iOriginBanner, iNotifications, iBusqueda, iDimAux;
    private Border bVacio;
    private JLabel lVacio, lPunto, lBusqueda;

    public NavegacionUsuarioTemplate(NavegacionUsuarioComponent navegacionUsuarioComponent) {
        this.navegacionUsuarioComponent = navegacionUsuarioComponent;
        this.sObjGraficos = ObjGraficosService.getService();
        this.sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJButtons();
        this.crearJLabels();

        this.setSize(250, 775);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanels() {
        this.pSuperior = sObjGraficos.construirJPanel(
                0, 0, 250, 650,
                sRecursos.getColorAzulOscuro(),
                null
        );
        this.add(pSuperior);

        this.pInferior = sObjGraficos.construirJPanel(
                0, 650, 250, 125,
                sRecursos.getColorAzulOscuro(),
                null
        );
        this.add(pInferior);
    }

    public void crearObjetosDecoradores() {
        this.iOriginBanner = new ImageIcon("src/assets/images/origin_banner-sinFondo.png");
        this.iIconoUsuario = new ImageIcon("src/assets/images/usuario_navegacion.png");
        this.iNotifications = new ImageIcon("src/assets/images/notifications.png");
        this.iBusqueda = new ImageIcon("src/assets/images/barraBusqueda.png");
        this.bVacio = new EmptyBorder(0, 5, 0, 0);
    }

    public void crearJButtons() {
        // BOTÓN ORIGIN
        iDimAux = new ImageIcon(
                iOriginBanner.getImage()
                        .getScaledInstance(210, 60, Image.SCALE_AREA_AVERAGING)
        );
        this.bOriginBanner = sObjGraficos.construirJButton(
                null,
                ((this.pSuperior.getWidth() - 210) / 2) - 25, 20, 210, 60,
                sRecursos.getCMano(),
                iDimAux,
                null,
                null,
                null,
                bVacio,
                "l",
                false
        );
        this.bOriginBanner.addActionListener(navegacionUsuarioComponent);
        this.pSuperior.add(bOriginBanner);

// BOTÓN My Home--------------------------------------------------------------------
        this.bInicio = sObjGraficos.construirJButton(
                "   My Home",
                0, 150, 250, 50,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrilla2(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                sRecursos.getBLateralNaranja(),
                "l",
                true
        );
        this.bInicio.addActionListener(navegacionUsuarioComponent);
        this.bInicio.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bInicio);

        // BOTÓN EA PLAY--------------------------------------------------------------------
        this.bEaPlay = sObjGraficos.construirJButton(
                "   EA Play                                     >",
                0, 200, 250, 50,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrilla2(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bEaPlay.addActionListener(navegacionUsuarioComponent);
        this.bEaPlay.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bEaPlay);
        // BOTÓN STORE--------------------------------------------------------------------
        this.bStore = sObjGraficos.construirJButton(
                "   Store",
                0, 250, 250, 50,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrilla2(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bStore.addActionListener(navegacionUsuarioComponent);
        this.bStore.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bStore);

        // BOTÓN BROWSE GAMES--------------------------------------------------------------------
        this.bBrowseGames = sObjGraficos.construirJButton(
                "      Browse Games                     >",
                0, 300, 250, 30,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bBrowseGames.addActionListener(navegacionUsuarioComponent);
        this.bBrowseGames.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bBrowseGames);

        // BOTÓN DEALS--------------------------------------------------------------------
        this.bDeals = sObjGraficos.construirJButton(
                "      Deals                                    >",
                0, 330, 250, 30,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bDeals.addActionListener(navegacionUsuarioComponent);
        this.bDeals.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bDeals);

        // BOTÓN MY GAME LIBRARY--------------------------------------------------------------------
        this.bLibrary = sObjGraficos.construirJButton(
                "   My Game Library",
                0, 360, 250, 50,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrilla2(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bLibrary.addActionListener(navegacionUsuarioComponent);
        this.bLibrary.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bLibrary);

        // BOTÓN NOTIFICATIONS--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iNotifications.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );

        this.bNotifications = sObjGraficos.construirJButton(
                "   Notifications                           >",
                0, 411, 250, 48,
                sRecursos.getCMano(),
                iDimAux,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaroCuerpo(),
                bVacio,
                "l",
                true
        );
        this.bNotifications.addActionListener(navegacionUsuarioComponent);
        this.bNotifications.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bNotifications);
        //BOTÓN ABOUT
        this.bAbout = sObjGraficos.construirJButton(
                "About",
                0, 465, 55, 20,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaro(),
                new EmptyBorder(0, 15, 0, 0),
                "l",
                true
        );
        this.bAbout.setName("bAbout");
        this.bAbout.addActionListener(navegacionUsuarioComponent);
        this.bAbout.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bAbout);

        //BOTÓN DOWNLOAD
        this.bDownload = sObjGraficos.construirJButton(
                "Download",
                65, 465, 65, 20,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaro(),
                new EmptyBorder(0, 0, 0, 0),
                "l",
                true
        );
        this.bDownload.setName("bDownload");
        this.bDownload.addActionListener(navegacionUsuarioComponent);
        this.bDownload.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bDownload);

        //BOTÓN HELP
        this.bHelp = sObjGraficos.construirJButton(
                "Help",
                140, 465, 35, 20,
                sRecursos.getCMano(),
                null,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaro(),
                new EmptyBorder(0, 0, 0, 0),
                "l",
                true
        );
        this.bHelp.setName("bHelp");
        this.bHelp.addActionListener(navegacionUsuarioComponent);
        this.bHelp.addMouseListener(navegacionUsuarioComponent);
        this.pSuperior.add(bHelp);

        //BOTÓN USUARIO
        iDimAux = new ImageIcon(
                iIconoUsuario.getImage()
                        .getScaledInstance(50, 40, Image.SCALE_AREA_AVERAGING)
        );

        this.bUsuario = sObjGraficos.construirJButton(
                "<html><p style='color:#afb2ba'>Usuario&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp></p><p>n Origin Points</p></html>",
                0, 65, 250, 50,
                sRecursos.getCMano(),
                iDimAux,
                sRecursos.getFontPrincipalNegrillaPequena(),
                null,
                sRecursos.getColorGrisClaro(),
                new EmptyBorder(0, 15, 0, 0),
                "l",
                true
        );
        this.bUsuario.addActionListener(navegacionUsuarioComponent);
        this.bUsuario.addMouseListener(navegacionUsuarioComponent);
        this.pInferior.add(bUsuario);
    }

    public void crearJLabels() {
        //LABEL BUSQUEDA
        iDimAux = new ImageIcon(
                iBusqueda.getImage()
                        .getScaledInstance(230, 50, Image.SCALE_AREA_AVERAGING)
        );

        this.lBusqueda = sObjGraficos.construirJLabel(
                null,
                ((this.pSuperior.getWidth() - 230) / 2) - 10, 85, 250, 50,
                null,
                iDimAux,
                null, null, null, new EmptyBorder(0, 0, 0, 0),
                "c"
        );
        this.pSuperior.add(lBusqueda);

        //LABEL VACIO
        this.lVacio = sObjGraficos.construirJLabel(
                null,
                0, 410, 250, 50,
                null,
                null,
                null, null, null, sRecursos.getBGris(),
                "c"
        );
        this.pSuperior.add(lVacio);

        //LABEL PUNTO
        this.lPunto = sObjGraficos.construirJLabel(
                "<html>&#8226</html>",
                57, 473, 5, 5,
                null,
                null,
                sRecursos.getFontSimbolos(), null, sRecursos.getColorGrisClaro(), new EmptyBorder(0, 0, 0, 0),
                "c"
        );
        this.pSuperior.add(lPunto);

        this.lPunto = sObjGraficos.construirJLabel(
                "<html>&#8226</html>",
                133, 473, 5, 5,
                null,
                null,
                sRecursos.getFontSimbolos(), null, sRecursos.getColorGrisClaro(), new EmptyBorder(0, 0, 0, 0),
                "c"
        );
        this.pSuperior.add(lPunto);
    }
    
    public JButton getBInicio() {
        return bInicio;
    }
    public JButton getBEaPlayInicio() {
        return bEaPlay;
    }
    
    public JButton getBStore() {
        return bStore;
    }
    public JButton getBBrowseGames() {
        return bBrowseGames;
    }
    public JButton getBDeals() {
        return bDeals;
    }
    public JButton getBLibrary() {
        return bLibrary;
    }
    public JButton getBNotifications() {
        return bNotifications;
    }
    
    public JPanel getPSuperior(){
        return pSuperior;
    }
}
