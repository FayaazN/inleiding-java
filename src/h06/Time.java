package h06;


import java.applet.Applet;
import java.awt.*;

public class Time extends Applet{
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    int seconden;
    int uur;
    int dag;
    int jaar;

    public void init() {
        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = 356;

        uitkomst1 = seconden*uur;
        uitkomst2 = seconden*uur*dag;
        uitkomst3 = seconden*uur*dag*jaar;
    }
    public void paint (Graphics g) {
    g.drawString(" Seconden in een uur --> " + uitkomst1, 20, 20);
    g.drawString("Seconden in een dag --> " + uitkomst2, 20, 40);
    g.drawString(" Seconden in een jaar -->"+ uitkomst3,20,60);

    }
}
