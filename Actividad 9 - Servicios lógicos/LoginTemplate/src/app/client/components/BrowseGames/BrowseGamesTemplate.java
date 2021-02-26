/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.BrowseGames;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class BrowseGamesTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private BrowseGamesComponent browseGamesComponent;

    public BrowseGamesTemplate(BrowseGamesComponent browseGamesComponent) {
        this.browseGamesComponent = browseGamesComponent;
        this.browseGamesComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
