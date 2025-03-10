/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;;

/**
 *
 * @author Lab Informatika
 */
public class halamanLogin extends JFrame implements ActionListener{
    JLabel pageLabel = new JLabel("Halaman Login");
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");

    JTextField usernameTextField = new JTextField();
    JTextField passwordTextField = new JTextField();

    JButton buttonLogin = new JButton("Login");
    JButton buttonReset = new JButton("Reset");

    halamanLogin() {
        setVisible(true);
        setSize(470,720);
        setTitle("Halaman Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(pageLabel);
        add(usernameLabel);
        add(usernameTextField);
        add(passwordLabel);
        add(passwordTextField);
        add(buttonLogin);
        add(buttonReset);

        pageLabel.setBounds(40,40,440,20);
        pageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        usernameLabel.setBounds(40,85,440,12);
        usernameTextField.setBounds(170,80,220,28);

        passwordLabel.setBounds(40,135,440,12);
        passwordTextField.setBounds(170,130,220,28);

        buttonLogin.setBounds(40, 180, 350, 28);
        buttonLogin.addActionListener(this);

        buttonReset.setBounds(40, 220, 350, 28);
        buttonReset.addActionListener(e -> {
            usernameTextField.setText("");
            passwordTextField.setText("");
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();

            if (username.equals("Bintang") && password.equals("123230075")) {
                new halamanUtama(username);

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "username atau password salah!");
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
