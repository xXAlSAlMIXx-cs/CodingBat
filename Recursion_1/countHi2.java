package Recursion_1;

public class countHi2 {
    public int countHi2(String str) {
        if (str.length() <2) {
            return 0;
        }
        if (str.charAt(0)=='h' && str.charAt(1)=='i') {
            return 1 + countHi2(str.substring(1));
        }
        if (str.charAt(0)=='x' && str.length() >2 && str.charAt(1)=='h') {
            return countHi2(str.substring(2));
        }
        return 0+ countHi2(str.substring(1));
    }
}
