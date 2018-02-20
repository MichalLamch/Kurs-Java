import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
        }
        catch (Exception e)
        {
            System.err.println("Nie wprowadzono poprawnej liczby");
            System.out.println(e);
        }
        System.out.println(division(5));
    }
    public static double division(int a)
    {
        Scanner scan = new Scanner(System.in);
        try {
            return a / scan.nextInt();
        }
        catch (Exception e)
        {
            return 0;
        }
    }
}
