public class extraFront {
    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String repeat = str.substring(0, 2);
        return repeat + repeat+ repeat;
    }
}
