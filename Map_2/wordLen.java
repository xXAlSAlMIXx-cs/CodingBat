package Map_2;

import java.util.Map;

public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String , Integer> map= new java.util.HashMap<String,Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }
        return map;
    } 
}
