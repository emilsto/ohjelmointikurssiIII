public class Harjoittelija extends Opiskelija {
    private String mTyopaikka;
    private float mPalkka;

    public Harjoittelija(){
        mTyopaikka = "Tuntematon";
        mPalkka = 0;
    }
    public Harjoittelija(String aNimi, String aOpiskelijanumero, String aTyopaikka, float aPalkka){
        super(aNimi, aOpiskelijanumero);
        mTyopaikka = aTyopaikka;
        mPalkka = aPalkka;
        System.out.println("Harjoittelijan 4 parametrinen rakentaja");


    }
    public void setTyopaikka(String aTyopaikka){
        mTyopaikka = aTyopaikka;
    }

    public String getTyopaikka(){
        return mTyopaikka;
    }
    public void setPalkka(float aPalkka){
        mPalkka = aPalkka;
    }

    public float getPalkka(){
        return mPalkka;
    }



    public void tulostaTiedot() {
        System.out.println("Nimi: " + getNimi());
        System.out.println("Opintopisteet: " + getOpintopisteet());
        System.out.println("Palkka: " + mPalkka); //tässä olisi myös hyvä käyttää getteriä!

    }
}
