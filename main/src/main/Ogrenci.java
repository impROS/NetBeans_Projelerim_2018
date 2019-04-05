/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author impROS
 */
public class Ogrenci extends Kisiler {

    private String bolum;
    private int sinif;

    @Override
    public void bilgiYaz() {
        super.bilgiYaz(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Bu sınıfın bilgileri gizlidir");
    }

}
