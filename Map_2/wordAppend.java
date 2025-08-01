package Map_2;

import java.util.HashMap;
import java.util.Map;

import Recursion_1.factorial;

public class wordAppend {
    public String wordAppend(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
    
        for (String s : strings) {
            int count = map.getOrDefault(s, 0) + 1;
            map.put(s, count);
            if (count % 2 == 0) {
                result.append(s);
            }
        }
        
        return result.toString();
    }   
}
