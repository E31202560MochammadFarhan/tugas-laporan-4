/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pertemuan_4;
import java.util.Scanner;
/**
 *
 * @author M.Farhan
 */
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        String NIM;
        int nilai;
        Scanner input = new Scanner (System.in);
        System.out.print("Input Nama Anda = ");
        nama = input.next();
        System.out.print("Input NIM Anda = ");
        NIM = input.next();
        System.out.print("Input Nilai Anda = ");
        nilai = input.nextInt();
        System.out.println("Nama Anda = "+nama);
        System.out.println("NIM Anda = "+NIM);
        System.out.println("Nilai Anda = "+nilai);
        if (nilai > 77)  {
            System.out.println("Anda Lulus");
        } else if (nilai < 56){
            System.out.println("Anda Tidak Lulus");
        } 
    }
}