/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan39.oo.nilaiterbesardanterkecil;

import data.nilai;
import data.petugas;
import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Nilai Terbesar Dan Terkecil (OO)
 */
public class PBOIF210119077Latihan39OONilaiTerbesarDanTerkecil {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nilai n = new nilai();
        petugas p = new petugas();
        

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        p.setNama(input.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n.setBanyakMhs(input.nextInt());
        
        for (int i = 0; i < n.getBanyakMhs(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+ (i+1) + " = ");
            n.setJmlNilai(input.nextInt());
        }
        
        n.tampilHasil();
        System.out.println("\nPetugas : " + p.getNama());
    }
    
}
