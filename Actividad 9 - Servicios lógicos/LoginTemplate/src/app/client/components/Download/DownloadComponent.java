/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Download;

/**
 *
 * @author Christian Galindo
 */
public class DownloadComponent {
    private DownloadTemplate downloadTemplate;

    public DownloadComponent() {
        this.downloadTemplate = new DownloadTemplate(this);
    }

    public DownloadTemplate getDownloadTemplate() {
        return this.downloadTemplate;
    }
}
