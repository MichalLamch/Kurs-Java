package Zad3;

import Zad3.Klocki.Czerwony.Czer;
import Zad3.Klocki.Kloc;
import Zad3.Klocki.Zielony.Ziel;

public class Main {
    public static void main (String args[]){
        Czer c = new Czer();
        Ziel z = new Ziel();
        Kloc k = new Kloc();
        c.Drukuj();
        z.Drukuj();
        k.Drukuj();
    }
}
