import Zad1.Main;

public class Zad {
    public static void main (String args[]){
    System.out.println(recursion(10));

    }
    public static int recursion(int a){
        if(a==0) return 1;
        else {
            return 5*recursion(a-1);
        }
    }
    public void enums(){

    }


}
