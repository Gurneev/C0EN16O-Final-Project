import javax.swing.SwingUtilities;

/**
 * Class to Test the project
 * 
 * @author Pranav, Gurneev
 *
 */
public class Tester{

    public static void main(String[] args){
        // Run the GUI codes on Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                RMOS rmos = new RMOS();
                RCM rcm1 = new RCM("San Jose", "001");
                RCM rcm2 = new RCM("San Fran", "002");
                rmos.addRCM(rcm1);
                rmos.addRCM(rcm2);
                rmos.getStats();
            }
        });
    }
}
