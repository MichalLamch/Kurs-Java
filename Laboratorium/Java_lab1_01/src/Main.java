public class Main {
    public static void main (String args[])
    {
        int temp_2 = 1;
        int temp_1 = 2;
        int temp =0;
        int sum = 2;
        while(temp < 4000000) {
            temp = temp_1 + temp_2;
            if(temp%2 == 0) sum += temp;
            temp_2 = temp_1;
            temp_1 = temp;
        }
        System.out.println(sum);

    }
}
