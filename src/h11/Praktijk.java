package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField tekstvak;
    Label label;
    int ingevuld;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("");
        tekstvak.addActionListener(new TeksvakListener());
        add(label);
        add(tekstvak);
    }

    class TeksvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingevuld = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;
        while(teller <= 10) {
            g.drawString("" + teller + "x" + ingevuld + "=" + (teller * ingevuld), 50, y);
            y += 20;
            teller++;

        }
    }
}





