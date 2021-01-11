/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Notifications;

/**
 *
 * @author Christian Galindo
 */
public class NotificationsComponent {
    private NotificationsTemplate notificationsTemplate;

    public NotificationsComponent() {
        this.notificationsTemplate = new NotificationsTemplate(this);
    }

    public NotificationsTemplate getNotificationsTemplate() {
        return this.notificationsTemplate;
    }
}
