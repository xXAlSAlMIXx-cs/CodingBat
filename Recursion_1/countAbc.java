package Recursion_1;

public class countAbc {
    public int countAbc(String str) {
        if (str.length() <=2) {
            return 0;
        }
        if (str.charAt(0)=='a' && str.charAt(1)=='b' && str.charAt(2)=='c') {
            return 1 +countAbc(str.substring(1));
        }
        if (str.charAt(0)=='a' && str.charAt(1)=='b' && str.charAt(2)=='a') {
            return 1 +countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}
