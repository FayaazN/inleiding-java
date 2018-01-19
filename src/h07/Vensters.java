package h07;

        import java.applet.Applet;
        import java.awt.*;

public class Vensters extends Applet {

    public void init(){
        setSize(1000, 1000);
    }

    public void paint(Graphics g){
        g.drawString("Fayaaz Nabie!",50,60);

        Dimension dim = new Dimension(400,300);
        this.setSize(dim);
    }
}