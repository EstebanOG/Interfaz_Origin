/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Download;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class DownloadTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private DownloadComponent downloadComponent;

    public DownloadTemplate(DownloadComponent downloadComponent) {
        this.downloadComponent = downloadComponent;
        this.downloadComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
