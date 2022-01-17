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
    public Opiskelija( String aNimi, String aOpiskelijanumero,  int aOpintopisteet){
        mNimi = aNimi;
        mOpiskelijanumero = aOpiskelijanumero;
        mOpintiopisteet = aOpintopisteet;
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


    public void tulostaTiedot() {
        System.out.println("Nimi: " + mNimi);
        System.out.println("Opiskelijanumero: " + mOpiskelijanumero);
        System.out.println("Opintopisteet: " + mOpintiopisteet);
    }

}