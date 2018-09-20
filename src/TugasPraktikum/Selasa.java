package TugasPraktikum;

/**
 *
 * @author user
 */
public class Selasa extends MataPelajaran {
    private String hari = "Selasa";
    private String jadwal = "\n    - Fisika X "
                          + "\n    - Sistem Telekomunikasi "
                          + "\n    - Sejarah Indonesia "
                          + "\n    - Produktif RPL X";
     protected void selasa(){
       super.identitas();
       super.judul();
       super.info();
     System.out.println("  > Hari "+hari+" : "+jadwal);
}
}
