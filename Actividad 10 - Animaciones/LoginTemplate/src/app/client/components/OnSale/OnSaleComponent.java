/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.OnSale;

import javax.swing.ImageIcon;
import models.Juego;

public class OnSaleComponent {
    private OnSaleTemplate onSaleTemplate;
    
    public OnSaleComponent(Juego accion){
        this.onSaleTemplate = new OnSaleTemplate(this, accion);
    }
    
    public OnSaleTemplate getOnSaleTemplate(){
        return onSaleTemplate;
    }
}
