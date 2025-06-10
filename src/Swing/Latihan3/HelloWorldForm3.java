package Swing.Latihan3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello world!");

        button = new JButton("Klik Me!");
        button.addActionListener(this);

        setLayout(new GridLayout(2, 1));
        add(label);
        add(button);

        setTitle("My First Program");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Penting agar window bisa ditutup
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");
    }

    // Method main agar bisa langsung dijalankan
    public static void main(String[] args) {
        new HelloWorldForm3();
    }
}

