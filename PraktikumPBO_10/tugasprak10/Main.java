/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 1000.00; // Contoh harga
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); // Output: 100.0

        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 200.00; // Contoh harga
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan)); // Output: 10.0
    }
}