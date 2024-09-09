/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak3;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Land Rover", "Range Rover", 2024, "Putih");
        System.out.println("Mobil 1");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        mobil1.setWarna("Hitam");
        System.out.println("Setelah mengubah warna:");
        mobil1.displayInfo();

        Mobil mobil2 = new Mobil("Mazda", "Mazda CX-30", 2019, "Merah");
        System.out.println("Mobil 2");
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}








