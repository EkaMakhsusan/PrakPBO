/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5_2;

/**
 *
 * @author HP
 */
public class SepedaMotor extends KendaraanDarat {
    private String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, int jumlahRoda, String jenisMesin) {
        super(nama, kecepatan, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}