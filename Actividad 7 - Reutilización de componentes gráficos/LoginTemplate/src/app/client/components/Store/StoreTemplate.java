/*
 * To change this license header, choose L
icense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Store;

import app.client.components.TarjetaDescuento.TarjetaDescuentoComponent;
import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class StoreTemplate extends JPanel{
    private static final long serialVersionUID = 1L;
   
    // Declaración Servicios y dependencias
    private StoreComponent storeComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    // Declaración de objetos gráficos
    private JPanel pSims4, pFifa21, pVibesSale, pPlayPro, pOnSale;
    private JLabel jOnSale;
    
    private ImageIcon iTarjetaDescuento1, iTarjetaDescuento2, iTarjetaDescuento3, iTarjetaDescuento4;
//    private ImageIcon 
    
    public StoreTemplate(StoreComponent storeComponent) {
        this.storeComponent = storeComponent;
        this.storeComponent.getClass();
        
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearContenidoPSims4();
        
        this.setSize(850, 775);
        this.setBackground(sRecursos.getColorGrisStore());
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearObjetosDecoradores(){
        this.iTarjetaDescuento1 = new ImageIcon("src/assets/images/tarjetasDescuento/theSims4.jpg");
        this.iTarjetaDescuento2 = new ImageIcon("src/assets/images/tarjetasDescuento/FIFA21.jpg");
        this.iTarjetaDescuento3 = new ImageIcon("src/assets/images/tarjetasDescuento/goodVibes.jpg");
        this.iTarjetaDescuento4 = new ImageIcon("src/assets/images/tarjetasDescuento/playPro.jpg");
    }
    
    
    public void crearJPanels(){
        this.pSims4 = sObjGraficos.construirJPanel(40, 15, 370, 210, Color.orange, null);
        this.add(pSims4);
        
        this.pFifa21 = sObjGraficos.construirJPanel(441, 15, 370, 210, Color.orange, null);
        this.add(pFifa21);
        
        this.pVibesSale = sObjGraficos.construirJPanel(40, 240, 370, 210, Color.orange, null);
        this.add(pVibesSale);
        
        this.pPlayPro = sObjGraficos.construirJPanel(441, 240, 370, 210, Color.orange, null);
        this.add(pPlayPro);
        
        this.pOnSale = sObjGraficos.construirJPanel(40, 465, 770, 218, Color.orange, null);
        this.add(pOnSale);
    }
    
    public void crearContenidoPSims4(){
        this.pSims4.add(new TarjetaDescuentoComponent(
                "Take 88% off The Sims 4",
                iTarjetaDescuento1,
                "Build your world and become whoever you want to be"
        ).getTarjetaDescuentoTemplate());
    }
}
