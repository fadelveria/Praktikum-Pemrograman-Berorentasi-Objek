/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Organizer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Putih");

        mobil1.displayInfo();
        System.out.println();  
        mobil2.displayInfo();

        mobil1.startEngine();
        mobil2.startEngine();

        System.out.println("\nMengubah warna mobil1 menjadi Merah...");
        mobil1.setWarna("Merah");
        mobil1.displayInfo();
    }
}
