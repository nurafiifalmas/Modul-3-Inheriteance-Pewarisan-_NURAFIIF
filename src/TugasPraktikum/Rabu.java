/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

public class Rabu extends Selasa {
    private String hari = "Rabu";
    private String jadwal = "\n    - Bahasa Indonesia X "
                          + "\n    - Dasar Desain Grafis "
                          + "\n    - Produktif RPL X "
                          + "\n    - Matematika X ";
     protected void Rabu(){
     super.selasa();
     System.out.println("  > Hari "+hari+" : "+jadwal);
}
}
