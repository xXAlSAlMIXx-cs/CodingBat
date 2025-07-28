public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if (count <= 0) return "";
        String result = "";
        for (int i = 1; i < count; i++) {
            result += sep + word;
        }
        return word+result;
    }
}
