/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_isim_duzenle;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author impROS
 */
public class Android_isim_duzenle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\impROS\\StudioProjects\\arabulkazan\\app\\src\\main\\res\\font";
        File file = new File(path);
       File[] arrFile = file.listFiles();
        for (int i = 0; i < arrFile.length; i++) {
            String filePath = arrFile[i].getParent();
            System.out.println("filepath : "+filePath );
            
            String name = arrFile[i].getName();
            System.out.println("Name : "+name);
            System.out.println("Duzeltilmis Name : "+isimDuzelt(name));
            String yeniIsim = filePath+"\\"+isimDuzelt(name);
            yeniIsim=yeniIsim.replaceAll("-","");
            arrFile[i].renameTo(new File(yeniIsim));
            //arrFile[i].renameTo(file)
        }
        
    
       
    }
    public static String isimDuzelt(String isim){
        for (int i = 0; i < isim.length(); i++) {
            char karakter =isim.charAt(i);
            if(Character.isUpperCase(isim.charAt(i))){
                isim =isim.replace(karakter+"","_"+(karakter+"").toLowerCase());
            }
        }
        return isim;
    }

}
