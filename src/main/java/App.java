import javax.swing.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: obyte
 * Date: 30.05.13
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    Gui gui = new Gui();
                } catch (Exception e) {
                    System.out.println("Look and feel Error");
                }
            }
        });
    }


}

