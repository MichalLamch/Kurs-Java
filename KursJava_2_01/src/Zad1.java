public class Zad1 {
    public static void main(String args[]){
        int z1 = 15;
        int z2 = 5;
        System.out.println("="+ (z1+z2));
        System.out.println("="+ (z1-z2));
        System.out.println("="+ (z1*z2));
        System.out.println("="+ (z1/z2));
        System.out.println("="+ (z1%z2));
        char letter = 'a';
        letter++;
        System.out.println(letter);
        double a = 10.123456789;
        for(int i=0; i<10;i++){
            a++;
        }
        System.out.println(a);
        String str = "Wynikiem dodawania liczby 2 i 2 jest";
        int c = 2;
        String str2 = str + 2;
        System.out.println(str2);
        int r=47;
        double pole = Math.PI*r*r;
        System.out.println(pole);
    }

}
