public class starOut {
    public String starOut(String str) {
        int [] indexes = new int[str.length()];
        int counter=0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='*') {
                indexes[counter] = i;
                counter++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
