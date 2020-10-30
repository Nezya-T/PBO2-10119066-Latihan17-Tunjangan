/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119066.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama : Nezya Tariska
 * Kelas : PBO/IF2
 * Nim : 10119066
 */
public class PBOIF210119066Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("==================Program Tunjangan===============");
        System.out.print("Berapa gaji pokok anda perbulan ?\t : Rp ");
        double gajipokok = scanner.nextDouble();
        System.out.print("Status anda ? (Menikah/Belum) \t\t : ");
        String status = scanner.next();
        System.out.println(" ");
        System.out.println("==========Hasil Perthitungan Gaji Anda============");
        System.out.println("Gaji Pokok\t\t = Rp " + gajipokok);
        double tunjangan;
        char Menikah;
        Menikah='Y';
        tunjangan =(status.equals("Menikah"))?0.35*gajipokok:0;
        System.out.println("Tunjangan\t\t = Rp " + tunjangan);
        System.out.println("Total Gaji\t\t = Rp " + (tunjangan+gajipokok));
        System.out.println("(Developed by : Nezya Tariska)");
        
    }
    
}
