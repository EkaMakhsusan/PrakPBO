package praktikum12;

import java.io.Serializable;

/**
 *
 * @author HP
 */
// Kelas Product untuk Serialisasi
public class Product implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    // Konstruktor
    public Product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }
}