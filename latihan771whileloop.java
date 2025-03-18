/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wulan180325;

/**
 *
 * @author LABSIKOMP03
 */
public class latihan771whileloop {
        public static void main(String[] args) {
        // Menginisialisasi array dengan 7 hari dalam seminggu
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Menggunakan while-loop untuk mencetak semua nilai dari array
        System.out.println("Using while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
        }
    
}
