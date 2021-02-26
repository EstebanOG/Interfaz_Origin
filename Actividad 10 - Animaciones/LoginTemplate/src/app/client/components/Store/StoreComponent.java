package app.client.components.Store;

import app.services.logicServices.JuegoService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;
import models.Juego;

public class StoreComponent implements ActionListener {

    private StoreTemplate storeTemplate;
    private JuegoService sAccion;
    private Timer timer;
    private int direccion, posicionInicial;

    public StoreComponent() {
        sAccion = JuegoService.getService();
        timer = new Timer(1, this);
        this.storeTemplate = new StoreTemplate(this);
    }

    public Juego obtenerAccion(int numeroAccion) {
        return sAccion.devolverAccion(numeroAccion);
    }

    public StoreTemplate getStoreTemplate() {
        return this.storeTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (e.getSource() == storeTemplate.getBIzquierda()) {
                this.direccion = 1;
            }
            if (e.getSource() == storeTemplate.getBDerecha()) {
                this.direccion = -1;
            }
            posicionInicial = storeTemplate.getPOnSale().getX();
            this.timer.start();
        }
        this.moverTarjetas2();
    }

    public void moverTarjetas1() {
        if (storeTemplate.getPOnSale().getX() == 0 && direccion == 1
                || storeTemplate.getPOnSale().getX() == -830 && direccion == -1) {
            timer.stop();
        } else {
            storeTemplate.getPOnSale().setLocation(
                    storeTemplate.getPOnSale().getX() + direccion, storeTemplate.getPOnSale().getY()
            );
        }
        storeTemplate.repaint();
    }

    public void moverTarjetas2() {
        if (storeTemplate.getPOnSale().getX() == 0 && direccion == 1
                || storeTemplate.getPOnSale().getX() == -830 && direccion == -1) {
            assert true;
        } else {
            if (storeTemplate.getPOnSale().getX() == posicionInicial + 200
                    || storeTemplate.getPOnSale().getX() == posicionInicial - 200) {
                timer.stop();
            } else {
                storeTemplate.getPOnSale().setLocation(
                        storeTemplate.getPOnSale().getX() + direccion, storeTemplate.getPOnSale().getY()
                );
            }
        }
        storeTemplate.repaint();
    }

}
