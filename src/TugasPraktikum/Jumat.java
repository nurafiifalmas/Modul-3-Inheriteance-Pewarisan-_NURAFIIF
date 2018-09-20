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
public class Jumat extends Kamis {
     private String hari = "Jum'at";
     private String jadwal = "\n    - OlahRaga Rutin (Senam / Jalan santai)"
                           + "\n    - Produktif RPL X "
                           + "\n    - Pendidikan Kewarganegaraan X "
                           + "\n    - Kimia X "
                           + "\n    - Pendidikan Agama Islam X ";
     protected void Jumat(){
     super.Kamis();
     System.out.println("  > Hari "+hari+" : "+jadwal);
     }
     protected void motivasi(){
        System.out.println("\n==========================================================");
        System.out.println("Lampauilah Batas Maksimalmu Maka Kesuksesan Akan Bersamamu");
        System.out.println("==========================================================");
     
}
}
