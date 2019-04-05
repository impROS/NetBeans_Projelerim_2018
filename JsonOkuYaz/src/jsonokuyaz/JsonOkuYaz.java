package jsonokuyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonOkuYaz {

    public static void main44(String[] args) {
        try {
            List<Mac> maclar = new ArrayList<Mac>();
            JSONArray arrMac = new JSONArray();
            
            Mac mac = (new Mac(
                    Mac.Spor.FUTBOL,
                    "Süper Lig",
                    "Fenerbahçe-Galatasaray",
                    "10.00",
                    "1.40",
                    "Fenerbahçe Kazanır",
                    "FenerBahçe Kazandı"
            ));
            arrMac.put(toJson(mac));
            mac = (new Mac(
                    Mac.Spor.FUTBOL,
                    "Süper Lig",
                    "Beşiktaş-Ankaragücü",
                    "21.00",
                    "1.20",
                    "Beşiktaş Kazanır",
                    "Beşiktaş Kazandı"
            ));
            arrMac.put(toJson(mac));
            String strJson = arrMac.toString();
            System.out.println(strJson);
            JSONArray denemeOku = new JSONArray(strJson);
            for (int i = 0; i < denemeOku.length(); i++) {
                System.out.println(denemeOku.get(i));
                System.out.println("Okundu..");
            }
        } catch (JSONException ex) {
            Logger.getLogger(JsonOkuYaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static JSONObject toJson(Mac mac) {
        JSONObject jsonMac = new JSONObject();
        try {
            jsonMac.put("Tur", mac.getSporTuru());
            jsonMac.put("LigAdi", mac.getLigAdi());
            jsonMac.put("Takimlar", mac.getTakimlar());
            jsonMac.put("Saat", mac.getSaat());
            jsonMac.put("Oran", mac.getOran());
            jsonMac.put("Tahmin", mac.getTahmin());
            jsonMac.put("Sonuc", mac.getSonuc());
        } catch (JSONException ex) {
            System.out.println("Hata : " + ex.getCause());
        }
        return jsonMac;
    }

}
