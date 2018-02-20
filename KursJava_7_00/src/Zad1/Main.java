package Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int y = Integer.parseInt(getText());
        System.out.println(y);
    }
    public static String getText(){
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }


}
