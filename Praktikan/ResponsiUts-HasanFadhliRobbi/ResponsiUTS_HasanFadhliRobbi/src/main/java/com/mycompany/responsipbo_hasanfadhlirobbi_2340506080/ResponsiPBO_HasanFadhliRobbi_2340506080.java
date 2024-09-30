/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsipbo_hasanfadhlirobbi_2340506080;

/**
 *
 * @author Organizer
 */
public class ResponsiPBO_HasanFadhliRobbi_2340506080 {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Produk("Snack", 15000);
        Pegawai pegawai1 = new PegawaiTetap("Hasan Fadhli Robbi", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}