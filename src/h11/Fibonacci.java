package h11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet{

    public void paint(Graphics g) {
        int d1 = -1;
        int d2 = 1;
        int d3;
        int y = 10;


        for(int a = 0; a<10; a++)  {
            y+=20;
            d3= d1+d2;
            d1=d2;
            d2=d3;

            g.drawString(""+d3,20,y);

        }


    }
}