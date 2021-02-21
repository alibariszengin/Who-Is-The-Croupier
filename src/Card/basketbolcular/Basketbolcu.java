package Card.basketbolcular;

import Card.Sporcu;

public class Basketbolcu extends Sporcu {
    private int ikilikAtis=0;
    private int uclukAtis=0;
    private int serbestAtis=0;



    public Basketbolcu() {

        super();
    }

    public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilikAtis, int uclukAtis, int serbestAtis) {
        super(sporcuIsim, sporcuTakim);
        this.ikilikAtis=ikilikAtis;
        this.uclukAtis=uclukAtis;
        this.serbestAtis=serbestAtis;
    }
    // String.format ile formatlanmış bir string olusturarak bilgilerimizi bu stringle birlikte return ederiz.
    @Override
    public String sporcuPuaniGoster1() {
        String puan = new String();
        puan=String.format("\n\t Basketbolcu: %s\n\t----------------------------\n Ikilik Atis : %d \n Ucluk Atis : %d \n Serbest Atis :" +
                " %d\n--------------------------------------------------------------------------\n",getSporcuIsim(),ikilikAtis,uclukAtis,serbestAtis);
        return puan;
    }
    //Getter Setter'lar
    public int getIkilikAtis() {
        return ikilikAtis;
    }

    public int getUclukAtis() {
        return uclukAtis;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setIkilikAtis(int ikilikAtis) {
        this.ikilikAtis = ikilikAtis;
    }

    public void setUclukAtis(int uclukAtis) {
        this.uclukAtis = uclukAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }


}
