public class Opiskelija {
    // DATA
    private String mNimi;
    private String mOpiskelijanumero;
    private int mOpintiopisteet;

    public Opiskelija(){
        mNimi = "tuntematon";
        mOpiskelijanumero = "xxxxxx";
        mOpintiopisteet = 10;
    }
    public Opiskelija( String aNimi, String aOpiskelijanumero){
        mNimi = aNimi;
        mOpiskelijanumero = aOpiskelijanumero;
    }
    public void setNimi( String aNimi){
        mNimi = aNimi;
    }
    public void setOpintopisteet( int aOpintopisteet){
        mOpintiopisteet = aOpintopisteet;
    }
    public void setOpiskelijanumero( String aOpiskelijanumero){
        mOpiskelijanumero = aOpiskelijanumero;
    }

    public String getNimi(){
        return mNimi;
    }

    public String getOpiskelijanumero(){
        return mOpiskelijanumero;
    }

    public int getOpintopisteet(){
        return mOpintiopisteet;
    }
    public void lisaaKurssi(int aOpintopisteet){
        mOpintiopisteet = aOpintopisteet;
    }


    public void tulostaTiedot() {
        System.out.println("Nimi: " + mNimi);
        System.out.println("Opiskelijanumero: " + mOpiskelijanumero);
        System.out.println("Opintopisteet: " + mOpintiopisteet);
    }

}