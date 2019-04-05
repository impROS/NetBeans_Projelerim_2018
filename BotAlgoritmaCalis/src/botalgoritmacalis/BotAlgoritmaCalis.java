package botalgoritmacalis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class BotAlgoritmaCalis {

    static float toplamPara = 100f;
    static float birimSayisi;

    static float oncekiFiyat;
    static float simdikiFiyat;
    static float girisFiyati;

    static float karSatmaOrani = 0.003f;
    static float zararSatmaOrani =-0.016f;

    static float yukselisTrendi = 0.001f;
    static float karDususTrendi = -0.039999988f;

    static boolean satildiMi = true;
    static boolean satisIcınBekle = false;

    static float simdikiOran;
    static float genelOran;
    static float artisOran = 40; //%70
    static boolean debugMode = true;

    public static void main(String[] args) throws IOException {
        float tmpToplam = 0;
        float tmpKarSatmaOrani = 0f;
        float tmpZararSatmaOrani = 0f;

        float tmpYukselisTrendi = 0f;
        float tmpKarDususTrendi = 0f;

        // LinkedList<Float> arrOran = new LinkedList();
        ArrayList<String> arrXRP = getRippleData();
        ArrayList<String> tmpXRP = getRippleData();

        int k = arrXRP.size() - 1;
        for (int i = 0;
                i < arrXRP.size();
                i++) {

            //String tmp = arrXRP.get(j);
            arrXRP.set(i, tmpXRP.get(k));
            k--;

        }

//        karSatmaOrani = 0.05f;
//        zararSatmaOrani = -0.05f;
//
//        yukselisTrendi = 0.01f;
//        karDususTrendi = -0.01f
//        for (yukselisTrendi = 0.001f; yukselisTrendi < 0.01f; yukselisTrendi += 0.001f) {
//            for (karDususTrendi = 0.001f; karDususTrendi < 0.01f; karDususTrendi += 0.001f) {
//                for (karSatmaOrani = 0.001f; karSatmaOrani < 0.01f; karSatmaOrani += 0.001f) {
//                    for (zararSatmaOrani = 0.001f; zararSatmaOrani < 0.01f; zararSatmaOrani += 0.001f) {
//                        sayacDeneme++;
//                    }
//                }
//            }
//        }
//        System.out.println("Sayac Deneme  : "+sayacDeneme);
        int tmpSayac = 0;
        // for (yukselisTrendi = 0.001f; yukselisTrendi < 0.04f; yukselisTrendi += 0.001f) {
        // for (karDususTrendi = -0.001f; karDususTrendi > -0.4f; karDususTrendi -= 0.001f) {
        //   for (karSatmaOrani = 0.003f; karSatmaOrani < 0.04f; karSatmaOrani += 0.001f) {
        //  for (zararSatmaOrani = -0.003f; zararSatmaOrani > -0.04f; zararSatmaOrani -= 0.001f) {
        //  tmpSayac++;
        // }
        // }
        // }
        // }

        System.out.println(
                "tmpSayac:" + tmpSayac);
        float sayacDeneme = 0;

//        for (yukselisTrendi = 0.001f; yukselisTrendi < 0.05f; yukselisTrendi += 0.001f) {
//            for (karDususTrendi = -0.001f; karDususTrendi > -0.5f; karDususTrendi -= 0.001f) {
//                for (karSatmaOrani = 0.003f; karSatmaOrani < 0.05f; karSatmaOrani += 0.001f) {
//                    for (zararSatmaOrani = -0.003f; zararSatmaOrani > -0.05f; zararSatmaOrani -= 0.001f) {
        sayacDeneme++;
        if (sayacDeneme % 1000 == 0) {
            float oran = (sayacDeneme / 23104000f) * 100f;
            System.out.println("% " + oran + " Tamamlandi..Adım :" + sayacDeneme);

        }

        // zararSatmaOrani = -1 * zararSatmaOrani;
        //karDususTrendi = -1 * karDususTrendi;
        simdikiFiyat = Float.parseFloat(arrXRP.get(0).replaceAll(",", "."));
        oncekiFiyat = simdikiFiyat;
        yaz("arrXRP Size : " + arrXRP.size());
        for (int i = 1; i < arrXRP.size() - 1; i++) {
            yaz("");
            simdikiOran = ((simdikiFiyat - oncekiFiyat) / oncekiFiyat) * 100;
            //System.out.println("Simdiki Oran : "+simdikiOran);
            //   arrOran.add(simdikiOran);
            yaz("Simdiki Oran = " + simdikiOran);
            yaz("Onceki : " + oncekiFiyat + ",Sonraki : " + simdikiFiyat);

            if (satildiMi) {
                if (simdikiOran >= yukselisTrendi) {
                    yaz("Yukselis Trendi.Alındı.Oran : " + simdikiOran);
                    yaz("Simdiki Fiyat : " + simdikiFiyat);
                    girisFiyati = simdikiFiyat;
                    birimSayisi = toplamPara / girisFiyati;
                    yaz("Birim Sayisi : " + birimSayisi);
                    yaz("Toplam Para : " + toplamPara);
                    satildiMi = false;
                } else {
                    yaz("Alim Icın Bekleniyor..Oran : " + simdikiOran);
                }
            } else {
                if (satisIcınBekle) {
                    toplamPara = birimSayisi * simdikiFiyat;

                    if (simdikiOran <= karDususTrendi) {
                        yaz("Kardan Satis.Oran :" + simdikiOran);
                        yaz("Toplam Para : " + toplamPara);
                        yaz("");
                        satildiMi = true;
                    } else {
                        yaz("Yukselis Devam Ediyor..");
                    }
                } else {
                    if (simdikiOran <= zararSatmaOrani) {
                        yaz("Zarardan Cikildi.Satıldı.Oran : " + simdikiOran);
                        girisFiyati = simdikiFiyat;
                        toplamPara = girisFiyati * birimSayisi;
                        yaz("Toplam Para : " + toplamPara);
                        yaz("");
                        satildiMi = true;
                    }
                    if (simdikiOran >= karSatmaOrani) {
                        yaz("Kar Durumuna Gecildi.Dusunce Satilacak.Kar :" + simdikiOran);
                        yaz("");
                        satisIcınBekle = true;
                    }
                }

            }
            oncekiFiyat = simdikiFiyat;
            simdikiFiyat = Float.parseFloat(arrXRP.get(i + 1));
        }//END FOR
        if (toplamPara > tmpToplam) {
            tmpToplam = toplamPara;
            tmpKarDususTrendi = karDususTrendi;
            tmpYukselisTrendi = yukselisTrendi;
            tmpZararSatmaOrani = zararSatmaOrani;
            tmpKarSatmaOrani = karSatmaOrani;

            System.out.println(
                    "Daha Yuksek Kar Bulundu");
            System.out.println("EN Yuksek Kar : " + tmpToplam);
            System.out.println("KarSatmaOran : " + tmpKarSatmaOrani);
            System.out.println("ZararSatmaOran : " + tmpZararSatmaOrani);
            System.out.println("DususTrendi : " + tmpKarDususTrendi);
            System.out.println("YukselisTrendi : " + tmpYukselisTrendi);
        }
        //System.out.println("Toplam : " + toplamPara);
        // }//END ZARAR SATMA
        yaz("ZARAR  Bitti");
        //  }//END KAR SATMA
        yaz("KAR SINIR  Bitti");

        //   }//END KAR DUSUS
        yaz("KAR DUSUS  Bitti");

        //}//END YUKSELIS KATSAYI 
        System.out.println(
                "YUKSELIS  Bitti");
        System.out.println("EN Yuksek Kar : " + tmpToplam);
        System.out.println("KarSatmaOran : " + tmpKarSatmaOrani);
        System.out.println("ZararSatmaOran : " + tmpZararSatmaOrani);
        System.out.println("DususTrendi : " + tmpKarDususTrendi);
        System.out.println("YukselisTrendi : " + tmpYukselisTrendi);
        /*
        float toplamOran = 0;
        Float[] tmpOran = arrOran.toArray(new Float[arrOran.size()]);
        for (int i = 0;
                i < tmpOran.length;
                i++) {
            for (int j = 0; j < tmpOran.length; j++) {
                float tmp = tmpOran[i];
                tmpOran[i] = tmpOran[j];
                tmpOran[j] = tmp;
            }
        }
        for (int i = 0;
                i < arrOran.size();
                i++) {
            toplamOran += arrOran.get(i);

        }

        yaz(
                "Toplam Oran : " + toplamOran);

        toplamOran = toplamOran / tmpOran.length;

        yaz(
                "Ortalama Oran : " + toplamOran);
        yaz(
                "Ik Oran : " + tmpOran[0]);
        yaz(
                "Son Oran : " + tmpOran[tmpOran.length - 1]);
        yaz(
                "Toplam : " + toplamPara);
        yaz(
                "Birim : " + birimSayisi);
         */

    }

    public static ArrayList<String> getRippleData() throws IOException {
        ArrayList<String> arrXRP = new ArrayList<>();
        String strFile = "C:\\Users\\impROS\\Desktop\\bot_deneme\\binance_250_dk_btc.txt";
        File file = new File(strFile);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String strTmp = br.readLine();
        strTmp = strTmp.replaceAll(",", ".");
        arrXRP.add(strTmp);
        while (strTmp != null) {
            strTmp = strTmp.replaceAll(",", ".");
            arrXRP.add(strTmp);
            //   yaz("XRP : " + strTmp);
            strTmp = br.readLine();

        }
        return arrXRP;
    }

    public static void yaz(String strMesaj) {
        if (!debugMode) {
            System.out.println(strMesaj);
        }
    }

    public static float randomArtis() {
        Random rnd = new Random();
        float artis = rnd.nextFloat();
        //  yaz("random1 : " + artis);

        artis = artis / 5;
        //yaz("random2 : " + artis);

        int yon = rnd.nextInt(100);

        // yaz("Yon : "+yon);
        if (yon <= artisOran) {
            // yaz("buyuk");
            return artis;

        } else {
            return -1 * artis;

        }
    }
}
