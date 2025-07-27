public class deFront {
    public String deFront(String str) {
        if(str.length() >= 2) { 
            boolean firstA = str.charAt(0) == 'a';
            boolean secondB = str.charAt(1) == 'b';
            if (firstA && secondB) {
              return str;
            }else if (firstA){
                return 'a' + str.substring(2,str.length());
            }else if (secondB) {
                return 'b' + str.substring(2,str.length());
            }else {
                return str.substring(2,str.length());
            }
        }else if (str.length() == 1) {
            if (str.charAt(0) == 'a') {
                return "a";
            } else if (str.charAt(0) == 'b') {
                return "b";
            } else {
                return "";
            }
        } else {
            return "";
        }
    }
}
