package app;

import javax.swing.SwingUtilities;
import app.vistaPrincipal.VistaPrincialTemplate;

/**
 *
 * @author Esteban Olaya
 * @author Christian Galindo
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                VistaPrincialTemplate vista = new VistaPrincialTemplate();
            }
        };
        SwingUtilities.invokeLater(runApplication);
 
    }
    
}
