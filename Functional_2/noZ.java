package Functional_2;

import java.util.List;

public class noZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

}
