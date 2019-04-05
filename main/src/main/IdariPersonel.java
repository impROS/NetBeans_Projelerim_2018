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
public class IdariPersonel extends Kisiler implements Calisan {

    private int gunSayisi;
    private int yevmiye;
    private int maas;
    private String birim;

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

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    @Override
    public void maasHesapla() {
        int maas = getGunSayisi() * getYevmiye();
        System.out.println("Idari Personelin Maasi : " + maas);
        setMaas(maas);
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Idari Personel Bilgileri : birim : " + getBirim()+ ",maas : " + getMaas());
    }

}
