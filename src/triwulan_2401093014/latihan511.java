/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABP1KOMP
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan511 {
    public static void main(String[] args) throws IOException {
        // Membuat objek BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Membaca tiga kata dari user
        System.out.print("Enter word1: ");
        String word1 = reader.readLine();

        System.out.print("Enter word2: ");
        String word2 = reader.readLine();

        System.out.print("Enter word3: ");
        String word3 = reader.readLine();

        // Menampilkan output
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
    

