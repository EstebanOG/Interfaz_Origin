/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

/**
 *
 * @author Christian Galindo
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
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
  private JLabel lTituloApp, lTituloLogin, lRemPass, lRegion,lIconLoc,lIconUser,lIconPass;
  private JLabel lFondo;
  private JTextField tNombreUsuario;
  private JPasswordField tClaveUsuario;
  private JComboBox<String> cbRegion;
  private JButton bEntrar, bCerrar, bRegistrarse, bSignInTemplate, bOpcion1, bOpcion2, bOpcion3;
  private JCheckBox checkSi, checkNo;
  private ButtonGroup grupo;
  // private JRadioButton rbOpcion1, rbOpcion2;
  // private JTextArea taSugerencias;

  //Declaración de Objetos Decoradores
  private Color colorPrincipal, colorCeleste, colorGrisClaro;
  private Font fontPrincipal, fontTitulo, fontEncabezado, fontPrincipalNegrilla;
  private Cursor cMano;
  private Border bInferiorPrincipal;
  private ImageIcon iFondo,iCerrar,iDimAux, iUser, iPassword, iLocation, iCircleGray, iCircleOrange;
  
  public LoginTemplate() {
    super("Login Usuario");
    this.generarFuentes();
    
    colorPrincipal = new Color(245,108, 45);
    colorCeleste = new Color(44,197,245);
    colorGrisClaro = new Color(101,106,109);
    fontPrincipal = new Font("Open Sans Light",Font.PLAIN,15);
    fontPrincipalNegrilla = new Font("Open Sans Light",Font.BOLD,15);
    fontTitulo = new Font("Open Sans Light",Font.PLAIN,20);
    fontEncabezado = new Font("Open Sans Light",Font.BOLD,11);
    cMano = new Cursor(Cursor.HAND_CURSOR);
    bInferiorPrincipal = createMatteBorder(0, 0, 3, 0, colorPrincipal);
    
    iFondo = new ImageIcon("src/assets/images/fondo.jpg");
    iCerrar = new ImageIcon("src/assets/images/cerrar.png");
    iUser = new ImageIcon("src/assets/images/user.png");
    iPassword = new ImageIcon("src/assets/images/password.png");
    iLocation = new ImageIcon("src/assets/images/location.png");
    iCircleGray = new ImageIcon("src/assets/images/circle gray.png");
    iCircleOrange = new ImageIcon("src/assets/images/circle orange.png");

    pIzquierda = new JPanel();
    pIzquierda.setSize(600, 600);
    pIzquierda.setLocation(0, 0);
    pIzquierda.setBackground(Color.WHITE);
    pIzquierda.setLayout(null);
    this.add(pIzquierda);

    pDerecha = new JPanel();
    pDerecha.setSize(400, 500);
    pDerecha.setLocation(600, 0);
    pDerecha.setBackground(Color.WHITE);
    pDerecha.setLayout(null);
    this.add(pDerecha);
    
//    lTituloApp = new JLabel("Origin Login");
//    lTituloApp.setBounds(100, 20, 220, 30);
//    lTituloApp.setForeground(Color.WHITE);
//    pIzquierda.add(lTituloApp);

    lTituloLogin = new JLabel("Sign in with your EA Account");
    lTituloLogin.setSize(270, 25);
    lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 80);
    lTituloLogin.setForeground(colorGrisClaro);
    lTituloLogin.setFont(fontTitulo);
    lTituloLogin.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lTituloLogin);
    
    lRemPass = new JLabel("Forget your password?");
    //lRemPass = new JLabel("<HTML><a href=''>Forget your password?</a></HTML>");
    lRemPass.setSize(250, 20);
    lRemPass.setLocation((pDerecha.getWidth() - lRemPass.getWidth()) / 2, 410);
    lRemPass.setForeground(colorCeleste);
    lRemPass.setFont(fontPrincipalNegrilla);
    lRemPass.setHorizontalAlignment(SwingConstants.LEFT);
    lRemPass.setCursor(cMano);
    pDerecha.add(lRemPass);
    
    iDimAux = new ImageIcon(iUser.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        
    lIconUser = new JLabel();
    //ImageIcon iconolbl2 = new ImageIcon("src/img/user.png");
    lIconUser.setSize(40, 40);
    //Icon icono2 = new ImageIcon(iconolbl2.getImage().getScaledInstance(lIconUser.getWidth(), lIconUser.getHeight(), Image.SCALE_DEFAULT));
    lIconUser.setLocation((pDerecha.getWidth() - 325) / 2, 120);
    lIconUser.setIcon(iDimAux);
    //lIconUser.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconUser);

    tNombreUsuario = new JTextField();
    TextPrompt placeholder1 = new TextPrompt("Email Address", tNombreUsuario);
    placeholder1.setBackground(colorGrisClaro);
    placeholder1.setFont(fontPrincipal);
    tNombreUsuario.setSize(250, 40);
    tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
    tNombreUsuario.setForeground(colorGrisClaro);
    tNombreUsuario.setBackground(Color.WHITE);
    tNombreUsuario.setFont(fontPrincipal);
    tNombreUsuario.setCaretColor(colorPrincipal);
    tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tNombreUsuario);
    
    iDimAux = new ImageIcon(iPassword.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
    
    lIconPass = new JLabel();
    //ImageIcon iconolbl3 = new ImageIcon("src/img/pass.png");
    lIconPass.setSize(40, 40);
    //Icon icono3 = new ImageIcon(iconolbl3.getImage().getScaledInstance(lIconPass.getWidth(), lIconPass.getHeight(), Image.SCALE_DEFAULT));
    lIconPass.setLocation((pDerecha.getWidth() - 325) / 2, 185);
    lIconPass.setIcon(iDimAux);
    //lIconPass.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconPass);

    tClaveUsuario = new JPasswordField();
    TextPrompt placeholder2 = new TextPrompt("Password", tClaveUsuario);
    placeholder2.setBackground(colorGrisClaro);
    placeholder2.setFont(fontPrincipal);
    tClaveUsuario.setSize(250, 40);
    tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 185);
    tClaveUsuario.setForeground(colorGrisClaro);
    tClaveUsuario.setCaretColor(colorPrincipal);
    tClaveUsuario.setFont(fontPrincipal);
    tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tClaveUsuario);
    
    iDimAux = new ImageIcon(iLocation.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
    
    lIconLoc = new JLabel();
    //ImageIcon iconolbl = new ImageIcon("src/img/location.png");
    lIconLoc.setSize(35, 35);
    //Icon icono = new ImageIcon(iconolbl.getImage().getScaledInstance(lIconLoc.getWidth(), lIconLoc.getHeight(), Image.SCALE_DEFAULT));
    lIconLoc.setLocation((pDerecha.getWidth() - 320) / 2, 240);
    lIconLoc.setIcon(iDimAux);
    lIconLoc.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconLoc);
    
    
    lRegion = new JLabel("Country/Region");
    lRegion.setSize(250, 30);
    lRegion.setLocation((pDerecha.getWidth() - lRegion.getWidth()) / 2, 240);
    lRegion.setForeground(colorGrisClaro);
    lRegion.setFont(fontPrincipal);
    lRegion.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lRegion);

    cbRegion = new JComboBox<>();
    cbRegion.addItem("South America");
    cbRegion.addItem("North America");
    cbRegion.addItem("Europe");
    cbRegion.addItem("Asia");
    cbRegion.addItem("Africa");
    cbRegion.setSize(250, 30);
    cbRegion.setLocation((pDerecha.getWidth() - cbRegion.getWidth()) / 2, 270);
    cbRegion.setForeground(colorGrisClaro);
    cbRegion.setBackground(Color.WHITE);
    ((JLabel) cbRegion.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    cbRegion.setCursor(cMano);
    pDerecha.add(cbRegion);

    bEntrar = new JButton("Sign in");
    bEntrar.setSize(250, 45);
    bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 360);
    bEntrar.setFocusable(false);
    bEntrar.setBackground(colorPrincipal);
    bEntrar.setForeground(Color.WHITE);
    bEntrar.setFont(fontPrincipalNegrilla);
    bEntrar.setCursor(cMano);
    pDerecha.add(bEntrar);
    
    iDimAux = new ImageIcon(iCerrar.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
    
    bCerrar = new JButton();
    bCerrar.setBounds(350, 10, 45, 30);
    bCerrar.setFocusable(false);
    bCerrar.setContentAreaFilled(false);
    bCerrar.setBorder(null);
    bCerrar.setIcon(iDimAux);
    //bCerrar.setBackground(colorPrincipal);
    //bCerrar.setForeground(Color.WHITE);
    bCerrar.setCursor(cMano);
    pDerecha.add(bCerrar);
    
    bSignInTemplate = new JButton("SIGN IN");
    bSignInTemplate.setSize(65,45);
    bSignInTemplate.setLocation((145 - bSignInTemplate.getWidth())/2, 0);
    bSignInTemplate.setFocusable(false);
    bSignInTemplate.setBackground(Color.WHITE);
    bSignInTemplate.setForeground(colorGrisClaro);
    bSignInTemplate.setFont(fontEncabezado);
    bSignInTemplate.setCursor(cMano);
    bSignInTemplate.setBorder(bInferiorPrincipal);
    pDerecha.add(bSignInTemplate);

    bRegistrarse = new JButton("CREATE AN ACCOUNT");
    bRegistrarse.setSize(150,45);
    bRegistrarse.setLocation(135, 0);
    bRegistrarse.setFocusable(false);
    bRegistrarse.setBackground(Color.WHITE);
    bRegistrarse.setForeground(colorGrisClaro);
    bRegistrarse.setFont(fontEncabezado);
    bRegistrarse.setCursor(cMano);
    bRegistrarse.setBorder(bInferiorPrincipal);
    pDerecha.add(bRegistrarse);

    iDimAux = new ImageIcon(iCircleOrange.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
    
    bOpcion1 = new JButton();
    bOpcion1.setBounds(10, 220, 30, 20);
    bOpcion1.setFocusable(false);
    bOpcion1.setContentAreaFilled(false);
    bOpcion1.setIcon(iDimAux);
    bOpcion1.setCursor(cMano);
    bOpcion1.setBorder(null);
    pIzquierda.add(bOpcion1);
    
    iDimAux = new ImageIcon(iCircleGray.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
    
    bOpcion2 = new JButton();
    bOpcion2.setBounds(10, 250, 30, 20);
    bOpcion2.setFocusable(false);
    bOpcion2.setContentAreaFilled(false);
    bOpcion2.setIcon(iDimAux);
    bOpcion2.setCursor(cMano);
    bOpcion2.setBorder(null);
    pIzquierda.add(bOpcion2);

    bOpcion3 = new JButton();
    bOpcion3.setBounds(10, 280, 30, 20);
    bOpcion3.setFocusable(false);
    bOpcion3.setContentAreaFilled(false);
    bOpcion3.setIcon(iDimAux);
    bOpcion3.setCursor(cMano);
    bOpcion3.setBorder(null);
    pIzquierda.add(bOpcion3);

    
    checkSi = new JCheckBox("Remember me");
    checkSi.setSize(230, 25);
    checkSi.setFocusable(false);
    checkSi.setBackground(Color.WHITE);
    checkSi.setForeground(colorGrisClaro);
    checkSi.setFont(fontPrincipal);
    checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 330);
    checkSi.setCursor(cMano);
    pDerecha.add(checkSi);
    
    iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(600, 500, Image.SCALE_AREA_AVERAGING));
    
    
    lFondo = new JLabel();
    lFondo.setBounds(0, 0, 600, 500);
    lFondo.setIcon(iDimAux);
    pIzquierda.add(lFondo);
/*
    checkNo = new JCheckBox("No");
    checkNo.setSize(45, 25);
    checkNo.setFocusable(false);
    checkNo.setBackground(Color.WHITE);
    checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 345);
    pDerecha.add(checkNo);

    grupo = new ButtonGroup();
    grupo.add(checkSi);
    grupo.add(checkNo);*/

    // rbOpcion1 = new JRadioButton("opcion1");
    // rbOpcion1.setBounds(50, 400, 120, 30);
    // pIzquierda.add(rbOpcion1);

    // rbOpcion2 = new JRadioButton("opcion2");
    // rbOpcion2.setBounds(200, 400, 120, 30);
    // pIzquierda.add(rbOpcion2);

    // taSugerencias = new JTextArea("Escribe algo...");
    // taSugerencias.setBounds(185, 180, 230, 140);
    // pIzquierda.add(taSugerencias);
    
    
    setLayout(null);
    setUndecorated(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1000, 500);
    setLocationRelativeTo(this);
    setLayout(null);
    setVisible(true);
  }
  
  private void generarFuentes() {
  try {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    ge.registerFont( Font.createFont(
        Font.TRUETYPE_FONT,
        new File("src/assets/fonts/OpenSans-Light.ttf")
    ));
  } catch (IOException | FontFormatException e) {
    System.out.println(e);
  }
}
}
