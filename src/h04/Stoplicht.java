package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
 public void init(){
     } 
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.gray);
        g.drawRoundRect(150, 50, 50, 100, 10, 10);
        g.fillRoundRect(150, 50, 50, 100, 10, 10);
        g.setColor(Color.RED);
        g.fillOval(160, 50, 30, 30);
        g.drawOval(160, 50, 30, 30);
        g.setColor(Color.YELLOW);
        g.fillOval(160, 85, 30, 30);
        g.drawOval(160, 85, 30, 30);
        g.setColor(Color.GREEN);
        g.fillOval(160, 120, 30, 30);
        g.drawOval(160, 120, 30, 30);
    }
}

