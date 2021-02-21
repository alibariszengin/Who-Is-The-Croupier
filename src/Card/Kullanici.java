package Card;
// Oyuncu class'ından miras alan,oyunu oynayan kişiyi temsilen Kullanici class'ı
public class Kullanici extends Oyuncu {
    //Constructor'lar
    public Kullanici() {
        super();
    }

    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }
    //Kart seçmek için kullandığımız method,seçilen kartı arguman olarak alır ve listeden o kartı dödürerek listeden çıkartır.
    @Override
    public Sporcu kartSec(int selected) {
        Sporcu selectedOne=getKartListesi().get(selected-1);
        getKartListesi().get(selected-1).setKartKullanildiMi(true);
        getKartListesi().remove(selected-1);
        return selectedOne;
    }

}
