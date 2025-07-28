public class plusOut {
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length() - 1;
            } else {
                result.append('+');
            }
        }
        return result.toString();
    }
}
