/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsipbo_hasanfadhlirobbi_2340506080;

/**
 *
 * @author Organizer
 */
public class Makanan extends Produk {
    private int expired;
    
    public Makanan(String namaProduk, int harga, int expired) {
        super(namaProduk, harga);
        this.expired = expired;
    }    
    
    public int getExpired() {
        return expired;
    }

    public void setexpired(int expired) {
        this.expired = expired;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Baik digunakan sebelum: " + expired );
    }    
    
}
