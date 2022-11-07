import java.util.ArrayList;

public class Araba {
    String marka, plaka, model, sinif, renk, yil, kilometre;

    public Araba(String marka, String plaka, String model, String sinif, String renk, String yil, String kilometre){
        this.marka = marka;
        this.plaka= plaka;
        this.model = model;
        this.sinif = sinif;
        this.renk = renk;
        this.yil = yil;
        this.kilometre = kilometre;
    }
    public String toString() {
        return "Marka = " + marka + "; Model = " + model + "; Plaka = " + plaka + "; Sinif = " + sinif
                + "; Renk = " + renk + "; Yil = " + yil + "; Kilometre = " + kilometre;
    }

}
