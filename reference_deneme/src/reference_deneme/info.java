/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference_deneme;

/**
 *
 * @author impROS
 */
public class info {
private static Uye uye;

    public info() {
        this.uye=new Uye();
    }


    public static void setUye(Uye uye) {
        info.uye = uye;
    }

    public static Uye getUye() {
        return uye;
    }



}
