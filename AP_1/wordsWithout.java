package AP_1;

import java.util.Arrays;

public class wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        return Arrays.stream(words).filter(n -> (!n.equals(target))).toArray(String[]::new);
    }

}
