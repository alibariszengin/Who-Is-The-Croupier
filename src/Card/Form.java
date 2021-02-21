package Card;

import javax.swing.*;
import java.util.ArrayList;


public class Form extends JFrame{

    private  JPanel kapsaPanel;
    private JPanel kullaniciOrta;
    private JTextArea kullaniciOrtaBilgi;
    private JTextArea bilgisayarOrtaBilgi;
    private JTextArea kullaniciKartlari;
    private JTextArea kullaniciKartlari2;
    public JButton button1;

    private JComboBox comboBox1;

    private JTextArea oyuncu1;
    private JTextArea oyuncu2;
    //Getter Setter'lar
    public void setBilgisayarOrtaBilgi(String bilgisayarOrtaBilgi) {
        this.bilgisayarOrtaBilgi.setText(bilgisayarOrtaBilgi);
    }

    public JTextArea getKullaniciOrtaBilgi() {
        return kullaniciOrtaBilgi;
    }
    public void setOyuncu1(String oyuncu1) {
        this.oyuncu1.setText(oyuncu1);
    }

    public void setOyuncu2(String oyuncu2) {
        this.oyuncu2.setText(oyuncu2);
    }
    public int getComboBox1() {
        return (int) comboBox1.getSelectedItem();
    }

    public void setKullaniciOrtaBilgi(String kullaniciOrtaBilgi) {
        this.kullaniciOrtaBilgi.setText(kullaniciOrtaBilgi);
    }
    public void removeItemCombo(){
        Integer itemSayisi=comboBox1.getItemCount()-1;
        comboBox1.removeAllItems();

/*        for(Integer i =1;i<=itemSayisi;i++){
            comboBox1.addItem(i);
        }*/
    }
    public void kartYazdir(ArrayList<Sporcu> kullanici){
        String ortaKart= new String(" ");
        String ortaKart1= new String(" ");
        int i = 0 ;
        for(Sporcu spor: kullanici){
            if(i<4){
                ortaKart=ortaKart.concat("\t No: -"+(i+1)+"-");
                ortaKart=ortaKart.concat(spor.sporcuPuaniGoster1());// Concat ile bilgileri string değişkene ekle
                i++;
            }

            else{
                ortaKart1=ortaKart1.concat("\t No: -"+(i+1)+"-");
                ortaKart1=ortaKart1.concat(spor.sporcuPuaniGoster1());// Concat ile bilgileri string değişkene ekle
                i++;
            }
            comboBox1.addItem((Integer)i);//Combo box değerlerini koy.
        }


        kullaniciKartlari.setText(ortaKart);//Arayüzümüzdeki kullanici kartları alanini doldur.(Soldaki 1. olan)
        kullaniciKartlari.setLineWrap(true);// alt satira geçilebilirlik sağla.
        kullaniciKartlari2.setText(ortaKart1);//Arayüzümüzdeki kullanici kartları alanini doldur.(Sağdaki 2. olan)
        kullaniciKartlari2.setLineWrap(true);// alt satira geçilebilirlik sağla.
    }
    //Constructor !
    public Form(ArrayList<Sporcu> kullanici) {

        kartYazdir(kullanici); // Ilk adim


        add(kapsaPanel);// Forma panelimizi ekle

        setTitle("Kart Oyunu");// Baslik



        setSize(1000,1000);// Size ayarlama
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Default kapama yöntemi ayaralama.
        setLocationRelativeTo(null);//Relative point ayarlama.



    }




}
