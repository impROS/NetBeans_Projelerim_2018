/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakrec;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author impROS
 */
public class FakRec {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i%2==0){
                System.out.println("i : "+i);
            }
        }
    }

    private static Date stringToDate(String aDate, String aFormat) {

        if (aDate == null) {
            return null;
        }
        ParsePosition pos = new ParsePosition(0);
        SimpleDateFormat simpledateformat = new SimpleDateFormat(aFormat);
        Date stringDate = simpledateformat.parse(aDate, pos);
        return stringDate;

    }

    private static boolean isPackageExpired(String date) {
        //2018-07-26 00:00:00
        boolean isExpired = false;
        Date expiredDate = stringToDate(date, "yyyy-MM-dd HH:mm:ss");
        if (new Date().after(expiredDate)) {
            isExpired = true;
        }

        return isExpired;
    }
    private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String encode(String s) {

        // the result/encoded string, the padding string, and the pad count
        String r = "", p = "";
        int c = s.length() % 3;

        // add a right zero pad to make this string a multiple of 3 characters
        if (c > 0) {
            for (; c < 3; c++) {
                p += "=";
                s += "\0";
            }
        }

        // increment over the length of the string, three characters at a time
        for (c = 0; c < s.length(); c += 3) {

            // we add newlines after every 76 output characters, according to
            // the MIME specs
            if (c > 0 && (c / 3 * 4) % 76 == 0) {
                r += "\r\n";
            }

            // these three 8-bit (ASCII) characters become one 24-bit number
            int n = (s.charAt(c) << 16) + (s.charAt(c + 1) << 8)
                    + (s.charAt(c + 2));

            // this 24-bit number gets separated into four 6-bit numbers
            int n1 = (n >> 18) & 63, n2 = (n >> 12) & 63, n3 = (n >> 6) & 63, n4 = n & 63;

            // those four 6-bit numbers are used as indices into the base64
            // character list
            r += "" + base64chars.charAt(n1) + base64chars.charAt(n2)
                    + base64chars.charAt(n3) + base64chars.charAt(n4);
        }

        return r.substring(0, r.length() - p.length()) + p;
    }
}
