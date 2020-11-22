package app.client.components.navegacionUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import app.services.RecursosService;

public class NavegacionUsuarioComponent implements ActionListener,MouseListener {
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
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
         
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getComponent().getName()==null){
            e.getComponent().setBackground(sRecursos.getGrisHover());
        }else{
            e.getComponent().setForeground(sRecursos.getColorGrisClaroCuerpo());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if(e.getComponent().getName()==null){
            e.getComponent().setBackground(null);
        }else{
            e.getComponent().setForeground(sRecursos.getColorGrisClaro());
        }
    }
}