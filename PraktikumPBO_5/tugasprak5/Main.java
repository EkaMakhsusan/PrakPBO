/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Oren", "Persia");
        Anjing anjing1 = new Anjing("Blacky", "Husky Siberian");

        System.out.println(kucing1.tampilkanInformasi());
        System.out.println(anjing1.tampilkanInformasi());
    }
}