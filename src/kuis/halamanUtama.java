/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class halamanUtama extends JFrame{
    JLabel labelWelcome = new JLabel();
    JLabel labelApel = new JLabel("Apel(Rp15.000/kg):");
    JLabel labelJeruk = new JLabel("Jeruk(Rp12.000/kg):");
    JLabel labelMangga = new JLabel("Mangga(Rp20.000/kg):");

    JTextField apelTextField = new JTextField();
    JTextField jerukTextField = new JTextField();
    JTextField manggaTextField = new JTextField();

    JButton buttonBeli = new JButton("Beli");
    JButton buttonLogout = new JButton("Logout");

    int jumlahApel = 0;
    int jumlahJeruk = 0;
    int jumlahMangga = 0;

    int hargaApel = 15000;
    int hargaJeruk = 12000;
    int hargaMangga = 20000;

    int totalApel = 0;
    int totalJeruk = 0;
    int totalMangga = 0;
    
    halamanUtama(String username) {
        setSize(470,720);
        setTitle("Halaman Utama");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(labelWelcome);
        add(labelApel);
        add(labelJeruk);
        add(labelMangga);
        add(apelTextField);
        add(jerukTextField);
        add(manggaTextField);
        add(buttonBeli);
        add(buttonLogout);

        labelWelcome.setText("Selamat Datang, " + username);
        labelWelcome.setBounds(40,30,400,100);
        labelWelcome.setFont(new Font("Arial", Font.PLAIN, 18));

        labelApel.setBounds(40,70,400,100);
        labelApel.setFont(new Font("Arial", Font.PLAIN, 14));
        apelTextField.setBounds(235,110,150,28);

        labelJeruk.setBounds(40,100,400,100);
        labelJeruk.setFont(new Font("Arial", Font.PLAIN, 14));
        jerukTextField.setBounds(235,140,150,28);

        labelMangga.setBounds(40,130,400,100);
        labelMangga.setFont(new Font("Arial", Font.PLAIN, 14));
        manggaTextField.setBounds(235,170,150,28);

        buttonBeli.setBounds(40, 220, 350, 28);
        buttonBeli.addActionListener(e -> {
            jumlahApel = Integer.parseInt(apelTextField.getText());
            jumlahJeruk = Integer.parseInt(jerukTextField.getText());
            jumlahMangga = Integer.parseInt(manggaTextField.getText());

            totalApel = jumlahApel * hargaApel;
            totalJeruk = jumlahJeruk * hargaJeruk;
            totalMangga = jumlahMangga * hargaMangga;

            new halamanPembelian(username,totalApel,totalJeruk,totalMangga,jumlahApel,jumlahJeruk,jumlahMangga);
            dispose();
        });

        buttonLogout.setBounds(40, 260, 350, 28);
        buttonLogout.addActionListener(e -> {
            dispose();
        });

        setVisible(true);
    }

}
