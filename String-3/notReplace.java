public class notReplace {
    public String notReplace(String str) {
        if (str.length() < 2) {
            return str;
        }

        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                if ((i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                    (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                    result += "is not";
                    i += 2;
                } else {
                    result += "is";
                    i += 2;
                }
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }
}
