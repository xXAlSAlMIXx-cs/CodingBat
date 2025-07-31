package Recursion_1;

public class nestParen {
    public boolean nestParen(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (!str.matches("[()]*")) { // new method , I just learn it
            return false;
        }
        if (str.startsWith("(") && str.endsWith(")")) {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
