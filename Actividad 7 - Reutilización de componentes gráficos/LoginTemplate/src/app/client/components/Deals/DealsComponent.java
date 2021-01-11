/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Deals;

/**
 *
 * @author Christian Galindo
 */
public class DealsComponent {
    private DealsTemplate dealsTemplate;

    public DealsComponent() {
        this.dealsTemplate = new DealsTemplate(this);
    }

    public DealsTemplate getDealsTemplate() {
        return this.dealsTemplate;
    }
}
