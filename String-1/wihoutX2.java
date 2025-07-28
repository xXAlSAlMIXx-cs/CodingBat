public class wihoutX2 {
    public String withoutX2(String str) {
        if (str.length() < 2) {
            return str.replace("x", "");
        }
        String firstTwo = str.substring(0, 2).replace("x", "");
        return firstTwo + str.substring(2, str.length());
    }
}
