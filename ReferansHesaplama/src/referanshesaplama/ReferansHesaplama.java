/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referanshesaplama;

/**
 *
 * @author impROS
 */
public class ReferansHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrBireyselKosul = {10, 15, 20, 25};
        int[] bireyselDerinlikSayac = {11, 5, 20, 25, 100, 10};

        int bireyselKazanc;
        int kobiKazanc;
        int toplamKazanc;

        //<editor-fold defaultstate="collapsed" desc="Bireysel Kazanc Hesaplama">
        int toplamBireysel = bireyselDerinlikSayac[0] * 5;
        for (int i = 1; i < 5; i++) {
            if (bireyselDerinlikSayac[i - 1] < arrBireyselKosul[i - 1]) {
                System.out.println((i + 1) + ".Derinlik False ==>" + bireyselDerinlikSayac[i - 1]);
                break;
            }
            System.out.println((i + 1) + ".Derinlik True ==>" + bireyselDerinlikSayac[i - 1]);
            toplamBireysel += bireyselDerinlikSayac[i];
        }
        bireyselKazanc = toplamBireysel * 10;
        System.out.println("Bireysel: " + toplamBireysel + " * " + "10 = " + bireyselKazanc);
//</editor-fold>

        int[] arrKobiKosul = {25, 10, 8, 7, 19, 11, 13, 15, 17, 19};
        int[] arrKobiDerinlik = {26, 9, 8, 9, 11, 13, 5, 17, 19, 4};

        System.out.println("\n\n");
        int toplamKobi = arrKobiDerinlik[0] * 10;
        System.out.println("1.Derinlik_Kobi " + arrKobiDerinlik[0] + " * 10 = " + toplamKobi);
        if (toplamKobi >= 250) { //Eger Kobi Derinligi 25 Kisiden Fazlaysa
            for (int i = 1; i < 10; i++) {
                System.out.println(toplamKobi + " + " + arrKobiDerinlik[i] + " = " + (toplamKobi += arrKobiDerinlik[i]));
              
            }
            kobiKazanc = toplamKobi * 10;
        } else {
            for (int i = 1; i < 10; i++) {
                if (arrKobiDerinlik[i - 1] < arrKobiKosul[i]) {
                    System.out.println((i + 1) + ".Derinlik_Kobi_False " + arrKobiDerinlik[i - 1] + " < " + arrKobiKosul[i]);
                    break;
                }
                System.out.println((i + 1) + ".Derinlik_Kobi_True  " + arrKobiDerinlik[i - 1] + " > = " + arrKobiKosul[i] + " ==> " + arrKobiDerinlik[i] + " Ekle");
                System.out.println("    ==> " + toplamKobi + " + " + arrKobiDerinlik[i] + " = " + 
                        (toplamKobi += arrKobiDerinlik[i]));

            }
            kobiKazanc = toplamKobi * 10;
            System.out.println("Kobi Kazanc : " + kobiKazanc);
        }
        toplamKazanc = kobiKazanc + bireyselKazanc;
        System.out.println("Toplam Kazanc : " + toplamKazanc);
    }

}
