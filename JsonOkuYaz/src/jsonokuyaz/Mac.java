
package jsonokuyaz;
public class Mac {
    private Spor sporTuru;
    private String ligAdi;
    private String takimlar;
    private String saat;
    private String oran;
    private String tahmin;
    private String skor;


    public enum Spor {
        FUTBOL,
        BASKETBOL
    }

    public Mac(Spor sporTuru, String ligAdi, String takimlar, String saat, String oran, String tahmin, String skor) {
        this.sporTuru = sporTuru;
        this.ligAdi = ligAdi;
        this.takimlar = takimlar;
        this.saat = saat;
        this.oran = oran;
        this.tahmin = tahmin;
        this.skor = skor;
    }

    public Spor getSporTuru() {
        return sporTuru;
    }


    public void setSporTuru(Spor sporTuru) {
        this.sporTuru = sporTuru;
    }

    public String getLigAdi() {
        return ligAdi;
    }

    public void setLigAdi(String ligAdi) {
        this.ligAdi = ligAdi;
    }

    public String getTakimlar() {
        return takimlar;
    }

    public void setTakimlar(String takimlar) {
        this.takimlar = takimlar;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getOran() {
        return oran;
    }

    public void setOran(String oran) {
        this.oran = oran;
    }

    public String getTahmin() {
        return tahmin;
    }

    public void setTahmin(String tahmin) {
        this.tahmin = tahmin;
    }

    public String getSonuc() {
        return skor;
    }

    public void setSonuc(String sonuc) {
        this.skor = sonuc;
    }


}
