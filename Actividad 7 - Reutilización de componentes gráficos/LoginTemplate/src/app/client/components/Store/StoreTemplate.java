/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Store;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class StoreTemplate extends JPanel{
    private static final long serialVersionUID = 1L;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración Servicios y dependencias
    private StoreComponent storeComponent;

    public StoreTemplate(StoreComponent storeComponent) {
        this.storeComponent = storeComponent;
        this.storeComponent.getClass();
        
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.setSize(850, 775);
        this.setBackground(sRecursos.getColorGrisStore());
        this.setLayout(null);
        this.setVisible(true);
    }
}
