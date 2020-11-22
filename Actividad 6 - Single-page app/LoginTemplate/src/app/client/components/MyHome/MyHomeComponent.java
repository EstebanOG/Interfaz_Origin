/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.MyHome;

/**
 *
 * @author Christian Galindo
 */
public class MyHomeComponent {

    private MyHomeTemplate myHomeTemplate;

    public MyHomeComponent() {
        this.myHomeTemplate = new MyHomeTemplate(this);
    }

    public MyHomeTemplate getMyHomeTemplate() {
        return this.myHomeTemplate;
    }
}
