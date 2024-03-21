/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_prak.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class HalamanPembelian extends JFrame implements ActionListener {
    
    JLabel judul = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel outputKategori = new JLabel();
    JLabel labelHarga = new JLabel("Harga");
    JLabel outputHarga = new JLabel();
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField jumlah = new JTextField();
    JButton btnKembali = new JButton("Kembali");
    JButton btnBeli = new JButton("Beli");
    JLabel labelTotal = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel outputHargaSatuan = new JLabel();
    JLabel labelJumlahPcs = new JLabel("Jumlah");
    JLabel outputJumlah = new JLabel();
    JLabel labelTotalHarga = new JLabel("Total Harga");
    JLabel totalHarga = new JLabel();
    
    public HalamanPembelian(String majalah, String hargaMajalah) {
        JFrame frameBeli = new JFrame();
        frameBeli.setSize(700, 600);
        frameBeli.setTitle("Halaman Pembelian");
        frameBeli.setLayout(null);

        frameBeli.setLocationRelativeTo(null);
        
        frameBeli.add(judul);
        frameBeli.add(labelKategori);
        frameBeli.add(outputKategori);
        frameBeli.add(labelHarga);
        frameBeli.add(outputHarga);
        frameBeli.add(labelJumlah);
        frameBeli.add(jumlah);
        frameBeli.add(btnKembali);
        frameBeli.add(btnBeli);
        frameBeli.add(labelTotal);
        frameBeli.add(labelHargaSatuan);
        frameBeli.add(outputHargaSatuan);
        frameBeli.add(outputJumlah);
        frameBeli.add(labelTotalHarga);
        frameBeli.add(totalHarga);
        
        outputKategori.setText(majalah);
        outputHarga.setText("Rp" + hargaMajalah + " /pcs");
        outputHargaSatuan.setText("Rp" + hargaMajalah);
        
        judul.setBounds(20, 20, 200, 30);
        labelKategori.setBounds(20, 70, 150, 30);
        outputKategori.setBounds(190,70, 150, 30);
        labelHarga.setBounds(20,100, 150, 30);
        outputHarga.setBounds(190, 100, 150, 30);
        labelJumlah.setBounds(20, 130, 150, 30);
        jumlah.setBounds(190, 130, 150, 30);
        btnKembali.setBounds(20, 170, 150, 30);
        btnBeli.setBounds(190, 170, 150, 30);
        labelTotal.setBounds(20, 210, 200, 30);
        labelHargaSatuan.setBounds(20, 250, 150, 30);
        outputHargaSatuan.setBounds(190, 250, 150, 30);
        labelJumlahPcs.setBounds(20, 280, 150, 30);
        outputJumlah.setBounds(190, 280, 150, 30);
        labelTotalHarga.setBounds(20, 310, 150, 30);
        totalHarga.setBounds(190, 310, 150, 30);
        
        btnKembali.addActionListener(this);
        btnBeli.addActionListener(this);
        
        frameBeli.setVisible(true);
        frameBeli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
