public class sameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i > 0 && i < str.length() - 1) {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
