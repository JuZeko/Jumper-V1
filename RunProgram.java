import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class RunProgram extends JFrame{

    JFrame frame = new JFrame("Jumper");
    JPanel panel = new JPanel();



    public RunProgram(){
        CreateFrame();
    }

    private void CreateFrame() {

        panel.setLayout(null);
       frame.setSize(400,400);
       frame.setResizable(false);
       frame.getContentPane().add(new panel());
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setVisible(true);

    }



}
