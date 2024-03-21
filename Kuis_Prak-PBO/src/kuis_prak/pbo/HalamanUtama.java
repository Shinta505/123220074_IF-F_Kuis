/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_prak.pbo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener {

    JLabel sambutan = new JLabel();
    JLabel tutor = new JLabel("Silahkan pilih menu di bawah untuk membeli majalah");
    JButton majalahAnak = new JButton("Majalah Anak");
    JButton majalahRemaja = new JButton("Majalah Remaja");
    JButton majalahDewasa = new JButton("Majalah Dewasa");

    public HalamanUtama(int username) {
        JFrame frameUtama = new JFrame();
        frameUtama.setSize(700, 600);
        frameUtama.setTitle("Halaman Utama");
        frameUtama.setLayout(null);

        frameUtama.setLocationRelativeTo(null);

        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));

        frameUtama.add(sambutan);
        frameUtama.add(tutor);
        ButtonGroup pilihMajalah = new ButtonGroup();
        frameUtama.add(majalahAnak);
        frameUtama.add(majalahRemaja);
        frameUtama.add(majalahDewasa);
        
        sambutan.setText("Selamat Datang, " + username);
        
        sambutan.setBounds(20, 20, 200, 30);
        tutor.setBounds(20, 50, 300, 30);
        majalahAnak.setBounds(20, 150, 640, 40);
        majalahRemaja.setBounds(20, 200, 640, 40);
        majalahDewasa.setBounds(20, 250, 640, 40);
        
        majalahAnak.setHorizontalAlignment(JButton.CENTER);
        majalahRemaja.setHorizontalAlignment(JButton.CENTER);
        majalahDewasa.setHorizontalAlignment(JButton.CENTER);
        
        majalahAnak.addActionListener(this);
        majalahRemaja.addActionListener(this);
        majalahDewasa.addActionListener(this);
        
        frameUtama.setVisible(true);
        frameUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (majalahAnak.isSelected()) {
            HalamanPembelian halamanPembelian = new HalamanPembelian("Majalah Anak", "12.700");
        } else if (majalahRemaja.isSelected()) {
            HalamanPembelian halamanPembelian = new HalamanPembelian("Majalah Remaja", "15.200");
        } else if (majalahDewasa.isSelected()) {
            HalamanPembelian halamanPembelian = new HalamanPembelian("Majalah Dewasa", "26.900");
        }
        
    }

}
