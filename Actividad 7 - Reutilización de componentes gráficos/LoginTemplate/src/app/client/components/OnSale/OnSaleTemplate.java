package app.client.components.OnSale;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class OnSaleTemplate extends JPanel {

    private OnSaleComponent onSaleComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración Objetos Gráficos
    private JLabel lImagen, lTitulo, lPrecio;

    // Declaración Objetos Decoradores
    private ImageIcon iDimAux;

    public OnSaleTemplate(OnSaleComponent onSaleComponent, ImageIcon imagen, String titulo, String precio) {
        this.onSaleComponent = onSaleComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        iDimAux = new ImageIcon(
                imagen.getImage()
                        .getScaledInstance(135, 134, Image.SCALE_AREA_AVERAGING)
        );
        this.lImagen = sObjGraficos.construirJLabel(
                null,
                0, 0, 135, 134,
                null,
                iDimAux,
                null, null, null, null,
                "c"
        );
        this.add(lImagen);

        this.lTitulo = sObjGraficos.construirJLabel(
                "<html><div >" + titulo + "</div></html>",
                5, 136, 125, 33,
                null, null,
                null,
                null,
                sRecursos.getGrisHover(),
                null,
                "c"
        );
        this.add(lTitulo);

        this.lPrecio = sObjGraficos.construirJLabel(
                "<html><div>" + precio + "</div></html>",
                0, 167, 136, 33,
                null, null,
                sRecursos.getFontPrincipal(),
                null,
                sRecursos.getColorPrincipal(),
                null,
                "c"
        );
        this.add(lPrecio);

        this.setSize(136, 200);
        this.setBackground(Color.WHITE);
        this.setBorder(sRecursos.getBGrisCompleto());
        this.setLayout(null);
        this.setVisible(true);
    }
}
