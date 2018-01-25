package h05;

import java.applet.Applet;
import java.awt.*;

public class VariableGraph extends Applet {

    int hoogteYas;
    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;
    int gewichtFayaaz;
    Color fontKleur;
    Color invulkleurFayaaz;
    Color invulkleurValerie;
    Color invulkleurJeroen;
    Color invulkleurHans;


    public void init() {
        setSize(600, 400);

        hoogteYas = 350;
        gewichtHans = 80;
        gewichtJeroen = 100;
        gewichtValerie = 40;
        gewichtFayaaz = 80;
        fontKleur = Color.black;
        invulkleurFayaaz = Color.GREEN;
        invulkleurHans = Color.BLUE;
        invulkleurJeroen = Color.RED;
        invulkleurValerie = Color.PINK;
    }

    public void paint(Graphics g) {
        g.drawLine(20, hoogteYas, 400, hoogteYas );
        g.setColor(invulkleurValerie);
        g.drawRect(20, hoogteYas - gewichtValerie, 70, gewichtValerie );
        g.fillRect(20,hoogteYas - gewichtValerie, 70, gewichtValerie);
        g.setColor(invulkleurHans);
        g.drawRect(90,hoogteYas-gewichtHans,70,gewichtHans);
        g.fillRect(90,hoogteYas-gewichtHans,70,gewichtHans);
        g.setColor(invulkleurJeroen);
        g.drawRect(160,hoogteYas-gewichtJeroen,70,gewichtJeroen);
        g.fillRect(160,hoogteYas-gewichtJeroen , 70,gewichtJeroen);
        g.setColor(invulkleurFayaaz);
        g.drawRect(230, hoogteYas-gewichtFayaaz, 70,gewichtFayaaz);
        g.fillRect(230,hoogteYas-gewichtFayaaz,70,gewichtFayaaz);
        g.setColor(invulkleurValerie);
        g.drawRect(20, 400,40,40);
        g.fillRect(20, 400,40,40);
        g.setColor(invulkleurHans);
        g.drawRect(20, 450, 40,40);
        g.fillRect(20,450,40,40);
        g.setColor(invulkleurJeroen);
        g.drawRect(20,500,40,40);
        g.fillRect(20,500,40,40);
        g.setColor(invulkleurFayaaz);
        g.drawRect(20,550,40,40);
        g.fillRect(20,550,40,40);
        g.setColor(fontKleur);
        g.drawString("Valerie",70,425);
        g.drawString("Hans",70,475);
        g.drawString("Jeroen",70,525);
        g.drawString("Fayaaz",70,575);

    }
}
