package Map_2;

import java.util.Map;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map= new java.util.HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].charAt(0)+"",strings[i].charAt(strings[i].length()-1)+"");
        }
        return map;
    }
}
