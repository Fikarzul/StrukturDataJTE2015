
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
    // instance variables - replace the example below with your own
   double lintang;
   double bujur;
   
   public KoordinatGPS(){
   this.bujur = new Double(0);          
   this.lintang = new Double(0);
   }
   
   public KoordinatGPS(double bujur, double lintang){
    this.bujur= bujur;
    this.lintang = lintang;
   }
   
   public KoordinatGPS(Double bujur, Double lintang){
   this.bujur = bujur;
   this.lintang = lintang;
   }
   
   public Double lintang(){
    return lintang;
    }
    
    public Double bujur(){
    return bujur;
    }
}
