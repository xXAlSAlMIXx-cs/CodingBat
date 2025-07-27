public class twoChar {
    public String twoChar(String str, int index) {
        if ((index +2 > str.length())|| index < 0) {
            return str.substring(0, 2); // Return first two characters if index is out of bounds

        }
        return str.substring(index, index + 2);
    }
}
