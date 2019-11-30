import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timer  extends JPanel{

    public Timer timer = null;
    JObject o = new JObject();


    public timer(){

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               System.out.println("Hello");
             //   o.moveCordinateX();
            //    System.out.println(o.getCordinateX());
            }
        });

        timer.start();

    }

}
