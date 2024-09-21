/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
class Anjing extends Hewan {
    private String ras;
    private String suara;

    public Anjing(String nama, String ras, String suara) {
        super(nama, "Anjing");
        this.ras = ras;
        this.suara = suara;
    }

    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + ", Ras: " + ras + ", Suara:" + suara;
    }
}
