package Swing.Kasus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AngkaLagiAje extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public AngkaLagiAje() {
        // Membuat komponen
        textField1 = new JTextField();
        textField2 = new JTextField();
        button = new JButton("Jumlah");

        // Menambahkan event listener
        button.addActionListener(this);

        // Layout dan penambahan komponen
        setLayout(new GridLayout(3, 1));
        add(textField1);
        add(textField2);
        add(button);

        // Konfigurasi JFrame
        setTitle("Penjumlahan");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(textField1.getText());
            int angka2 = Integer.parseInt(textField2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AngkaLagiAje();
    }
}
