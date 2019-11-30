import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class panel extends JPanel  implements KeyListener{


    Image img = Toolkit.getDefaultToolkit().getImage("/home/osla/Desktop/1.jpeg");
    JumpingObject jo = new JumpingObject();
    JObject o = new JObject();
    JLabel label = new JLabel(new ImageIcon(img)); // wtf?



    public panel() {


            doit();
        addKeyListener(this);
        setFocusable(true);
       }



    private void doit() {
        timer.start();
        jo.Gravity();

    }


    @Override
    public void paintComponent(Graphics g) { // g is your screen
        super.paintComponent(g);

        g.drawImage(img,0,0,400,400,null);

      g.drawImage(jo.getImg(),jo.getCordinateX(), jo.getCordinateY(),jo.getWidth(),jo.getHeight(),null);  //jura



        g.drawImage(o.getImg(),o.getCordinateX(), 320,60,60,null); //cipsai

repaint();

    }





    Timer timer = new Timer(500, new ActionListener() {
        public void actionPerformed(ActionEvent e) {


              o.moveCordinateX();
            if(jo.getCordinateY()<315) {
                jo.Gravity();
            }
                    System.out.println(jo.getCordinateY());
               repaint();
        }
    });


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch( keyCode ) {
            case KeyEvent.VK_UP:

                if((o.getCordinateY() == 320 ) ||(o.getCordinateY() == 330 )) {
                    jo.moveCordinateY();
                }

                break;
            case KeyEvent.VK_DOWN:
                // handle down
                break;
            case KeyEvent.VK_LEFT:
                // handle left
                break;
            case KeyEvent.VK_RIGHT :
                // handle right
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }


}


