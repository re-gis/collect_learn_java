package between;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ListThree {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(95);
        li.add(50);
        li.add(14);
        li.add(22);
        li.add(31);
        li.sort(Comparator.comparingInt(num -> {
            String numStr = Integer.toString(num);
            return (numStr.length() >= 2) ? Character.getNumericValue(numStr.charAt(1)) : 0;
        } ));

        for(Integer i:li){
            System.out.println(i);
        }
    }
}
