/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_4;

/**
 *
 * @author Organizer
 */

public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Kendaraan
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);

        // Menampilkan data awal menggunakan getter
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());

        // Mengubah data menggunakan setter
        mobil.setMerek("Toyota");
        mobil.setModel("Innova");
        mobil.setTahun(2021);

        // Menampilkan data setelah perubahan
        System.out.println("Merek baru: " + mobil.getMerek());
        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());
    }
}

