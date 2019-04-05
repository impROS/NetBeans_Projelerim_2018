/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabagalerisi;

/**
 *
 * @author impROS
 */
public class ArabaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba[] arrAraba = new Araba[15];
        arrAraba[0] = new Araba();
        arrAraba[0].setMarka("a");
        arrAraba[0].setModel("a model");
        arrAraba[0].setFiyat(13);
        arrAraba[0].setYıl(2018);
        arrAraba[0].bilgiYaz();
    }

}
