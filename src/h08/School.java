package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class School extends Applet{

    Button Vader;
    Button Moeder;
    Button Heren;
    Button Dames;
    int teller;
    int teller2;
    int teller3;
    int teller4;
    int totaal;


    public void init() {
        setSize(500, 600);
        KnopListener kl = new KnopListener();

        Vader = new Button("Vader");
        Vader.addActionListener(kl);
        Moeder = new Button("Moeder");
        Moeder.addActionListener(new Vrouw());
        Heren = new Button("Heren");
        Heren.addActionListener(new Man2());
        Dames = new Button("Dames");
        Dames.addActionListener(new Vrouw2());
        teller = 0;
        teller2 =0;
        teller3 = 0;
        teller4 = 0;
        add(Vader);
        add(Moeder);
        add(Heren);
        add(Dames);


    }


    public void paint(Graphics g) {
        g.drawString("Aantal Vaders  " + teller, 20, 50);
        g.drawString("aantal Moeders  " + teller2, 20, 65);
        g.drawString("aantal mannelijke potentiële studenten  " + teller3, 20, 80);
        g.drawString("aantal vrouwelijke potentiële stundenten  " + teller4, 20, 95);
        g.drawString("Totaal  " + totaal , 20, 110);
        totaal= teller + teller2 + teller3 + teller4;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            totaal++;
            repaint();

        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }

    class Man2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller3++;
            totaal++;
            repaint();
        }
    }

    class Vrouw2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller4++;
            totaal++;
            repaint();

        }
    }


}