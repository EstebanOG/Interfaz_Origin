/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.TarjetaDescuento;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Usuario
 */
public class TarjetaDescuentoTemplate extends JPanel{
    private TarjetaDescuentoComponent tarjetaDescuentoComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    // Declaración Objetos Gráficos
    private JLabel lTitulo, lImagen, lParrafo;
    
    // Declaración Objetos Decoradores
    private ImageIcon iDimAux;
    
    public TarjetaDescuentoTemplate(TarjetaDescuentoComponent tarjetaDescuentoComponent, String titulo, ImageIcon iImagen,
            String parrafo){
        this.tarjetaDescuentoComponent = tarjetaDescuentoComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        
        
        this.lTitulo = sObjGraficos.construirJLabel(
                titulo,
                0, 120, 370, 30,
                null, null,
                sRecursos.getFontPrincipalNegrilla2(),
                sRecursos.getColorNegroTransparente(),
                sRecursos.getColorPrincipal(),
                new EmptyBorder(0,10,0,0),//top,left,bottom,right,
                "l"
        );
        this.add(lTitulo);
        
        lParrafo = sObjGraficos.construirJLabel(
                "<html><div>" + parrafo + "</div></html>", 
                0, 150, 370, 60,
                null, null,
                sRecursos.getFontPrincipal(), 
                sRecursos.getColorNegroTransparente(), 
                Color.WHITE, 
                new EmptyBorder(0,10,0,0),//top,left,bottom,right,
                "c"
                );
        this.add(lParrafo);
        
        iDimAux = new ImageIcon(
                iImagen.getImage()
                .getScaledInstance(370,210, Image.SCALE_AREA_AVERAGING)
        );
        
        lImagen = sObjGraficos.construirJLabel(
            null,
                0, 0, 370, 210,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c"
        );
        this.add(lImagen);
    
        this.setSize(370, 210);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
