package Map_2;

import java.util.Map;

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map <String, Boolean> map = new java.util.HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], true);
            }else{
                map.put(strings[i], false);
            }
        }
        return map;
    }


}
