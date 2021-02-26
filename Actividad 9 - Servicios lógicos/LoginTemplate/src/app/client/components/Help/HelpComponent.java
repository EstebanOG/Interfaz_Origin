/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Help;

/**
 *
 * @author Christian Galindo
 */
public class HelpComponent {
   private HelpTemplate helpTemplate;

    public HelpComponent() {
        this.helpTemplate = new HelpTemplate(this);
    }

    public HelpTemplate getHelpTemplate() {
        return this.helpTemplate;
    }
}
