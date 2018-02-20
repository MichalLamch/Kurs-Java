package Zad2;

public class Main {
    public static void main (String args[]){
        System.out.println(Silnia(10));
    }
    public static int Silnia(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*Silnia(n-1);
        }
    }
}
