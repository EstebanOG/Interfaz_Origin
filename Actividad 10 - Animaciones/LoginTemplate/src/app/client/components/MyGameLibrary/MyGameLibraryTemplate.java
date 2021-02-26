/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.MyGameLibrary;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class MyGameLibraryTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private MyGameLibraryComponent myGameLibraryComponent;

    public MyGameLibraryTemplate(MyGameLibraryComponent myGameLibraryComponent) {
        this.myGameLibraryComponent = myGameLibraryComponent;
        this.myGameLibraryComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(true);
    }
}
