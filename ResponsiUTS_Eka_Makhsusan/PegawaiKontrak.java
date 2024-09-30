/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_Eka_Makhsusan;

/**
 *
 * @author HP
 */
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", Lama Kontrak: " + lamaKontrak + " bulan";
    }
}