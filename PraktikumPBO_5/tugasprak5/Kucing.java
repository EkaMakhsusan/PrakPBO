/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, String ras) {
        super(nama, "Kucing");
        this.ras = ras;
    }

    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + ", Ras: " + ras + ", Suara: Meow!";
    }
}