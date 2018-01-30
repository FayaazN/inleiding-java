import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnopK extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    double btw;
    double getal;


    public void init () {
        tekstvak = new TextField("klik op mij", 20);
        label = new Label("type iets in het tektvakje" +
                "en druk op enter");
        tekstvak.addActionListener(new TeksvakListener());
        add(label);
        add(tekstvak);
        s = "";
        btw = 1.21;

    }
    public void paint(Graphics g){
        g.drawString(""+ getal*btw ,50,80);

    }
    class TeksvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            repaint();
        }
    }
}