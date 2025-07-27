public class middleThree {
    public String middleThree(String str) {
        if (str.length() < 3) {
            return str; // Return the string as is if it's less than 3 characters
        }
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2); // Return the three middle characters
    }
}
