/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan51_gajikaryawan;

import java.util.Scanner;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan gaji karyawan
* sesuai dengan jabatan, golongan, dan jumlah kehadirannya. dengan inputan dari
* user
 */
public class PBO3_10117082_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
     
        Manager kry = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t: ");
        kry.setNik(scn1.next());
        System.out.print("Masukkan Nama\t: ");
        kry.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3): ");
        kry.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        kry.setJabatan(scn1.next());
        System.out.print("Masukkan Jumlah Kehadiran \t: ");
        kry.setKehadiran(scn1.nextInt());
                
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK\t: "+kry.getNik());
        System.out.println("NAMA\t: "+kry.getNama());
        System.out.println("GOLONGAN: "+kry.getGolongan());
        System.out.println("JABATAN\t: "+kry.getJabatan());
        
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN\t: "+kry.tunjanganGolongan
        (kry.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "+kry.tunjanganJabatan
        (kry.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "+kry.tunjanganKehadiran
        (kry.getKehadiran()));
        
        System.out.println("");
        
        System.out.println("Gaji Total\t: "+kry.gajiTotal());        
                
    }
    
}
