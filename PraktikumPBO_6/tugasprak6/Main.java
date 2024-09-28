/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Membuat objek produk
        Buku buku = new Buku("Belajar Java", 100000);
        Elektronik elektronik = new Elektronik("Laptop", 1500000);
        Pakaian pakaian = new Pakaian("Kaos", 50000);

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Menghitung total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + keranjang.totalHargaSetelahDiskon());
    }
}