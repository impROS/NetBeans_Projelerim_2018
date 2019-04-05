package botalgoritma;

import java.util.Random;

public class BotAlgoritma {

    static float yuzdelikOrani;
    static float coinBaslangic = 100f;
    static float artisOran = 30; //%70
    static float oncekiCoinMiktari;
    static float sonrakiCoinMiktari;
    static float karSatmaOrani = 2f;
    static float zararSatmaOrani = -2f;
    static boolean satildiMi = false;
    static boolean satisIcınBekle = false;
    static float birimSayisi=1f;

    public static void main(String[] args) {
        sonrakiCoinMiktari = coinBaslangic;
        oncekiCoinMiktari = coinBaslangic;

        for (int i = 0; i < 100; i++) {
            float miktar = randomDegis();
            sonrakiCoinMiktari += miktar;

            if (miktar < 0) {
                //System.out.println("Azaldi   : " + sonrakiCoinMiktari + " ==> Miktar : " + miktar);
            } else if (miktar > 0) {
                // System.out.println("Artti    : " + sonrakiCoinMiktari + " ==> Miktar : +" + miktar);
            } else if (miktar == 0) {
                //  System.out.println("Sabit   : " + sonrakiCoinMiktari);

            } else {
                System.out.println("Bilinmeyen Durum!!");
            }

            float oran = ((sonrakiCoinMiktari - oncekiCoinMiktari) / oncekiCoinMiktari) * 100;
            //System.out.println("Oran : " + oran + "\n");

            oncekiCoinMiktari = sonrakiCoinMiktari;

            float genelOran = ((sonrakiCoinMiktari - (coinBaslangic*birimSayisi)) / (coinBaslangic*birimSayisi)) * 100;
            //System.out.println("Genel Oran : " + genelOran);
            if (!satildiMi) {
                if (satisIcınBekle) {
                    if (oran < -0.1) {
                        System.out.println("Kardan Zarara Satildi ==> " + sonrakiCoinMiktari + " ==> Oran : " + oran);
                        birimSayisi=coinBaslangic/sonrakiCoinMiktari;
                        coinBaslangic = birimSayisi*sonrakiCoinMiktari;
                        satildiMi = true;
                        satisIcınBekle = false;
                    } else {
                        System.out.println("Yukselis Devam Ediyor : " + sonrakiCoinMiktari + "==> "
                                + "Oran :" + oran);
                    }

                } else {
                    if (genelOran >= karSatmaOrani) {
                        System.out.println("%1 Düşerse  Satılacak ==> " + sonrakiCoinMiktari + " Oran : +" + genelOran);
                        //coinBaslangic = sonrakiCoinMiktari;
                        satisIcınBekle = true;
                    }

                    if (genelOran <= zararSatmaOrani) {
                        System.out.println("Zararına Satildi ==> " + sonrakiCoinMiktari + " ==> Oran : " + genelOran);
                        birimSayisi=coinBaslangic/sonrakiCoinMiktari;
                        System.out.println("Birim Sayisi : "+birimSayisi);
                        coinBaslangic = birimSayisi*sonrakiCoinMiktari;
                        satildiMi = true;
                    }
                }

            } else {
                if (oran > 1) {
                    System.out.println("Tekrar Alindi : " + sonrakiCoinMiktari + " ==> Oran : " + oran);
                    birimSayisi = coinBaslangic / sonrakiCoinMiktari;
                    System.out.println("Birim Sayisi : " + birimSayisi);
                    System.out.println();
                    coinBaslangic = birimSayisi*sonrakiCoinMiktari;
                    satildiMi = false;
                }

            }
        }
        System.out.println("Son Para : " + coinBaslangic);

    }

    public static float randomDegis() {
        Random rnd = new Random();
        float artis = rnd.nextFloat();
        //   System.out.println("random : " + artis);

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
