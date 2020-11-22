/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Perfil;

/**
 *
 * @author Christian Galindo
 */
public class PerfilComponent {
    private PerfilTemplate perfilTemplate;

    public PerfilComponent() {
        this.perfilTemplate = new PerfilTemplate(this);
    }

    public PerfilTemplate getPerfilTemplate() {
        return this.perfilTemplate;
    }
}
