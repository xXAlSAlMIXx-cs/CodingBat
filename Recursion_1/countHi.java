package Recursion_1;

public class countHi {
    public int countHi(String str) {
        if (str.length() <2) {
            return 0;
        }
        if (str.charAt(0)=='h' && str.charAt(1)=='i') {
            return 1+countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
}
