package Map_1;

import java.util.Map;

    public class mapShare {
        public Map<String, String> mapShare(Map<String, String> map) {
            if (map.containsKey("b")) {
                if (map.containsKey("a")) {
                    map.put("b", map.get("a"));                    
                }
                
            }

            if (map.containsKey("a")) {
                if (!map.containsKey("b")) {
                    map.put("b", map.get("a"));                    
                }
            }
            if (map.containsKey("c")) {
                map.remove("c");
            }
            return map;
        }

}
