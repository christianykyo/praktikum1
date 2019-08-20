package pertemuan2;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        
        // deklarasi
        Double alas, tinggi, luas;
        
        // Deskripsi
        alas = 23.0;
        tinggi = 41.0;
        
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Proses
        luas = (alas * tinggi) / 2;
        
        // Input
        System.out.println("== Program Hitung Luas Segitiga ==");
        System.out.println("Input alas: " + alas);
        System.out.println("Input tinggi: " + tinggi);
        
        // Output
        System.out.println("Luas: " + luas);
    }
}
