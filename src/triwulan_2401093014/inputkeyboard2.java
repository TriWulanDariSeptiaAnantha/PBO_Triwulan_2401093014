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

public class inputkeyboard2 {
     public static void main( String[] args ){ 
         String name = "";
         name = JOptionPane.showInputDialog("Pelase enter your name");
         String msg = "Hello" + name + "!";
         JOptionPane.showMessageDialog(null, msg);
}
}
    

