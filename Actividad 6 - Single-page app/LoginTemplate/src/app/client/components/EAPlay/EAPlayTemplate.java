/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.EAPlay;

import app.client.components.MyHome.MyHomeComponent;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class EAPlayTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private EAPlayComponent eAPlayComponent;

    public EAPlayTemplate(EAPlayComponent eAPlayComponent) {
        this.eAPlayComponent = eAPlayComponent;
        this.eAPlayComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.GREEN);
        this.setLayout(null);
        this.setVisible(true);
    }
}
