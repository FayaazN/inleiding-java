package h01;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

import static java.awt.Color.black;
import static java.awt.Color.white;

public class Grafiek extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(120, 10, 120, 140);
        g.drawLine(120,140, 240, 140);
        g.drawString("120",90,35 );
        g.drawString("100",90,55 );
        g.drawString("80",90,75 );
        g.drawString("60",90,92 );
        g.drawString("40",90,105 );
        g.drawString("20",90,120 );
        g.drawString("0",90,140 );
        g.drawString("Valerie", 120,160);
        g.drawString("Hans", 160,160);
        g.drawString("Jeroen", 200,160);
        g.setColor(Color.pink);
        g.fillRect(120, 100, 40, 40);
        g.drawRect(120, 100, 40, 40);
        g.setColor(Color.blue);
        g.fillRect(160, 65, 40, 75);
        g.drawRect(160, 65, 40, 75);
        g.setColor(Color.yellow);
        g.fillRect(200, 45, 40, 95);
        g.drawRect(200, 45, 40, 95);


    }
}
