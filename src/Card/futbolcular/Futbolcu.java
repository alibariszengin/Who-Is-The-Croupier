package Card.futbolcular;

import Card.Sporcu;

public class Futbolcu extends Sporcu{
    private int penalti=0;
    private int serbestAtis=0;
    private int kaleciyleKarsiKarsiya=0;

    public Futbolcu() {

        super();
    }


    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciyleKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti=penalti;
        this.serbestAtis=serbestAtis;
        this.kaleciyleKarsiKarsiya=kaleciyleKarsiKarsiya;
    }


    // String.format ile formatlanmış bir string olusturarak bilgilerimizi bu stringle birlikte return ederiz.
    @Override
    public String sporcuPuaniGoster1() {
        String puan = new String();
        puan=String.format("\n\tFutbolcu: %s\n\t----------------------------\n Penalti : %d \n Serbest Vurus : %d \n Kaleciyle karsi karsiya :" +
                " %d\n--------------------------------------------------------------------------" +
                "\n",getSporcuIsim(),penalti,serbestAtis,kaleciyleKarsiKarsiya);
        return puan;
    }
    //Getter Setter'lar
    public int getPenalti() {
        return penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public int getKaleciyleKarsiKarsiya() {
        return kaleciyleKarsiKarsiya;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public void setKaleciyleKarsiKarsiya(int kaleciyleKarsiKarsiya) {
        this.kaleciyleKarsiKarsiya = kaleciyleKarsiKarsiya;
    }
}
