package Map_2;

import java.util.Map;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String , String> map = new java.util.HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0)+"")) {
                map.put(strings[i].charAt(0)+"",map.get(strings[i].charAt(0)+"")+strings[i]);
            }else{
                map.put(strings[i].charAt(0)+"", strings[i]);
            }
        }
        return map;
    }
}
