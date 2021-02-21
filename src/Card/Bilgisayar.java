package Card;

import Card.basketbolcular.Basketbolcu;
import Card.futbolcular.Futbolcu;

import java.util.Random;
// Oyuncu class'ından miras alan,bilgisayar oyuncusunu temsilen Oyuncu class'ı
public class Bilgisayar extends Oyuncu{

    //Constructor'lar

    public Bilgisayar() {
        super();
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {

        super(oyuncuID, oyuncuAdi, skor);
    }
    // Aldıgı integer argumana göre sıranın hangi kart class'ında(Çift sayi--> Futbolcu / Tek sayi --> Basketbolcu)
    //oldugu bilgisiyle birlikte o class'a ait rastgele bir kart dondurur.
    @Override
    public Sporcu kartSec(int sira) {
        Random rand= new Random();
        int kartIndex;
        if(sira%2==0){ //Method argumanı -->Ciftse --> Futbolcu
            do{
                kartIndex=rand.nextInt(getKartListesi().size());//0-Listedeki kart sayisi aralığında random sayı al.
            }while(getKartListesi().get(kartIndex) instanceof Basketbolcu);// Aldığın random sayidaki kart class'ı
            //Basketbolcu oldugu sürece bu islemi yapmaya devam et.(Futbolcu gelene kadar bu islemi yapıyor).

        }
        else{//Method argumanı -->Tekse --> Basketbolcu
            do{
                kartIndex=rand.nextInt(getKartListesi().size());//0-Listedeki kart sayisi aralığında random sayı al.
            }while(getKartListesi().get(kartIndex) instanceof Futbolcu);// Aldığın random sayidaki kart class'ı
            //Futbolcu oldugu sürece bu islemi yapmaya devam et.(Basketbolcu gelene kadar bu islemi yapıyor).

        }

        Sporcu spor =getKartListesi().get(kartIndex); // spor isimli değişkende bu kartı tut.
        getKartListesi().get(kartIndex).setKartKullanildiMi(true);//Kart kullanildi değişkenini 'true' yap.
        getKartListesi().remove(kartIndex);//Listeden karti kaldır.
        return spor;//Karti dondur.

    }
}
