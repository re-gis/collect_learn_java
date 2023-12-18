package between;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Clemantine", 19);
        map.put("Alex", 21);
        map.put("Patrick", 22);
        map.put("Jean", 20);

        map.put("Alex", 50);
        Boolean b = map.containsValue(10);
    
        System.out.println(b);
      System.out.print(map);
    }
}
