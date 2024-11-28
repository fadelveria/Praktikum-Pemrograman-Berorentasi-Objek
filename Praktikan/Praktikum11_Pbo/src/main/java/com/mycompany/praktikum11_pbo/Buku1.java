/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum11_pbo;

/**
 *
 * @author Organizer
 */
class Buku1 {
    private String judul;
    private Pengarang pengarang;

    public Buku1(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku1() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}
