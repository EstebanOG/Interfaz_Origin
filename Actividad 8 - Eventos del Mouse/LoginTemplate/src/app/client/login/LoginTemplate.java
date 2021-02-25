/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

/**
 *
 * @author Christian Galindo
 */
import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
// import javax.swing.JRadioButton;
// import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LoginTemplate extends JFrame {

    private static final long serialVersionUID = 1L;

    // Declaración Objetos Gráficos
    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lTituloLogin, lRemPass, lRegion, lIconLoc, lIconUser, lIconPass;
    private JLabel lFondo, lOrigin;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbRegion;
    private JButton bEntrar, bCerrar, bRegistrarse, bSignInTemplate, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;

    //Declaración de Objetos Decoradores
    private ImageIcon iFondo, iCerrar, iDimAux, iOrigin, iUser, iPassword, iLocation, iCircleGray, iCircleOrange;

    // Declaración servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent loginComponent) {
        super("Login Usuario");

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.loginComponent = loginComponent;

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJComboBoxes();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJLabels();

        setLayout(null);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void crearObjetosDecoradores() {
        iFondo = new ImageIcon("src/assets/images/fondo.jpg");
        iOrigin = new ImageIcon("src/assets/images/origin_banner.png");
        iUser = new ImageIcon("src/assets/images/user.png");
        iPassword = new ImageIcon("src/assets/images/password.png");
        iLocation = new ImageIcon("src/assets/images/location.png");
        iCircleGray = new ImageIcon("src/assets/images/circle gray.png");
        iCircleOrange = new ImageIcon("src/assets/images/circle orange.png");
    }

    public void crearJPanels() {
        pIzquierda = sObjGraficos.construirJPanel(0, 0, 600, 500, Color.WHITE, null);
        this.add(pIzquierda);
        pDerecha = sObjGraficos.construirJPanel(600, 0, 400, 500, Color.WHITE, null);
        this.add(pDerecha);
    }

    public void crearJTextFields() {
        
        tNombreUsuario = sObjGraficos.construirJTextField(
                null,
                (pDerecha.getWidth() - 250) / 2, 120, 250, 40,
                sRecursos.getFontPrincipal(),
                Color.WHITE,
                sRecursos.getColorGrisClaro(),
                sRecursos.getColorPrincipal(),
                BorderFactory.createLineBorder(sRecursos.getColorGrisClaroCuerpo()),
                "c"
        );
        TextPrompt placeholder1 = new TextPrompt("Email Address", tNombreUsuario);
        placeholder1.setBackground(sRecursos.getColorGrisClaro());
        placeholder1.setFont(sRecursos.getFontPrincipal());
        tNombreUsuario.addMouseListener(loginComponent);
        pDerecha.add(tNombreUsuario);
    }

    public void crearJButtons() {
        // BOTÓN ENTRAR-----------------------------------------------------------------------------
        bEntrar = sObjGraficos.construirJButton(
                "Sign in",
                (pDerecha.getWidth() - 250) / 2, 360, 250, 45,
                sRecursos.getCMano(),
                null, sRecursos.getFontPrincipalNegrilla(),
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                null,
                "c",
                true
        );
        bEntrar.addMouseListener(loginComponent);
        bEntrar.addActionListener(loginComponent);
        pDerecha.add(bEntrar);

        // BOTÓN CREAR CUENTA-----------------------------------------------------------------------
        bRegistrarse = sObjGraficos.construirJButton(
                "CREATE AN ACCOUNT",
                135, 0, 150, 45,
                sRecursos.getCMano(),
                null, sRecursos.getFontEncabezado(),
                Color.WHITE,
                sRecursos.getColorGrisClaro(),
                sRecursos.getBInferiorPrincipal(),
                "c",
                true
        );
        bRegistrarse.addActionListener(loginComponent);
        pDerecha.add(bRegistrarse);

        // BOTÓN INGRESAR-----------------------------------------------------------------------
        bSignInTemplate = sObjGraficos.construirJButton(
                "SIGN IN",
                (145 - 65) / 2, 0, 65, 45,
                sRecursos.getCMano(),
                null, sRecursos.getFontEncabezado(),
                Color.WHITE,
                sRecursos.getColorGrisClaro(),
                sRecursos.getBInferiorPrincipal(),
                "c",
                true
        );
        
        bSignInTemplate.addActionListener(loginComponent);
        pDerecha.add(bSignInTemplate);

        // BOTÓN CERRAR-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(
                sRecursos.getICerrar().getImage()
                        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        bCerrar = sObjGraficos.construirJButton(
                null,
                350, 10, 45, 30,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false
        );
        
        bCerrar.addActionListener(loginComponent);
        pDerecha.add(bCerrar);

        iDimAux = new ImageIcon(iCircleOrange.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        // BOTÓN OPCIÓN 1-----------------------------------------------------------------------------
        bOpcion1 = sObjGraficos.construirJButton(
                null,
                10, 220, 20, 20,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false
        );
        bOpcion1.addActionListener(loginComponent);
        pIzquierda.add(bOpcion1);

        iDimAux = new ImageIcon(iCircleGray.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        // BOTÓN OPCIÓN 2-----------------------------------------------------------------------------
        bOpcion2 = sObjGraficos.construirJButton(
                null,
                10, 250, 20, 20,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false
        );
        bOpcion2.addActionListener(loginComponent);
        pIzquierda.add(bOpcion2);

        // BOTÓN OPCIÓN 3-----------------------------------------------------------------------------
        bOpcion3 = sObjGraficos.construirJButton(
                null,
                10, 280, 20, 20,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false
        );
        bOpcion3.addActionListener(loginComponent);
        pIzquierda.add(bOpcion3);
    }

    public void crearJLabels() {
        // LABEL LOGO-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(iOrigin.getImage().getScaledInstance(200, 50, Image.SCALE_AREA_AVERAGING));
        lOrigin = sObjGraficos.construirJLabel(
                null,
                0, 0, 200, 50,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c"
        );
        pIzquierda.add(lOrigin);

        // LABEL FORGET-----------------------------------------------------------------------------
        lRemPass = sObjGraficos.construirJLabel(
                "Forget your password?",
                (pDerecha.getWidth() - 250) / 2, 410, 250, 20,
                sRecursos.getCMano(), null,
                sRecursos.getFontPrincipalNegrilla(),
                null,
                sRecursos.getColorCeleste(),
                null,
                "c"
        );
        lRemPass.setHorizontalAlignment(SwingConstants.LEFT);
        pDerecha.add(lRemPass);

        // LABEL TITULO LOGIN-----------------------------------------------------------------------------
        lTituloLogin = sObjGraficos.construirJLabel(
                "Sign in with your EA Account",
                (pDerecha.getWidth() - 270) / 2, 80, 270, 25,
                null, null,
                sRecursos.getFontTitulo(),
                null,
                sRecursos.getColorGrisClaro(),
                null,
                "c"
        );
        pDerecha.add(lTituloLogin);

        // LABEL REGION-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(iLocation.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));

        lIconLoc = sObjGraficos.construirJLabel(
                null,
                (pDerecha.getWidth() - 320) / 2, 240, 35, 35,
                null, iDimAux,
                null, null, null,
                null,
                "c"
        );
        pDerecha.add(lIconLoc);

        lRegion = sObjGraficos.construirJLabel(
                "Country/Region",
                (pDerecha.getWidth() - 250) / 2, 240, 250, 30,
                null, null,
                sRecursos.getFontPrincipal(),
                null,
                sRecursos.getColorGrisClaro(),
                null,
                "c"
        );
        lRegion.setHorizontalAlignment(SwingConstants.LEFT);
        pDerecha.add(lRegion);

        // LABEL USUARIO-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(iUser.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));

        lIconUser = sObjGraficos.construirJLabel(
                null,
                (pDerecha.getWidth() - 325) / 2, 120, 40, 40,
                null,
                iDimAux,
                null, null, null, null,
                "c"
        );
        pDerecha.add(lIconUser);

        // LABEL CLAVE-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(iPassword.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));

        lIconPass = sObjGraficos.construirJLabel(
                null,
                (pDerecha.getWidth() - 325) / 2, 185, 40, 40,
                null,
                iDimAux,
                null, null, null, null,
                "c"
        );
        pDerecha.add(lIconPass);

        // LABEL FONDO-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(600, 500, Image.SCALE_AREA_AVERAGING));
        lFondo = sObjGraficos.construirJLabel(
                null,
                0, 0, 600, 500,
                null,
                iDimAux,
                null, null, null, null,
                "c"
        );
        pIzquierda.add(lFondo);
    }

    public void crearJPasswordFields() {
        tClaveUsuario = sObjGraficos.construirJPasswordField(
                null,
                (pDerecha.getWidth() - 250) / 2, 185, 250, 40,
                null, null,
                sRecursos.getColorGrisClaro(),
                sRecursos.getColorPrincipal(),
                BorderFactory.createLineBorder(sRecursos.getColorGrisClaroCuerpo()),
                "c"
        );
        TextPrompt placeholder2 = new TextPrompt("Password", tClaveUsuario);
        placeholder2.setBackground(sRecursos.getColorGrisClaro());
        placeholder2.setFont(sRecursos.getFontPrincipal());
        tClaveUsuario.addMouseListener(loginComponent);
        pDerecha.add(tClaveUsuario);
    }

    public void crearJComboBoxes() {
        cbRegion = sObjGraficos.construirJComboBox(
                "South America_North America_Europe_Asia_Africa",
                (pDerecha.getWidth() - 250) / 2, 270, 250, 30,
                null,
                Color.WHITE,
                sRecursos.getColorGrisClaro(),
                "c"
        );
        cbRegion.setCursor(sRecursos.getCMano());
        pDerecha.add(cbRegion);
    }

    public void crearJCheckBoxes() {
        checkSi = sObjGraficos.construirJCheckBox(
                "Remember me",
                (pDerecha.getWidth() - 230) / 2 - 15, 330, 230, 25,
                sRecursos.getCMano(),
                sRecursos.getFontPrincipal(), sRecursos.getColorGrisClaro()
        );
        pDerecha.add(checkSi);
    }

    public JButton getBEntrar() {
        return bEntrar;
    }

    public JButton getBRegistrarse() {
        return bRegistrarse;
    }

    public JButton getBSignInTemplate() {
        return bSignInTemplate;
    }

    public JButton getBCerrar() {
        return bCerrar;
    }

    public JButton getBOpcion1() {
        return bOpcion1;
    }

    public JButton getBOpcion2() {
        return bOpcion2;
    }

    public JButton getBOpcion3() {
        return bOpcion3;
    }

    public JTextField getTNombreUsuario() {
        return tNombreUsuario;
    }

    public JPasswordField getTClaveUsuario() {
        return tClaveUsuario;
    }

    public JComboBox getCbRegion() {
        return cbRegion;
    }

    public JCheckBox getCheckSi() {
        return checkSi;
    }
    
    public RecursosService getRecursosService() { return sRecursos; }
}
