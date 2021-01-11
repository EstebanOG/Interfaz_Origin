/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Store;

/**
 *
 * @author Christian Galindo
 */
public class StoreComponent {
    private StoreTemplate storeTemplate;

    public StoreComponent() {
        this.storeTemplate = new StoreTemplate(this);
    }

    public StoreTemplate getStoreTemplate() {
        return this.storeTemplate;
    }
}
