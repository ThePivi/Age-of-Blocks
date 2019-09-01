package GrapicalEngine;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TwodDraw extends Frame {
    public static void main(String args[]){
        new TwodDraw(); //ablak rajzolásának meghívása
    }

    public TwodDraw(){              //ablak kirajzolása
        super("ablak");        //Title megadása, super nincs meg telejesen mire jó
        setSize(400,400);  //ablak mérete
        setVisible(true);           //láthatóvá tétel
        addWindowListener(new WindowAdapter() {     //abkak listener
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
                System.exit(0);
            }       //ablak listener vége
        });

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);   //graphics.paint superrel ősosztályból
        g.setColor(Color.blue);     //első kitöltött téglalap -szín
        g.fillRect(20,40,200,200);      //kezdő koordináták, méret  -első kitöltött téglalap
        g.setColor(Color.red);      //első téglalap - szín
        g.drawRect(10,30,380,355);      //kezdő koordináták, méret  -első téglalap
        Graphics2D g2d = (Graphics2D)g;     //váltás graphics-ról graphichs2d-re
        g2d.setColor(Color.green);      //második kitöltött téglalap -szín
        g2d.fillRect(40,60,200,200);        //kezdő koordináták, méret  -második kitöltött téglalap
    }
}
