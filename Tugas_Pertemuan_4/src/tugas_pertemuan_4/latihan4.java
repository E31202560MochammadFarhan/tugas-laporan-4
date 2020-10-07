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
public class latihan4 {
    public static void main(String[]args) {
        String alfabet;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Anda = ");
        alfabet = input.next();
        
        switch (alfabet) {
            case "A":
                System.out.println("4");
                break;
            case "B":
                System.out.println("3");
                break;
            case "C":
                System.out.println("2");
                break;
            case "D":
                System.out.println("1");
                break;
            case "E":
                System.out.println("0");
                break;
        }
    }
}