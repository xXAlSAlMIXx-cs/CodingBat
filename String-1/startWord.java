public class startWord {
     public  String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        }

        String subStr = str.substring(0, word.length());

        if (subStr.substring(1).equals(word.substring(1))) {
            return subStr;
        } else {
            return "";
        }
    }
}
