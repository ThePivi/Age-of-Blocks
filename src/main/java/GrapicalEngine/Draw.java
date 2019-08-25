package GrapicalEngine;

import javax.swing.*;

public class Draw extends JFrame{

    public static void main(String[] args) {
        Draw drawer = new Draw ("Test application name");
    }


    public Draw(String applicationName) {
        super (applicationName);
        setSize(400, 400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(addPanel().add(addButton()));

        setVisible(true);
    }

    private JButton addButton() {
        JButton jButton = new JButton("text");
        jButton.setSize(50, 50);

        return jButton;
    }

    public JPanel addPanel() {
        return new JPanel();
    }


}
