/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.MyHome;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class MyHomeTemplate extends JPanel {

    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private MyHomeComponent myHomeComponent;

    public MyHomeTemplate(MyHomeComponent myHomeComponent) {
        this.myHomeComponent = myHomeComponent;
        this.myHomeComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
