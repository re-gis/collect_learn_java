package between;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(95);
        li.add(50);
        li.add(14);
        li.add(22);
        li.add(31);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 % 10 > num2 % 10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(li, com);
        for(Integer i: li){
            System.out.println(i);
        }
    }
}
