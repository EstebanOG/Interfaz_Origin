/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Help;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class HelpTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private HelpComponent helpComponent;

    public HelpTemplate(HelpComponent helpComponent) {
        this.helpComponent = helpComponent;
        this.helpComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
