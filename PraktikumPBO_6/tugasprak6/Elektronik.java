/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author HP
 */
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    double hitungDiskon() {
        return harga * 0.2; // Diskon 20%
    }
}