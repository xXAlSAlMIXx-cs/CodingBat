public class lastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        char last = str.charAt(str.length() - 1);
        char secondLast = str.charAt(str.length() - 2);
        return str.substring(0, str.length() - 2) + last + secondLast;
    }
}
