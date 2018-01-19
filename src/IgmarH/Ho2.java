package IgmarH;

import java.applet.Applet;
import java.awt.*;




public class Ho2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Igmar", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Houtsnee", 50, 80 );
    }
}