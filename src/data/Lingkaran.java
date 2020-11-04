/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung Lingkaran
 * (Jari-Jari, Luas, dan Keliling)
 */
public class Lingkaran {
    private int diameter;

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    private double hitungJariJari(){
        return diameter / 2;
    }
    
    private double hitungLuas(){
        return Math.PI * Math.pow(hitungJariJari(), 2);
    }
    
    private double hitungKeliling(){
        return 2 * Math.PI * hitungJariJari();
    }
    
    public void tampilPerhitungan(){
        System.out.println("\n=======Hasil Perhitungan Lingkaran=======");
        System.out.println("Jari - Jari Lingkaran   = " + String.format("%.2f", hitungJariJari()).replace('.', ',') + " cm");
        System.out.println("Luas Lingkaran          = " + String.format("%.2f", hitungLuas()).replace('.', ',') + " cm");
        System.out.println("Keliling Lingkaran      = " + String.format("%.2f", hitungKeliling()).replace('.', ',') + " cm");
    }
}
