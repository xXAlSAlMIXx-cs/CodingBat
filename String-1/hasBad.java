public class hasBad {
    public boolean hasBad(String str) {
        if (str.length() < 4) {
            return str.contains("bad"); // If the string is less than 4 characters, check if it contains "bad"
        }
        String firstFourChars = str.substring(0, 4);
        return firstFourChars.contains("bad");
    }
}
