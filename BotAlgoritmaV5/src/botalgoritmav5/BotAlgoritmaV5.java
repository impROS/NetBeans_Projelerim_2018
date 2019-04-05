package botalgoritmav5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BotAlgoritmaV5 {

    public static void main(String[] args) {
        ArrayList<Double> arrCoinData = getCoinData("F:\\SSD_YEDEK_1_Eylul\\bot_deneme\\bitcoin_yillik.txt");
        tradeYap(arrCoinData, 0, 0, 0, 0);
    }

    public static void tradeYap(ArrayList<Double> arrCoinData, double karOran,
            double zararOran, double dususTrendi, double yukselistTrendi
    ) {
        //Degisken Tanimlamalari
        ArrayList<Double> arrParalar = paraBolustur(100, 3);
        double takipFiyat = arrCoinData.get(0);
        boolean satildiMi = true;
        boolean satisIcinBekle = false;
        double girisPara = 100;
        double coinSayisi = 1;

        double takipOran = -1;
        double simdikiFiyat;
        for (int i = 1; i < arrCoinData.size(); i++) {
            simdikiFiyat = arrCoinData.get(i);
            takipOran = yuzde(simdikiFiyat, takipFiyat);
            // System.out.printf("takipOran: %f\n", takipOran);

            if (satildiMi) {
                if (takipOran >= -1) {
                    //    if (arrParalar.size() > 0) {
                    //double para = arrParalar.get(0);
                    System.out.printf("Alındı : %.6f\n", takipOran);
                    takipFiyat = simdikiFiyat;
                    coinSayisi = girisPara / simdikiFiyat;
                    System.out.println("Coin Sayisi : " + coinSayisi);
                    satildiMi = false;
                    //  arrParalar.remove(0);
                    //   }
                }
            } else {
                if (satisIcinBekle) {
                    girisPara = coinSayisi * simdikiFiyat;
                    if (takipOran <= -1) {
                        System.out.printf("Kardan Satis : %.6f\n", takipOran);
                        System.out.println("Toplam Para: " + girisPara);
                        takipFiyat = simdikiFiyat;
                        satildiMi = true;
                    } else {
                        System.out.printf("Kar Devam Ediyor..%.6f Toplam  Para : %.6f\n", takipOran, girisPara);
                    }
                } else {
                    girisPara = coinSayisi * simdikiFiyat;

                    if (takipOran >= 2) {
                        System.out.printf("Kar Durumuna gecildi,satis icin bekleniyor.. : %.6f\n", takipOran);
                        takipFiyat = simdikiFiyat;

                        System.out.println("Toplam Para : " + girisPara);
                        satisIcinBekle = true;
                    } else if (takipOran <= -2) {
                        System.out.printf("Zarar  Satis : %.6f,Toplam Para :%.6f\n", takipOran, girisPara);
                        takipFiyat = simdikiFiyat;
                        satildiMi = true;
                    }
                }

            }

        }//End for
    }

    public static double yuzde(double x, double y) {
        // System.out.println(x + " : " + y);
        return ((x - y) / y) * 100;
        // return (x / y) - 1;
    }

    public static ArrayList<Double> getCoinData(String path) {
        try {
            return convertArrToDouble((ArrayList<String>) Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        } catch (IOException ex) {
            System.err.println("Hata : " + ex.getMessage());
        }
        return null;
    }

    public static ArrayList<Double> paraBolustur(double para, int dilim) {
        ArrayList<Double> arrParalar = new ArrayList<>();
        double tmpPara;
        for (int i = 0; i < dilim; i++) {
            tmpPara = para / dilim;
            arrParalar.add(para);
            System.out.println("Tmppara : " + tmpPara);

        }
        return arrParalar;
    }

    public static ArrayList<Double> convertArrToDouble(ArrayList<String> arrCoinStringData) {
        //   int sayac = 0;
        ArrayList<Double> arrCoinFloatData = new ArrayList<>();
        for (int i = arrCoinStringData.size() - 1; i >= 0; i--) {
            double tmpCoin = Double.parseDouble(arrCoinStringData.get(i).replaceAll(",", "."));
            // double tmpCoin2 = Double.parseDouble(arrCoinStringData.get(sayac++).replaceAll(",", "."));
            arrCoinFloatData.add(tmpCoin);
            //arrCoinFloatData.add(tmpCoin2);
        }
        return arrCoinFloatData;
    }
}
