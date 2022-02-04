package Tilasto;

//Staattinen metodi == luokkametodi

public class Tilasto {

    public static double summa(double luvut[]){
        double x = 0;
        for (double n : luvut ){
            x = x + n;
        }
        return x;
    }

    public static double minimi(double luvut[]){
        double min = luvut[0];
        for (double n : luvut ){
            if (min > n){
                min = n;
            }
        }
        return min;
    }

    public static double maksimi(double luvut[]){
        double max = luvut[0];
        for (double n : luvut ){
            if (max < n){
                max = n;
            }
        }

        return max;

    }
    public static double keskiarvo(double luvut[]){
        double x = 0;
        for (double n : luvut ){
            x = x + n;
        }
        x = x/luvut.length;
        return x;
    }
    
}
