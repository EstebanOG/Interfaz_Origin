/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.TarjetaDescuento;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class TarjetaDescuentoComponent {
    private TarjetaDescuentoTemplate tarjetaDescuentoTemplate;

    public TarjetaDescuentoComponent(String titulo, ImageIcon iImagen,
            String parrafo) {
        this.tarjetaDescuentoTemplate = new TarjetaDescuentoTemplate(this, titulo, iImagen, parrafo);
    }
    
    public TarjetaDescuentoTemplate getTarjetaDescuentoTemplate(){
        return tarjetaDescuentoTemplate;
    }
}
