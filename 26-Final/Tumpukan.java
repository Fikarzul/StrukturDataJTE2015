import java.math.BigInteger;
import java.util.Stack;
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumpukan
{   
     
    private Node atas;
    private Node bawah;
    
    public Tumpukan(){
        atas=null;
        bawah=null;
    }
    public void tumpukkanKosong(){
        
    }
    
    public void tumpuk(BigInteger data){
        Node baru = new Node (data);
        baru.berikut = null;
        if(atas == null)
        {
            bawah = baru;
            atas = baru;
        }
        else{
            atas.berikut=baru;
            atas=baru;
        }
    }
    
    public BigInteger ambil(){
        if (atas==null){
        return null;
    }else{
        BigInteger ambil = bawah.data;
        Node sekarang = atas;
        while (sekarang.berikut != null){
            sekarang = sekarang.berikut;
        }
        bawah = sekarang;
        return ambil;
    }
    }
    
    public BigInteger atas(){
        if(atas==null)
        return null;
        else {
            return atas.data;
        }
    }
    
    public BigInteger bawah(){
        if(bawah!=null)
        return bawah.data;
        else{
            return null;
        }
    }
   
}
