/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class MataPelajaran {
    private String hari = "Senin";
    private String jadwal = "\n    - Pendidikan jasmani & kesehatan X 2"
                          + "\n    - Produktif RPL X "
                          + "\n    - Bahasa Inggris "
                          + "\n    - Bimbingan Konseling X";
    
    protected void identitas(){
        System.out.println("==========================================================");
        System.out.println("-----------Nurafiif Almas Azhari / X RPL 5 / 33-----------");
        System.out.println("==========================================================");
    }
    protected void judul(){
        System.out.println("\n* Jadwal Pelajaran SMK Telkom Malang Kelas X RPL 5");
       
    }
     public void info (){
     System.out.println("  > Hari "+hari+" : "+jadwal);
    
}
}

