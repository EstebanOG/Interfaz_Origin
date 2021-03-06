package app.client.components.barraTitulo;

import app.services.ObjGraficosService;
import app.services.RecursosService;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.Font;

public class BarraTituloTemplate extends JPanel {
  private static final long serialVersionUID = 1L;

  // Declaración Servicios y dependencias
  private BarraTituloComponent barraTituloComponent;
  private ObjGraficosService sObjGraficos;
  private RecursosService sRecursos;

  // Declaración objetos gráficos
  private JLabel lLogoApp, lTituloApp;
  private JButton bCerrar, bMinimizar;

  // Declaración Objetos Decoradores
  private ImageIcon iLogoApp, iDimAux;
  private Font fontTituloBarra;

  public BarraTituloTemplate(BarraTituloComponent barraTituloComponent) {
    this.barraTituloComponent = barraTituloComponent;
    this.sObjGraficos = ObjGraficosService.getService();
    this.sRecursos = RecursosService.getService();

    this.crearObjetosDecoradores();
    this.crearJLabels();
    this.crearJButtons();

    this.setSize(1100, 25);
    this.setBackground(Color.WHITE);
    this.setLayout(null);
    this.setVisible(true);
  }

  public void crearObjetosDecoradores() {
    iLogoApp = new ImageIcon("src/assets/images/logo.png");
    fontTituloBarra = sRecursos.getFontPrincipalNegrilla2();
  }

  public void crearJButtons() {
    iDimAux = new ImageIcon(
      sRecursos.getICerrar().getImage()
        .getScaledInstance(23, 23, Image.SCALE_AREA_AVERAGING)
    );
    bCerrar = sObjGraficos.construirJButton(
      null, 
      1075, 0, 25, 25,
      sRecursos.getCMano(), 
      iDimAux, 
      null, null, null, null, 
      "c", 
      false
    );
    bCerrar.addActionListener(barraTituloComponent);
    this.add(bCerrar);

    iDimAux = new ImageIcon(
      sRecursos.getIMinimizar().getImage()
        .getScaledInstance(23, 22, Image.SCALE_AREA_AVERAGING)
    );
    bMinimizar = sObjGraficos.construirJButton(
      null,
      1050, 0, 25, 25,
      sRecursos.getCMano(),
      iDimAux,
      null, null, null, null,
      "c",
      false
    );
    bMinimizar.addActionListener(barraTituloComponent);
    this.add(bMinimizar);
  }

  public void crearJLabels() {
    iDimAux = new ImageIcon(
      iLogoApp.getImage()
        .getScaledInstance(23, 23, Image.SCALE_AREA_AVERAGING)
    );
    lLogoApp = sObjGraficos.construirJLabel(
      null,
      0, 0, 25, 25,
      null,
      iDimAux,
      null, null, null, null,
      "c"
    );
    this.add(lLogoApp);

    lTituloApp = sObjGraficos.construirJLabel(
      "Origin",
      0, 0, 100, 25,
      null, null,
      fontTituloBarra,
      null,
      sRecursos.getColorGrisClaro(),
      null,
      "c"
    );
    this.add(lTituloApp);
  }

  public JButton getBCerrar() { return bCerrar; }

  public JButton getBMinimizar() { return bMinimizar; }
}