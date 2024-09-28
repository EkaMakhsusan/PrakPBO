/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

class KeranjangBelanja {
    ArrayList<Produk> produkList = new ArrayList<>();

    void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    double totalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.harga - produk.hitungDiskon();
        }
        return total;
    }
}