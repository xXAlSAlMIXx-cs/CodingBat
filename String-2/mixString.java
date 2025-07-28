public class mixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        
        // Append the remaining characters from the longer string
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }
        
        return result.toString();
    }
}
