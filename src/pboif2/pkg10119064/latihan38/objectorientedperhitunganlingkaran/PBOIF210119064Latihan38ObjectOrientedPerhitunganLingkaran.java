/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan38.objectorientedperhitunganlingkaran;

import data.Lingkaran;
import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung Lingkaran
 * (Jari-Jari, Luas, dan Keliling)
 */
public class PBOIF210119064Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filterAngka;
        boolean kondisi = true;
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek lingkaran
        Lingkaran l = new Lingkaran();
        
        
        //input
        System.out.println("=======Perhitungan Lingkaran=======");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = keyboard.nextLine();
            if(filterAngka.matches("[0-9]*")){
                l.setDiameter(Integer.parseInt(filterAngka));
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while (!kondisi);
        
        //output
        l.tampilPerhitungan();
    }
    
}
