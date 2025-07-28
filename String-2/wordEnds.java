public class wordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {
                    result.append(str.charAt(i + word.length()));
                }
                i += word.length() - 1;
            }
        }
        return result.toString();
    }
}
