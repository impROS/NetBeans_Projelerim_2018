package ysa_basit;

import java.util.Random;
public class Ysa_basit {
    public static float x1 = 0.1f;
    public static float y1 = 0.2f;
    public static float x2 = 0.3f;
    public static float y2 = 0.4f;
    public static void main(String[] args) {
     
        float sonDeger = 0;
        for (int i = 0; i < 10; i++) {
            float deger = randomDeger();

            if (deger < x1) {
                sonDeger = x1 - 5;
            }
            if (deger > x2) {
                sonDeger = x2 + 5;
            }

            if (deger <= y1) {
                sonDeger = deger * y1;
            }
            if (deger >= y2) {
                sonDeger = deger / y2;
            }
        }
        System.out.println("Son Deger : " + sonDeger);
    }
    public static float randomDeger() {
        Random rnd = new Random();
        float random = rnd.nextFloat();
        return random;
    }
}
