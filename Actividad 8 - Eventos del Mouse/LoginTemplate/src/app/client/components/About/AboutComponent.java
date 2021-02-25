/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.About;

/**
 *
 * @author Christian Galindo
 */
public class AboutComponent {
    private AboutTemplate aboutTemplate;

    public AboutComponent() {
        this.aboutTemplate = new AboutTemplate(this);
    }

    public AboutTemplate getAboutTemplate() {
        return this.aboutTemplate;
    }
}
