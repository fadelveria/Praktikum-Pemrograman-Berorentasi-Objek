/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_12;

import java.io.Serializable;

/**
 *
 * @author Organizer
 */

public class Produk implements Serializable {
    String namaProduk;
    double harga;
    int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    @Override
    public String toString() {
        return "Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
    }
    void tampilkanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


