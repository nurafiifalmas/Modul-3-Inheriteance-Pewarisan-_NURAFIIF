/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

public class Kamis extends Rabu {
    private String hari = "Kamis";
    private String jadwal = "\n    - Produktif RPL X "
                          + "\n    - Simulasi dan Komunikasi Digital X "
                          + "\n    - Seni Budaya X"
                          + "\n    - Komputer dan Jaringan Dasar X ";
     protected void Kamis(){
     super.Rabu();
     System.out.println("  > Hari "+hari+" : "+jadwal);
}
}
