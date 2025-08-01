package Functional_2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class noYY {
    public List<String> noYY(List<String> strings) {
        strings=strings.stream()
            .map(n -> n+"y")
            .filter(n -> !n.contains("yy"))
            .collect(Collectors.toList());
        return strings;
    }

}
