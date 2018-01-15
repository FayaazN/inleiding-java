package h04;

import java.applet.Applet;
import java.awt.*;

public class Eclips extends Applet{
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50,60,60,50);
        g.drawOval(50, 60, 60, 50);
    }



}
