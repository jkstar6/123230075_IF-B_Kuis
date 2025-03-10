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
public class halamanPembelian extends JFrame{
    JLabel labelPembelian = new JLabel("Halaman Pembelian");
    JLabel labelHitungApel = new JLabel();
    JLabel labelHitungJeruk = new JLabel();
    JLabel labelHitungMangga = new JLabel();
    JLabel labelSubTotal = new JLabel();
    JLabel labelPajak = new JLabel();
    JLabel labelTotalHarga = new JLabel();

    JButton buttonKembali = new JButton("Kembali");

    int subTotal = 0;
    int pajak = 0;
    int totalHarga = 0;

    halamanPembelian(String username, int totalApel, int totalJeruk, int totalMangga, int jumlahApel, int jumlahJeruk, int jumlahMangga) {
        setSize(470,720);
        setTitle("Halaman Pembelian");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(labelPembelian);
        add(labelHitungApel);
        add(labelHitungJeruk);
        add(labelHitungMangga);
        add(labelSubTotal);
        add(labelPajak);
        add(labelTotalHarga);
        add(buttonKembali);

        labelPembelian.setBounds(40,0,400,100);
        labelPembelian.setFont(new Font("Arial", Font.BOLD, 18));

        labelHitungApel.setText("Apel: " + jumlahApel + "kg x Rp15.000 = Rp" + totalApel);
        labelHitungJeruk.setText("Jeruk: " + jumlahJeruk + "kg x Rp12.000 = Rp" + totalJeruk);
        labelHitungMangga.setText("Mangga: " + jumlahMangga + "kg x Rp20.000 = Rp" + totalMangga);
        labelHitungApel.setBounds(40,30,400,100);
        labelHitungJeruk.setBounds(40,60,400,100);
        labelHitungMangga.setBounds(40,90,400,100);
        labelHitungApel.setFont(new Font("Arial", Font.PLAIN, 14));
        labelHitungJeruk.setFont(new Font("Arial", Font.PLAIN, 14));
        labelHitungMangga.setFont(new Font("Arial", Font.PLAIN, 14));

        subTotal = totalApel + totalJeruk + totalMangga;
        pajak = subTotal *10 / 100;
        totalHarga = subTotal + pajak;

        labelSubTotal.setText("Subtotal: Rp" + subTotal);
        labelPajak.setText("Pajak(10%): Rp" + pajak);
        labelTotalHarga.setText("Total Harga: Rp" + totalHarga);
        labelSubTotal.setBounds(40,130,400,100);
        labelPajak.setBounds(40,160,400,100);
        labelTotalHarga.setBounds(40,190,400,100);
        labelSubTotal.setFont(new Font("Arial", Font.PLAIN, 14));
        labelPajak.setFont(new Font("Arial", Font.PLAIN, 14));
        labelTotalHarga.setFont(new Font("Arial", Font.BOLD, 14));

        buttonKembali.setBounds(40, 290, 350, 28);
        buttonKembali.addActionListener(e -> {
            new halamanUtama(username);
            dispose();
        });
        

        setVisible(true);
    }

    
}