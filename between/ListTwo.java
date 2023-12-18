package between;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListTwo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Lidvine");
        list1.add("Regis");
        list1.add("Ritha");
        list1.add("Exauce");
        list1.add("Linda");
        
        // System.out.println(new ArrayList<>().size());
        List<String> list2 = new ArrayList<String>();
        list2.add("Moustapha");
        list2.add("Faith");
        list2.add("Divine");

        list1.add(3, "Gisele");

        list2.set(1, "Mbabazi");
        list2.remove(0);

        list1.addAll(list2);
        Collections.sort(list1);
        // Collection

        for(String s:list1){
            System.out.println(s);
        }

    }
}
