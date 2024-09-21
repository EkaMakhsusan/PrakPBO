/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5_2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 200, 4, 4);
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor("Yamaha", 150, 2, "4-tak");
        motor.tampilkanInfo();
    }
}
