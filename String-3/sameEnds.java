public class sameEnds {
    public String sameEnds(String str) {
        int len = str.length();
        if(len <= 1) {
            return "";
        }
        if (len < 2) {
            return str;
        }
        int maxLength = len / 2;
        for (int i = maxLength; i > 0; i--) {
            if (str.substring(0, i).equals(str.substring(len - i))) {
                return str.substring(0, i);
            }
        }
        return "";
    }
}
