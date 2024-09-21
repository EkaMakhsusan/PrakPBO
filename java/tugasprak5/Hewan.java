/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
public class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String tampilkanInformasi() {
        return "Nama: " + nama + ", Jenis: " + jenis;
    }
}
