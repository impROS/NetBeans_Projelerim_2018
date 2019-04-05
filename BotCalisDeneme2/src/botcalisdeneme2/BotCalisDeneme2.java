/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botcalisdeneme2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BotCalisDeneme2 {

    static float enYuksekToplam = 0;
    static float oncekiToplam = 0;
    static boolean debugMode = false;

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrXRP = getCoinData();
        ArrayList<String> tmpXRP = getCoinData();

        int k = arrXRP.size() - 1;
        for (int i = 0; i < arrXRP.size(); i++) {
            arrXRP.set(i, tmpXRP.get(k));
            k--;
        }
        float karSatmaOrani = 1f;
        float zararSatmaOrani = -1f;
        float yukselisTrendi = 0.03f; //Bulundu
        float karDususTrendi = -0.03f;
        
//genetik programlama

        int toplamDongu = 0;
        //for (karSatmaOrani = 0.5f; karSatmaOrani < 5f; karSatmaOrani += 0.2f) {
        //  for (zararSatmaOrani = -0.5f; zararSatmaOrani > -3f; zararSatmaOrani -= 0.2f) {
         //  for (karDususTrendi = -0.001f; karDususTrendi > -5f; karDususTrendi -= 0.001f) {
       //for (yukselisTrendi = 0.001f; yukselisTrendi < 1f; yukselisTrendi += 0.001f) {

            toplamDongu++;
            karHesapla(arrXRP, karSatmaOrani, zararSatmaOrani, karDususTrendi, yukselisTrendi);
            //  }
            // }
            //  }
       // }//END Yukselis Trendi;
        System.out.println("Toplam Dongu : " + toplamDongu);
    }

    public static void karHesapla(ArrayList<String> arrCoinData, float kar,
            float zarar, float trendDusus, float trendYukselis) {

        float simdikiFiyat;
        float oncekiFiyat;
        float coinAdedi = 0;
        float simdikiOran;
        float genelOran = 0;
        float toplamPara;
        float ilkPara;
        float sinananDeger=trendYukselis;

        boolean satisIcınBekle = false;
        boolean satildiMi = true;
        oncekiFiyat = Float.parseFloat(arrCoinData.get(0).replaceAll(",", "."));
        toplamPara = ilkPara = 100f;

        for (int i = 1; i < arrCoinData.size() - 1; i++) {
            simdikiFiyat = Float.parseFloat(arrCoinData.get(i).replaceAll(",", "."));
            simdikiOran = ((simdikiFiyat - oncekiFiyat) / oncekiFiyat) * 100;
          //  yaz("Simdiki Oran : " + simdikiOran);
            if (satildiMi) {
                //Coinler Satildiysa..
                if (simdikiOran >= trendYukselis) {
                    yaz("Coin Alindi.Oran : " + simdikiOran);
                    coinAdedi = ilkPara / simdikiFiyat;
                    satildiMi = false;
                }

            } else {//Coinler Hala Satilmadiysa..
                genelOran = ((toplamPara - ilkPara) / ilkPara) * 100;
               // yaz("Genel Oran : " + genelOran);
                toplamPara = coinAdedi * simdikiFiyat;

                if (satisIcınBekle) {//Kar durumuna gecildiyse..
                    if (genelOran <= trendDusus) {
                        yaz("Kar Satisi Yapildi.Oran : " + genelOran);

                        satisIcınBekle = false;
                        satildiMi = true;
                    }
                } else {
                    if (genelOran <= zarar) {//Zarar Durumunda Coinleri SAT
                        yaz("Coinler  Zararına Satildi.Genel Oran  " + genelOran);
                        satildiMi = true;
                    }
                    if (genelOran >= kar) {//Kar Durumunda,Dusus Icin Bekle ve Dusunce Sat
                        yaz("Kar Durumuna Gecildi.Dusunce Satilacak.Genel Oran : " + genelOran);
                        satisIcınBekle = true;
                    }
                }
                ilkPara = toplamPara;
            }

            oncekiFiyat = simdikiFiyat;
          //  yaz("Toplam : " + toplamPara);
           // yaz("Toplam ilk : " + ilkPara);
        }//End for
        if (toplamPara > enYuksekToplam) {
            enYuksekToplam = toplamPara;
            System.out.println("En Yuksek Toplam Para : " + enYuksekToplam + "\nKar : "
                    + kar + "\nZarar : " + zarar + "\nTrendDusus : " + trendDusus
                    + "\nTrendYukselis : " + trendYukselis + "\n-------------------------");
        }
        
        if (oncekiToplam < toplamPara) {
            System.out.println(toplamPara + ", Yukseldi : " + sinananDeger);
        } else if (oncekiToplam > toplamPara) {
            System.out.println(toplamPara + ", Dustu: " + sinananDeger);

        } else {
            System.out.println(toplamPara + ", Sabit : " + sinananDeger);

        }

    }

    public static void yaz(String strMesaj) {
        if (!debugMode) {
            System.out.println(strMesaj);
        }
    }

    public static ArrayList<String> getCoinData() {
        FileReader fr = null;
        ArrayList<String> arrXRP = new ArrayList<>();
        try {

            String strFile = "C:\\Users\\impROS\\Desktop\\bot_deneme\\binance_250_dk_btc.txt";
            File file = new File(strFile);
            fr = new FileReader(file);
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BotCalisDeneme2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BotCalisDeneme2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(BotCalisDeneme2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arrXRP;
    }
}
