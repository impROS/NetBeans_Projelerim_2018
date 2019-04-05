package dosyaokuma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String strFile = "C:\\Users\\impROS\\Desktop\\bot_deneme\\ripple_yillik.txt";
        File file = new File(strFile);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String strTmp = br.readLine();
        while (strTmp != null) {
            System.out.println("XRP : " + strTmp);
            strTmp = br.readLine();
        }
    }
}
