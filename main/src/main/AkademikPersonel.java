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
public class AkademikPersonel extends Kisiler implements Calisan {

    private int gunSayisi;
    private int yevmiye;
    private int maas;
    private String bolum;

    public int getGunSayisi() {
        return gunSayisi;
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public int getYevmiye() {
        return yevmiye;
    }

    public void setYevmiye(int yevmiye) {
        this.yevmiye = yevmiye;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public void maasHesapla() {
        int maas = getGunSayisi() * getYevmiye() + 1000;
        System.out.println("Akademik Personelin Maasi : " + maas);
        setMaas(maas);
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Akademik Personel Bilgileri : bolum : " + getBolum() + ",maas : " + getMaas());


    }

}
