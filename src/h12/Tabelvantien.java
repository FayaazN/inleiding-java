package H12;
import java.awt.*;
import java.applet.*;

public class Tabelvantien extends Applet {
    private double getallen[];

    public void init() {
        getallen = new double [10];

        for (int teller = 0; teller < getallen.length; teller ++) {
            getallen[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
        }
    }
}