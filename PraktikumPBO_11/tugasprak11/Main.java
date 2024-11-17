/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak11;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(10);

        Buku buku1 = new Buku("Bumi Manusia");
        Buku buku2 = new Buku("Kambing Jantan");

        Pengarang pengarang1 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang pengarang2 = new Pengarang("Raditya Dika");

        buku1.tambahPengarang(pengarang1);
        buku2.tambahPengarang(pengarang2);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}