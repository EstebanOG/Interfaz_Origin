package app.client.login;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.logicServices.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginComponent extends MouseAdapter implements ActionListener {

    private JButton boton,botonSec;
    private JTextField text;
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    private String[] placeholders = {"Email Address", "Password"};
    private UsuarioService sUsuario;

    public LoginComponent() {
        sUsuario = UsuarioService.getService();
        loginTemplate = new LoginTemplate(this);

    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(loginTemplate.getBEntrar())) {
            this.enviarDatosUsuario();
            //entrar();
        }
        if (e.getSource().equals(loginTemplate.getBRegistrarse())) {
            boton = ((JButton) e.getSource());
            botonSec = loginTemplate.getBSignInTemplate();
            if(boton.getBorder() == null){
                boton.setBorder(loginTemplate.getRecursosService().getBInferiorPrincipal());
                botonSec.setBorder(null);
            }
            JOptionPane.showMessageDialog(null, "Boton pestaña Registrarse", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBSignInTemplate())) {
            boton = ((JButton) e.getSource());
            botonSec = loginTemplate.getBRegistrarse();
            if(boton.getBorder() == null){
                boton.setBorder(loginTemplate.getRecursosService().getBInferiorPrincipal());
                botonSec.setBorder(null);
            }
            //JOptionPane.showMessageDialog(null, "Boton pestaña Ingresar", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBCerrar())) {
            System.exit(0);
        }
//        if (e.getSource().equals(loginTemplate.getBOpcion1())) {
//            JOptionPane.showMessageDialog(null, "Boton Opcion1", "Advertencia", 1);
//        }
//        if (e.getSource().equals(loginTemplate.getBOpcion2())) {
//            JOptionPane.showMessageDialog(null, "Boton Opcion2", "Advertencia", 1);
//        }
//        if (e.getSource().equals(loginTemplate.getBOpcion3())) {
//            JOptionPane.showMessageDialog(null, "Boton Opcion3", "Advertencia", 1);
//        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() instanceof JTextField) {
            text = ((JTextField) e.getSource());
            text.setBorder(loginTemplate.getRecursosService().getBPrincipalCompleto());
            if (text.getText().equals(placeholders[0])
                    || text.getText().equals(placeholders[1])) {
                text.setText("");
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            boton = ((JButton) e.getSource());
            boton.setBackground(loginTemplate.getRecursosService().getColorPrincipalOscuro());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            boton = ((JButton) e.getSource());
            boton.setBackground(loginTemplate.getRecursosService().getColorPrincipal());
        }
    }

    public void enviarDatosUsuario() {
        String nombreUsuario = loginTemplate.getTNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.getTClaveUsuario().getPassword());
        String regionUsuario = (String) loginTemplate.getCbRegion().getSelectedItem();
        if (!nombreUsuario.isEmpty() && !claveUsuario.isEmpty()) {
            if (sUsuario.verificarDatosUsuario(nombreUsuario, claveUsuario, regionUsuario)) {
                JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Advertencia", 1);
                entrar();
            } else {
                JOptionPane.showMessageDialog(null, "Algo quedo mal", "Advertencia", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede dejar un campo vacio", "Advertencia", 2);
        }

    }

    public void entrar() {
        if (vistaPrincipal == null) {
            this.vistaPrincipal = new VistaPrincipalComponent(this);
        } else {
            this.vistaPrincipal.getVpTemplate().setVisible(true);
        }
        loginTemplate.setVisible(false);
    }
}
