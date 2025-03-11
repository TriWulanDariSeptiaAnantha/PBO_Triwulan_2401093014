/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABP1KOMP
 */
import java.io.*;
public class inputkeyboard1 {
   public static void main( String[] args ){ 
      
       BufferedReader dataIn = 
       new BufferedReader(new InputStreamReader( System.in) );
       String nama ="";

 System.out.print("Please Enter Your Name:");

 try{
 nama = dataIn.readLine();
 }catch (IOException e) { 
 System.out.println("Error in getting input");
 }
 System.out.println("Hello " + nama ); 

}
   
}
