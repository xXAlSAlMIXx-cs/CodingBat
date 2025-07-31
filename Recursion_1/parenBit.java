package Recursion_1;

public class parenBit {
   public String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;
        }
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(0,str.length()-1));
    } 
}
