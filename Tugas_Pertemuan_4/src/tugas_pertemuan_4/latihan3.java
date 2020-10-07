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
public class latihan3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String Nama, Jenis_Kelamin;
        int Tinggi_Badan;
        System.out.print("Masukan Nama Anda = ");
        Nama = input.next();
        System.out.print("Masukan Jenis Kelamin = ");
        Jenis_Kelamin = input.next();
        System.out.print("Masukan Tinggi Badan = ");
        Tinggi_Badan = input.nextInt();
        
        if ("laki-laki".equals(Jenis_Kelamin)){
            if (Tinggi_Badan < 171) {
                System.out.println("Anda Gagal");
            } else {
                System.out.println("Selamat Anda Lulus");
            }
        } else {
            if (Tinggi_Badan < 161) {
                System.out.println("Anda Gagal");
            } else {
                System.out.println("Selamat Anda Lulus");
            } 
        }
    }
}