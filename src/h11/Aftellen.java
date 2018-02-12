package h11;

import java.applet.Applet;
import java.awt.*;

public class Aftellen extends Applet {

    public void paint(Graphics g){

        int teller;
        int y = 20;


        for(teller=20; teller>9; teller--){
            y +=20;
            g.drawString(""+teller, 20,y);
        }

    }




}
