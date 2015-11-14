
public class Gabung
{
    // instance variables - replace the example below with your own
  public int[] gabung (int[] pertama , int[] kedua){
     
      int [] hasil = new int[pertama.length+kedua.length];
      
      System.arraycopy(pertama, 0, hasil, 0, pertama.length);
      System.arraycopy(kedua, 0, hasil, pertama.length, kedua.length);


      return hasil;
  }
}
 
