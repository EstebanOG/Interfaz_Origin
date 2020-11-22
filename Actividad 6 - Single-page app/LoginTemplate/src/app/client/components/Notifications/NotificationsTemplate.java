/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Notifications;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Christian Galindo
 */
public class NotificationsTemplate extends JPanel{
    private static final long serialVersionUID = 1L;

    // Declaración Servicios y dependencias
    private NotificationsComponent notificationsComponent;

    public NotificationsTemplate(NotificationsComponent notificationsComponent) {
        this.notificationsComponent = notificationsComponent;
        this.notificationsComponent.getClass();

        this.setSize(850, 775);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
