/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Deals;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class DealsTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private DealsComponent dealsComponent;

    public DealsTemplate(DealsComponent dealsComponent) {
        this.dealsComponent = dealsComponent;
        this.dealsComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        this.setVisible(true);
    }
}
