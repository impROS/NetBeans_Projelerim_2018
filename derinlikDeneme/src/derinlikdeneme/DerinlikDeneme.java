/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derinlikdeneme;

import java.util.ArrayList;

/**
 *
 * @author impROS
 */
public class DerinlikDeneme {

    /**
     * @param args the command line arguments
     */
    public enum Tur{
    Ref,
    Rek
  
    public String getString(){
    switch(this){
    case                                                        >Ref:return "Ref";break;
    case Rek:return "Rek";break;
 
    }
      return "";
    }
    }
    static int ID=0;
   static ArrayList<String> arrHesapHareketleri ;
    public static void main(String[] args) {
         arrHesapHareketleri = new ArrayList<>();
        
        //uyeID,tur,tutar
        arrHesapHareketleri.add("1");
    }
    public static void ekle(Tur tur,float tutar){
        ID++;
        String strHareket =ID+","+Tur.
        arrHesapHareketleri.add(e)
    
    }
    
}
