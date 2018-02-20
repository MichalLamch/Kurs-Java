package Zad4;

import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String nazwa = scan.nextLine();
        for(int i=0; i< nazwa.length(); i++) {
            System.out.println("Indeks:"+i+" Litera:"+nazwa.charAt(i));
        }
    }
}
