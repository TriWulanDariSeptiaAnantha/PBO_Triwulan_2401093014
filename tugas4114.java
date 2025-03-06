/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wulan_4112_latihan;

/**
 *
 * @author LAB-MM
 */
public class tugas4114 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        // Tampilkan output
        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);

        // Gunakan operator kondisi ?: untuk mencari nilai terbesar
        int max = (number1 > number2) ? number1 : number2;
        max = (max > number3) ? max : number3;

        // Tampilkan output
        System.out.println("Nilai tertingginya adalah angka = " + max);
    }
    
}
