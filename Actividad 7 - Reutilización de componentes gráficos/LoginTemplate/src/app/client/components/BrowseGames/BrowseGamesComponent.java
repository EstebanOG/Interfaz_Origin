/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.BrowseGames;


/**
 *
 * @author Christian Galindo
 */
public class BrowseGamesComponent {
    private BrowseGamesTemplate browseGamesTemplate;

    public BrowseGamesComponent() {
        this.browseGamesTemplate = new BrowseGamesTemplate(this);
    }

    public BrowseGamesTemplate getBrowseGamesTemplate() {
        return this.browseGamesTemplate;
    }
}
