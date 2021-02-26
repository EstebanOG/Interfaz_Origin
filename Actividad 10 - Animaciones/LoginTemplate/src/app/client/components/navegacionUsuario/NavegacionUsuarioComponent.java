package app.client.components.navegacionUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.MouseEvent;
import app.services.graphicServices.RecursosService;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

public class NavegacionUsuarioComponent extends MouseAdapter implements ActionListener {
  private NavegacionUsuarioTemplate navegacionUsuarioTemplate;
  private VistaPrincipalComponent vistaPrincipalComponent;
  private RecursosService sRecursos;

  public NavegacionUsuarioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
    this.vistaPrincipalComponent = vistaPrincipalComponent;
    this.navegacionUsuarioTemplate = new NavegacionUsuarioTemplate(this);
    this.sRecursos = RecursosService.getService();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().contains("<html")){
        this.vistaPrincipalComponent.mostrarComponente("Perfil");
    }else{
        this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().replace(" ","").replace(">",""));
    }
  }
 
  public NavegacionUsuarioTemplate getNavegacionUsuarioTemplate() {
    return this.navegacionUsuarioTemplate;
  }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        boton.setContentAreaFilled(true);
        boton.setBackground(RecursosService.getService().getColorPrincipalGrisClaro());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        boton.setContentAreaFilled(false);
    }
}