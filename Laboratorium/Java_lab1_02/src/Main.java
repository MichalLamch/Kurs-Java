import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main (String args[]) throws IOException {
        List<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<100; i++){
            list.add((int)(0.5*i*(i+1)));
        }

        File plik = new File("C:\\Users\\micha\\Desktop\\java\\słowa.txt");
        Scanner scan = new Scanner(plik);
        StringTokenizer token;
        int count = 0;
        while(scan.hasNextLine())
        {
            token = new StringTokenizer(scan.nextLine(), ",");
            while (token.hasMoreElements())
            {
                //System.out.println(token.nextToken());
                String temp = token.nextToken();
                temp = temp.replaceAll("\"", "");
                int temp_pkt = LiczPunkty(temp);
                if(list.contains(temp_pkt)) count++;

            }
        }
        System.out.println(count);
    }
    public static int LiczPunkty(String s)
    {
        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            sum+=Punkt(s.charAt(i));
        }
        return sum;
    }
    public static int Punkt (char c)
    {
        int pkt = (int)c -64;
        return pkt;


    }

}
