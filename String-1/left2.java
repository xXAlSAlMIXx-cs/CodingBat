public class left2 {
    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2,str.length()) + str.substring(0, 2);
        }
        return str;
    }
}
