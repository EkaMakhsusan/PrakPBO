/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {

        Klub klub = new Klub("Klub Drama");

        Anggota anggota1 = new Anggota("Hou Minghao");
        Anggota anggota2 = new Anggota("Ding Yuxi");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        klub.infoKlub();
    }
}