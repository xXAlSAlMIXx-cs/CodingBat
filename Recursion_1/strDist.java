package Recursion_1;

public class strDist {
    public int strDist(String str, String sub) {
        if (str.length()<sub.length()) {
            return 0;
        }
        if (str.equals(sub)) {
            return str.length();
        }

        if (str.startsWith(sub)&& str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0,str.length()-1), sub);
    }
}
