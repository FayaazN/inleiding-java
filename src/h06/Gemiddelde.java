package h06;

import java.awt.*;
import java.applet.*;

public class Gemiddelde extends Applet {

    double a, b, c, d, uitkomstA, uitkomstR;

    public void init(){

        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;

        uitkomstR = (a + b + c)/d;

        uitkomstA = (a + b + c) ;
         uitkomstA = (uitkomstA/3);
         uitkomstA = (int)(uitkomstA*10);
         uitkomstA = uitkomstA/10;

    }

    public void paint (Graphics g){
        g.drawString("Behaalde cijfers: 5.9 - 6.3 - 6.9", 20, 10);
        g.drawString("De afgeronde uitkomst is:" + uitkomstA, 20, 30);
        g.drawString("De ruwe uitkomst is: " + uitkomstR, 20,50);
    }
}
