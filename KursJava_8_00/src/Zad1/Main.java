package Zad1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Test();
    }
    public static void Test(){
        Random rand = new Random();
        int count = 0;
        int odp;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5;i++)
        {
            int a = rand.nextInt(10);
            int b = rand.nextInt(10);
            int wynik = a * b;
            System.out.println(a + " * " + b + " = ");
            odp = scan.nextInt();
            if(odp==wynik) {
                count++;
                System.out.println("Dobrze");
            }
            else
            {
                System.out.println("Źle");
            }
        }
        System.out.println("Twój wynik: " + count);
    }
}
