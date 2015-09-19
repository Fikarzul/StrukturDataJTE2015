
/**
 * Write a description of class FiniteElement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiniteElement
{
    Gaya gaya[];
    
    public FiniteElement(){
    }
    
    public FiniteElement(Gaya[] gaya){
    this.gaya=gaya;
    }
    
    Gaya[] daftarGaya(){
    return gaya;
    }

}
