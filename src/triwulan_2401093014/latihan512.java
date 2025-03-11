/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABP1KOMP
 */
import javax.swing.JOptionPane;
public class latihan512 {
     public static void main( String[] args ){
        String kata1 = "";
        String kata2 = "";
        
        kata1 = JOptionPane.showInputDialog("Please enter your word1");
        kata2 = JOptionPane.showInputDialog("Please enter your word2");
        
        String msg = kata1 + " and " + kata2;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
