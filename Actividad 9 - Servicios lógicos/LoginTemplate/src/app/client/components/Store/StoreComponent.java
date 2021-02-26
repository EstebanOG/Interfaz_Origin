/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Store;

import app.services.logicServices.JuegoService;
import models.Juego;

/**
 *
 * @author Christian Galindo
 */
public class StoreComponent {

    private StoreTemplate storeTemplate;
    private JuegoService sAccion;

    public StoreComponent() {
        sAccion = JuegoService.getService();
        this.storeTemplate = new StoreTemplate(this);
    }

    public Juego obtenerAccion(int numeroAccion) {
        return sAccion.devolverAccion(numeroAccion);
    }

    public StoreTemplate getStoreTemplate() {
        return this.storeTemplate;
    }
}
