package Zad3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String nazwa = scan.nextLine();
        char[] tab = nazwa.toCharArray();
        Arrays.sort(tab);
        //System.out.println(tab[0]);
        int count = 0;
        char temp = tab[0];
        for(int i =0; i<tab.length; i++){
            if(tab[i]==temp){
                count++;
            }
            else
            {
                System.out.println("#"+temp+"-"+count);
                temp = tab[i];
                count = 1;
            }
        }
        System.out.println("#"+tab[tab.length-1]+"-"+count);
    }
}
