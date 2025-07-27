public class theEnd {
    public String theEnd(String str, boolean front) {
        if (str.length() == 0) {
            return "";
        }
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }
}
