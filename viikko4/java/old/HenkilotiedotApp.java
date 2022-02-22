import java.util.ArrayList;
import java.util.Scanner;


public class HenkilotiedotApp {
    private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);

    public static void main ( String args[]){
        Henkilotiedot h = new Henkilotiedot();
        h.start();
        
    }
    public HenkilotiedotApp(){
    }
    
    public void start(){
        
        int valinta = 0;
        while (valinta != 4){
            printMenu();
            valinta = scanner.nextInt();
            switch (valinta){
                case 1:
                //Toteutus
                System.out.println("Syota nimi:");
                String nimi = scanner2.nextLine();
                System.out.println("Syota ika:");
                int ika = Integer.parseInt(scanner2.nextLine());
                System.out.println("Syota katu:");
                String katu = scanner2.nextLine();
                System.out.println("Syota postinumero:");
                String postinro = scanner2.nextLine();
                System.out.println("Syota kunta:");
                String kunta = scanner2.nextLine(); 
                henkilot.add(new Henkilo(nimi, ika, new Osoite(katu, postinro, kunta)));
                break;

                case 2:
                System.out.println("Syota poistettavan henkilon nimi:");
                String poistettava = scanner2.nextLine();
                henkilot.removeIf(h -> h.getNimi().contains(poistettava));
                break;

                case 3:
                int index = 1;
                for (Henkilo h: henkilot ) {
                    System.out.println("Henkilo #" + index);
                    h.tulostaTiedot();
                    System.out.println("------------------------");
                    index++;
                }
                break;

                case 4:
                break;

                default:
                System.out.println("Virheellinen valinta");
    }

        }
    }
    public static void printMenu(){
        System.out.println("1. Lisaa uusi henkilo");
        System.out.println("2. Poista henkilo");
        System.out.println("3. Tulosta henkilot");
        System.out.println("4. Lopeta");
    }
}