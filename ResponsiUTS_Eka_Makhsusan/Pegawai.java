/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_Eka_Makhsusan;

/**
 *
 * @author HP
 */
class Pegawai {
    private String namaPegawai;
    private double gaji;

    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String tampilkanInfo() {
        return "Nama Pegawai: " + namaPegawai + ", Gaji: " + gaji;
    }
}