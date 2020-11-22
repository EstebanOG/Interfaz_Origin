/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LoginComponent implements ActionListener {

    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;

    public LoginComponent() {
        loginTemplate = new LoginTemplate(this);

    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(loginTemplate.getBEntrar())) {
            mostrarDatos();
            entrar();
        }
        if (e.getSource().equals(loginTemplate.getBRegistrarse())) {
            JOptionPane.showMessageDialog(null, "Boton pestaña Registrarse", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBSignInTemplate())) {
            JOptionPane.showMessageDialog(null, "Boton pestaña Ingresar", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBCerrar())) {
            System.exit(0);
        }
        if (e.getSource().equals(loginTemplate.getBOpcion1())) {
            JOptionPane.showMessageDialog(null, "Boton Opcion1", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBOpcion2())) {
            JOptionPane.showMessageDialog(null, "Boton Opcion2", "Advertencia", 1);
        }
        if (e.getSource().equals(loginTemplate.getBOpcion3())) {
            JOptionPane.showMessageDialog(null, "Boton Opcion3", "Advertencia", 1);
        }

    }

    public void mostrarDatos() {
        String nombreUsuario = loginTemplate.getTNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.getTClaveUsuario().getPassword());
        String regionUsuario = (String) loginTemplate.getCbRegion().getSelectedItem();
        String check = "No";
        if (loginTemplate.getCheckSi().isSelected()) {
            check = "Yes";
        }
        JOptionPane.showMessageDialog(
                null,
                "User: " + nombreUsuario + "\n"
                + "Password: " + claveUsuario + "\n"
                + "Region: " + regionUsuario + "\n"
                + "Remember me: " + check + "\n",
                "Advertencia",
                1
        );
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
