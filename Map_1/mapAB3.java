package Map_1;

import java.util.Map;

public class mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        return map;
    }
}
