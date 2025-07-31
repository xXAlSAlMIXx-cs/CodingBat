package Recursion_1;

public class stringClean {
    public String stringClean(String str) {
        if (str.length() <=1) {
            return str;
        }
        if (str.charAt(0)==str.charAt(1)) {
            return stringClean(str.charAt(0)+str.substring(2));
        }
        return  str.charAt(0)+stringClean(str.substring(1));
    }
}
