/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.MyGameLibrary;

/**
 *
 * @author Christian Galindo
 */
public class MyGameLibraryComponent {
    private MyGameLibraryTemplate myGameLibraryTemplate;

    public MyGameLibraryComponent() {
        this.myGameLibraryTemplate = new MyGameLibraryTemplate(this);
    }

    public MyGameLibraryTemplate getMyGameLibraryTemplate() {
        return this.myGameLibraryTemplate;
    }
}
