import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main (String args[])
    {
        for( int i = 0; i<10 ; i++){
            if(i%2 == 0) System.out.println("Parzysta: " +i);
        }
        IntStream.range(0,10)
                .filter(value -> value%2 ==0)
                .forEach(value -> System.out.println("Parzystaa: "+ value));

        List<Integer> intList = new ArrayList();
        int avgsum = 0;
        for(int i = 0; i<10; i++)
        {
            if(i%2 == 1)
            {
                avgsum+=i;
                intList.add(i);
            }
        }
        double avg = avgsum/intList.size();
        System.out.println(avg);

        System.out.println(IntStream.iterate(1, f-> f+2).limit(5).average().getAsDouble());
////////////////////////
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Przycisk został wciśnięty");
            }
        });
        //=======
        button.addActionListener(e -> {
            System.out.println("Przycisk został wciśnięty");
        });
/////////////////////////
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        for (Integer n: list)
        {
                //System.out.println(n);
        }
        //=======
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
            //list2.forEach(n -> System.out.println(n));
        ////////////////////
        //Przekształcenie metody w wyrażenie lambda
        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
            //list3.forEach(System.out::println);
        //////////
        LocalDateTime dateTime = LocalDateTime.now();
            //System.out.println(dateTime);
            //System.out.println(dateTime.hashCode());
    }
}
/** Wyrażenia lambda
 () - parametry wywołania funkcji
 ->
 () - treść wyrażenia

 (a,b), (), (int a, int b)
 () -> 33 - proste wywołanie funkcji
 () (a) -> return a*a
**/