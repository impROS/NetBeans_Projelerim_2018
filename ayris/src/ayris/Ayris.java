/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayris;

import java.util.ArrayList;

/**
 *
 * @author impROS
 */
public class Ayris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strVeri = "-4-1--8--3---9---6----12--2---10---7----111----------5";
        // String strVeri = "-11";

        ArrayList<String> arrVeriler = new ArrayList<>();
        int bas = tireIndex(strVeri);
        int son = numberIndex(strVeri);
        String tmpString = "";
        while (bas > -1 && son > 0) {
            tmpString = strVeri.substring(bas, son + 1);
            strVeri = strVeri.substring(son + 1, strVeri.length());
            //System.out.println("strVeri : "+strVeri);
            bas = tireIndex(strVeri);
            son = numberIndex(strVeri);
            for (int i = son + 1; i < strVeri.length(); i++) {
                if ((strVeri.charAt(i) + "").equalsIgnoreCase("-")) {
                    break;
                }
                son++;
            }
            System.out.println("Tmp : " + tmpString);
            arrVeriler.add(tmpString);

        }
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < arrVeriler.size(); j++) {
                if (tireCount(arrVeriler.get(j)) == i) {
                    System.out.println(" " + i + ".Derinlik : " + arrVeriler.get(j).replaceAll("-", ""));
                }
            }
        }

    }

    public static int tireCount(String strVeri) {
        int counTire = 0;
        for (int i = 0; i < strVeri.length(); i++) {
            if (!(strVeri.charAt(i) + "").equalsIgnoreCase("-")) {
                break;
            }
            counTire++;
        }
        return counTire;
    }

    public static int tireIndex(String strVeri) {
        for (int i = 0; i < strVeri.length(); i++) {
            if ((strVeri.charAt(i) + "").equalsIgnoreCase("-")) {
                // System.out.println("Char : " + strVeri.charAt(i) + "");
                return i;
            }
        }
        return 0;
    }

    public static int numberIndex(String strVeri) {
        for (int i = 0; i < strVeri.length(); i++) {
            if (Character.isDigit(strVeri.charAt(i))) {
                //  System.out.println("Char : " + strVeri.charAt(i) + "");
                return i;
            }
        }
        return 0;
    }

}
