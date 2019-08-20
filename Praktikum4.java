/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg4;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi
        Double fahrenheit;
        int celcius;
        
        //Memebuat scanner baru
        Scanner baca = new Scanner (System.in);
        
        //Input
        System.out.println ("Suhu Celcius ke Fahrenheit");
        System.out.println ("Celcius");
        celcius = baca.nextInt();
        
        //Proses
        fahrenheit = Double.valueOf((9/5 * celcius) + 32);
        
        //Output
        System.out.println("F:" + fahrenheit);
    }
    
}
