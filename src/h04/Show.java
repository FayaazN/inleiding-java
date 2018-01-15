package h04;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

import static java.awt.Color.black;
import static java.awt.Color.white;

public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(50, 20, 100, 20);
        g.drawString("Lijn" , 50, 30 );
        g.drawRect(50, 40, 50, 25);
        g.drawString("Rechthoek" , 50, 80);
        g.drawRoundRect(50, 90, 50, 25, 10, 10);
        g.drawString("Afgeronde rechthoek" , 5, 130 );
        g.setColor(Color.magenta);
        g.drawRect(160, 40, 50, 25);
        g.fillRect(160, 40, 50, 25);
        g.setColor(Color.black);
        g.drawOval(160, 40, 50, 25);
        g.drawString("Rechthoek met ovaal" , 160,80  );
        g.setColor(Color.magenta);
        g.drawOval(160, 90, 50, 25);
        g.fillOval(160, 90, 50, 25);
        g.setColor(Color.black);
        g.drawString("Ovaal", 170, 130);
        g.drawOval(50,140,50,25);
        g.drawArc(50, 140, 50, 25, 0, 45);
        g.fillArc(50, 140, 50, 25, 0, 45);
        g.drawString("Ovaal met Taart",50, 180);
        g.drawOval(160, 140, 40, 40);
        g.drawString("Cirkel", 160, 200);


    }
}

