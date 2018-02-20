package Zad2;

import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Palindrom();
    }
    public static void Palindrom()
    {
        Scanner scan = new Scanner(System.in);
        boolean pal = true;
        String nazwa = scan.nextLine();
        nazwa = nazwa.toLowerCase();
        String[] nazwa_tab= nazwa.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String nazwa_bs = "";
        for(String x : nazwa_tab) {
            stringBuilder.append(x);
        }
        System.out.println(stringBuilder);
        nazwa_bs = stringBuilder.toString();
        for (int i=0; i< (int)(nazwa_bs.length()/2); i++)
        {
            if(nazwa_bs.charAt(i)!=nazwa_bs.charAt(nazwa_bs.length()-i-1)) pal = false;
        }
        if(pal) System.out.println("Słowo jest palindromem");
        else System.out.println("Słowo nie jest palindromem");

    }
}
