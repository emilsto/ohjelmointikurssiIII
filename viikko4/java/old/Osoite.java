public class Osoite {

    private String mKatu;
    private String mPostinumero;
    private String mKunta;

    public Osoite(String aKatu, String aPostinumero, String aKunta){
        mKatu = aKatu;
        mPostinumero = aPostinumero;
        mKunta = aKunta;
    }

        //getterit ja setterit

        public void setKatu( String aKatu){
            mKatu = aKatu;
        }
        public void setPostinumero( String aPostinumero){
            mPostinumero = aPostinumero;
        }
        public void setKunta( String aKunta){
            mKunta = aKunta;
        }
    
        public String getKatu(){
            return mKatu;
        }
        public String getPostinumero(){
            return mPostinumero;
        }
        public String getKunta(){
            return mKunta;
        }

    public void tulostaTiedot() {
        System.out.println("OSOITETIEDOT");
        System.out.println(mKatu);
        System.out.println(mPostinumero + " " + mKunta);
    }
    
}
