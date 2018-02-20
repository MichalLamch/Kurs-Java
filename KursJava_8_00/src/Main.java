import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main (String args[]){

        addString();
        showString();
        Mat();
        Rand();
    }
    public static void addString(){
        StringBuilder stringBuilder = new StringBuilder();
        String str = "a";
        stringBuilder.append(str);
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000; i++){
            //if(i==5) System.out.println("Piątka!");
            stringBuilder.append("a");
        }
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println(result);
    }
    public static void showString()
    {
        String str = "temp string";
        str = str.charAt(0)+"";
        str = str.concat("bla");
        str = str.substring(1,3);
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        System.out.println(str);

    }
    public static void Mat(){
        BigInteger bigInteger = new BigInteger("21312423534624654634256346353");
        System.out.println(bigInteger.pow(3));
    }
    public static void Rand(){
    Random rand = new Random();
    int a = rand.nextInt();
    System.out.println(a);
    int b = rand.nextInt();
    System.out.println(b);
    }
}
