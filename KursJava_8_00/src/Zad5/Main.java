package Zad5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        StringBuilder sbuild = new StringBuilder();
        int n = scan.nextInt();
        Random rand = new Random();
        for(int i=0; i<n; i++)
        {
            int l = rand.nextInt(26)+97;
            sbuild.append((char)l);
        }
        System.out.println(sbuild.toString());
    }
}
