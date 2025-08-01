package Map_2;

import java.util.Map;

public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<String,Integer> map= new java.util.HashMap<>();
        
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0)+"")) {
                String temp = strings[i];
                strings[i]=strings[map.get(strings[i].charAt(0)+"")];
                strings[map.get(strings[i].charAt(0)+"")]=temp;
                map.remove(strings[i].charAt(0)+"");
            }else{
                map.put(strings[i].charAt(0)+"",i);
            }
        }
        return strings;
    }
}
