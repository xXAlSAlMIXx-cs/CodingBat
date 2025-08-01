package Map_2;

import java.util.Map;

public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String , Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i],map.get(strings[i])+1);
            }else{
                map.put(strings[i], 1);
            }
        }
        return map;
    }
}
