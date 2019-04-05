package enesıf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnesIF {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Haftanin Gununu Giriniz..Cikmak icin 0 a basiniz");
        int gun = -1;
        boolean sayiDogruMu = false;
        while (sayiDogruMu == false) {
            try {
                giris = new Scanner(System.in);
                gun = giris.nextInt();
                sayiDogruMu = true;
                System.out.println("Sayi Dogru Girildi");
            } catch (InputMismatchException e) {
                System.err.println("Sayi girisi Yanlis.Tekran Girin");
                sayiDogruMu = false;
            }
        }
        while (gun != 0) {

            if (gun == 1) {
                System.out.println("Pazar");
            } else if (gun == 2) {
                System.out.println("Pazartesi");
            } else if (gun == 3) {
                System.out.println("Salı");
            } else if (gun == 4) {
                System.out.println("Carsamba");
            } else if (gun == 5) {
                System.out.println("Persembe");
            } else if (gun == 6) {
                System.out.println("Cuma");
            } else if (gun == 7) {
                System.out.println("Cumartesi");
            } else {
                System.out.println("1 ile 7 arasında bir sayi giriniz");
            }
            System.out.println("Haftanin Gununu Giriniz..Cikmak icin 0 a basiniz");
            gun = giris.nextInt();
        }
        System.out.println("Program Kapatildi.");

    }

}
