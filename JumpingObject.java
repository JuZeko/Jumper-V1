import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class JumpingObject  extends JPanel{

     private int height,width, cordinateX,cordinateY;  private   Image img1;


    public JumpingObject(){

        this.height = 30;
        this.width = 40;
        this.cordinateX = 0;
        this.cordinateY = 320;
       this.img1 = Toolkit.getDefaultToolkit().getImage("/home/osla/Desktop/2.jpeg");

    };


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCordinateX() {
        return cordinateX;
    }

    public void setCordinateX(int cordinateX) {
        this.cordinateX = cordinateX;
    }

    public int getCordinateY() {
        return cordinateY;
    }

    public void setCordinateY(int cordinateY) {
        this.cordinateY = cordinateY;
    }

    public Image getImg() {
        return img1;
    }

    public void setImg(Image img) {
        this.img1 = img;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void moveCordinateY() {

        this.cordinateY = cordinateY - 50;

    }

    public void Gravity() {


            this.cordinateY = this.cordinateY + 10;


    }
}
