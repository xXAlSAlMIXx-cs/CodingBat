package Map_2;

import java.util.Map;

public class firstSwap {
        public String[] firstSwap(String[] strings) {
        Map<String,Integer> map= new java.util.HashMap<>();
        
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0)+"")) {
                if (map.get(strings[i].charAt(0)+"")!=-1) {   
                    String temp = strings[i];
                    strings[i]=strings[map.get(strings[i].charAt(0)+"")];
                    strings[map.get(strings[i].charAt(0)+"")]=temp;
                    map.put(strings[i].charAt(0)+"" ,-1);   
                }
            }else{
                map.put(strings[i].charAt(0)+"",i);
            }
        }
        return strings;
    }   
}
