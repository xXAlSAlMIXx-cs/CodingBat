public class mixString {
    public String mixString(String a, String b) {
    String result = "";
       int min = Math.min(a.length(), b.length());
       for (int i = 0; i < min; i++) {
           result += a.charAt(i);
           result += b.charAt(i);
       }
       if (a.length() > b.length()) {
           result += a.substring(min);
       } else if (b.length() > a.length()) {
           result += b.substring(min);
       }
       return result;
    }
}
