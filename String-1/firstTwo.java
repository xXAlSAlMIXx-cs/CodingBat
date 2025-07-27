public class firstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str.substring(str.length() - 2);
        }
        return str;
    }

}
