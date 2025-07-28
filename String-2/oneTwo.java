public class oneTwo {
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i += 3) {
            String triplet = str.substring(i, i + 3);
            result.append(triplet.charAt(1)).append(triplet.charAt(2)).append(triplet.charAt(0));
        }

        return result.toString();
    }
}
