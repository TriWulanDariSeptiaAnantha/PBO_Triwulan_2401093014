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
public class latihan771dowhile {
    public static void main(String[] args) {
         String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
  
     System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
    }
}
