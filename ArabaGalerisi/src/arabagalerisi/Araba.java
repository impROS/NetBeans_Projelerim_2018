/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabagalerisi;

/**
 *
 * @author impROS
 */
public class Araba {

    private String marka;
    private String model;
    private int yıl;
    private double fiyat;

    public Araba(String marka, String model, int yıl, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.fiyat = fiyat;
    }

    public Araba() {
        this.marka = "marka";
        this.model = "model";
        this.yıl = 0;
        this.fiyat = 0;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void bilgiYaz() {
        System.out.println("Araba Bilgileri : ");
        System.out.println("Marka : " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println("Yıl: " + getYıl());
        System.out.println("-----------------------");
    }
}
