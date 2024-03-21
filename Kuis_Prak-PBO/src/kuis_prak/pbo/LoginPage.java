/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_prak.pbo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener {
    
    JLabel sambutan = new JLabel("Selamat Datang!");
    JLabel tutor = new JLabel("Silahkan masuk untuk melanjutkan");
    JLabel labelUsername = new JLabel("Username");
    JTextField inpUsername = new JTextField();
    JLabel labelPassword = new JLabel("Password");
    JTextField inpPassword = new JTextField();
    JButton btnLogin = new JButton("Login");
    
    public LoginPage() {
        JFrame frameLogin = new JFrame();
        frameLogin.setSize(700,600);
        frameLogin.setTitle("Halaman Login");
        frameLogin.setLayout(null);
        
        frameLogin.setLocationRelativeTo(null);
        
        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));
        
        frameLogin.add(sambutan);
        frameLogin.add(tutor);
        frameLogin.add(labelUsername);
        frameLogin.add(inpUsername);
        frameLogin.add(labelPassword);
        frameLogin.add(inpPassword);
        frameLogin.add(btnLogin);
        
        sambutan.setBounds(20, 20, 200, 30);
        tutor.setBounds(20, 50, 300, 30);
        labelUsername.setBounds(20, 80, 100, 30);
        inpUsername.setBounds(20, 110, 640, 30);
        labelPassword.setBounds(20, 150, 100, 30);
        inpPassword.setBounds(20, 180, 640, 30);
        
        btnLogin.setBounds(20, 250, 640, 30);
        
        btnLogin.setHorizontalAlignment(JButton.CENTER);
        
        btnLogin.addActionListener(this);
        
        frameLogin.setVisible(true);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String usernameStr = inpUsername.getText();
            String passwordStr = inpPassword.getText();
            
            if (usernameStr.isEmpty() || passwordStr.isEmpty()) {
                throw new Exception("Tolong di isi");
            }
            
            int username = Integer.parseInt(inpUsername.getText());
            int password = Integer.parseInt(inpPassword.getText());
            
            if (username != 123220074 && password != 12345) {
                throw new Exception("Username atau Password salah!");
            }
            
            new HalamanUtama(username);
            this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        } 
    }
}
