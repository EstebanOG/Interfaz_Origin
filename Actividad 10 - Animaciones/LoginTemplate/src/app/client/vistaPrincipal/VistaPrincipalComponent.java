/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

import app.client.components.barraTitulo.BarraTituloComponent;
import app.client.components.navegacionUsuario.NavegacionUsuarioComponent;
import app.client.login.LoginComponent;
import app.client.components.MyHome.MyHomeComponent;
import app.client.components.EAPlay.EAPlayComponent;
import app.client.components.Store.StoreComponent;
import app.client.components.BrowseGames.BrowseGamesComponent;
import app.client.components.Deals.DealsComponent;
import app.client.components.MyGameLibrary.MyGameLibraryComponent;
import app.client.components.Notifications.NotificationsComponent;
import app.client.components.About.AboutComponent;
import app.client.components.Download.DownloadComponent;
import app.client.components.Help.HelpComponent;
import app.client.components.Perfil.PerfilComponent;

import java.awt.Frame;

/**
 *
 * @author Usuario
 */
public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vpTemplate;

    // Declaración Componentes
    private BarraTituloComponent barraTituloComponent;
    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private MyHomeComponent myHomeComponent;
    private EAPlayComponent eAPlayComponent;
    private StoreComponent storeComponent;
    private BrowseGamesComponent browseGamesComponent;
    private DealsComponent dealsComponent;
    private MyGameLibraryComponent myGameLibraryComponent;
    private NotificationsComponent notificationsComponent;
    private AboutComponent aboutComponent;
    private DownloadComponent downloadComponent;
    private HelpComponent helpComponent;
    private PerfilComponent perfilComponent;
    private LoginComponent loginComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
        this.vpTemplate = new VistaPrincipalTemplate(this);
        this.barraTituloComponent = new BarraTituloComponent(this);
        this.navegacionUsuarioComponent = new NavegacionUsuarioComponent(this);
        this.myHomeComponent = new MyHomeComponent();

        vpTemplate.getPBarra()
                .add(barraTituloComponent.getBarraTituloTemplate());

        vpTemplate.getPNavegacion()
                .add(navegacionUsuarioComponent.getNavegacionUsuarioTemplate());

        vpTemplate.getPPrincipal()
                .add(myHomeComponent.getMyHomeTemplate());
    }

    public void mostrarComponente(String comando) {
        vpTemplate.getPPrincipal().removeAll();
        switch (comando) {
            case "MyHome":
                vpTemplate.getPPrincipal()
                        .add(myHomeComponent.getMyHomeTemplate());
                break;
            case "EAPlay":
                if (this.eAPlayComponent == null) {
                    this.eAPlayComponent = new EAPlayComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(eAPlayComponent.getEAPlayTemplate());
                break;
            case "Store":

                if (this.storeComponent == null) {
                    this.storeComponent = new StoreComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(storeComponent.getStoreTemplate());
                break;
            case "BrowseGames":

                if (this.browseGamesComponent == null) {
                    this.browseGamesComponent = new BrowseGamesComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(browseGamesComponent.getBrowseGamesTemplate());
                break;
            case "Deals":

                if (this.dealsComponent == null) {
                    this.dealsComponent = new DealsComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(dealsComponent.getDealsTemplate());
                break;
            case "MyGameLibrary":
                if (this.myGameLibraryComponent == null) {
                    this.myGameLibraryComponent = new MyGameLibraryComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(myGameLibraryComponent.getMyGameLibraryTemplate());
                break;

            case "Notifications":
                if (this.notificationsComponent == null) {
                    this.notificationsComponent = new NotificationsComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(notificationsComponent.getNotificationsTemplate());

                break;

            case "About":
                if (this.aboutComponent == null) {
                    this.aboutComponent = new AboutComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(aboutComponent.getAboutTemplate());
                break;

            case "Download":
                if (this.downloadComponent == null) {
                    this.downloadComponent = new DownloadComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(downloadComponent.getDownloadTemplate());
                break;

            case "Help":
                if (this.helpComponent == null) {
                    this.helpComponent = new HelpComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(helpComponent.getHelpTemplate());
                break;

            case "Perfil":
                if (this.perfilComponent == null) {
                    this.perfilComponent = new PerfilComponent();
                }
                vpTemplate.getPPrincipal()
                        .add(perfilComponent.getPerfilTemplate());
                break;
        }
        vpTemplate.repaint();
    }

    public VistaPrincipalTemplate getVpTemplate() {
        return vpTemplate;
    }

    public void cerrar() {
        System.exit(0);
    }

    public void minimizar() {
        this.vpTemplate.setExtendedState(Frame.ICONIFIED);
    }

    // DENTRO DE LA CLASE VISTA PRINCIPAL COMPONENT
    public void moverVentana(int posicionX, int posicionY) {
        this.vpTemplate.setLocation(posicionX, posicionY);
    }
}
