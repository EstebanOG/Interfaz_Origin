package app.client.vistaPrincipal;

import app.services.ObjGraficosService;
import javax.swing.JFrame;

import app.services.RecursosService;
import javax.swing.JPanel;

public class VistaPrincipalTemplate extends JFrame {
    private static final long serialVersionUID = 1L;
    
    // Declaración Objetos Gráficos
    private JPanel pNavegacion, pBarra, pPrincipal;
    
    // Declaración servicios
    private ObjGraficosService sObjGraficos;

    private VistaPrincipalComponent vpComponent;

    public VistaPrincipalTemplate(VistaPrincipalComponent vpc) {
        super("Vista Principal");

        this.vpComponent = vpc;
        this.vpComponent.getClass();
        
        sObjGraficos = ObjGraficosService.getService();
        
        crearJPanels();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 800);
        setLocationRelativeTo(this);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void crearJPanels(){
        pBarra = sObjGraficos.construirJPanel(0, 0, 1100, 25,null, null);
        this.add(pBarra);
        
        pNavegacion = sObjGraficos.construirJPanel(0, 25, 250, 775, null, null);
        this.add(pNavegacion);
        
        pPrincipal = sObjGraficos.construirJPanel(250, 25, 850, 775,null, null);
        this.add(pPrincipal);
    }
    
    public JPanel getPNavegacion() { return this.pNavegacion; }

    public JPanel getPPrincipal() { return this.pPrincipal; }

    public JPanel getPBarra() { return this.pBarra; }
}
