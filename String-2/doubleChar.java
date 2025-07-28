public class doubleChar {
    public String doubleChar(String str) {
       String newString ="";
       for (int i = 0; i < str.length(); i++) {
           char currentChar = str.charAt(i);
           newString += currentChar;
           newString += currentChar; // Append the character twice
       }
       return newString;
    }
}
