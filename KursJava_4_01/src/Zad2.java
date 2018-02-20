import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

        int l1;
        int l2;
        int l3;
    do {
        System.out.println("Wprowadź trzy liczby od 1 do 100");
        l1 = scan.nextInt();
        l2 = scan.nextInt();
        l3 = scan.nextInt();
    }
    while(l1 >100 || l2 >100 || l3>100 || l1<1||l2<1|| l3<1);
    int[] tab = new int[3];
    tab[0]=l1;
    tab[1]=l2;
    tab[2]=l3;
    Arrays.sort(tab);
    System.out.println(Arrays.toString(tab));
    }
}