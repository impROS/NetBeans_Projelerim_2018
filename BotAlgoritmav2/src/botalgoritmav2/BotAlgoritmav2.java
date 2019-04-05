package botalgoritmav2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BotAlgoritmav2 {

    static float yuzdelikOrani;
    static float toplamPara = 100f;
    static float birimSayisi;

    static float oncekiFiyat;
    static float simdikiFiyat;
    static float girisFiyati;

    static float karSatmaOrani = 2f;
    static float zararSatmaOrani = -2f;

    static boolean satildiMi = false;
    static boolean satisIcınBekle = false;

    static float simdikiOran;
    static float genelOran;
    static float artisOran = 40; //%70

    static float tmpToplamPara;

    public static void main(String[] args) {
        tmpToplamPara = toplamPara;

        oncekiFiyat = 10f;
        simdikiFiyat = 10f;
        girisFiyati = 10f;
        birimSayisi = toplamPara / simdikiFiyat;
        for (int i = 0; i < 1000; i++) {
            System.out.println("\n");
            float miktar = randomArtis();
            simdikiFiyat += miktar;
            System.out.println("Miktar : " + miktar);

            System.out.println("Simdiki Fiyat : " + simdikiFiyat);
            simdikiOran = ((simdikiFiyat - oncekiFiyat) / oncekiFiyat) * 100;
            System.out.println("Simdiki Oran : " + simdikiOran);
            oncekiFiyat = simdikiFiyat;

            if (satildiMi) {

                if (simdikiOran > 0.7) {
                    girisFiyati = simdikiFiyat;
                    birimSayisi = toplamPara / girisFiyati;

                    System.out.println("Satın Alındı ==>  Fiyat " + girisFiyati);
                    System.out.println("Birim Sayisi ==> " + birimSayisi);
                    satildiMi = false;
                } else {
                    System.out.println("Alim icin bekleniyor..");
                }
            } else {
                genelOran = ((simdikiFiyat - girisFiyati) / girisFiyati) * 100;
                System.out.println("Genel Oran : " + genelOran);
                if (satisIcınBekle) {
                    if (simdikiOran < -0.7) {
                        System.out.println("Kardan Satis.Koinler Satıldı :");
                        toplamPara = birimSayisi * simdikiFiyat;
                        System.out.println("Toplam Para : " + toplamPara);

                        satildiMi = true;
                        satisIcınBekle = false;
                    } else {
                        System.out.println("Yukselis Devam Ediyor..");
                    }
                } else {
                    if (genelOran >= karSatmaOrani) {
                        System.out.println("Kar Hedefine Ulasildi.Dusunce Satilacak.. ");

                        satisIcınBekle = true;
                    } else if (genelOran <= zararSatmaOrani) {
                        System.out.println("Zarar Sınırı.Coinler Satıldı.");
                        toplamPara = birimSayisi * simdikiFiyat;
                        System.out.println("Toplam Para : " + toplamPara);

                        satildiMi = true;
                    }
                }

            }//End Satilmadi

        }//End For
        genelOran = ((toplamPara - tmpToplamPara) / tmpToplamPara) * 100;
        System.out.println("Son Genel Oran:" + genelOran);
        System.out.println("Son Toplam Para  : " + toplamPara);
        System.out.println("Son Birim Sayisi : " + birimSayisi);
    }

    public ArrayList<String> getRippleData(String strPath) throws IOException {
        ArrayList<String> arrXRP = new ArrayList<>();
        String strFile = "C:\\Users\\impROS\\Desktop\\bot_deneme\\ripple_yillik.txt";
        File file = new File(strFile);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String strTmp = br.readLine();
        while (strTmp != null) {
            System.out.println("XRP : " + strTmp);
            strTmp = br.readLine();
        }
        return arrXRP;
    }

    public static float randomArtis() {
        Random rnd = new Random();
        float artis = rnd.nextFloat();
        //  System.out.println("random1 : " + artis);

        artis = artis / 5;
        //System.out.println("random2 : " + artis);

        int yon = rnd.nextInt(100);

        // System.out.println("Yon : "+yon);
        if (yon <= artisOran) {
            // System.out.println("buyuk");
            return artis;

        } else {
            return -1 * artis;

        }
    }
}
