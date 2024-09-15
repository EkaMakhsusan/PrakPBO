/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak4;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Eka", 20, "Programmer", 10000000);

        pekerja.tampilkanInfo();

        pekerja.setNama("Susan");
        System.out.println("\nSetelah perubahan nama:");
        pekerja.tampilkanInfo();
    }
}