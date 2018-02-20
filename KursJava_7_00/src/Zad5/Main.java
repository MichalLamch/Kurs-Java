package Zad5;

public class Main {
    public static void main (String args[]){
        int[] tab = new int[100];
        for(int i=0; i<tab.length; i++){
            tab[i]=9;
        }
        System.out.println(licz9(tab));
    }
    public static int licz9(int[] tab){
        int count = 0;
        for(int i=0; i<tab.length; i++){
            if (tab[i]==9) count++;
        }
        return count;
    }
}
