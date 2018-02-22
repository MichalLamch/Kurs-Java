import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main (String args[]) throws FileNotFoundException {
        File plik = new File("C:\\Users\\micha\\Desktop\\java\\poker.txt");
        Scanner scan = new Scanner(plik);
        StringTokenizer token;
        Player player1 = new Player();
        Player player2 = new Player();
        Arbiter arbiter = new Arbiter();
        int pkt1 = 0;
        int pkt2 = 0;
        //Pętla rozdań
        while(scan.hasNextLine())
        {
            token = new StringTokenizer(scan.nextLine(), " ");
            int count = 0;
            //Przypisanie graczom kart
            while (token.hasMoreElements())
            {
                Card c = new Card(); //////// ?? czy tu sie dobrze dzieje?
                c.setCard(token.nextToken());
                if (count < 5 ) {
                    player1.AddCards(c);
                }
                else
                {
                    player2.AddCards(c);
                }
                count++;
            }
            //Organizacja kart, uporządkowanie według wartości
            player1.organize();
            player2.organize();
            //Drukowanie
            player1.printCards();

            player2.printCards();

            //Porównanie
            if(arbiter.compareResults(player1,player2).equals("Gracz 1")) pkt1++;
            else pkt2++;
            player1.printResult();
            player2.printResult();
            System.out.println(arbiter.compareResults(player1,player2));
            player1.getResult().getValueOfCards().clear();
            player2.getResult().getValueOfCards().clear();




            //Usunięcie
            player1.DeleteCards();
            player2.DeleteCards();

        }
        System.out.println("Gracz1:" + pkt1 + " Gracz2:" +pkt2);
    }
}
