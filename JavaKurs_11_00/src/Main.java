import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String args[]) throws IOException {
        //System.out.println("text");
        //System.out.println(inputStreamTest());
        //System.out.println(bufferedReaderTest());
        //System.out.println(streamTokenizerTest());
        //saveText("blabla bla");
        List<String> aList = new ArrayList<String>(32);
        List<String> lList = new LinkedList<String>();
        aList.add("Kotek");
        aList.add("Koteczek");
        lList.add("Piesek");
        System.out.println(aList.get(0));
        System.out.println(lList);
    }
    public static String inputStreamTest()
    {
        System.out.println("Wprowadź dowolny znak z klawiatury");
        try
        {
            char c = (char) System.in.read();
            String str = c + "";
            return str;
        }
        catch (Exception e)
        {
            return "error";
        }
    }
    public static String bufferedReaderTest() throws IOException {
        BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadź linię tekstu i wciśnij enter");
        try
        {
            String text = brIn.readLine();
            return text;
        }
        catch (Exception e)
        {
            return "-1";
        }
    }
    public static String streamTokenizerTest()
    {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Wprowadź linię tekstu i wciśnij enter");
        try {
            streamTokenizer.nextToken();
            if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER)
                return streamTokenizer.toString();
            else
                return "-1";
        }
        catch (Exception e)
        {
            return "-1";
        }
    }
    public static void saveText(String text)
    {
        try
        {
            File file = new File("C:\\Users\\micha\\text.txt");
            FileWriter fileWritter = new FileWriter(file);
            fileWritter.write(text);
            fileWritter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
