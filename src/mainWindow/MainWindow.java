package mainWindow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by romanegorov on 20.06.17.
 */
public class MainWindow extends JFrame {

    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    public MainWindow(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize((int)(dimension.getWidth() - 31), (int)(dimension.getHeight() - 31));
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}
