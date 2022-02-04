import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;


public class Henkilotiedot {

    public static void printMenu(){
        System.out.println("1. Lisaa uusi henkilo");

        System.out.println("2. Poista henkilo");

        System.out.println("3. Tulosta henkilot");

        System.out.println("4. Lopeta");
    }
    public static void main ( String args[]){

        // cout <=> System.out.print(ln)
        // cin <=> Scanner ja System.in


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syota nimesi: ");
        String nimi = scanner.nextLine();
        System.out.println("Nimesi on " + nimi);
        scanner.close();

        Osoite pekan = new Osoite("Kissanmaankatu 20 D 191", "33530", "Tampere");

        Henkilo pekka = new Henkilo("Pekka", 20, pekan);

        pekka.tulostaTiedot();


        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Henkilo("Kalle", 20));
        henkilot.add(new Henkilo("Maija", 23));


        for (Henkilo h: henkilot ) {
            h.tulostaTiedot();
        }
        */
        Scanner scanner = new Scanner(System.in);
        int valinta = scanner.nextInt();
        List<Henkilo> henkilot = new ArrayList<Henkilo>();

        while (valinta != 4){
            printMenu();

            switch (valinta){
                case 1:
                //Toteutus
                break;


                case 2:
                //Toteutus
                break;

                case 3:
                //toteutus
                break;

                case 4:
                break;

                default:
                System.out.println("Virheellinen valinta");

            }
      
        }


       

        scanner.close();

        




    }


}
