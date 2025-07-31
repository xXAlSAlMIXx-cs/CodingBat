package Recursion_1;

public class strCopies {
   public boolean strCopies(String str, String sub, int n) {
        if (n<=0) {
            return true;
        }
        if (str.length()<sub.length()) {
            return false;
        }
        if (sub.equals(str.substring(0, sub.length()))) {
            return strCopies(str.substring(1), sub, n-1);
        }
        return strCopies(str.substring(1), sub, n);
    }
}
