

// java on puhdas oliokieli, kaikki koodi on luokkien sisalla
// luokka on Java-ohjelman perusmoduuli

public class hello {
 public static void main( String args[] ){
	// Java -ohjelman suoritus alkaa tasta
	System.out.println("Hello world!");
	Opiskelija olli = new Opiskelija("Olli", "12345");
	olli.setNimi("Olli Foer");
	olli.setOpiskelijanumero("12359036");
	olli.setOpintopisteet(40);
	olli.tulostaTiedot();

	Harjoittelija maija = new Harjoittelija("Maija", "22222", "GoFore", 2000);
	maija.tulostaTiedot();

	Harjoittelija pekka = new Harjoittelija("Pekka", "11111", "Nokia", 1800);
	pekka.tulostaTiedot();

	Opiskelija jarkko = new Harjoittelija("Jarkko", "33333", "Telia", 2000);
	jarkko.tulostaTiedot();
	//ei deletea, roskienkeruu hoitaa vapautuksen kun hoitaa
 }

}