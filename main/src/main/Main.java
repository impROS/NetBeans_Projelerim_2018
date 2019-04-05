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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci();
        o1.bilgiYaz();

        IdariPersonel i1 = new IdariPersonel();
        i1.setBirim("yonetim");
        i1.setMaas(1500);
        i1.bilgiYaz();

        AkademikPersonel a1 = new AkademikPersonel();
        a1.setBolum("muhendislik");
        a1.setMaas(2000);
        a1.bilgiYaz();

    }

}
