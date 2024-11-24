package praktikum12;

import java.io.Serializable;

// Kelas yang dapat diserialisasi
public class Produk implements Serializable {
    private static final long serialVersionUID = 1L; // Menambahkan serialVersionUID untuk serialisasi
    private String namaProduk;
    private double harga;
    private int stok;
    // Konstruktor
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
    // Getters untuk akses ke atribut (opsional)
    public String getNamaProduk() {
        return namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
}