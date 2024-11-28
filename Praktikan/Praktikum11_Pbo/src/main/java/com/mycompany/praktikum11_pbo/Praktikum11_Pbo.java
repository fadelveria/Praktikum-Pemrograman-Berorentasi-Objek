/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum11_pbo;

/**
 *
 * @author Organizer
 */
public class Praktikum11_Pbo {


    public class Main {
        public static void main(String[] args) {
            // Membuat objek perpustakaan
            Perpustakaan perpustakaan = new Perpustakaan();

            // Menambahkan buku ke dalam perpustakaan
            perpustakaan.tambahBuku(new Buku("Pemrograman Java"));
            perpustakaan.tambahBuku(new Buku("Struktur Data"));
            perpustakaan.tambahBuku(new Buku("Basis Data"));

            // Menampilkan informasi perpustakaan
            perpustakaan.infoPerpustakaan();
        }
    }

}
