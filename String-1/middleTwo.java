public class middleTwo {
    public String middleTwo(String str) {
        if (str.length() < 2) {
            return str; // Return the string as is if it's less than 2 characters
        }
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1); // Return the two middle characters
    }
}