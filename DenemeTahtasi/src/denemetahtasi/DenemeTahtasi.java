/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemetahtasi;

/**
 *
 * @author impROS
 */
public class DenemeTahtasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      String str="impROS aa";
//        System.out.println(str.replaceAll("a", ""));
//        System.out.println(str);
//        String strDeneme="{'Maclar':[{'tur':'futbol','tarih':'18.06.2018','saat':'16:00','ligAdi':'World Cup','skor':'---','takimlar':'Belgium - Panama','oran':'1.30','tahmin':'Belgium Wins','sonuc':'bekleniyor','bayrak':'http:\\/\\/free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com\\/img\\/\\/Flags\\/EuropeanUnion.png'},{'tur':'futbol','tarih':'18.06.2018','saat':'15:00','ligAdi':'Belarusian Vysshaya Liga','skor':'---','takimlar':'Dinamo Minsk - FC Vitebsk','oran':'1.33','tahmin':'Dinamo Wins or Draw','sonuc':'bekleniyor','bayrak':'http:\\/\\/free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com\\/img\\/\\/Flags\\/Belarus.png'},{'tur':'futbol','tarih':'18.06.2018','saat':'14:00','ligAdi':'Georgian U'lesi Liga','skor':'---','takimlar':'Chikhura- Torpedo','oran':'1.38','tahmin':'1.5 GOAL OVER','sonuc':'bekleniyor','bayrak':'http:\\/\\/free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com\\/img\\/\\/Flags\\/Georgia.png'},{'tur':'futbol','tarih':'18.06.2018','saat':'18:00','ligAdi':'Swedish Superettan','skor':'---','takimlar':'GAIS - Degerfors','oran':'1.44','tahmin':'3.5 GOAL UNDER','sonuc':'bekleniyor','bayrak':'http:\\/\\/free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com\\/img\\/\\/Flags\\/Sweden.png'},{'tur':'futbol','tarih':'18.06.2018','saat':'19:00','ligAdi':'World Cup','skor':'---','takimlar':'Tunisia - England','oran':'1.55','tahmin':'England Wins','sonuc':'bekleniyor','bayrak':'http:\\/\\/free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com\\/img\\/\\/Flags\\/EuropeanUnion.png'}]}";
//        System.out.println(strDeneme.substring(690, 700));

        //  //####-##-##
        String strDogumTarihi = "1990-02-35";
        System.out.println("lenght : "+strDogumTarihi.length());
       int yil = Integer.parseInt(strDogumTarihi.substring(0, 4));
        int ay = Integer.parseInt(strDogumTarihi.substring(5, 7));
        int gun = Integer.parseInt(strDogumTarihi.substring(8, 10));
        System.out.println("Gun :" + gun);
        System.out.println("Ay :" + ay);
        System.out.println("Yil :" + yil);
    }

}
