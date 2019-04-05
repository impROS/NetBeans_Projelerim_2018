package bayraklink;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BayrakLink {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            String strHtml = "http://free-sddfsdf856578asd498dgdfffsgffjajdqweed.scoutmobiletech.com/img/flags/";
            String strDir = "C:\\Users\\impROS\\Desktop\\Calisma_Odasi\\bayrak.txt";
            String strFullUrl = "";
            String strTargetDir="C:\\Users\\impROS\\Documents\\NetBeansProjects\\BayrakLink\\flags\\";
            File file = new File(strDir);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String tmp = "";
            try {
                while ((tmp = br.readLine()) != null) {
                    try {
                        strFullUrl = strHtml + tmp + ".png";
                        System.out.println(strFullUrl);
                        saveUrl(strTargetDir+tmp + ".png", strFullUrl);
                        System.out.println("Kaydedildi..");
                    } catch (Exception e) {
                        System.out.println("Link Yok");
                    }

                }
            } catch (IOException ex) {
                Logger.getLogger(BayrakLink.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BayrakLink.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(BayrakLink.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void saveUrl(final String filename, final String urlString)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
}
