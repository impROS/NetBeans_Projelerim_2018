/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilineremove;

/**
 *
 * @author impROS
 */
public class MultilineRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String strVeri="Veriler :\n" +
"\n" +
"19:30\n" +
"Spanish Liga Segunda\n" +
"0-2\n" +
"Sporting Gijon - Real Valladolid1.38\n" +
"1.5 GOAL OVER\n" +
"\n" +
"\n" +
"17:00\n" +
"Norwegian Division 13-2\n" +
"Aalesund - Ullensaker/Kisa1.38\n" +
"4.5 GOAL UNDER\n" +
"\n" +
"\n" +
"20:00\n" +
"Italian Serie B\n" +
"1-1Frosinone - Cittadella\n" +
"1.383.5 GOAL UNDER\n" +
"\n" +
"\n" +
"17:00\n" +
"\n" +
"Norwegian Div. 2 Avd. 21-0\n" +
"Bryne - Vard Haugesund1.40\n" +
"Bryne Wins\n" +
"\n" +
"\n" +
"16:00\n" +
"Swedish Div. 1 Norra2-4\n" +
"Assyriska FF - Akropolis IF\n" +
"1.44Assyriska Wins or Draw\n" +
"\n" +
"\n" +
"16:30\n" +
"Swedish Superettan\n" +
"4-1\n" +
"Helsingborg - Degerfors1.46\n" +
"3.5 GOAL UNDER\n" +
"\n" +
"\n" +
"1X:X2\n" +
"&gt;&gt;WE DON'T SHARE THE TICKET&lt;&lt;---\n" +
"&gt;&gt;ATTENTION PLEASE&lt;&lt;\n" +
"IN ORDER TO INCREASE YOUR WINNING RATE, YOU HAVE TO BET BY CHOOSING 1 OR 2 BETTING TIPS!";
        System.out.println(strVeri);
        System.out.println("--------------");
     strVeri=strVeri.replaceAll("(\r?\n){2,}", "");
        System.out.println(strVeri);
    }
    
}
