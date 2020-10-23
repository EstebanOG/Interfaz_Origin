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
import java.awt.Image;
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

public class LoginTemplate extends JFrame {
  private static final long serialVersionUID = 1L;

  // Declaración Objetos Gráficos
  private JPanel pDerecha, pIzquierda;
  private JLabel lTituloApp, lEslogan, lTituloLogin, lRemPass, lRegion,lIconLoc,lIconUser,lIconPass;
  private JTextField tNombreUsuario;
  private JPasswordField tClaveUsuario;
  private JComboBox<String> cbRegion;
  private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
  private JCheckBox checkSi, checkNo;
  private ButtonGroup grupo;
  // private JRadioButton rbOpcion1, rbOpcion2;
  // private JTextArea taSugerencias;

  public LoginTemplate() {
    super("Login Usuario");

    pIzquierda = new JPanel();
    pIzquierda.setSize(600, 500);
    pIzquierda.setLocation(0, 0);
    pIzquierda.setBackground(new Color(245, 108, 45));
    pIzquierda.setLayout(null);
    this.add(pIzquierda);

    pDerecha = new JPanel();
    pDerecha.setSize(400, 500);
    pDerecha.setLocation(600, 0);
    pDerecha.setBackground(Color.WHITE);
    pDerecha.setLayout(null);
    this.add(pDerecha);

    lTituloApp = new JLabel("Origin Login");
    lTituloApp.setBounds(100, 20, 220, 30);
    lTituloApp.setForeground(Color.WHITE);
    pIzquierda.add(lTituloApp);

    lEslogan = new JLabel("SIGN IN");
    lEslogan.setSize(130, 20);
    lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
    lEslogan.setForeground(Color.DARK_GRAY);
    lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(lEslogan);

    lTituloLogin = new JLabel("with your EA Account");
    lTituloLogin.setSize(150, 30);
    lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 60);
    lTituloLogin.setForeground(Color.DARK_GRAY);
    lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(lTituloLogin);

    lRemPass = new JLabel("<HTML><a href=''>Forget your password?</a></HTML>");
    lRemPass.setSize(140, 20);
    lRemPass.setLocation((pDerecha.getWidth() - lRemPass.getWidth()) / 2, 390);
    lRemPass.setForeground(Color.DARK_GRAY);
    lRemPass.setHorizontalAlignment(SwingConstants.CENTER);
    lRemPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
    pDerecha.add(lRemPass);
    
    lIconUser = new JLabel();
    ImageIcon iconolbl2 = new ImageIcon("src/img/user.png");
    lIconUser.setSize(20, 20);
    Icon icono2 = new ImageIcon(iconolbl2.getImage().getScaledInstance(lIconUser.getWidth(), lIconUser.getHeight(), Image.SCALE_DEFAULT));
    lIconUser.setLocation((pDerecha.getWidth() - 260) / 2, 130);
    lIconUser.setIcon(icono2);
    lIconUser.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconUser);

    tNombreUsuario = new JTextField();
    TextPrompt placeholder1 = new TextPrompt("User", tNombreUsuario);
    tNombreUsuario.setSize(220, 40);
    tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
    tNombreUsuario.setForeground(Color.DARK_GRAY);
    tNombreUsuario.setBackground(Color.WHITE);
    tNombreUsuario.setCaretColor(new Color(245, 108, 45));
    tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tNombreUsuario);
    
    lIconPass = new JLabel();
    ImageIcon iconolbl3 = new ImageIcon("src/img/pass.png");
    lIconPass.setSize(20, 20);
    Icon icono3 = new ImageIcon(iconolbl3.getImage().getScaledInstance(lIconPass.getWidth(), lIconPass.getHeight(), Image.SCALE_DEFAULT));
    lIconPass.setLocation((pDerecha.getWidth() - 260) / 2, 195);
    lIconPass.setIcon(icono3);
    lIconPass.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconPass);

    tClaveUsuario = new JPasswordField();
    TextPrompt placeholder2 = new TextPrompt("Password", tClaveUsuario);
    tClaveUsuario.setSize(220, 40);
    tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 185);
    tClaveUsuario.setForeground(Color.DARK_GRAY);
    tClaveUsuario.setCaretColor(new Color(245, 108, 45));
    tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tClaveUsuario);
    
    lIconLoc = new JLabel();
    ImageIcon iconolbl = new ImageIcon("src/img/location.png");
    lIconLoc.setSize(15, 15);
    Icon icono = new ImageIcon(iconolbl.getImage().getScaledInstance(lIconLoc.getWidth(), lIconLoc.getHeight(), Image.SCALE_DEFAULT));
    lIconLoc.setLocation((pDerecha.getWidth() - 260) / 2, 245);
    lIconLoc.setIcon(icono);
    lIconLoc.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lIconLoc);
    
    
    lRegion = new JLabel("Country/Region");
    lRegion.setSize(220, 30);
    lRegion.setLocation((pDerecha.getWidth() - lRegion.getWidth()) / 2, 240);
    lRegion.setForeground(Color.DARK_GRAY);
    lRegion.setHorizontalAlignment(SwingConstants.LEFT);
    pDerecha.add(lRegion);

    cbRegion = new JComboBox<>();
    cbRegion.addItem("South America");
    cbRegion.addItem("North America");
    cbRegion.addItem("Europe");
    cbRegion.addItem("Asia");
    cbRegion.addItem("Africa");
    cbRegion.setSize(220, 30);
    cbRegion.setLocation((pDerecha.getWidth() - cbRegion.getWidth()) / 2, 270);
    cbRegion.setForeground(Color.DARK_GRAY);
    cbRegion.setBackground(Color.WHITE);
    ((JLabel) cbRegion.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    cbRegion.setCursor(new Cursor(Cursor.HAND_CURSOR));
    pDerecha.add(cbRegion);

    bEntrar = new JButton("Sign in");
    bEntrar.setSize(250, 45);
    bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 340);
    bEntrar.setFocusable(false);
    bEntrar.setBackground(new Color(245, 108, 45));
    bEntrar.setForeground(Color.WHITE);
    bEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    pDerecha.add(bEntrar);

    bCerrar = new JButton("X");
    bCerrar.setBounds(330, 10, 45, 30);
    bCerrar.setFocusable(false);
    bCerrar.setBackground(new Color(245, 108, 45));
    bCerrar.setForeground(Color.WHITE);
    bCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    pDerecha.add(bCerrar);

    bRegistrarse = new JButton("Create an account");
    bRegistrarse.setBounds(230, 420, 145, 35);
    bRegistrarse.setFocusable(false);
    bRegistrarse.setBackground(new Color(245, 108, 45));
    bRegistrarse.setForeground(Color.WHITE);
    pDerecha.add(bRegistrarse);

    
    bOpcion1 = new JButton();
    bOpcion1.setBounds(10, 220, 30, 20);
    pIzquierda.add(bOpcion1);

    bOpcion2 = new JButton();
    bOpcion2.setBounds(10, 250, 30, 20);
    pIzquierda.add(bOpcion2);

    bOpcion3 = new JButton();
    bOpcion3.setBounds(10, 280, 30, 20);
    pIzquierda.add(bOpcion3);

    
    checkSi = new JCheckBox("Remember me");
    checkSi.setSize(230, 25);
    checkSi.setFocusable(false);
    checkSi.setBackground(Color.WHITE);
    checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 310);
    pDerecha.add(checkSi);
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
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1000, 500);
    setLocationRelativeTo(this);
    setLayout(null);
    setVisible(true);
  }
}
