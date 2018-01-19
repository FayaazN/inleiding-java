package h06;

import java.applet.Applet;
import java.awt.*;

public class Karwei extends Applet {

    int geheelBedrag;
    int A;
    int uitkomst;


    public void init(){
        geheelBedrag = 133;
        A = 4;
        uitkomst = geheelBedrag/A;
    }

    public void paint(Graphics g) {
        g.drawString("Totaalbedrag en Berekening is 133 / 4 =" + uitkomst,20,30);
        g.drawString("Fayaaz -->" + uitkomst,20,50);
        g.drawString("Jan -->" +uitkomst,20,65);
        g.drawString("Ali -->" + uitkomst,20,80);
        g.drawString("Jeannette -->" + uitkomst,20,95);

    }
}