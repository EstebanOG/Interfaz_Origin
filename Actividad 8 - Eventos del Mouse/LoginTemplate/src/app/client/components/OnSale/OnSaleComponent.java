/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.OnSale;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class OnSaleComponent {
    private OnSaleTemplate onSaleTemplate;
    
    public OnSaleComponent(ImageIcon imagen, String titulo, String precio){
        this.onSaleTemplate = new OnSaleTemplate(this, imagen, titulo, precio);
    }
    
    public OnSaleTemplate getOnSaleTemplate(){
        return onSaleTemplate;
    }
}
