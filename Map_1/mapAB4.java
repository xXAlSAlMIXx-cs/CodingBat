package Map_1;

import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
               if (map.containsKey("a")&& map.containsKey("b")) {
            String aa = map.get("a");
            String bb = map.get("b");
            if (aa.length()>bb.length()) {
                map.put("c", aa)    ;
            }
            else if(aa.length()<bb.length()){
                map.put("c", bb);
            }else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
