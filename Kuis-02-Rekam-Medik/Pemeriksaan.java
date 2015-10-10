
/**
 * Write a description of class Pemeriksaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
public class Pemeriksaan 
{
    Date tanggalPemeriksaan;
    Catatan [] catatan;
    Resep[]obat;
    
    public Pemeriksaan (Date tanggalPemeriksaan, Catatan[]catatan, Resep[]obat ){
    this.tanggalPemeriksaan=tanggalPemeriksaan;
    this.catatan=catatan;
    this.obat=obat;
    }
    
    
}
