package Card;

import Card.basketbolcular.Basketbolcu;
import Card.futbolcular.Futbolcu;

import java.util.ArrayList;
// Oyuncu abstract class'ı, Kullanici ve Bilgisayar bu classtan miras alacak.
public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor=0;
    private ArrayList<Sporcu> kartListesi= new ArrayList<Sporcu>();
    private Sporcu secilenKart;

    //Constructorlar

    public Oyuncu() {
        oyuncuID=-999;
        oyuncuAdi="Adsiz Oyuncu";
        skor = 0;
    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    // Girilen integer değere göre(0--> Futbolcu / 1--> Basketbolcu) istenilen class'tan olan kart sayisini buluyor.
    public int kartSayisiBulma(int tur){
        int sayi=0;
        if(tur==0){
            for(Sporcu c: kartListesi){
                if(c instanceof Futbolcu)
                {
                    sayi++;
                }
            }
        }
        else if(tur==1){
            for(Sporcu c: kartListesi){
                if(c instanceof Basketbolcu)
                {
                    sayi++;
                }
            }
        }

        return sayi;
    }
    //Skor arttırmak için method
    public void skorArttir() {
        this.skor=this.skor+10;
    }
    //String dönüs tipiyle birlikte oyuncu id,adi ve skorunu string olarak almamızı sağlayan method
    //Arayüze yazdırmak için string dönüşlü alıyoruz.
    public String skorGoster() {
        String bilgiler= "Oyuncu Id: "+oyuncuID+" Oyuncu Adi: "+oyuncuAdi+"\n\tSkor: "+skor;
        return bilgiler;
    }
    //Kart seçimi için abstract method tanımı
    public abstract Sporcu kartSec(int kart);
    //Oyuncu kart listesine kart ekleme methodu
    public void addKartListesi(Sporcu sporcu) {
        sporcu.setKartKullanildiMi(false);
        kartListesi.add(sporcu);
    }
    //Getter Setter'lar
    public Sporcu getSecilenKart() {
        return secilenKart;
    }

    public void setSecilenKart(Sporcu secilenKart) {
        this.secilenKart = secilenKart;
    }
    public int getSkor() {
        return skor;
    }

    public ArrayList<Sporcu> getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(ArrayList<Sporcu> kartListesi) {
        this.kartListesi = kartListesi;
    }
}
