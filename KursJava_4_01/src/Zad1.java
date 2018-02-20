import java.util.Scanner;

public class Zad1 {
    public static void main(String args[]) {
    int liczba = 0;
    Scanner scan = new Scanner(System.in);
    liczba = scan.nextInt();
    int liczba_pol = liczba/2;
    boolean p = false;
    if(liczba_pol > 0){
        for(int i=2; i<liczba_pol;i++){
            if(liczba%i == 0 ) {
                p = true;
                System.out.println(liczba_pol);
                break;
            }
        }
    }
    if (p) System.out.println("Liczba nie jest pierwsza");
    else System.out.println("Liczba jest pierwsza");
        double x0=6.00000;
        double x1=6.000001;
        double x2=6.499;
        double x3=6.50000001;
        double x4=6.9999;
    }

}
