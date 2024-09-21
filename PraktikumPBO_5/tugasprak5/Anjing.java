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

    public Anjing(String nama, String ras) {
        super(nama, "Anjing");
        this.ras = ras;
    }

    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + ", Ras: " + ras + ", Suara: Guk Guk";
    }
}