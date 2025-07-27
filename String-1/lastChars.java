public class lastChars {
    public String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@"; 
        } else {
            a = a.substring(0, 1); 
        }
        
        if (b.length() < 1) {
            b = "@"; 
        } else {
            b = b.substring(b.length() - 1); 
        }
        return a + b; 
    }
}
