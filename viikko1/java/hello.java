// java on puhdas oliokieli, kaikki koodi on luokkien sisalla
// luokka on Java-ohjelman perusmoduuli

public class hello {
 public static void main( String args[] ){
	// Java -ohjelman suoritus alkaa tasta
	System.out.println("Hello world!");
	Opiskelija olli = new Opiskelija("Olli", "12345", 0);
	olli.setNimi("Olli Foer");
	olli.setOpiskelijanumero("12359036");
	olli.setOpintopisteet(40);
	olli.tulostaTiedot();
	//ei deletea, roskienkeruu hoitaa vapautuksen kun hoitaa
 }

}