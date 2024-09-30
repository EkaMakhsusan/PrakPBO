/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_Eka_Makhsusan;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        System.out.println("1. Output Produk");
        System.out.println(produk1.tampilkanInfo());

        Pegawai pegawai1 = new PegawaiTetap("Eka Makhsusan", 5000000, 1000000);
        System.out.println("\n2. Output Pegawai");
        System.out.println(pegawai1.tampilkanInfo());
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai pegawai2 = new PegawaiKontrak("Eka Makhsusan", 3000000, 12);

        System.out.println("\n3. Output Polimorfisme");
        System.out.println(produk2.tampilkanInfo());
        System.out.println(pegawai2.tampilkanInfo());
    }
}