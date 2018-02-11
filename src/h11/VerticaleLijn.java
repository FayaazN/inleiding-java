package h11;

import java.applet.Applet;
import java.awt.*;

public class VerticaleLijn extends Applet {

    public void paint(Graphics g){

        int teller;
        int y = 100;
        int x = 20;

        for(teller=1; teller<10; teller++){
            y +=10;
            g.drawLine(x, y, x,y);
        }

    }




}
