
package praktikum.pkg3;

import java.util.Scanner;


public class Praktikum3 {

   
    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi = 0;
        
        
        //membuat scanner baru
        Scanner baca = new Scanner(System.in);
    
        
        
        //input
        System.out.println ("== Program hitung luas segitiga ==");
        System.out.println ("Input alas :");
        alas = baca.nextInt();
        System.out.println("Input tinggi :");
        tinggi = baca.nextInt();
        
        
        //proses
        luas = (double) (alas * tinggi) / 2;
        
        //output
        System.out.println ("Luas ="+ luas);
    }
    
}

