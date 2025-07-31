package Recursion_1;

public class strCount {
    public int strCount(String str, String sub) {
           if (str.length()<sub.length()) {
                return 0;
           }
           if (sub.equals(str.subSequence(0, sub.length()))) {
                return 1 + strCount(str.substring(sub.length()), sub);
           }
           return strCount(str.substring(1), sub);
    }
}
