public class Zad1 {
    public static void main(String args[]){
        String gw = "*";
        for (int i=0; i<10; i++){
            System.out.println(gw);
            gw+="*";
        }
        int[][] tab = new int[3][];
        tab[0] = new int [5];
        tab[1] = new int [3];
        tab[2] = new int [8];
        for (int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j] = 1;
            }
        }
        for (int i=0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        char letter = 'a';
        for(int i=0; i<26; i++){
            System.out.println(letter);
            letter++;
        }
        int[] tab1 = new int[10];
        int licz=0;
        while(licz<tab1.length){
            tab1[licz]=11*(licz+1);
            System.out.println(tab1[licz]);
            licz++;
        }

    }
}
