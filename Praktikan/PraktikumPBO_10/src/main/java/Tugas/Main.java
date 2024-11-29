/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author Organizer
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 1000; // Harga elektronik
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); // Output: 100.0
        
        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 500; // Harga makanan
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan)); // Output: 25.0
    }
}

