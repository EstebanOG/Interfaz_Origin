/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Perfil;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class PerfilTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private PerfilComponent perfilComponent;

    public PerfilTemplate(PerfilComponent perfilComponent) {
        this.perfilComponent = perfilComponent;
        this.perfilComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.PINK);
        this.setLayout(null);
        this.setVisible(true);
    }
}
