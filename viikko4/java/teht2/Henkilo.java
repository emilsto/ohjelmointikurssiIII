public class Henkilo {
    private String mNimi;
    private int mIka;
    private Osoite mOsoite;

    public Henkilo (String aNimi, int aIka){
        mNimi = aNimi;
        mIka = aIka;
    }

    public Henkilo( String aNimi, int aIka, Osoite aOsoite){
        mNimi = aNimi;
        mIka = aIka;
        mOsoite = aOsoite;
    }


    //getterit ja setterit

    public void setNimi( String aNimi){
        mNimi = aNimi;
    }
    public void setIka( int aIka){
        mIka = aIka;
    }


    public String getNimi(){
        return mNimi;
    }

    public int getIka(){
        return mIka;
    }




    public void tulostaTiedot(){
        //Tulostaa tiedot
        System.out.println(" Nimi: " + mNimi);
        System.out.println(" Ika: " + mIka);
        if (mOsoite != null){
            mOsoite.tulostaTiedot();
        }
    }
}