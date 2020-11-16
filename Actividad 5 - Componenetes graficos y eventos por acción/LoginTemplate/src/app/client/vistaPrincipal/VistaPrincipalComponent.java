/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

/**
 *
 * @author Usuario
 */
public class VistaPrincipalComponent {
    
    private VistaPrincipalTemplate vpTemplate;
    
    public VistaPrincipalComponent(){
        vpTemplate = new VistaPrincipalTemplate(this);
    }
    
    public VistaPrincipalTemplate getVpTemplate(){
        return vpTemplate;
    }
}
