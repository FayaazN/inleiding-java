package h11;

import java.applet.Applet;
import java.awt.*;

public class Trap extends Applet {


    public void paint(Graphics g){
        int kolom;
        int y = 100;
        int x = 100;
        int x1 = x;
        int x2 = x1 + x;
        int x3 = x2 + x;
        int x4 = x3 + x;
        int x5 = x4 + x;
        int y1 = y ;
        int y2 = y1 + y;
        int y3 = y2 + y;
        int y4 = y3 + y;
        int y5 = y4 + y;
        int lengtebreedte = 100;

        for(kolom = 0; kolom < 5; kolom++) {
            g.drawRect(x1,y1,lengtebreedte,lengtebreedte);
            g.drawRect(x2,y2,lengtebreedte,lengtebreedte);
            g.drawRect(x3,y3,lengtebreedte,lengtebreedte);
            g.drawRect(x4,y4,lengtebreedte,lengtebreedte);
            g.drawRect(x5,y5,lengtebreedte,lengtebreedte);


        }



    }

}
