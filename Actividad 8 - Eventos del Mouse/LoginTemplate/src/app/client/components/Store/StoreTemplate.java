/*
 * To change this license header, choose L
icense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Store;

import app.client.components.OnSale.OnSaleComponent;
import app.client.components.OnSale.OnSaleTemplate;
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
public class StoreTemplate extends JPanel {

    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private StoreComponent storeComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración de objetos gráficos
    private JPanel pSims4, pFifa21, pVibesSale, pPlayPro, pOnSale;
    private JLabel lOnSale;

    private ImageIcon iTarjetaDescuento1, iTarjetaDescuento2, iTarjetaDescuento3, iTarjetaDescuento4;
    private ImageIcon iOnSale1, iOnSale2, iOnSale3, iOnSale4, iOnSale5;

    public StoreTemplate(StoreComponent storeComponent) {
        this.storeComponent = storeComponent;
        this.storeComponent.getClass();

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearContenidoPSims4();
        this.crearContenidoPFifa21();
        this.crearCotenidoPVibesSale();
        this.crearContenidoPPlayPro();
        this.crearContenidoPOnSale();

        this.setSize(850, 790);
        this.setBackground(sRecursos.getColorGrisStore());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradores() {
        this.iTarjetaDescuento1 = new ImageIcon("src/assets/images/tarjetasDescuento/theSims4.jpg");
        this.iTarjetaDescuento2 = new ImageIcon("src/assets/images/tarjetasDescuento/FIFA21.jpg");
        this.iTarjetaDescuento3 = new ImageIcon("src/assets/images/tarjetasDescuento/goodVibes.jpg");
        this.iTarjetaDescuento4 = new ImageIcon("src/assets/images/tarjetasDescuento/playPro.jpg");
        this.iOnSale1 = new ImageIcon("src/assets/images/imagenesSeccionOnSale/FIFA21.jpg");
        this.iOnSale2 = new ImageIcon("src/assets/images/imagenesSeccionOnSale/starWars-Squadrons.jpg");
        this.iOnSale3 = new ImageIcon("src/assets/images/imagenesSeccionOnSale/losSims4.jpg");
        this.iOnSale4 = new ImageIcon("src/assets/images/imagenesSeccionOnSale/losSims4-SnowyEscape.jpg");
        this.iOnSale5 = new ImageIcon("src/assets/images/imagenesSeccionOnSale/needForSpeed-HotPursuitRemastered.jpg");
    }

    public void crearJPanels() {
        this.pSims4 = sObjGraficos.construirJPanel(40, 15, 370, 210, Color.orange, null);
        this.add(pSims4);

        this.pFifa21 = sObjGraficos.construirJPanel(441, 15, 370, 210, Color.orange, null);
        this.add(pFifa21);

        this.pVibesSale = sObjGraficos.construirJPanel(40, 240, 370, 210, Color.orange, null);
        this.add(pVibesSale);

        this.pPlayPro = sObjGraficos.construirJPanel(441, 240, 370, 210, Color.orange, null);
        this.add(pPlayPro);

        this.pOnSale = sObjGraficos.construirJPanel(40, 455, 770, 238, sRecursos.getColorGrisStore(), null);
        this.add(pOnSale);
    }

    public void crearContenidoPSims4() {
        this.pSims4.add(new TarjetaDescuentoComponent(
                "Take 88% off The Sims 4",
                iTarjetaDescuento1,
                "Build your world and become whoever you want to be"
        ).getTarjetaDescuentoTemplate());
    }

    public void crearContenidoPFifa21() {
        this.pFifa21.add(new TarjetaDescuentoComponent(
                "FIFA 21 is up to 63% off",
                iTarjetaDescuento2,
                "Play by Jan 15 to add David Beckham to your FUT & VOLTA squads"
        ).getTarjetaDescuentoTemplate());
    }

    public void crearCotenidoPVibesSale() {
        this.pVibesSale.add(new TarjetaDescuentoComponent(
                "Get up to 63% off",
                iTarjetaDescuento3,
                "Stock up on heart-pumping titles during the Good Vibes Sale"
        ).getTarjetaDescuentoTemplate());
    }

    public void crearContenidoPPlayPro() {
        this.pPlayPro.add(new TarjetaDescuentoComponent(
                "PlayPro",
                iTarjetaDescuento4,
                "Members score an extra 10% off FIFA 21 and more until Jan 13"
        ).getTarjetaDescuentoTemplate());
    }

    public void crearContenidoPOnSale() {

        this.lOnSale = sObjGraficos.construirJLabel(
                "On Sale",
                -45, 0, 160, 30,
                null, null,
                sRecursos.getFontTitulo(),
                null,
                Color.BLACK,
                null,
                "c"
        );
        this.pOnSale.add(lOnSale);

        OnSaleTemplate p1 = new OnSaleComponent(
                iOnSale1, "FIFA 21 Champions Edition", "US$ 29.99").getOnSaleTemplate();
        p1.setLocation(15, 35);
        this.pOnSale.add(p1);
        
        // Componente OnSale 2 -----------------------------------------
        OnSaleTemplate p2 = new OnSaleComponent(
                iOnSale2, "STAR WARS: Squadrons", "US$ 23.99").getOnSaleTemplate();
        p2.setLocation(30 + p2.getWidth(),35);
        this.pOnSale.add(p2);
        
        // Componente OnSale 3 -----------------------------------------
        OnSaleTemplate p3 = new OnSaleComponent(
                iOnSale3, "The Sims 4", "US$ 4.99").getOnSaleTemplate();
        p3.setLocation(45 + p3.getWidth()*2,35);
        this.pOnSale.add(p3);
        
        // Componente OnSale 4 -----------------------------------------
        OnSaleTemplate p4 = new OnSaleComponent(
                iOnSale4, "The Sims 4 Snowy Escape", "US$ 19.99").getOnSaleTemplate();
        p4.setLocation(60 + p4.getWidth()*3,35);
        this.pOnSale.add(p4);
        
        // Componente OnSale 5 -----------------------------------------
        OnSaleTemplate p5 = new OnSaleComponent(
                iOnSale5, "Need for Speed Hot Pursuit Remastered", "US$ 14.99").getOnSaleTemplate();
        p5.setLocation(75 + p5.getWidth()*4,35);
        this.pOnSale.add(p5);
    }
}
