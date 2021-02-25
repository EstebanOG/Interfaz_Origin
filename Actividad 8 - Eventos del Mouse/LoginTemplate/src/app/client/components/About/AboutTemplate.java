/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.About;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class AboutTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private AboutComponent aboutComponent;

    public AboutTemplate(AboutComponent aboutComponent) {
        this.aboutComponent = aboutComponent;
        this.aboutComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }
}
