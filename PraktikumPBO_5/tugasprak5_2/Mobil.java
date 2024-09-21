/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5_2;

/**
 *
 * @author HP
 */
public class Mobil extends KendaraanDarat {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}