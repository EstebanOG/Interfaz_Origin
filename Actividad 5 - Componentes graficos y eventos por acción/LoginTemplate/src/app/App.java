/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Christian Galindo
 */
import app.client.login.LoginComponent;
import javax.swing.SwingUtilities;


public class App {
  public static void main(String[] args) {
    Runnable runApplication = new Runnable() {
      public void run(){
        LoginComponent login = new LoginComponent();
        login.getClass();
      }
    };
    SwingUtilities.invokeLater(runApplication);
  }
}