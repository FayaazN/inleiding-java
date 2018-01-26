package h06;

import java.applet.Applet;
import java.awt.*;

public class Negatief extends Applet {

    int a;
    int b;

    public void init(){

        a = 40;
        b = 100;
    }

        public void paint (Graphics g){
        g.drawString("De uitkomst is:  "  + - (a + b),20,20);
        }
}
