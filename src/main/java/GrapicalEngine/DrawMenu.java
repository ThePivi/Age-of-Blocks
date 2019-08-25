package GrapicalEngine;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawMenu extends Frame {

    public static void main(String args[]) {
        new DrawMenu();
    }

   public DrawMenu() {
     super("Java 2D DrawMenu");
     setSize(400,300);
     setVisible(true);
     addWindowListener(
             getWindowAdapter()
     );
   }

    private WindowAdapter getWindowAdapter() {
        WindowAdapter windowAdapter = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        };
        return windowAdapter;
    }

    public void paint(Graphics g) {
        Integer magnify = 3;
     g.setColor(Color.red);
     g.drawRect(50*magnify,1*magnify+15,1*magnify,1*magnify);
     Graphics2D g2d = (Graphics2D)g;
     g2d.setColor(Color.blue);
     g2d.drawRect(1*magnify,75*magnify+15,1*magnify,1*magnify);

        Integer maxX = 50*magnify+magnify;
        Integer maxY = 75*magnify+magnify;
        setSize(magnify*maxX, magnify*maxY);
   }
}
