package app.client.vistaPrincipal;

import app.services.ObjGraficosService;
import javax.swing.JFrame;

import app.services.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;

public class VistaPrincipalTemplate extends JFrame {
    private static final long serialVersionUID = 1L;
    
    // Declaración Objetos Gráficos
    private JPanel pNavegacion, pBarra, pPrincipal;
    
    // Declaración servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private VistaPrincipalComponent vpComponent;

    public VistaPrincipalTemplate(VistaPrincipalComponent vpc) {
        super("Vista Principal");

        this.vpComponent = vpc;
        
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        crearJPanels();
        
        getContentPane().setBackground(sRecursos.getColorPrincipal());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
    
    public void crearJPanels(){
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 250, 700, sRecursos.getColorGrisClaro(), null);
        this.add(pNavegacion);
        
        pBarra = sObjGraficos.construirJPanel(250, 0, 850, 50, sRecursos.getColorPrincipal(), null);
        this.add(pBarra);
        
        pPrincipal = sObjGraficos.construirJPanel(250, 50, 850, 600, Color.WHITE, null);
        this.add(pPrincipal);
    }
    
    public JPanel getPNavegacion() { return this.pNavegacion; }

    public JPanel getPPrincipal() { return this.pPrincipal; }

    public JPanel getPBarra() { return this.pBarra; }
}
