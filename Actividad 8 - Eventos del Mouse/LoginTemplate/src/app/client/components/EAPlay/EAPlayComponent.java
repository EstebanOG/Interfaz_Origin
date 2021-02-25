/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.EAPlay;

/**
 *
 * @author Christian Galindo
 */
public class EAPlayComponent {
    private EAPlayTemplate eAPlayTemplate;

    public EAPlayComponent() {
        this.eAPlayTemplate = new EAPlayTemplate(this);
    }

    public EAPlayTemplate getEAPlayTemplate() {
        return this.eAPlayTemplate;
    }
}
