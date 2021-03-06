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
import app.services.graphicServices.ObjGraficosService;
import app.services.graphicServices.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Juego;

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
        int numeroAccion = 0, fila = 0;
        Juego accion = storeComponent.obtenerAccion(numeroAccion);
        while (accion != null) {
            OnSaleTemplate pAccion = new OnSaleComponent(accion).getOnSaleTemplate();
            pAccion.setLocation(15 + ((pAccion.getWidth() + 15) * (numeroAccion % 5)), 35);
            this.pOnSale.add(pAccion);
            numeroAccion++;
            accion = storeComponent.obtenerAccion(numeroAccion);
        }
    }
}
